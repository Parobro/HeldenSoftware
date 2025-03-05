/*
 * Decompiled with CFR 0.152.
 */
package helden.comm;

import java.awt.Desktop;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CommUtilities {
    static final String[] \u00d400000 = new String[]{"xdg-open", "x-www-browser", "google-chrome", "firefox", "opera", "epiphany", "konqueror", "conkeror", "midori", "kazehakase", "mozilla"};
    private String \u00d300000 = "http://helden-software.de/update/";
    private String super = "http://helden-software.de/update/";
    private String \u00d200000 = "http://helden-software.de/update/";

    public static String replaceAllEvil(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        string = string.trim();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c = string.charAt(i2);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == ' ' || c == '.') {
                stringBuffer.append(c);
                continue;
            }
            stringBuffer.append("_");
        }
        return stringBuffer.toString();
    }

    public static boolean showInBrowser(String string) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI(string));
                    return true;
                }
            } else if (CommUtilities.o00000(string)) {
                return true;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Ich habe keinen Browser gefunden,\num die folgende Webseite zu \u00f6ffnen:\n" + string + "\n" + "Bitte nehmen sie Kontakt zu den Programmieren auf,\ndamit wir das Problem " + "beheben k\u00f6nnen.");
        return false;
    }

    private static boolean o00000(String string) throws Exception {
        String string2 = System.getProperty("os.name");
        if (string2.startsWith("Mac OS")) {
            Class.forName("com.apple.eio.FileManager").getDeclaredMethod("openURL", String.class).invoke(null, string);
            return true;
        }
        if (string2.startsWith("Windows")) {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + string);
            return true;
        }
        for (String string3 : \u00d400000) {
            int n = Runtime.getRuntime().exec(new String[]{"which", string3}).getInputStream().read();
            if (n <= 0) continue;
            Runtime.getRuntime().exec(new String[]{string3, string});
            return true;
        }
        return false;
    }

    public String getHilfsTexteUrl() {
        return this.\u00d200000;
    }

    public File getJarPath() {
        File file;
        try {
            file = new File(URLDecoder.decode(this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath(), "UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            file = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath());
        }
        return file;
    }

    public String getServerUrl() {
        return this.super;
    }

    public String getServerUrlUpdater() {
        return this.\u00d300000;
    }
}

