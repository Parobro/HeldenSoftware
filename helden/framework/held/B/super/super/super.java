/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.OoOO.G;
import helden.framework.held.B.super.super.O00O;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.oooo.oo0o_0;
import java.util.List;

public class super
extends O00O {
    public static final int \u00f4\u00f60000 = 1;
    public static final int \u00f5\u00f60000 = 2;

    public super(K k2, List<oo0o_0> list) {
        super(k2, new String[]{"Sprachen (A)", "Komp.", "TaW"}, list);
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        G g2 = (G)this.oO0000().get(n);
        switch (n2) {
            case 0: {
                string = g2.toString().substring(16);
                break;
            }
            case 1: {
                string = g2.\u00f5\u00f40000() + "";
                break;
            }
            case 2: {
                try {
                    string = this.\u00d200000().\u00d300000((oo0o_0)g2) + "";
                    break;
                }
                catch (D d2) {
                    return "-";
                }
            }
            default: {
                string = "Fehler! spaltenIndex: " + n2;
            }
        }
        return string;
    }
}

