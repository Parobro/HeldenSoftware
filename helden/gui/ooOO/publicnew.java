/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.ooOO;

import helden.framework.Einstellungen;
import helden.framework.held.Object.I;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.a_0;
import helden.gui.A;
import helden.gui.OooO;
import helden.gui.allgemein.ExampleFileFilter;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public final class publicnew
extends AbstractAction {
    private static publicnew o00000;
    private static publicnew \u00d400000;
    private A Object;
    private boolean \u00d200000;

    public static publicnew o00000(A a2, boolean bl) {
        if (bl) {
            if (\u00d400000 == null) {
                \u00d400000 = new publicnew(a2, bl);
            }
            return \u00d400000;
        }
        if (o00000 == null) {
            o00000 = new publicnew(a2, bl);
        }
        return o00000;
    }

    private static String o00000(boolean bl) {
        if (!bl) {
            return "Alle Helden in separate Dateien exportieren";
        }
        return "Alle Helden in separate Dateien exportieren (ZIP)";
    }

    private publicnew(A a2, boolean bl) {
        super(publicnew.o00000(bl), OooO.\u00d300000().\u00d400000());
        this.Object = a2;
        this.\u00d200000 = bl;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = this.Object.\u00d3O0000();
        JFileChooser jFileChooser = new JFileChooser(Einstellungen.getInstance().getLetzterPfad());
        jFileChooser.setFileSelectionMode(1);
        ExampleFileFilter exampleFileFilter = new ExampleFileFilter();
        exampleFileFilter.addExtension("xml");
        exampleFileFilter.setDescription("XML");
        jFileChooser.setFileFilter(exampleFileFilter);
        File file = new File("");
        jFileChooser.setSelectedFile(file);
        String string = "";
        if (jFileChooser.showSaveDialog(this.Object) == 0) {
            File file2 = jFileChooser.getSelectedFile();
            while (!file2.exists()) {
                if (!(file2 = file2.getParentFile()).getPath().equals("")) continue;
                file2 = new File(Einstellungen.getInstance().getLetzterPfad());
            }
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                File file3 = new File(file2.getPath() + System.getProperty("file.separator") + i2 + " " + arrayList.get(i2).\u00f5o0000() + ".xml");
                try {
                    if (this.\u00d200000) {
                        file3.deleteOnExit();
                        File file4 = File.createTempFile("held", "tmp");
                        a_0.class().super(file4, arrayList.get(i2));
                        I i3 = new I();
                        File file5 = new File(arrayList.get(i2).forsuper());
                        i3.o00000(file4, file5, file3);
                        file3.exists();
                        continue;
                    }
                    a_0.class().super(file3, arrayList.get(i2));
                    continue;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    string = string + i2 + arrayList.get(i2).\u00f5o0000() + "\n";
                }
            }
            if (string.compareTo("") != 0) {
                JOptionPane.showMessageDialog(this.Object, "Fehler bei fogenden Helden:\n" + string, "Fehler beim Export des Helden", 0);
            }
            Einstellungen.getInstance().setLetzterPfad(file2.toString());
        }
    }
}

