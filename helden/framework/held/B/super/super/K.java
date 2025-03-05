/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.OoOO.E;
import helden.framework.held.B.super.super.O00O;
import helden.framework.held.D;
import helden.framework.oooo.oo0o_0;
import java.util.List;

public class K
extends O00O {
    public static final int \u00d2\u00f60000 = 1;
    public static final int \u00d5\u00f60000 = 2;
    public static final int o\u00f60000 = 3;
    public static final int \u00d4\u00f60000 = 4;
    public static final int intvoid = 5;

    public K(helden.framework.held.K k2, List<oo0o_0> list) {
        super(k2, new String[]{"Kampftechniken", "", "BE", "AT", "PA", "TaW"}, list);
    }

    @Override
    public final String o00000(int n, int n2) {
        String string;
        E e = (E)this.oO0000().get(n);
        switch (n2) {
            case 0: {
                string = e.toString();
                break;
            }
            case 1: {
                string = e.getSteigernKategorie().toString();
                break;
            }
            case 2: {
                string = e.superclass().toString();
                break;
            }
            case 3: {
                string = this.\u00d200000().o00000(e) + "";
                break;
            }
            case 4: {
                string = this.\u00d200000().new(e) + "";
                break;
            }
            case 5: {
                try {
                    string = this.\u00d200000().\u00d300000((oo0o_0)e) + "";
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

