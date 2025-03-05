/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;

public class BoronMarbide
extends N {
    public BoronMarbide() {
        super("Marbide", 3);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, -1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, -1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        return k_02;
    }

    @Override
    public String toString() {
        return "Marbide";
    }
}

