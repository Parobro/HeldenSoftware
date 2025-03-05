/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.D.P;
import helden.framework.OoOO.N;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class X
extends oooo_0 {
    public static final int \u00d5\u00f50000 = 0;
    public static final int publicreturn = 1;
    private ArrayList<P> \u00d4\u00f50000 = new ArrayList();

    public X(K k2) {
        super(k2, new String[]{"Andere", "TaW"});
        for (P p2 : k2.\u00f5O0000()) {
            if (!p2.\u00d500000() && !p2.new()) continue;
            this.\u00d4\u00f50000.add(p2);
        }
    }

    @Override
    public String o00000(int n, int n2) {
        switch (n2) {
            case 0: {
                return this.\u00d4\u00f50000.get(n).toString();
            }
            case 1: {
                try {
                    if (!this.\u00d4\u00f50000.get(n).\u00d4\u00d20000()) {
                        return new Integer(this.\u00d200000().\u00d300000((oo0o_0)N.floatsuper().\u00d200000(this.\u00d4\u00f50000.get(n).toString()))).toString();
                    }
                    return "n/a";
                }
                catch (D d2) {
                    d2.printStackTrace();
                }
            }
        }
        return "Fehler! ZeilenIndex " + n + " SpaltenIndex " + n2;
    }

    @Override
    public int o00000() {
        return this.\u00d4\u00f50000.size();
    }
}

