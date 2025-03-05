/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.Einstellungen;
import helden.gui.allgemein.FontEinstellungenPanel;
import helden.gui.ooOO.h;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FontEinstellungenController
implements ActionListener,
ChangeListener,
ListSelectionListener {
    private FontEinstellungenPanel \u00d200000;
    private JDialog \u00d600000;
    private h o00000;
    private Font \u00d300000;
    private int \u00d500000;
    private boolean String;

    public FontEinstellungenController(FontEinstellungenPanel fontEinstellungenPanel, h h2, boolean bl) {
        this.String = bl;
        this.o00000 = h2;
        this.\u00d200000 = fontEinstellungenPanel;
        this.\u00d300000 = bl ? Einstellungen.getInstance().getDruckFont() : Einstellungen.getInstance().getGUIFont();
        this.\u00d500000 = Einstellungen.getInstance().getFontGroesse();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.\u00d200000.getOkButton()) {
            this.\u00d600000.setVisible(false);
        }
        if (actionEvent.getSource() == this.\u00d200000.getAbbrechenButton()) {
            if (this.String) {
                Einstellungen.getInstance().setFontOhneWarnung(this.\u00d300000);
                Einstellungen.getInstance().setFontGroesse(this.\u00d500000);
            } else {
                Einstellungen.getInstance().setGuiFont(this.\u00d300000);
            }
            this.o00000.new().repaint();
            this.\u00d600000.setVisible(false);
        }
    }

    public void setDialog(JDialog jDialog) {
        this.\u00d600000 = jDialog;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if (changeEvent.getSource() == this.\u00d200000.getFontGroesse()) {
            int n = this.\u00d200000.getFontGroesse().getValue();
            Einstellungen.getInstance().setFontGroesse(n - 3);
            this.\u00d200000.setFontGroesse();
            this.o00000.new().repaint();
        }
    }

    public void updateSelection() {
        for (int i2 = 0; i2 < this.\u00d200000.getFontTable().getRowCount(); ++i2) {
            if (!this.\u00d200000.getFontTable().getValueAt(i2, 0).equals(this.\u00d300000.getName())) continue;
            this.\u00d200000.getFontTable().getSelectionModel().setSelectionInterval(i2, i2);
            break;
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        int n = this.\u00d200000.getFontTable().getSelectedRow();
        if (n > -1) {
            Font font = (Font)this.\u00d200000.getFontTable().getModel().getValueAt(n, 1);
            int n2 = this.\u00d600000.getFontMetrics(font).getHeight();
            if (n2 <= 0) {
                this.\u00d200000.getFontTable().getSelectionModel().clearSelection();
                JOptionPane.showMessageDialog(this.\u00d600000, "Der Ausgew\u00e4hlte Font scheint Kaputt zu sein\nEr kann nicht verwendet werden!", "Font Kaputt?", 0);
                font = null;
            }
            if (font != null) {
                if (this.String) {
                    Einstellungen.getInstance().setFontOhneWarnung(font);
                } else {
                    Einstellungen.getInstance().setGuiFont(font);
                }
                this.o00000.new().repaint();
            }
        }
    }
}

