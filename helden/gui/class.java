/*
 * Decompiled with CFR 0.152.
 */
package helden.gui;

import helden.framework.Einstellungen;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.A;
import helden.gui.OooO;
import helden.gui.allgemein.ExampleFileFilter;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class class
extends AbstractAction {
    private static class super;
    private A \u00d200000;

    public static class o00000(A a2) {
        if (super == null) {
            super = new class(a2);
        }
        return super;
    }

    private class(A a2) {
        super("Portr\u00e4t des Helden importieren ...", OooO.\u00d300000().\u00d400000());
        this.\u00d200000 = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = this.\u00d200000.\u00d2O0000();
        JFileChooser jFileChooser = new JFileChooser();
        ExampleFileFilter exampleFileFilter = new ExampleFileFilter();
        exampleFileFilter.addExtension("jpg");
        exampleFileFilter.addExtension("gif");
        exampleFileFilter.addExtension("png");
        exampleFileFilter.setDescription("JPG, PNG & GIF Images");
        jFileChooser.setFileFilter(exampleFileFilter);
        if (Einstellungen.getInstance().getPfade().getPfad("heldBildPfad").endsWith(System.getProperty("file.separator"))) {
            jFileChooser.setSelectedFile(new File(Einstellungen.getInstance().getPfade().getPfad("heldBildPfad") + "*.jpg"));
        } else {
            jFileChooser.setSelectedFile(new File(Einstellungen.getInstance().getPfade().getPfad("heldBildPfad") + System.getProperty("file.separator") + "*.jpg"));
        }
        if (jFileChooser.showOpenDialog(this.\u00d200000) == 0) {
            File file = jFileChooser.getSelectedFile();
            try {
                oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.o00000(file.getAbsolutePath());
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog(this.\u00d200000, "Fehler beim \u00d6ffnen des Bildes", exception.getMessage(), 0);
                exception.printStackTrace();
            }
        }
    }
}

