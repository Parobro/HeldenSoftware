/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.pfadEinstellung;

import helden.framework.DruckEinstellungen;
import helden.framework.Einstellungen;
import helden.framework.held.Object.M;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.pfadeEinstellungen.PfadEinstellungen;
import helden.framework.pfadeEinstellungen.PfadMapItem;
import helden.gui.A;
import helden.gui.allgemein.ExampleFileFilter;
import helden.gui.ooOO.S;
import helden.gui.oooo.i_0;
import helden.gui.pfadEinstellung.PfadEinstellungsDialog;
import helden.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.Serializable;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class PfadEinstellungsController
implements ActionListener {
    private PfadEinstellungsDialog new = null;
    private A o00000 = null;
    private PfadEinstellungen \u00d300000 = Einstellungen.getInstance().getPfade();

    public PfadEinstellungsController(A a2) {
        this.o00000 = a2;
        if (Einstellungen.getInstance().getPfade().isHsLocal()) {
            JOptionPane.showMessageDialog(this.new, "Im hsLocal-Mode k\u00f6nnen die Pfade nicht angepasst werden, es muss vorher die Helden-Software mit dem Parameter -hsLocalOff gestartet werden!", "-hsLocal-Mode", 1);
        } else {
            this.new = new PfadEinstellungsDialog(this, this.o00000);
            this.\u00d2O0000();
            this.null();
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object;
        Serializable serializable;
        JButton jButton = (JButton)actionEvent.getSource();
        if (jButton == this.new.getJallButton()) {
            boolean bl = this.\u00f600000();
            if (!this.\u00d300000.isProfiMode() && bl) {
                this.\u00f800000();
            }
        }
        if (jButton == this.new.getJHeldenButton()) {
            String string = this.new.getJHeldenPfadTextField().getText();
            serializable = new JFileChooser(new File(string).getParent());
            object = new ExampleFileFilter();
            ((ExampleFileFilter)object).addExtension("zip.hld");
            ((ExampleFileFilter)object).setDescription("zip.hld");
            ((JFileChooser)serializable).setFileFilter((FileFilter)object);
            ((JFileChooser)serializable).setFileSelectionMode(0);
            File file = new File("helden.zip.hld");
            ((JFileChooser)serializable).setSelectedFile(file);
            if (((JFileChooser)serializable).showSaveDialog(this.new) == 0) {
                File file2 = ((JFileChooser)serializable).getSelectedFile();
                try {
                    this.new.getJHeldenPfadTextField().setText(file2.getAbsolutePath());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(this.new, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                    exception.printStackTrace();
                }
            }
        }
        if (jButton == this.new.getJPluginButton()) {
            JFileChooser jFileChooser = new JFileChooser(this.new.getJPluginPfadTextField().getText());
            jFileChooser.setFileSelectionMode(1);
            serializable = new File("plugins");
            jFileChooser.setSelectedFile((File)serializable);
            if (jFileChooser.showSaveDialog(this.new) == 0) {
                object = jFileChooser.getSelectedFile();
                try {
                    this.new.getJPluginPfadTextField().setText(((File)object).getAbsolutePath());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(this.new, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                    exception.printStackTrace();
                }
            }
        }
        if (jButton == this.new.getJHintergrundButton()) {
            JFileChooser jFileChooser = new JFileChooser(this.new.getJHintergrundPfadTextField().getText());
            jFileChooser.setFileSelectionMode(1);
            serializable = new File("hintergruende");
            jFileChooser.setSelectedFile((File)serializable);
            if (jFileChooser.showSaveDialog(this.new) == 0) {
                object = jFileChooser.getSelectedFile();
                try {
                    this.new.getJHintergrundPfadTextField().setText(((File)object).getAbsolutePath());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(this.new, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                    exception.printStackTrace();
                }
            }
        }
        if (jButton == this.new.getJBilderButton()) {
            JFileChooser jFileChooser = new JFileChooser(this.new.getJBildPfadTextField().getText());
            jFileChooser.setFileSelectionMode(1);
            serializable = new File("charakterbilder");
            jFileChooser.setSelectedFile((File)serializable);
            if (jFileChooser.showSaveDialog(this.new) == 0) {
                object = jFileChooser.getSelectedFile();
                try {
                    this.new.getJBildPfadTextField().setText(((File)object).getAbsolutePath());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(this.new, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                    exception.printStackTrace();
                }
            }
        }
        if (jButton == this.new.getJHilfeButton()) {
            JFileChooser jFileChooser = new JFileChooser(this.new.getJHilfePfadTextField().getText());
            jFileChooser.setFileSelectionMode(1);
            serializable = new File("hilfeTexte");
            jFileChooser.setSelectedFile((File)serializable);
            if (jFileChooser.showSaveDialog(this.new) == 0) {
                object = jFileChooser.getSelectedFile();
                try {
                    this.new.getJHilfePfadTextField().setText(((File)object).getAbsolutePath());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(this.new, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                    exception.printStackTrace();
                }
            }
        }
        if (jButton == this.new.getJSaveButton()) {
            JFileChooser jFileChooser = new JFileChooser(this.new.getJSavePfadTextField().getText());
            jFileChooser.setFileSelectionMode(1);
            serializable = new File("erschaffungsSaves");
            jFileChooser.setSelectedFile((File)serializable);
            if (jFileChooser.showSaveDialog(this.new) == 0) {
                object = jFileChooser.getSelectedFile();
                try {
                    this.new.getJSavePfadTextField().setText(((File)object).getAbsolutePath());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(this.new, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                    exception.printStackTrace();
                }
            }
        }
        if (jButton == this.new.getJModsButton()) {
            JFileChooser jFileChooser = new JFileChooser(this.new.getJModsPfadTextField().getText());
            jFileChooser.setFileSelectionMode(1);
            serializable = new File("rasse");
            jFileChooser.setSelectedFile((File)serializable);
            if (jFileChooser.showSaveDialog(this.new) == 0) {
                object = jFileChooser.getSelectedFile();
                try {
                    this.new.getJModsPfadTextField().setText(((File)object).getAbsolutePath());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(this.new, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                    exception.printStackTrace();
                }
            }
        }
        if (jButton == this.new.getJDatenButton()) {
            JFileChooser jFileChooser = new JFileChooser(this.new.getJDatenPfadTextField().getText());
            jFileChooser.setFileSelectionMode(1);
            serializable = new File("daten");
            jFileChooser.setSelectedFile((File)serializable);
            if (jFileChooser.showSaveDialog(this.new) == 0) {
                object = jFileChooser.getSelectedFile();
                try {
                    this.new.getJDatenPfadTextField().setText(((File)object).getAbsolutePath());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(this.new, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                    exception.printStackTrace();
                }
            }
        }
        if (jButton == this.new.getJLogButton()) {
            JFileChooser jFileChooser = new JFileChooser(this.new.getJLogsPfadTextField().getText());
            jFileChooser.setFileSelectionMode(1);
            serializable = new File("logs");
            jFileChooser.setSelectedFile((File)serializable);
            if (jFileChooser.showSaveDialog(this.new) == 0) {
                object = jFileChooser.getSelectedFile();
                try {
                    this.new.getJLogsPfadTextField().setText(((File)object).getAbsolutePath());
                }
                catch (Exception exception) {
                    JOptionPane.showMessageDialog(this.new, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                    exception.printStackTrace();
                }
            }
        }
        if (jButton == this.new.getJSpeichernButton()) {
            this.\u00f800000();
        }
        if (jButton == this.new.getJProfiButton()) {
            if (this.\u00d300000.isProfiMode()) {
                this.\u00d300000.setProfiMode(false);
            } else {
                this.\u00d300000.setProfiMode(true);
            }
            this.null();
        }
    }

    private boolean \u00f600000() {
        JFileChooser jFileChooser = new JFileChooser(new File(this.\u00d300000.getPfad("heldenPfad")).getParent());
        jFileChooser.setFileSelectionMode(1);
        if (jFileChooser.showSaveDialog(this.new) == 0) {
            File file = jFileChooser.getSelectedFile().getAbsoluteFile();
            try {
                Map<String, PfadMapItem> map = this.\u00d300000.getAll();
                this.new.getJHeldenPfadTextField().setText(file + System.getProperty("file.separator") + map.get("heldenPfad").getLokalPfad());
                this.new.getJPluginPfadTextField().setText(file + System.getProperty("file.separator") + map.get("pluginPfad").getLokalPfad());
                this.new.getJHintergrundPfadTextField().setText(file + System.getProperty("file.separator") + map.get("hintergruende").getLokalPfad());
                this.new.getJBildPfadTextField().setText(file + System.getProperty("file.separator") + map.get("heldBildPfad").getLokalPfad());
                this.new.getJHilfePfadTextField().setText(file + System.getProperty("file.separator") + map.get("hilfeTextePfad").getLokalPfad());
                this.new.getJSavePfadTextField().setText(file + System.getProperty("file.separator") + map.get("erschaffungsSavesPfad").getLokalPfad());
                this.new.getJModsPfadTextField().setText(file + System.getProperty("file.separator") + map.get("mods").getLokalPfad());
                this.new.getJDatenPfadTextField().setText(file + System.getProperty("file.separator") + map.get("daten").getLokalPfad());
                this.new.getJLogsPfadTextField().setText(file + System.getProperty("file.separator") + map.get("logs").getLokalPfad());
                if (this.\u00d300000.isProfiMode()) {
                    JOptionPane.showMessageDialog(this.new, "Alle Pfade wurden angepasst, \nes muss aber noch gespeichert werden", "Info", 1);
                }
                return true;
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(this.new, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                exception.printStackTrace();
            }
        }
        return false;
    }

    private void \u00d800000() {
        if (this.new.getJBildPfadTextField().hasChanged()) {
            String string = this.new.getJBildPfadTextField().getText();
            String string2 = this.new.getJBildPfadTextField().getDefaultText();
            Object[] objectArray = new Object[]{"Verschieben", "Kopieren", "Nein"};
            int n = JOptionPane.showOptionDialog(this.new, "Sollen die Heldenbilder vom alten Verzeichnis \nin das neue Verzeichnis kopiert/verschoben werden?", "Frage", 1, 3, null, objectArray, objectArray[0]);
            if (n == 0) {
                M.\u00d200000(string2, string, true);
            }
            if (n == 1) {
                M.\u00d200000(string2, string);
            }
            int n2 = this.o00000.int().getModel().getSize();
            for (int i2 = 0; i2 < n2; ++i2) {
                OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = (OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)this.o00000.int().getModel().getElementAt(i2);
                String string3 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.forsuper();
                if (!string3.contains(string2)) continue;
                String string4 = string + string3.substring(string2.length(), string3.length());
                oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(string4);
            }
            this.\u00d300000.setPath("heldBildPfad", string);
        }
    }

    private boolean \u00d600000() {
        if (!this.new.getJHeldenPfadTextField().checkPfad()) {
            return false;
        }
        if (!this.new.getJPluginPfadTextField().checkPfad()) {
            return false;
        }
        if (!this.new.getJHintergrundPfadTextField().checkPfad()) {
            return false;
        }
        if (!this.new.getJBildPfadTextField().checkPfad()) {
            return false;
        }
        if (!this.new.getJHilfePfadTextField().checkPfad()) {
            return false;
        }
        if (!this.new.getJSavePfadTextField().checkPfad()) {
            return false;
        }
        if (!this.new.getJModsPfadTextField().checkPfad()) {
            return false;
        }
        if (!this.new.getJDatenPfadTextField().checkPfad()) {
            return false;
        }
        return this.new.getJLogsPfadTextField().checkPfad();
    }

    private void \u00d500000() {
        if (this.new.getJDatenPfadTextField().hasChanged()) {
            String string = this.new.getJDatenPfadTextField().getText();
            String string2 = this.new.getJDatenPfadTextField().getDefaultText();
            Object[] objectArray = new Object[]{"Verschieben", "Kopieren", "Nein"};
            int n = JOptionPane.showOptionDialog(this.new, "Sollen die eigenen Talente vom alten Verzeichnis \nin das neue Verzeichnis kopiert/verschoben werden?", "Frage", 1, 3, null, objectArray, objectArray[0]);
            if (n == 0) {
                M.\u00d200000(string2, string, true);
            }
            if (n == 1) {
                M.\u00d200000(string2, string);
            }
            this.\u00d300000.setPath("daten", string);
        }
    }

    private void \u00d200000() {
        if (this.new.getJHeldenPfadTextField().hasChanged()) {
            int n;
            String string = this.new.getJHeldenPfadTextField().getText();
            String string2 = this.new.getJHeldenPfadTextField().getDefaultText();
            this.\u00d300000.setPath("heldenPfad", string);
            S.super(this.o00000).\u00d300000();
            Object[] objectArray = new Object[]{"Verschieben", "Kopieren", "Nein"};
            int n2 = JOptionPane.showOptionDialog(this.new, "Sollen die Helden vom alten Verzeichnis \nin das neue Verzeichnis kopiert/verschoben werden?", "Frage", 1, 3, null, objectArray, objectArray[0]);
            if (n2 == 0) {
                this.\u00d300000.getPfad("heldenPfad");
                M.\u00d200000(string2, string, true);
                M.o00000(new File(string2 + ".ok"));
            }
            if (n2 == 1) {
                this.\u00d300000.getPfad("heldenPfad");
                M.\u00d200000(string2, string);
            }
            if ((n = JOptionPane.showConfirmDialog(this.new, "Sollen die Helden aus dem neuen Pfad neu geladen werden?", "Frage", 0)) == 0) {
                i_0.o00000(this.o00000).o00000();
            }
        }
    }

    private void o00000() {
        if (this.new.getJHilfePfadTextField().hasChanged()) {
            String string = this.new.getJHilfePfadTextField().getText();
            String string2 = this.new.getJHilfePfadTextField().getDefaultText();
            Object[] objectArray = new Object[]{"Verschieben", "Kopieren", "Nein"};
            int n = JOptionPane.showOptionDialog(this.new, "Sollen die Hilfetexte vom alten Verzeichnis \nin das neue Verzeichnis kopiert/verschoben werden?", "Frage", 1, 3, null, objectArray, objectArray[0]);
            if (n == 0) {
                M.\u00d200000(string2, string, true);
            }
            if (n == 1) {
                M.\u00d200000(string2, string);
            }
            this.\u00d300000.setPath("hilfeTextePfad", string);
        }
    }

    private void for() {
        if (this.new.getJHintergrundPfadTextField().hasChanged()) {
            String string = this.new.getJHintergrundPfadTextField().getText();
            String string2 = this.new.getJHintergrundPfadTextField().getDefaultText();
            Object[] objectArray = new Object[]{"Verschieben", "Kopieren", "Nein"};
            int n = JOptionPane.showOptionDialog(this.new, "Sollen die Hintergr\u00fcnde vom alten Verzeichnis \nin das neue Verzeichnis kopiert/verschoben werden?", "Frage", 1, 3, null, objectArray, objectArray[0]);
            if (n == 0) {
                M.\u00d200000(string2, string, true);
            }
            if (n == 1) {
                M.\u00d200000(string2, string);
            }
            int n2 = this.o00000.int().getModel().getSize();
            for (int i2 = 0; i2 < n2; ++i2) {
                OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = (OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)this.o00000.int().getModel().getElementAt(i2);
                DruckEinstellungen druckEinstellungen = Einstellungen.getInstance().getSeitenEinstellungen(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
                if (druckEinstellungen.getBackgroudPath().equals("#")) continue;
                File file = new File(druckEinstellungen.getBackgroudPath());
                String string3 = file.getName();
                String string4 = string + "/" + string3 + "/";
                druckEinstellungen.setBackgroudPath(string4);
            }
            this.\u00d300000.setPath("hintergruende", string);
        }
    }

    private void \u00d2O0000() {
        this.new.getJHeldenPfadTextField().setDefaultText(this.\u00d300000.getPfad("heldenPfad"));
        this.new.getJPluginPfadTextField().setDefaultText(this.\u00d300000.getPfad("pluginPfad"));
        this.new.getJHintergrundPfadTextField().setDefaultText(this.\u00d300000.getPfad("hintergruende"));
        this.new.getJBildPfadTextField().setDefaultText(this.\u00d300000.getPfad("heldBildPfad"));
        this.new.getJHilfePfadTextField().setDefaultText(this.\u00d300000.getPfad("hilfeTextePfad"));
        this.new.getJSavePfadTextField().setDefaultText(this.\u00d300000.getPfad("erschaffungsSavesPfad"));
        this.new.getJModsPfadTextField().setDefaultText(this.\u00d300000.getPfad("mods"));
        this.new.getJDatenPfadTextField().setDefaultText(this.\u00d300000.getPfad("daten"));
        this.new.getJLogsPfadTextField().setDefaultText(this.\u00d300000.getPfad("logs"));
        this.new.setLocationRelativeTo(null);
        this.new.setVisible(true);
    }

    private void \u00f500000() {
        if (this.new.getJLogsPfadTextField().hasChanged()) {
            String string = this.new.getJLogsPfadTextField().getText();
            String string2 = this.new.getJLogsPfadTextField().getDefaultText();
            Object[] objectArray = new Object[]{"Verschieben", "Kopieren", "Nein"};
            int n = JOptionPane.showOptionDialog(this.new, "Sollen die Logs vom alten Verzeichnis \nin das neue Verzeichnis kopiert/verschoben werden?", "Frage", 1, 3, null, objectArray, objectArray[0]);
            boolean bl = Logger.getInstance().isLogging();
            if (n == 0) {
                if (bl) {
                    Logger.getInstance().stopLogging();
                }
                M.\u00d200000(string2, string, true);
                if (bl) {
                    Logger.getInstance().startLoging();
                }
            }
            if (n == 1) {
                if (bl) {
                    Logger.getInstance().stopLogging();
                }
                M.\u00d200000(string2, string);
                if (bl) {
                    Logger.getInstance().startLoging();
                }
            }
            this.\u00d300000.setPath("logs", string);
        }
    }

    private void oO0000() {
        if (this.new.getJModsPfadTextField().hasChanged()) {
            String string = this.new.getJModsPfadTextField().getText();
            String string2 = this.new.getJModsPfadTextField().getDefaultText();
            Object[] objectArray = new Object[]{"Verschieben", "Kopieren", "Nein"};
            int n = JOptionPane.showOptionDialog(this.new, "Sollen die eigenen Rassen vom alten Verzeichnis \nin das neue Verzeichnis kopiert/verschoben werden?", "Frage", 1, 3, null, objectArray, objectArray[0]);
            if (n == 0) {
                M.\u00d200000(string2, string, true);
            }
            if (n == 1) {
                M.\u00d200000(string2, string);
            }
            this.\u00d300000.setPath("mods", string);
        }
    }

    private void \u00f800000() {
        if (this.\u00d600000()) {
            this.\u00d200000();
            this.\u00d300000();
            this.for();
            this.\u00d800000();
            this.o00000();
            this.String();
            this.oO0000();
            this.\u00d500000();
            this.\u00f500000();
            JOptionPane.showMessageDialog(this.new, "Die Pfadanpassung war erfolgreich!\n");
            S.super(this.o00000).\u00d300000();
            this.new.setVisible(false);
        }
    }

    private void \u00d300000() {
        if (this.new.getJPluginPfadTextField().hasChanged()) {
            String string = this.new.getJPluginPfadTextField().getText();
            String string2 = this.new.getJPluginPfadTextField().getDefaultText();
            Object[] objectArray = new Object[]{"Verschieben", "Kopieren", "Nein"};
            int n = JOptionPane.showOptionDialog(this.new, "Sollen die Plugins vom alten Verzeichnis \nin das neue Verzeichnis kopiert/verschoben werden?", "Frage", 1, 3, null, objectArray, objectArray[0]);
            if (n == 0) {
                JOptionPane.showMessageDialog(this.new, "Der alte Pluginordner wird erst beim n\u00e4chsten Start des Heldentools gel\u00f6scht!", "Info", 1);
                M.\u00d200000(string2, string, true);
            }
            if (n == 1) {
                M.\u00d200000(string2, string);
            }
            this.\u00d300000.setPath("pluginPfad", string);
            this.o00000.\u00f4O0000();
        }
    }

    private void String() {
        if (this.new.getJSavePfadTextField().hasChanged()) {
            String string = this.new.getJSavePfadTextField().getText();
            String string2 = this.new.getJSavePfadTextField().getDefaultText();
            Object[] objectArray = new Object[]{"Verschieben", "Kopieren", "Nein"};
            int n = JOptionPane.showOptionDialog(this.new, "Sollen die Erschaffungssaves vom alten Verzeichnis \nin das neue Verzeichnis kopiert/verschoben werden?", "Frage", 1, 3, null, objectArray, objectArray[0]);
            if (n == 0) {
                M.\u00d200000(string2, string, true);
            }
            if (n == 1) {
                M.\u00d200000(string2, string);
            }
            this.\u00d300000.setPath("erschaffungsSavesPfad", string);
        }
    }

    private void null() {
        this.new.setLabelVisible(this.\u00d300000.isProfiMode());
        if (this.\u00d300000.isProfiMode()) {
            this.new.getJProfiButton().setText("Einfach");
        } else {
            this.new.getJProfiButton().setText("Experte");
        }
        this.new.getJSpeichernButton().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJHeldenButton().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJPluginButton().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJHintergrundButton().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJBilderButton().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJHilfeButton().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJSaveButton().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJModsButton().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJDatenButton().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJLogButton().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJHeldenPfadTextField().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJPluginPfadTextField().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJHintergrundPfadTextField().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJBildPfadTextField().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJHilfePfadTextField().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJSavePfadTextField().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJModsPfadTextField().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJDatenPfadTextField().setVisible(this.\u00d300000.isProfiMode());
        this.new.getJLogsPfadTextField().setVisible(this.\u00d300000.isProfiMode());
    }
}

