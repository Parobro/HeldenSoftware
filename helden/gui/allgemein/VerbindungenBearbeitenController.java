/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.held.A.String;
import helden.framework.held.S;
import helden.gui.allgemein.Utils;
import helden.gui.allgemein.VerbindungenBearbeitenPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class VerbindungenBearbeitenController
implements ActionListener {
    private JDialog class;
    private VerbindungenBearbeitenPanel super;
    private S \u00d300000;
    private java.lang.String \u00d200000;
    private boolean \u00d400000;

    public VerbindungenBearbeitenController(S s, java.lang.String string, boolean bl, JDialog jDialog) {
        this.\u00d300000 = s;
        this.\u00d200000 = string;
        this.\u00d400000 = bl;
        this.super = new VerbindungenBearbeitenPanel(this);
        this.o00000();
        this.class = new JDialog(Utils.getFrame(jDialog), "Verbindungen bearbeiten", true);
        this.class.getContentPane().add(this.super);
        this.class.setSize(400, 350);
        Utils.zentriere(this.class);
        this.class.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.super.getAbbrechenButton() && JOptionPane.showConfirmDialog(this.super, "Die aktuellen \u00c4nderungen gehen verloren.", "Wirklich abbrechen?", 0) == 0) {
            this.class.setVisible(false);
        }
        if (actionEvent.getSource() == this.super.getOkButton()) {
            if (this.super.getNameFeld().getText().equals("")) {
                JOptionPane.showConfirmDialog(this.super, "Es muss ein eindeutiger Name eingegeben werden.", "Namen eingeben!", 0);
            }
            if (this.\u00d400000) {
                String string = this.\u00d300000.\u00d200000(this.\u00d200000);
                this.\u00d300000.o00000(this.\u00d200000);
                if (this.\u00d300000.\u00d200000(this.super.getNameFeld().getText()) == null) {
                    string.new(this.super.getBeschreibung().getText());
                    string.o00000((Integer)this.super.getSo().getValue());
                    string.o00000(this.super.getNameFeld().getText());
                    this.\u00d300000.o00000(string);
                    this.class.setVisible(false);
                } else {
                    JOptionPane.showConfirmDialog(this.super, "Es muss ein eindeutiger Name eingegeben werden.", "Namen eingeben!", 0);
                    this.\u00d300000.o00000(string);
                }
            } else if (this.\u00d300000.\u00d200000(this.super.getNameFeld().getText()) == null) {
                String string = new String(this.super.getNameFeld().getText(), (Integer)this.super.getSo().getValue(), this.super.getBeschreibung().getText());
                this.\u00d300000.o00000(string);
                this.class.setVisible(false);
            } else {
                JOptionPane.showConfirmDialog(this.super, "Es muss ein eindeutiger Name eingegeben werden.", "Namen eingeben!", 0);
            }
        }
    }

    private void o00000() {
        if (this.\u00d200000 != null) {
            String string = this.\u00d300000.\u00d200000(this.\u00d200000);
            if (string != null) {
                this.super.getNameFeld().setText(string.\u00d300000());
                this.super.getSo().setValue(new Integer(string.o00000()));
                this.super.getBeschreibung().setText(string.new());
            } else {
                this.super.getNameFeld().setText("");
                this.super.getSo().setValue(new Integer(1));
                this.super.getBeschreibung().setText("");
            }
        }
    }
}

