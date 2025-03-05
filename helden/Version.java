/*
 * Decompiled with CFR 0.152.
 */
package helden;

public final class Version {
    private static final String \u00d300000 = "5.5.3";
    private static final String o00000 = "20171231";
    private static final boolean new = false;

    public static String getSoftwareVersion() {
        String string = "";
        String string2 = \u00d300000;
        string = Version.versionStringToString(string2);
        return string;
    }

    public static String getTESTENDE() {
        return o00000;
    }

    public static String getVersion() {
        return \u00d300000;
    }

    public static boolean isTESTVERSION() {
        return false;
    }

    public static Integer versionStringToNummer(String string) {
        return Integer.parseInt(Version.versionStringToString(string));
    }

    public static String versionStringToString(String string) {
        String string2;
        int n = 0;
        int n2 = string.indexOf(".");
        if (n2 - n < 2) {
            string2 = "0" + string.substring(n, n2);
            n = ++n2;
        } else {
            string2 = string.substring(n, n2);
            n = ++n2;
        }
        n2 = string.indexOf(".", n);
        if (n2 - n < 2) {
            string2 = string2 + "0" + string.substring(n, n2);
            n = ++n2;
        } else {
            string2 = string2 + string.substring(n, n2);
            n = ++n2;
        }
        n2 = string.indexOf(".", n) > 0 ? string.indexOf(".", n) : string.length();
        string2 = n2 - n < 2 ? (n2 - n < 1 ? string2 + "00" : string2 + "0" + string.substring(n, n2)) : string2 + string.substring(n, n2);
        return string2;
    }

    private Version() {
    }
}

