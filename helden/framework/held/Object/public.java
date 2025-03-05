/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import java.util.Comparator;

public final class public
implements Comparator<Object> {
    private static public o00000;

    public static public o00000() {
        if (o00000 == null) {
            o00000 = new public();
        }
        return o00000;
    }

    private public() {
    }

    @Override
    public int compare(Object object, Object object2) {
        return this.o00000(object.toString().toLowerCase(), object2.toString().toLowerCase());
    }

    private int o00000(String string, String string2) {
        int n = string.length();
        int n2 = string2.length();
        int n3 = Math.min(n, n2);
        char[] cArray = string.toCharArray();
        char[] cArray2 = string2.toCharArray();
        int n4 = 0;
        int n5 = 0;
        if (n4 == n5) {
            int n6 = n3 + n4;
            for (int i2 = n4; i2 < n6; ++i2) {
                char c = cArray[i2];
                c = this.o00000(c);
                char c2 = cArray2[i2];
                if (c == (c2 = this.o00000(c2))) continue;
                return c - c2;
            }
        } else {
            while (n3-- != 0) {
                char c;
                char c3;
                if ((c3 = cArray[n4++]) == (c = cArray2[n5++])) continue;
                return c3 - c;
            }
        }
        return n - n2;
    }

    private char o00000(char c) {
        if (c == '\u00e4') {
            return 'a';
        }
        if (c == '\u00c4') {
            return 'A';
        }
        if (c == '\u00d6') {
            return 'O';
        }
        if (c == '\u00f6') {
            return 'o';
        }
        if (c == '\u00dc') {
            return 'U';
        }
        if (c == '\u00fc') {
            return 'u';
        }
        if (c == '\u00fb') {
            return 'u';
        }
        return c;
    }
}

