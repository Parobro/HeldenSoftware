/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.E.B;
import helden.framework.E.C.void;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;

public class W
extends oooo_0 {
    private static final int \u00f5\u00f40000 = 7;
    private static final int voidreturn = 2;
    public static final int \u00d2\u00f50000 = 0;
    public static final int o\u00f50000 = 1;
    public static final int O\u00f50000 = 2;
    public static final int floatreturn = 3;
    public static final int \u00f6\u00f40000 = 4;
    public static final int \u00f4\u00f40000 = 5;
    public static final int \u00d6\u00f40000 = 6;

    public W(K k2) {
        super(k2, new String[]{"Name", "TYP", "INI", "WM", "PA", "minBF", "aktBF"});
    }

    public String \u00f5\u00d20000(int n) {
        return new Integer(this.\u00d6\u00d20000(n).\u00d8\u00d20000().\u00d300000()).toString();
    }

    @Override
    public String o00000(int n, int n2) {
        if (this.\u00d200000().OO0000().\u00f5O0000(n + 1) == null) {
            return "";
        }
        switch (n2) {
            case 0: {
                return this.\u00f4\u00d20000(n);
            }
            case 1: {
                return this.voidnew(n);
            }
            case 2: {
                return this.floatnew(n);
            }
            case 3: {
                return this.\u00d4\u00d20000(n);
            }
            case 4: {
                return this.\u00f6\u00d20000(n);
            }
            case 5: {
                return this.\u00d5\u00d20000(n);
            }
            case 6: {
                return this.\u00f5\u00d20000(n);
            }
        }
        return "Zeile(" + n + ") Spalte( " + n2 + ") nicht vorhanden";
    }

    public String floatnew(int n) {
        return new Integer(this.\u00d6\u00d20000(n).nullnew()).toString();
    }

    public String \u00d5\u00d20000(int n) {
        return new Integer(this.\u00d6\u00d20000(n).\u00d8\u00d20000().\u00d400000()).toString();
    }

    public String \u00f4\u00d20000(int n) {
        return this.\u00d200000().OO0000().\u00f5O0000(n + 1).OO0000();
    }

    public String \u00f6\u00d20000(int n) {
        return new Integer(this.\u00d200000().OO0000().\u00d600000(n)).toString();
    }

    @Override
    public int \u00d500000() {
        return 7;
    }

    public String voidnew(int n) {
        return B.super(this.\u00d200000().OO0000().\u00f5O0000(n + 1).float());
    }

    public String \u00d4\u00d20000(int n) {
        return this.\u00d6\u00d20000(n).\u00f5\u00d20000().toString();
    }

    @Override
    public int o00000() {
        return 2;
    }

    @Override
    public boolean \u00d400000() {
        for (int i2 = 1; i2 <= 2; ++i2) {
            if (this.\u00d200000().OO0000().\u00f5O0000(i2) == null) continue;
            return false;
        }
        return true;
    }

    private void \u00d6\u00d20000(int n) {
        return (void)this.\u00d200000().OO0000().\u00f5O0000(n + 1).o00000(B.\u00d300000, 0);
    }
}

