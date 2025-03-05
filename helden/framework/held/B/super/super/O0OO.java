/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.held.J;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;
import helden.framework.oooo.b_0;

public class O0OO
extends oooo_0 {
    private static final int oo0000 = 9;
    public static final int Oo0000 = 0;
    public static final int intsuper = 1;
    public static final int \u00f5O0000 = 2;
    public static final int \u00f4o0000 = 3;
    public static final int \u00d2o0000 = 4;
    public static final int classsuper = 5;
    public static final int \u00d5O0000 = 6;
    public static final int dosuper = 7;
    public static final int supersuper = 8;
    public static final int \u00f5o0000 = 0;
    public static final int \u00f6O0000 = 1;
    public static final int \u00d4o0000 = 2;
    public static final int \u00d5o0000 = 3;
    public static final int \u00d6o0000 = 4;
    public static final int \u00f4O0000 = 5;
    public static final int \u00d6O0000 = 6;

    public O0OO(K k2) {
        super(k2, new String[]{"Basiswerte", "Formel", "Mod.", "Start", "Aktuell", "Gekauft", "Rest"});
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        switch (n) {
            case 0: {
                string = this.o00000(b_0.\u00d3\u00f4\u00d2000, n, n2);
                break;
            }
            case 1: {
                string = this.o00000(b_0.thispublicsuper, n, n2);
                break;
            }
            case 2: {
                if (!this.\u00d200000().oo0000() && n2 >= 1) {
                    string = "";
                    break;
                }
                string = this.o00000(b_0.\u00f4\u00f5\u00d2000, n, n2);
                break;
            }
            case 3: {
                if (!this.\u00d200000().\u00d8\u00d20000() && n2 >= 1) {
                    string = "";
                    break;
                }
                string = this.o00000(b_0.\u00d4\u00f5\u00d2000, n, n2);
                break;
            }
            case 4: {
                string = this.o00000(b_0.\u00d8\u00f5\u00d2000, n, n2);
                break;
            }
            case 5: {
                string = this.o00000(b_0.\u00f4\u00d8\u00d2000, n, n2);
                break;
            }
            case 6: {
                string = this.o00000(b_0.\u00f8\u00d8\u00d2000, n, n2);
                break;
            }
            case 7: {
                string = this.o00000(b_0.ifwhilesuper, n, n2);
                break;
            }
            case 8: {
                string = this.o00000(b_0.\u00f5\u00f4\u00d2000, n, n2);
                break;
            }
            default: {
                string = "Fehler! zeilenIndex " + n + " spaltenIndex " + n2;
            }
        }
        return string;
    }

    @Override
    public int o00000() {
        return 9;
    }

    private J \u00d600000() {
        return this.\u00d200000().\u00d3\u00d30000();
    }

    private String \u00d2O0000(int n) {
        switch (n) {
            case 0: {
                return "(KO+KO+KK)/2";
            }
            case 1: {
                return "(MU+KO+GE)/2";
            }
            case 2: {
                return "(MU+IN+CH)/2";
            }
            case 3: {
                return "";
            }
            case 4: {
                return "(MU+KL+KO)/5";
            }
            case 5: {
                return "(MU+MU+IN+GE)/5";
            }
            case 6: {
                return "(MU+GE+KK)/5";
            }
            case 7: {
                return "(IN+GE+KK)/5";
            }
            case 8: {
                return "(IN+FF+KK)/5";
            }
        }
        return "Fehler! getFormel (zeilenIndex :=" + n + ")";
    }

    private String o00000(b_0 b_02, int n, int n2) {
        String string;
        switch (n2) {
            case 0: {
                string = b_02.toString();
                break;
            }
            case 1: {
                string = this.\u00d2O0000(n);
                break;
            }
            case 2: {
                string = this.\u00d600000().\u00d200000(b_02) + "";
                break;
            }
            case 3: {
                string = this.\u00d600000().do(b_02) - this.\u00d600000().\u00d200000(b_02) - this.\u00d600000().\u00d200000(b_02) + "";
                break;
            }
            case 4: {
                if (b_02 == b_0.\u00f4\u00d8\u00d2000) {
                    string = "" + this.\u00d200000().OO0000().private();
                    break;
                }
                string = this.\u00d600000().do(b_02) + "";
                break;
            }
            case 5: {
                if (n < 4) {
                    string = this.\u00d600000().\u00d200000(b_02) + "";
                    break;
                }
                string = "";
                break;
            }
            case 6: {
                if (n < 3) {
                    string = this.\u00d600000().interface(b_02) + "";
                    break;
                }
                string = "";
                break;
            }
            default: {
                string = "Fehler! spaltenIndex " + n2;
            }
        }
        return string;
    }
}

