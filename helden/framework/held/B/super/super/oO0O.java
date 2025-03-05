/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.E.B;
import helden.framework.E.C.E;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;

public class oO0O
extends oooo_0 {
    private static final int doObject = 3;
    public static final int \u00d6\u00d40000 = 0;
    public static final int intObject = 1;
    public static final int \u00f6\u00d40000 = 2;
    public static final int \u00d5\u00d40000 = 3;
    public static final int \u00f5\u00d40000 = 4;
    public static final int \u00f4\u00d40000 = 5;
    public static final int \u00d4\u00d40000 = 6;

    public oO0O(K k2) {
        super(k2, new String[]{"Name", "Typ/Be", "TP", "Entfernung", "TP/Entfernung", "FK", "Anzahl Geschosse"});
    }

    public String classsuper(int n) {
        return "";
    }

    public String \u00d5O0000(int n) {
        return this.\u00d200000().OO0000().\u00f500000(++n).super().O\u00d80000() + " / " + this.\u00d200000().OO0000().\u00f500000(n).super().superclass();
    }

    @Override
    public String o00000(int n, int n2) {
        if (this.\u00d200000().OO0000().\u00d500000(n + 1) == null) {
            return "";
        }
        switch (n2) {
            case 0: {
                return this.\u00f5O0000(n);
            }
            case 1: {
                return this.\u00d5O0000(n);
            }
            case 2: {
                return this.supersuper(n);
            }
            case 3: {
                return this.\u00d6O0000(n);
            }
            case 4: {
                return this.\u00f4O0000(n);
            }
            case 5: {
                return this.\u00f6O0000(n);
            }
            case 6: {
                return this.classsuper(n);
            }
        }
        return "Zeile(" + n + ") Spalte( " + n2 + ") nicht vorhanden";
    }

    public String \u00d6O0000(int n) {
        return this.\u00d4O0000(n).\u00d6o0000().toString();
    }

    public String \u00f6O0000(int n) {
        return new Integer(this.\u00d200000().OO0000().null(n)).toString();
    }

    public String \u00f5O0000(int n) {
        return this.\u00d200000().OO0000().\u00d500000(n + 1).toString();
    }

    public String supersuper(int n) {
        return this.\u00d4O0000(n).\u00d8o0000().toString();
    }

    public String \u00f4O0000(int n) {
        return this.\u00d4O0000(n).\u00f6o0000().toString();
    }

    @Override
    public int o00000() {
        return 3;
    }

    @Override
    public boolean \u00d400000() {
        for (int i2 = 1; i2 <= 3; ++i2) {
            if (this.\u00d200000().OO0000().\u00d500000(i2) == null) continue;
            return false;
        }
        return true;
    }

    private E \u00d4O0000(int n) {
        return (E)this.\u00d200000().OO0000().\u00d500000(n + 1).o00000(B.class, 0);
    }
}

