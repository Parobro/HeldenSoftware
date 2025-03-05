/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.E.B;
import helden.framework.E.F;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;
import java.util.ArrayList;

public class while
extends oooo_0 {
    private static final int ObjectString = 14;
    public static final int \u00d2\u00d60000 = 0;
    public static final int \u00d6\u00d50000 = 1;
    public static final int \u00d5\u00d50000 = 2;
    public static final int o\u00d50000 = 3;
    public static final int O\u00d50000 = 4;
    public static final int \u00f6\u00d50000 = 5;
    public static final int \u00f4\u00d50000 = 6;
    public static final int \u00f5\u00d50000 = 7;
    public static final int voidString = 8;
    public static final int floatString = 9;
    public static final int \u00d2\u00d50000 = 10;
    public static final int \u00d4\u00d50000 = 11;
    public static final int O\u00d60000 = 12;
    public static final int interfaceObject = 13;
    private ArrayList<F> o\u00d60000 = this.\u00d200000().OO0000().oO0000();

    public while(K k2) {
        super(k2, new String[]{"Name", "Ko", "Br", "R\u00fc", "Ba", "LA", "RA", "LB", "RB", "Ges", "gRS", "gBE", "RS", "BE"});
    }

    public String O\u00d20000(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.\u00f6O0000()).toString();
    }

    public String \u00f6o0000(int n) {
        if (n == this.o00000() - 1) {
            return new Integer(this.\u00d200000().OO0000().\u00d300000()).toString();
        }
        helden.framework.E.C.B b = (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        if (b.\u00d3O0000()) {
            return "*";
        }
        return new Integer(b.\u00f600000()).toString();
    }

    public String \u00d6o0000(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.\u00f800000()).toString();
    }

    @Override
    public String o00000(int n, int n2) {
        switch (n2) {
            case 0: {
                return this.dosuper(n);
            }
            case 1: {
                return this.\u00d2o0000(n);
            }
            case 2: {
                return this.\u00d6o0000(n);
            }
            case 3: {
                return this.\u00d5o0000(n);
            }
            case 4: {
                return this.O\u00d20000(n);
            }
            case 5: {
                return this.o\u00d20000(n);
            }
            case 6: {
                return this.interfacesuper(n);
            }
            case 7: {
                return this.\u00d4o0000(n);
            }
            case 8: {
                return this.\u00f5o0000(n);
            }
            case 9: {
                return this.Oo0000(n);
            }
            case 10: {
                return this.\u00f4o0000(n);
            }
            case 11: {
                return this.intsuper(n);
            }
            case 12: {
                return this.oo0000(n);
            }
            case 13: {
                return this.\u00f6o0000(n);
            }
        }
        return "Zeile(" + n + ") Spalte( " + n2 + ") nicht vorhanden";
    }

    public String intsuper(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.\u00f600000()).toString();
    }

    public String Oo0000(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.\u00f8O0000()).toString();
    }

    public String \u00f4o0000(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.oO0000()).toString();
    }

    public String \u00d2o0000(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.\u00f8O0000()).toString();
    }

    public String o\u00d20000(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.\u00d6O0000()).toString();
    }

    public String \u00d4o0000(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.\u00f500000()).toString();
    }

    public String dosuper(int n) {
        if (n == this.o00000() - 1) {
            return "Gesamt";
        }
        F f2 = this.o\u00d60000.get(n);
        return f2.OO0000();
    }

    public String interfacesuper(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.\u00d8O0000()).toString();
    }

    public String \u00f5o0000(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.\u00d5O0000()).toString();
    }

    public String oo0000(int n) {
        if (n == this.o00000() - 1) {
            return new Integer(this.\u00d200000().OO0000().for()).toString();
        }
        helden.framework.E.C.B b = (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.\u00d2O0000()).toString();
    }

    public String \u00d5o0000(int n) {
        helden.framework.E.C.B b = n == this.o00000() - 1 ? this.\u00d200000().OO0000().\u00f800000() : (helden.framework.E.C.B)this.o\u00d60000.get(n).o00000(B.OO0000, 0);
        return new Integer(b.newsuper()).toString();
    }

    @Override
    public int \u00d500000() {
        return 14;
    }

    @Override
    public int o00000() {
        if (this.o\u00d60000.size() > 9) {
            return 10;
        }
        return this.o\u00d60000.size() + 1;
    }

    @Override
    public boolean \u00d400000() {
        return this.o\u00d60000.size() == 0;
    }
}

