/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.Einstellungen;
import helden.gui.A;
import helden.gui.allgemein.ExampleFileFilter;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class O0OO
extends AbstractAction {
    private static O0OO o00000;
    private A \u00d200000;

    public static O0OO super(A a2) {
        if (o00000 == null) {
            o00000 = new O0OO(a2);
        }
        return o00000;
    }

    private O0OO(A a2) {
        super("Bilderverzeichnis w\u00e4hlen");
        this.\u00d200000 = a2;
        this.putValue("ShortDescription", "<html><body>Setzt nur den Default-Pfad f\u00fcr Bilder.<br>siehe <b>Bearbeiten/Portr\u00e4t des Helden</b> importieren");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("heldBildPfad"));
        if (!file.exists()) {
            file.mkdirs();
        }
        JFileChooser jFileChooser = new JFileChooser(Einstellungen.getInstance().getPfade().getPfad("heldBildPfad"));
        jFileChooser.setFileSelectionMode(1);
        if (jFileChooser.showSaveDialog(this.\u00d200000) == 0) {
            file = jFileChooser.getSelectedFile();
            ExampleFileFilter exampleFileFilter = new ExampleFileFilter();
            exampleFileFilter.addExtension("jpg");
            exampleFileFilter.addExtension("gif");
            exampleFileFilter.setDescription("JPG & GIF Images");
            try {
                Einstellungen.getInstance().getPfade().setPath("heldBildPfad", file.getAbsolutePath());
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(this.\u00d200000, "Fehlerhafte Pfadangabe", exception.getMessage(), 0);
                exception.printStackTrace();
            }
        }
    }
}

