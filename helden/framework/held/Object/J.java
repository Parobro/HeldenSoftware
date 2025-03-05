/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class J {
    private static char[] \u00d200000;
    private static byte[] super;

    public static char[] o00000(byte[] byArray) {
        int n = byArray.length;
        int n2 = (n * 4 + 2) / 3;
        int n3 = (n + 2) / 3 * 4;
        char[] cArray = new char[n3];
        int n4 = 0;
        int n5 = 0;
        while (n4 < n) {
            int n6 = byArray[n4++] & 0xFF;
            int n7 = 0;
            int n8 = 0;
            if (n4 < n) {
                n7 = byArray[n4++] & 0xFF;
            }
            if (n4 < n) {
                n8 = byArray[n4++] & 0xFF;
            }
            int n9 = n6 >>> 2;
            int n10 = (n6 & 3) << 4 | n7 >>> 4;
            int n11 = (n7 & 0xF) << 2 | n8 >>> 6;
            int n12 = n8 & 0x3F;
            cArray[n5++] = \u00d200000[n9];
            cArray[n5++] = \u00d200000[n10];
            cArray[n5] = n5 < n2 ? \u00d200000[n11] : 61;
            cArray[n5] = ++n5 < n2 ? \u00d200000[n12] : 61;
            ++n5;
        }
        return cArray;
    }

    public static String o00000(String string) {
        return new String(J.o00000(string.getBytes()));
    }

    private J() {
    }

    static {
        int n;
        \u00d200000 = new char[64];
        int n2 = 0;
        for (n = 65; n <= 90; n = (int)((char)(n + 1))) {
            J.\u00d200000[n2++] = n;
        }
        for (n = 97; n <= 122; n = (int)((char)(n + 1))) {
            J.\u00d200000[n2++] = n;
        }
        for (n = 48; n <= 57; n = (int)((char)(n + 1))) {
            J.\u00d200000[n2++] = n;
        }
        J.\u00d200000[n2++] = 43;
        J.\u00d200000[n2++] = 47;
        super = new byte[128];
        for (n2 = 0; n2 < super.length; ++n2) {
            J.super[n2] = -1;
        }
        for (n2 = 0; n2 < 64; ++n2) {
            J.super[J.\u00d200000[n2]] = (byte)n2;
        }
    }
}

