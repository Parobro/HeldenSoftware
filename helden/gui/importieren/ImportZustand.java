/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.importieren;

import helden.comm.CommUtilities;
import helden.gui.A;
import helden.gui.importieren.ImportDialog;
import helden.gui.ooOO.oO0Oo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ImportZustand
implements ActionListener {
    private A \u00d200000;
    private ImportDialog o00000 = null;

    public ImportZustand(A a2) {
        this.\u00d200000 = a2;
        this.o00000 = new ImportDialog(a2, this);
        this.o00000.setLocationRelativeTo(null);
        this.o00000.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton jButton = (JButton)actionEvent.getSource();
        if (jButton == this.o00000.getJCloseButton()) {
            this.o00000.setVisible(false);
        }
        if (jButton == this.o00000.getJImportButton()) {
            File file = null;
            boolean bl = true;
            try {
                file = this.o00000(this.o00000.getJURLTextArea().getText());
            }
            catch (Exception exception) {
                exception.printStackTrace();
                bl = false;
            }
            if (!bl || !oO0Oo.o00000(this.\u00d200000).\u00d600000(file)) {
                JOptionPane.showMessageDialog(this.\u00d200000, "Import fehlgeschlagen, Unbekanntes Dateiformat!", "Fehler beim Import", 0);
            } else {
                this.o00000.setVisible(false);
            }
        }
    }

    private File o00000(String string) throws Exception {
        int n;
        string = string.trim();
        int n2 = string.lastIndexOf(47);
        String string2 = string.substring(++n2, string.length());
        string2 = CommUtilities.replaceAllEvil(string2);
        string2 = string2.trim();
        File file = new File(System.getProperty("java.io.tmpdir") + "/" + string2);
        InputStream inputStream = new URL(string).openStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 1024);
        byte[] byArray = new byte[1024];
        while ((n = bufferedInputStream.read(byArray)) != -1) {
            bufferedOutputStream.write(byArray, 0, n);
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        fileOutputStream.close();
        return file;
    }
}

