/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.Einstellungen;
import helden.framework.held.B.B.C;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.A;
import helden.gui.OooO;
import helden.gui.allgemein.BildEinstellungenPanel;
import helden.gui.allgemein.Utils;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class $A
extends AbstractAction {
    private static $A \u00d200000;
    private A String;
    private int o00000;
    private float \u00d300000;

    public static $A super(A a2) {
        if (\u00d200000 == null) {
            \u00d200000 = new $A(a2);
        }
        return \u00d200000;
    }

    private $A(A a2) {
        super("Held als JPG exportieren", OooO.\u00d300000().\u00d400000());
        this.String = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = this.String.\u00d2O0000();
        JFileChooser jFileChooser = new JFileChooser(Einstellungen.getInstance().getLetzterPfad());
        jFileChooser.setFileSelectionMode(1);
        File file = new File(Einstellungen.getInstance().getLetzterPfad());
        jFileChooser.setSelectedFile(file);
        if (jFileChooser.showSaveDialog(this.String) == 0) {
            File file2 = jFileChooser.getSelectedFile();
            while (!file2.exists()) {
                if (!(file2 = file2.getParentFile()).getPath().equals("")) continue;
                file2 = new File(Einstellungen.getInstance().getLetzterPfad());
            }
            BildEinstellungenPanel bildEinstellungenPanel = new BildEinstellungenPanel(this);
            JDialog jDialog = new JDialog(Utils.getFrame(this.String), "Bild Einstellungen", true);
            bildEinstellungenPanel.getController().setDialog(jDialog);
            jDialog.getContentPane().add(bildEinstellungenPanel);
            jDialog.setSize(400, 250);
            Utils.zentriere(jDialog);
            jDialog.setVisible(true);
            try {
                C c = new C(file2.getAbsolutePath() + System.getProperty("file.separator"), oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, this.o00000, this.\u00d300000);
                int n = 0;
                while (c.o00000(n)) {
                    ++n;
                }
                JOptionPane.showMessageDialog(this.String, "Held exportiert nach\n" + file2.getPath(), "Held als Jpg exportiert", 1);
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(this.String, "Fehler beim Export des Helden", exception.getMessage(), 0);
                exception.printStackTrace();
            }
        }
    }

    public void super(int n) {
        this.o00000 = n;
    }

    public void super(float f2) {
        this.\u00d300000 = f2;
    }
}

