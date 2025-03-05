/*
 * Decompiled with CFR 0.152.
 */
package helden.cloudinterface;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class CloudUtils {
    private static String[] super = new String[]{"ulisses", "uhrwerk"};

    public static boolean pruefeAufGesperrteNamen(String string) {
        String string2 = string.toLowerCase();
        for (String string3 : super) {
            if (!string2.contains(string3)) continue;
            return true;
        }
        return false;
    }

    public static boolean pruefeAufUngueltigeName(String string) {
        String string2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ\u00d6\u00dc\u00c4\u00dfabcdefghijklmnopqrstuvwxyz\u00f6\u00fc\u00e41234567890._-%$";
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (string2.indexOf(string.substring(i2, i2 + 1)) >= 0) continue;
            return true;
        }
        return false;
    }

    private CloudUtils() {
    }
}

