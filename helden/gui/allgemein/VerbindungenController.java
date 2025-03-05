/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.held.A.String;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.S;
import helden.gui.A;
import helden.gui.allgemein.Utils;
import helden.gui.allgemein.VerbindungenBearbeitenController;
import helden.gui.allgemein.VerbindungenPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VerbindungenController
implements ActionListener,
ItemListener {
    private VerbindungenPanel o00000;
    private JDialog \u00d400000;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO new;
    private S \u00d300000;

    public VerbindungenController(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, A a2) {
        this.new = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.\u00d300000 = new S();
        for (java.lang.String string : oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d4o0000().\u00d200000()) {
            try {
                this.\u00d300000.o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d4o0000().\u00d200000(string).\u00d400000());
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                cloneNotSupportedException.printStackTrace();
            }
        }
        this.o00000 = new VerbindungenPanel(this);
        this.o00000();
        this.\u00d400000 = new JDialog(Utils.getFrame(a2), "Verbindungen Bearbeiten", true);
        this.\u00d400000.getContentPane().add(this.o00000);
        this.\u00d400000.setSize(400, 350);
        Utils.zentriere(this.\u00d400000);
        this.\u00d400000.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.o00000.getAbbrechenButton() && JOptionPane.showConfirmDialog(this.o00000, "Die aktuellen \u00c4nderungen gehen verloren.", "Wirklich abbrechen?", 0) == 0) {
            this.\u00d400000.setVisible(false);
        }
        if (actionEvent.getSource() == this.o00000.getOkButton()) {
            this.new.\u00d4o0000().o00000();
            ((K)this.new).ifnew().\u00d300000();
            for (java.lang.String string : this.\u00d300000.\u00d200000()) {
                this.new.\u00d4o0000().o00000(this.\u00d300000.\u00d200000(string));
            }
            this.\u00d400000.setVisible(false);
        }
        if (actionEvent.getSource() == this.o00000.getEntfernenButton()) {
            java.lang.String string = (java.lang.String)this.o00000.getVerbindungen().getSelectedItem();
            if (string != null) {
                ((K)this.new).ifnew().\u00d300000();
                this.\u00d300000.o00000(string);
                this.o00000(this.\u00d300000.\u00d200000((java.lang.String)this.o00000.getVerbindungen().getSelectedItem()));
                this.o00000.getVerbindungen().removeItem(this.o00000.getVerbindungen().getSelectedItem());
                if (this.o00000.getVerbindungen().getItemCount() > 0) {
                    this.o00000.getVerbindungen().setSelectedIndex(0);
                }
            } else {
                this.o00000(null);
            }
        }
        if (actionEvent.getSource() == this.o00000.getHinzfuegenButton()) {
            new VerbindungenBearbeitenController(this.\u00d300000, null, false, this.\u00d400000);
            ((K)this.new).ifnew().\u00d300000();
            this.o00000();
        }
        if (actionEvent.getSource() == this.o00000.getBearbeitenButton() && this.o00000.getVerbindungen().getItemCount() > 0) {
            new VerbindungenBearbeitenController(this.\u00d300000, (java.lang.String)this.o00000.getVerbindungen().getSelectedItem(), true, this.\u00d400000);
            ((K)this.new).ifnew().\u00d300000();
            this.o00000();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        this.o00000(this.\u00d300000.\u00d200000((java.lang.String)this.o00000.getVerbindungen().getSelectedItem()));
    }

    private void o00000(String string) {
        if (string != null) {
            this.o00000.getNameFeld().setText(string.\u00d300000());
            this.o00000.getSo().setText("" + string.o00000());
            this.o00000.getBeschreibung().setText(string.new());
        } else {
            this.o00000.getNameFeld().setText("");
            this.o00000.getSo().setText("");
            this.o00000.getBeschreibung().setText("");
        }
    }

    private void o00000() {
        Iterator<java.lang.String> iterator = this.\u00d300000.\u00d200000().iterator();
        this.o00000.getVerbindungen().removeAllItems();
        while (iterator.hasNext()) {
            java.lang.String string = iterator.next();
            this.o00000.getVerbindungen().addItem(string);
        }
        if (this.o00000.getVerbindungen().getItemCount() > 0) {
            this.o00000.getVerbindungen().setSelectedIndex(0);
            this.o00000(this.\u00d300000.\u00d200000((java.lang.String)this.o00000.getVerbindungen().getItemAt(0)));
        }
    }
}

