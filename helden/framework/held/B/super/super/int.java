/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;

public class int
extends oooo_0 {
    public static final int \u00f6\u00d30000 = 0;
    public static final int \u00f5\u00d30000 = 1;
    public static final int \u00f4\u00d30000 = 2;

    public int(K k2) {
        super(k2, new String[]{"", ""});
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        switch (n) {
            case 0: {
                if (n2 == 0) {
                    string = "Rasse";
                    break;
                }
                string = this.\u00d200000().o\u00d20000().toString();
                break;
            }
            case 1: {
                if (n2 == 0) {
                    string = "Kultur";
                    break;
                }
                string = this.\u00d200000().\u00f800000().toString();
                break;
            }
            case 2: {
                if (n2 == 0) {
                    string = "Profession";
                    break;
                }
                string = this.\u00d200000().\u00d800000().toString();
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
        return 3;
    }
}

