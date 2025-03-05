/*
 * Decompiled with CFR 0.152.
 */
package helden.comm.updater;

import helden.comm.CommUtilities;
import helden.comm.updater.UpdateCheck;
import helden.framework.Einstellungen;
import helden.framework.held.Object.M;
import helden.framework.held.Object.Q;
import helden.framework.held.Object.private;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class UpdaterDownloader
extends Thread {
    private String \u00d300000 = "";
    private File class = null;
    private URL \u00d400000 = null;
    private Einstellungen super = Einstellungen.getInstance();
    private CommUtilities \u00d200000 = new CommUtilities();

    public static boolean istInstalliert() {
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("pluginPfad") + "/" + UpdateCheck.getUpdaterfilename());
        return file.exists() && M.\u00d200000(file) >= 0;
    }

    public UpdaterDownloader() {
        this.class = new File(Einstellungen.getInstance().getPfade().getPfad("pluginPfad") + "/" + UpdateCheck.getUpdaterfilename());
    }

    @Override
    public void run() {
        block7: {
            try {
                this.\u00d200000();
                if (this.\u00d400000 == null) {
                    private.\u00d200000("Der Server konnte nicht erreicht werden", "christian");
                    return;
                }
                if (!Q.o00000(this.class).equals(this.\u00d300000)) {
                    private.\u00d200000("Update gefunden", "christian");
                    this.o00000();
                } else {
                    private.\u00d200000("Kein Update gefunden", "christian");
                }
            }
            catch (UnknownHostException unknownHostException) {
                if (this.super.getActor().equals("christian")) {
                    System.out.println("Keine Internetverbindung");
                }
            }
            catch (Exception exception) {
                if (!this.super.getActor().equals("christian")) break block7;
                exception.printStackTrace();
            }
        }
    }

    private void \u00d200000() throws Exception {
        URL uRL = new URL(this.\u00d200000.getServerUrlUpdater() + "index.php?pw=autoUpdater");
        int n = 0;
        while (n <= 3 && (this.\u00d400000 == null || this.\u00d300000.equals(""))) {
            Scanner scanner = new Scanner(uRL.openStream());
            while (scanner.hasNext()) {
                String string = scanner.nextLine();
                if (string.startsWith("UpdatePath=")) {
                    this.\u00d400000 = new URL(string.substring("UpdatePath=".length(), string.length()));
                }
                if (!string.startsWith("MD5=")) continue;
                this.\u00d300000 = string.substring("Md5=".length(), string.length());
            }
            scanner.close();
            if (++n < 3) continue;
            throw new IOException("Server liefert M\u00fcll");
        }
    }

    private void o00000() throws Exception {
        if (this.class.isDirectory()) {
            this.class.delete();
        }
        if (!this.class.exists()) {
            this.class.createNewFile();
        }
        if (this.class.exists() && this.class.canWrite()) {
            File file = new File("t");
            try {
                int n;
                String string = this.class.getAbsolutePath();
                file = new File(string + ".temp");
                file.createNewFile();
                InputStream inputStream = this.\u00d400000.openStream();
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
                if (!Q.o00000(file).equals(this.\u00d300000)) {
                    private.\u00d200000("Download fehler", "christian");
                    throw new Exception("Download fehler");
                }
                this.class.delete();
                file.renameTo(this.class);
                private.\u00d200000("Download erfolgreich", "christian");
            }
            catch (Exception exception) {
                file.delete();
                if (M.\u00d200000(this.class) == 0) {
                    this.class.delete();
                }
                throw exception;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Der Autoupdater konnte, aufgrund fehlender Schreibrechte im PluginOrdner, nicht installiert werden.", "Keine Schreibrechte", 0);
            private.\u00d200000("localPath) " + this.class.getAbsolutePath(), "christian");
            private.\u00d200000("localPath.exists() " + this.class.exists(), "christian");
            private.\u00d200000("localPath.isFile() " + this.class.isFile(), "christian");
            private.\u00d200000("localPath.canWrite() " + this.class.canWrite(), "christian");
            throw new IOException("Dateirechte fehlen");
        }
    }
}

