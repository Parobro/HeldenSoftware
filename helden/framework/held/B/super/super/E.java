/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.D.P;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;
import java.util.ArrayList;

public class E
extends oooo_0 {
    public static final int \u00d2\u00d20000 = 0;
    public static final int \u00f6o0000 = 1;
    public static final int interfacesuper = 2;
    public static final int o\u00d20000 = 3;
    private ArrayList<P> O\u00d20000 = new ArrayList();

    public E(K k2) {
        super(k2, new String[]{"Ritual", "Probe", "Dauer", "Kosten"});
        for (P p2 : k2.\u00f5O0000()) {
            if (!p2.returnnew()) continue;
            this.O\u00d20000.add(p2);
        }
    }

    @Override
    public String o00000(int n, int n2) {
        switch (n2) {
            case 0: {
                return this.O\u00d20000.get(n).toString();
            }
            case 1: {
                return "";
            }
            case 2: {
                return "";
            }
            case 3: {
                return "";
            }
        }
        return "Fehler! spaltenIndex: " + n2;
    }

    @Override
    public int o00000() {
        return this.O\u00d20000.size();
    }
}

