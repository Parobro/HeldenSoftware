/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein.druckeinstellungen;

import java.io.File;

public class Utils {
    public static final String \u00d200000 = "jpeg";
    public static final String String = "jpg";
    public static final String o00000 = "gif";
    public static final String \u00d300000 = "tiff";
    public static final String \u00d500000 = "tif";
    public static final String \u00d600000 = "png";

    public static String getExtension(File file) {
        String string = null;
        String string2 = file.getName();
        int n = string2.lastIndexOf(46);
        if (n > 0 && n < string2.length() - 1) {
            string = string2.substring(n + 1).toLowerCase();
        }
        return string;
    }
}

