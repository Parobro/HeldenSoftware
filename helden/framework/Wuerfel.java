/*
 * Decompiled with CFR 0.152.
 */
package helden.framework;

import java.util.Random;

public final class Wuerfel {
    private static final Random o00000 = new Random(System.currentTimeMillis());

    public static int max(int n, int n2) {
        int n3 = n * n2;
        return n3;
    }

    public static int sum(int n, int n2) {
        int n3 = 0;
        for (int i2 = 1; i2 <= n2; ++i2) {
            n3 += Wuerfel.w(n);
        }
        return n3;
    }

    public static int w(int n) {
        return Math.abs(o00000.nextInt() % n) + 1;
    }

    public static int w20() {
        return Math.abs(o00000.nextInt() % 20) + 1;
    }

    public static int w3() {
        return Math.abs(o00000.nextInt() % 3) + 1;
    }

    public static int w30() {
        return Math.abs(o00000.nextInt() % 30) + 1;
    }

    public static int w5() {
        return Math.abs(o00000.nextInt() % 5) + 1;
    }

    public static int w6() {
        return Math.abs(o00000.nextInt() % 6) + 1;
    }

    private Wuerfel() {
    }
}

