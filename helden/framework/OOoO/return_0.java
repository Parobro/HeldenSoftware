/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.held.object.oooo_0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/*
 * Renamed from helden.framework.OooO.return
 */
public final class return_0 {
    public static Properties o00000(String string) throws IOException {
        Properties properties = return_0.\u00d200000();
        Properties properties2 = new Properties();
        for (Map.Entry entry : properties.entrySet()) {
            if (!entry.getKey().toString().startsWith(string)) continue;
            properties2.put(entry.getKey().toString().substring(string.length()), entry.getValue().toString());
        }
        return properties2;
    }

    public static Properties \u00d200000() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(return_0.o00000());
        properties.load(fileInputStream);
        fileInputStream.close();
        return properties;
    }

    public static void \u00d200000(String string, Properties properties) throws IOException {
        if (!string.endsWith(".")) {
            oooo_0.\u00f500000("Prefix endet nicht mit .");
        }
        Properties properties2 = return_0.o00000(string, return_0.\u00d200000());
        for (Map.Entry entry : properties.entrySet()) {
            properties2.put(string + entry.getKey(), entry.getValue());
        }
        return_0.o00000(properties2);
    }

    public static void o00000(String string, String string2) throws IOException {
        Properties properties = return_0.\u00d200000();
        properties.put(string, string2);
        return_0.o00000(properties);
    }

    private static File o00000() {
        return new File(System.getProperty("user.home") + System.getProperty("file.separator") + ".dsa4.properties");
    }

    private static Properties o00000(String string, Properties properties) {
        Properties properties2 = new Properties();
        for (Map.Entry entry : properties.entrySet()) {
            if (entry.getKey().toString().startsWith(string)) continue;
            properties2.put(entry.getKey(), entry.getValue());
        }
        return properties2;
    }

    private static void o00000(Properties properties) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(return_0.o00000());
        properties.store(fileOutputStream, "");
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    private return_0() {
    }
}

