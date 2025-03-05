/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.OoOO.voidsuper;
import helden.framework.held.B.super.super.O00O;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.oooo.oo0o_0;
import java.util.List;

public class O
extends O00O {
    public static final int \u00d6\u00f60000 = 1;
    public static final int dovoid = 2;

    public O(K k2, String string, List<oo0o_0> list) {
        super(k2, new String[]{string, "", "TaW"}, list);
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        voidsuper voidsuper2 = (voidsuper)this.oO0000().get(n);
        switch (n2) {
            case 0: {
                string = voidsuper2.toString();
                break;
            }
            case 1: {
                string = voidsuper2.getTalentprobe().toString();
                break;
            }
            case 2: {
                try {
                    string = this.\u00d200000().\u00d300000((oo0o_0)voidsuper2) + "";
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

