/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.oOoO.W;
import helden.framework.oooo.private_0;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.oOoO.S
 */
public class s_1
extends W<voidsuper> {
    private ArrayList<voidsuper> supersuper;
    private private_0 \u00d6O0000;

    public s_1(private_0 private_02, ArrayList<voidsuper> arrayList, int n) {
        super(n);
        this.\u00d6O0000 = private_02;
        this.supersuper = arrayList;
    }

    @Override
    public ArrayList<voidsuper> o00000() {
        return this.supersuper;
    }

    @Override
    public String return() {
        if (this.\u00d800000() == 1) {
            return "W\u00e4hle ein Mirakeltalent";
        }
        return "W\u00e4hle " + this.\u00d800000() + " Mirakeltalente";
    }

    @Override
    public void o00000(int n, K k2) {
        this.\u00d6O0000.waehleMirakeltalent(this.supersuper.get(n));
    }
}

