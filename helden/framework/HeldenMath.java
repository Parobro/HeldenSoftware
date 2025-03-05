/*
 * Decompiled with CFR 0.152.
 */
package helden.framework;

import java.math.BigDecimal;

public final class HeldenMath {
    public static int anderthalbGerundet(int n) {
        float f2 = 1.5f * (float)n;
        float f3 = Math.round(f2);
        return Math.round(f3);
    }

    public static int dreiviertel(int n) {
        int n2 = Math.round((float)n * 0.75f);
        if (n2 == 0) {
            n2 = 1;
        }
        return n2;
    }

    public static int drittel(int n) {
        int n2 = Math.round((float)n / 3.0f);
        return n2;
    }

    public static int durchFuenfzig(int n) {
        int n2 = Math.round((float)n / 50.0f);
        return n2;
    }

    public static int fuenftel(int n) {
        double d2 = (double)n / 5.0;
        return Math.round((float)d2);
    }

    public static boolean ganzzaehlig(double d2) {
        return d2 == Math.floor(d2);
    }

    public static int getMaxAp(int n) {
        int n2 = (n + 1) * n * 50 - 1;
        return n2;
    }

    public static int getMinAp(int n) {
        int n2 = n * (n - 1) * 50;
        return n2;
    }

    @Deprecated
    public static int getStufe(int n) {
        if (n < 0) {
            return 0;
        }
        int n2 = 0;
        int n3 = 1;
        while (n >= n2) {
            n2 = ++n3 * (n3 - 1) * 50;
        }
        return n3 - 1;
    }

    public static int getStufe40(int n) {
        if (n < 0) {
            return 0;
        }
        int n2 = 0;
        int n3 = 1;
        while (n >= n2) {
            n2 = ++n3 * (n3 - 1) * 50;
        }
        return n3 - 1;
    }

    public static int getStufe41(int n) {
        return n / 1000;
    }

    public static int haelfte(int n) {
        int n2 = Math.round((float)n * 0.5f);
        return n2;
    }

    public static double round(double d2, int n) {
        BigDecimal bigDecimal = new BigDecimal(d2);
        return bigDecimal.setScale(n, 4).doubleValue();
    }

    public static int runde(double d2) {
        return (int)Math.round(d2);
    }

    public static int runde(float f2) {
        return Math.round(f2);
    }

    public static int viertel(int n) {
        double d2 = (double)n / 4.0;
        return Math.round((float)d2);
    }

    public static int zehntel(int n) {
        int n2 = Math.round((float)n * 0.1f);
        return n2;
    }

    private HeldenMath() {
    }
}

