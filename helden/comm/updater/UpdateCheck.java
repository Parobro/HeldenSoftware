/*
 * Decompiled with CFR 0.152.
 */
package helden.comm.updater;

import helden.Version;
import helden.comm.CommUtilities;
import helden.comm.updater.UpdaterDownloader;
import helden.framework.Einstellungen;
import helden.framework.held.Object.M;
import helden.framework.held.Object.Q;
import helden.framework.held.Object.private;
import helden.gui.A;
import helden.gui.ooOO.S;
import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class UpdateCheck {
    private static final String \u00f400000 = "autoUpdater.jar";
    private static UpdateCheck if = null;
    private A new = null;
    private CommUtilities return = null;
    private String o00000 = "";
    private String \u00d400000 = "";
    private boolean \u00d800000 = false;
    private boolean \u00d500000 = false;
    private boolean \u00d300000 = true;
    private boolean \u00f500000 = true;

    public static UpdateCheck getInstance(A a2, boolean bl) {
        if (if == null) {
            if = new UpdateCheck(a2, bl);
        }
        UpdateCheck.if.\u00d800000 = bl;
        return if;
    }

    public static String getUpdaterfilename() {
        return \u00f400000;
    }

    public static boolean isWindowsVista78() {
        if (System.getProperty("os.name").equals("Windows 7")) {
            return true;
        }
        if (System.getProperty("os.name").equals("Windows 8")) {
            return true;
        }
        return System.getProperty("os.name").equals("Windows Vista");
    }

    public static void showAutoUpdaterInfoDialog(JFrame jFrame) {
        Object[] objectArray;
        int n;
        if (!Einstellungen.getInstance().isAutoUpdate() && !Einstellungen.getInstance().isDebianMode() && (n = JOptionPane.showOptionDialog(jFrame, "Der Autoupdater ist nicht aktiv, soll er aktiviert werden?", "AutoUpdater", 1, 3, null, objectArray = new Object[]{"Autoupdater aktivieren", "schlie\u00dfen"}, objectArray[1])) == 0) {
            Einstellungen.getInstance().setAutoUpdate(true);
        }
    }

    private UpdateCheck(A a2, boolean bl) {
        this.new = a2;
        this.return = new CommUtilities();
        this.\u00d500000 = !this.return.getJarPath().isFile();
        this.\u00d800000 = bl;
        if (bl && !UpdaterDownloader.istInstalliert()) {
            UpdaterDownloader updaterDownloader = new UpdaterDownloader();
            updaterDownloader.start();
            try {
                updaterDownloader.join();
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        this.new();
    }

    public boolean isLoading() {
        return this.\u00d300000;
    }

    public boolean istAusEclipseGestartet() {
        return this.\u00d500000;
    }

    public boolean istNeueVersionVorhanden() {
        String string = Q.o00000(this.return.getJarPath());
        return !string.equals(this.\u00d400000);
    }

    public boolean istServerOnline() {
        return this.\u00f500000;
    }

    public void zeigeUpdateDialog() {
        int n = -1;
        if (M.\u00d400000(this.return.getJarPath().getParentFile())) {
            if (this.istNeueVersionVorhanden()) {
                String string = this.\u00d800000 ? "Vor dem Update speichern?" : "<html>Es wurde ein Update gefunden. Soll vor der Installation gespeichert werden?";
                Object[] objectArray = new Object[]{"Speichern", "Nichtspeichern", "UpdateInfo", "Abbrechen"};
                while (n == -1 || n == 2) {
                    n = JOptionPane.showOptionDialog(this.new, string, "Update", 1, 1, null, objectArray, objectArray[0]);
                    if (n != 2) continue;
                    String string2 = "";
                    if (!this.o00000.startsWith("<html>")) {
                        string2 = string2 + "<html>";
                    }
                    for (int i2 = 0; i2 < this.o00000.length(); ++i2) {
                        string2 = string2 + this.o00000.charAt(i2);
                        if (i2 == 0 || i2 % 40 != 0) continue;
                        string2 = string2 + "-<br>";
                    }
                    JOptionPane.showMessageDialog(this.new, string2, "UpdateInfo", 1);
                }
            } else {
                Object[] objectArray = new Object[]{"Ja und Speichern", "Ja und Nichtspeichern", "Nein"};
                n = JOptionPane.showOptionDialog(this.new, "Es wurden kein Update gefunden, soll das Heldenjar \u00fcberpr\u00fcft werden?", "Update", 1, 1, null, objectArray, objectArray[0]);
                if (n == 2) {
                    n = 3;
                }
            }
        } else {
            System.out.println("Das Heldenjar ist nicht schreibbar!");
            n = 3;
        }
        switch (n) {
            case 0: {
                S.super(this.new).\u00d300000();
                S.super(this.new).super();
            }
            case 1: {
                this.o00000();
                break;
            }
            case 3: {
                return;
            }
            default: {
                throw new RuntimeException("Case Unbekannt");
            }
        }
    }

    private String \u00d500000() {
        if (Version.getVersion().endsWith(".devel")) {
            return "devel";
        }
        if (Einstellungen.getInstance().isPreRelease()) {
            return "pre";
        }
        return "";
    }

    private String \u00d400000() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("java");
        stringBuilder.append(" ");
        stringBuilder.append("-jar");
        stringBuilder.append(" ");
        if (UpdateCheck.isWindowsVista78()) {
            stringBuilder.append(Einstellungen.getInstance().getPfade().getPfad("pluginPfad"));
            stringBuilder.append("/");
        }
        stringBuilder.append(UpdateCheck.getUpdaterfilename());
        stringBuilder.append(" ");
        try {
            stringBuilder.append("-jHeldenJar=" + URLEncoder.encode(this.return.getJarPath().getAbsolutePath(), "UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        stringBuilder.append(" ");
        stringBuilder.append("-jChannelPw=");
        try {
            stringBuilder.append(URLEncoder.encode(this.\u00d500000(), "UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        private.\u00d200000(stringBuilder.toString(), "christian");
        return stringBuilder.toString();
    }

    private void new() {
        Thread thread = new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    Object[] objectArray;
                    URL uRL = new URL(UpdateCheck.this.return.getServerUrl() + "index.php?pw=" + URLEncoder.encode(UpdateCheck.this.\u00d500000(), "UTF-8") + "&md5=" + URLEncoder.encode(Q.o00000(UpdateCheck.this.return.getJarPath()), "UTF-8"));
                    int n = 0;
                    while (UpdateCheck.this.\u00d400000.equals("") || UpdateCheck.this.o00000.equals("")) {
                        if (n > 2) {
                            throw new Exception("Serverfehler");
                        }
                        objectArray = new Scanner(uRL.openStream());
                        while (objectArray.hasNext()) {
                            String string = objectArray.nextLine();
                            if (string.startsWith("UpdateText=")) {
                                UpdateCheck.this.o00000 = "   " + string.substring("UpdateText=".length(), string.length());
                            }
                            if (!string.startsWith("MD5=")) continue;
                            UpdateCheck.this.\u00d400000 = string.substring("MD5=".length(), string.length());
                        }
                        objectArray.close();
                        ++n;
                    }
                    UpdateCheck.this.\u00d300000 = false;
                    if (!UpdateCheck.this.\u00d800000 && !UpdateCheck.this.istAusEclipseGestartet() && UpdateCheck.this.istNeueVersionVorhanden()) {
                        if (Einstellungen.getInstance().isAutoUpdate()) {
                            UpdateCheck.this.zeigeUpdateDialog();
                        } else {
                            objectArray = new Object[]{"Zur Downloadseite", "Sp\u00e4ter"};
                            int n2 = JOptionPane.showOptionDialog(UpdateCheck.this.new, "Es wurde ein Update f\u00fcr die Helden-Software gefunden", "Update", 1, 3, null, objectArray, objectArray[1]);
                            if (n2 == 0) {
                                Desktop.getDesktop().browse(new URI("http://www.helden-software.de/index.php/download/"));
                            }
                        }
                    }
                }
                catch (Exception exception) {
                    UpdateCheck.this.\u00f500000 = false;
                    System.out.println(exception.getMessage());
                }
            }
        });
        thread.start();
    }

    private void \u00d300000() {
        try {
            File file = new File(Einstellungen.getInstance().getPfade().getPfad("pluginPfad") + "\\sudo.exe");
            file.delete();
            file.createNewFile();
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("helden/comm/sudo.exe");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
            int n = 0;
            while ((n = inputStream.read()) != -1) {
                bufferedOutputStream.write(n);
            }
            inputStream.close();
            bufferedOutputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void o00000() {
        try {
            if (UpdateCheck.isWindowsVista78() && !M.\u00d400000(this.return.getJarPath().getParentFile())) {
                System.out.println("Start 64bit Updater");
                this.\u00d300000();
                System.out.println("Install fertig");
                String string = Einstellungen.getInstance().getPfade().getPfad("pluginPfad") + "\\sudo.exe -k " + this.\u00d400000();
                System.out.println(string);
                Runtime.getRuntime().exec(string, null, new File(Einstellungen.getInstance().getPfade().getPfad("pluginPfad")));
            } else {
                String string = this.\u00d400000();
                System.out.println(string);
                Runtime.getRuntime().exec(string, null, new File(Einstellungen.getInstance().getPfade().getPfad("pluginPfad")));
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        System.exit(0);
    }
}

