/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.b.super.super;

import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;

/*
 * Renamed from helden.framework.held.B.super.super.oOOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
 */
public class oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0
extends oooo_0 {
    private static final int \u00f6\u00d80000 = 1;
    public static final int O\u00f40000 = 0;
    public static final int \u00f5\u00d80000 = 1;
    public static final int \u00f4\u00d80000 = 2;
    public static final int interfaceclass = 3;

    public oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0(K k2) {
        super(k2, new String[]{"AP Gesamt", "AP verf\u00fcgbar", "AP eingesetzt", "Stufe"});
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        switch (n2) {
            case 0: {
                string = new Integer(this.\u00d200000().o\u00d30000()).toString();
                break;
            }
            case 1: {
                string = new Integer(this.\u00d200000().\u00d400000()).toString();
                break;
            }
            case 2: {
                string = new Integer(this.\u00d200000().o\u00d30000() - this.\u00d200000().\u00d400000()).toString();
                break;
            }
            case 3: {
                string = new Integer(this.\u00d200000().\u00d5\u00d30000()).toString();
                break;
            }
            default: {
                string = "Fehler! getEintrag (spalteIndex :=" + n2 + ")";
            }
        }
        return string;
    }

    @Override
    public int o00000() {
        return 1;
    }
}

