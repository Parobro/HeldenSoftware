/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.D.P;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;
import java.util.ArrayList;

public class OooO
extends oooo_0 {
    private ArrayList<P> superObject = new ArrayList();

    public OooO(K k2) {
        super(k2, new String[]{"", ""});
        for (P p2 : k2.\u00f5O0000()) {
            if (p2.\u00d3O0000() || p2.returnnew()) continue;
            this.superObject.add(p2);
        }
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        int n3 = n;
        if (n2 == 1) {
            n3 += this.o00000();
        }
        switch (n2) {
            case 0: {
                string = this.superObject.get(n3).toString();
                break;
            }
            case 1: {
                if (n3 < this.superObject.size()) {
                    string = this.superObject.get(n3).toString();
                    break;
                }
                string = "";
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
        return Math.round((float)this.superObject.size() / 2.0f);
    }
}

