/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.held.J;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;
import helden.framework.oooo.b_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class G
extends oooo_0 {
    public static final int \u00f6\u00d20000 = 0;
    public static final int O\u00d30000 = 1;
    public static final int voidnew = 2;
    public static final int floatnew = 3;
    public static final int o\u00d30000 = 4;
    public static final int \u00f4\u00d20000 = 5;
    public static final int \u00f5\u00d20000 = 6;
    public static final int publicnew = 7;
    public static final int \u00d4\u00d30000 = 8;
    public static final int \u00d6\u00d30000 = 0;
    public static final int \u00d5\u00d30000 = 1;
    public static final int \u00d6\u00d20000 = 2;
    public static final int \u00d2\u00d30000 = 3;

    public G(K k2) {
        super(k2, new String[]{"Eigenschaft", "Mod.", "Start", "Aktuell"});
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        switch (n) {
            case 0: {
                string = this.o00000(b_0.whilewhilesuper, n2);
                break;
            }
            case 1: {
                string = this.o00000(b_0.newwhilesuper, n2);
                break;
            }
            case 2: {
                string = this.o00000(b_0.\u00f8\u00f4\u00d2000, n2);
                break;
            }
            case 3: {
                string = this.o00000(b_0.\u00d5\u00f4\u00d2000, n2);
                break;
            }
            case 4: {
                string = this.o00000(b_0.O\u00f5\u00d2000, n2);
                break;
            }
            case 5: {
                string = this.o00000(b_0.\u00f4\u00f4\u00d2000, n2);
                break;
            }
            case 6: {
                string = this.o00000(b_0.returnwhilesuper, n2);
                break;
            }
            case 7: {
                string = this.o00000(b_0.privatedosuper, n2);
                break;
            }
            case 8: {
                string = this.public(n2);
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

    private J \u00f500000() {
        return this.\u00d200000().\u00d3\u00d30000();
    }

    private String public(int n) {
        String string;
        switch (n) {
            case 0: {
                string = "Geschwindigkeit";
                break;
            }
            case 1: {
                string = "";
                break;
            }
            case 2: {
                string = this.\u00d200000().\u00d3\u00d30000().\u00d3O0000(b_0.O\u00f4\u00d2000) + "";
                break;
            }
            case 3: {
                string = this.\u00d200000().OO0000().returnsuper() + "";
                break;
            }
            default: {
                string = "Fehler! spaltenIndex " + n;
            }
        }
        return string;
    }

    private String o00000(b_0 b_02, int n) {
        String string;
        switch (n) {
            case 0: {
                string = b_02.toString();
                break;
            }
            case 1: {
                string = this.\u00f500000().\u00d200000(b_02) + "";
                break;
            }
            case 2: {
                string = this.\u00f500000().OO0000(b_02) + "";
                break;
            }
            case 3: {
                string = this.\u00f500000().do(b_02) + "";
                break;
            }
            default: {
                string = "Fehler! spaltenIndex " + n;
            }
        }
        return string;
    }
}

