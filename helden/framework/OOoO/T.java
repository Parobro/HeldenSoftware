/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oOoO;

import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.oOoO.W;
import helden.framework.oooo.k_1;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class T
extends W<voidsuper> {
    private ArrayList<voidsuper> \u00f5O0000;
    private k_1 \u00f4O0000;

    public T(k_1 k_12, ArrayList<voidsuper> arrayList, int n) {
        super(n);
        this.\u00f4O0000 = k_12;
        this.\u00f5O0000 = arrayList;
    }

    @Override
    public ArrayList<voidsuper> o00000() {
        return this.\u00f5O0000;
    }

    @Override
    public String return() {
        if (this.\u00d800000() == 1) {
            return "W\u00e4hle ein Leittalent";
        }
        return "W\u00e4hle " + this.\u00d800000() + " Leittalente";
    }

    @Override
    public void o00000(int n, K k2) {
        this.\u00f4O0000.waehleLeittalent(this.\u00f5O0000.get(n));
    }
}

