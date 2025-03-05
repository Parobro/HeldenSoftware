/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.comm.CommUtilities;
import helden.framework.Einstellungen;
import helden.gui.erschaffung.HauptDialog;
import helden.gui.erschaffung.dialoge.SpeichernPanel;
import helden.gui.erschaffung.werkzeug.HEW2;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class SpeichernZustand {
    private SpeichernPanel \u00d400000 = null;
    private HauptDialog o00000 = null;
    private HEW2 new;
    private JDialog \u00d300000;

    public SpeichernZustand(HauptDialog hauptDialog, HEW2 hEW2) {
        this.new = hEW2;
        this.o00000 = hauptDialog;
        this.\u00d400000 = new SpeichernPanel(this);
        this.\u00d300000 = new JDialog(hauptDialog);
        this.\u00d300000.add(this.\u00d400000);
        this.\u00d300000.pack();
        this.\u00d300000.setLocationRelativeTo(null);
        this.\u00d300000.setVisible(true);
    }

    public void close() {
        this.\u00d300000.dispose();
    }

    public String getDefautTextFieldText() {
        if (this.new.getDateinameEntwurf() != null) {
            return this.new.getDateinameEntwurf();
        }
        String string = "";
        if (this.new.getName() != null) {
            string = string + this.new.getName() + " ";
        }
        string = string + this.new.getHauptProfession().toString();
        string = string + " " + this.new.getKultur().toString();
        string = string + " " + this.new.getRasse().toString();
        return string;
    }

    public void speichern() {
        Object[] objectArray;
        int n;
        String string = this.\u00d400000.getText() + ".erschaffung.hld";
        this.new.setDateinameEntwurf(this.\u00d400000.getText());
        string = CommUtilities.replaceAllEvil(string);
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("erschaffungsSavesPfad") + "/" + string);
        boolean bl = true;
        if (file.exists() && (n = JOptionPane.showOptionDialog(null, "Unter diesem Namen wurde schon gespeichert, soll der verhandene Entwurf \u00fcberschrieben werden?", "Warnung", 0, 2, null, objectArray = new Object[]{"Ja, \u00fcberschreiben", "Nein"}, objectArray[0])) != 0) {
            bl = false;
        }
        if (bl) {
            try {
                this.o00000.speichern(file.getAbsolutePath());
                JOptionPane.showMessageDialog(null, "Der Entwurf wurde gespeichert und\nkann \u00fcber den Laden-Tab geladen werden", "Speichern", 1);
                this.\u00d300000.setVisible(false);
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(null, "Es ist beim Speichern ein Fehler aufgetretten! " + exception.getMessage(), "Speichernfehler", 1);
            }
        }
    }
}

