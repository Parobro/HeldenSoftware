/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.Einstellungen;
import helden.gui.allgemein.BildEinstellungenPanel;
import helden.gui.ooOO.$A;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class BildEinstellungenController
implements ActionListener,
ChangeListener {
    private BildEinstellungenPanel \u00d200000;
    private JDialog \u00d300000;
    private $A super;

    public BildEinstellungenController(BildEinstellungenPanel bildEinstellungenPanel, $A $A) {
        this.super = $A;
        this.\u00d200000 = bildEinstellungenPanel;
        $A.super(1);
        $A.super(0.5f);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.\u00d200000.getAbbrechenButton() && JOptionPane.showConfirmDialog(this.\u00d200000, "Die aktuellen \u00c4nderungen gehen verloren.", "Wirklich abbrechen?", 0) == 0) {
            this.super.super(1);
            this.super.super(0.5f);
            this.\u00d300000.setVisible(false);
        }
        if (actionEvent.getSource() == this.\u00d200000.getOkButton()) {
            Einstellungen.getInstance().setGrau(this.\u00d200000.getGrauToggleButton().isSelected());
            this.\u00d300000.setVisible(false);
        }
    }

    public void setDialog(JDialog jDialog) {
        this.\u00d300000 = jDialog;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        int n;
        if (changeEvent.getSource() == this.\u00d200000.getAufloesung()) {
            n = this.\u00d200000.getAufloesung().getValue();
            this.super.super(n);
            this.\u00d200000.getAufloesungText().setText(400 * ++n + " x " + 300 * n);
        }
        if (changeEvent.getSource() == this.\u00d200000.getQuallitaet()) {
            n = this.\u00d200000.getQuallitaet().getValue();
            if (n == 1) {
                this.\u00d200000.getQuallitaetText().setText("niedrig");
                this.super.super(0.5f);
            } else if (n == 2) {
                this.\u00d200000.getQuallitaetText().setText("mittel");
                this.super.super(0.75f);
            } else {
                this.\u00d200000.getQuallitaetText().setText("hoch");
                this.super.super(0.95f);
            }
        }
        if (changeEvent.getSource() == this.\u00d200000.getGrauToggleButton()) {
            this.\u00d200000.getFarbeToggleButton().setSelected(!this.\u00d200000.getGrauToggleButton().isSelected());
        }
        if (changeEvent.getSource() == this.\u00d200000.getFarbeToggleButton()) {
            this.\u00d200000.getGrauToggleButton().setSelected(!this.\u00d200000.getFarbeToggleButton().isSelected());
        }
    }
}

