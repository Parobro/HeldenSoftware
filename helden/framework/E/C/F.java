/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.C;

import helden.framework.E.A;
import helden.framework.E.B;
import helden.framework.E.G;

public class F
implements G {
    public static final int \u00f8o0000 = 0;
    public static final int supernew = 1;
    public static final int publicsuper = 2;
    public static final int \u00d2\u00d20000 = 3;
    public static final int \u00f6o0000 = 4;
    private int O\u00d20000;
    private int classnew;
    private int \u00d3\u00d20000;
    private boolean \u00d4\u00d20000;

    public static String \u00d8O0000(int n) {
        if (n == 1) {
            return "Kugel";
        }
        if (n == 2) {
            return "Pfeil";
        }
        if (n == 3) {
            return "Bolzen";
        }
        if (n == 4) {
            return "Stein";
        }
        return "keine";
    }

    public F(int n, int n2, int n3, boolean bl) {
        this.O\u00d20000 = n;
        this.classnew = n2;
        this.\u00d3\u00d20000 = n3;
        this.\u00d4\u00d20000 = bl;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new F(this.O\u00d20000, this.classnew, this.\u00d3\u00d20000, this.\u00d4\u00d20000);
    }

    @Override
    public A \u00d800000() {
        return B.\u00f800000;
    }

    @Override
    public String \u00d600000() {
        return null;
    }

    public int \u00d2\u00d20000() {
        return this.classnew;
    }

    public int \u00d5\u00d20000() {
        return this.\u00d3\u00d20000;
    }

    public int \u00d3\u00d20000() {
        return this.O\u00d20000;
    }

    public boolean Stringnew() {
        return this.\u00d4\u00d20000;
    }

    public void \u00f6O0000(int n) {
        this.classnew = n;
    }

    public void \u00d300000(boolean bl) {
        this.\u00d4\u00d20000 = bl;
    }

    public void \u00f5O0000(int n) {
        this.\u00d3\u00d20000 = n;
    }

    public void newsuper(int n) {
        this.O\u00d20000 = n;
    }

    protected F o\u00d20000() throws CloneNotSupportedException {
        return (F)this.clone();
    }
}

