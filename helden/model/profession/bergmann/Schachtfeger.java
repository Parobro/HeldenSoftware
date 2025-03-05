/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.bergmann;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.bergmann.VarianteBergmann;

public class Schachtfeger
extends VarianteBergmann {
    public Schachtfeger() {
        super("Schachtfeger", 5);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Schachtfeger";
        }
        return "Schachtfegerin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, -1);
        k_02.\u00d200000(E.\u00f8\u00d5\u00d8000, -2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.returnforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.\u00d200000(voidsuper.forObjectObject, -2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, -1);
        return k_02;
    }
}

