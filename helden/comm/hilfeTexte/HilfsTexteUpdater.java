/*
 * Decompiled with CFR 0.152.
 */
package helden.comm.hilfeTexte;

import helden.Version;
import helden.comm.CommUtilities;
import helden.framework.Einstellungen;
import helden.framework.held.Object.private;
import helden.framework.held.object.oooo_0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HilfsTexteUpdater {
    private static String[] o00000 = new String[]{"Regelbasis", "Fehler", "Versionshinweise", "Updaterinfos", "Buginfo"};

    public String getAktuellenHilfsText(String string) {
        try {
            File file = new File(Einstellungen.getInstance().getPfade().getPfad("hilfeTextePfad") + "/" + string + ".html");
            Scanner scanner = file.exists() && this.o00000(string).compareTo(this.\u00d200000(string)) <= 0 ? new Scanner(file, "UTF-8") : new Scanner(ClassLoader.getSystemResourceAsStream("helden/comm/hilfeTexte/" + string + ".html"), "UTF-8");
            StringBuffer stringBuffer = new StringBuffer();
            while (scanner.hasNext()) {
                String string2 = scanner.nextLine();
                if (string2.startsWith("Version=")) continue;
                stringBuffer.append(string2);
            }
            scanner.close();
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return exception.getMessage();
        }
    }

    public void updateLocalFiles() {
        Thread thread = new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    String string = System.getProperty("os.version");
                    String string2 = System.getProperty("os.name");
                    for (String string3 : o00000) {
                        Object object;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(new CommUtilities().getHilfsTexteUrl());
                        stringBuilder.append("help.php?filename=");
                        stringBuilder.append(string3);
                        stringBuilder.append("&heldenVersion=");
                        stringBuilder.append(URLEncoder.encode(Version.getSoftwareVersion(), "UTF-8"));
                        stringBuilder.append("&sysVersion=");
                        stringBuilder.append(URLEncoder.encode(string, "UTF-8"));
                        stringBuilder.append("&sysName=");
                        stringBuilder.append(URLEncoder.encode(string2, "UTF-8"));
                        URL uRL = new URL(stringBuilder.toString());
                        Scanner scanner = new Scanner(uRL.openStream());
                        String string4 = "";
                        String string5 = "";
                        while (scanner.hasNext()) {
                            object = scanner.nextLine();
                            if (((String)object).startsWith("Version=")) {
                                string4 = ((String)object).substring("Version=".length(), ((String)object).length());
                            }
                            if (!((String)object).startsWith("hilfsTextURL=")) continue;
                            string5 = "   " + ((String)object).substring("hilfsTextURL=".length(), ((String)object).length());
                        }
                        scanner.close();
                        if (string4.compareTo(HilfsTexteUpdater.this.\u00d200000(string3)) > 0) {
                            try {
                                object = new File(Einstellungen.getInstance().getPfade().getPfad("hilfeTextePfad") + "/" + string3 + ".html");
                                HilfsTexteUpdater.this.o00000(new URL(string5), (File)object);
                                private.\u00d200000("Hilfstext " + string3 + " updated", "christian");
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                            }
                            continue;
                        }
                        oooo_0.\u00d300000("Kein Update des Hilfstextes " + string3 + " n\u00f6tig");
                    }
                }
                catch (UnknownHostException unknownHostException) {
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        thread.start();
    }

    private void o00000(URL uRL, File file) throws Exception {
        int n;
        InputStream inputStream = uRL.openStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        if (!file.delete()) {
            private.o00000("Hilfetextefile konte nicht gel\u00f6st werden " + file.toString());
        }
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
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String o00000(String string) {
        try (Scanner scanner = null;){
            scanner = new Scanner(ClassLoader.getSystemResourceAsStream("helden/comm/hilfeTexte/" + string + ".html"), "UTF-8");
            while (scanner.hasNext()) {
                String string2 = scanner.nextLine();
                if (!string2.startsWith("Version=")) continue;
                String string3 = string2.substring("Version=".length(), string2.length());
                return string3;
            }
            scanner.close();
        }
        return "0.0";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String \u00d200000(String string) {
        String string2;
        try (Scanner scanner = null;){
            File file = new File(Einstellungen.getInstance().getPfade().getPfad("hilfeTextePfad") + "/" + string + ".html");
            scanner = new Scanner(file, "UTF-8");
            while (scanner.hasNext()) {
                string2 = scanner.nextLine();
                if (!string2.startsWith("Version=")) continue;
                String string3 = string2.substring("Version=".length(), string2.length());
                return string3;
            }
            scanner.close();
        }
        return "0.0";
    }
}

