/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.schiffer;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.schiffer.Schiffer;

public class Flussschiffer
extends Schiffer {
    public Flussschiffer() {
        super("Flussschiffer", 2);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Flussschiffer";
        }
        return "Flussschifferin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(E.\u00d5\u00d6\u00d8000, 1);
        k_02.\u00d200000(voidsuper.nullObjectObject, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.thisclassObject, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00f6\u00d5000, 2);
        return k_02;
    }
}

