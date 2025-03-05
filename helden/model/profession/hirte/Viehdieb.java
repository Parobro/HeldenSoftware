/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.hirte;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.hirte.VarianteHirte;

public class Viehdieb
extends VarianteHirte {
    public Viehdieb() {
        super("Viehdieb", 3);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Viehdieb";
        }
        return "Viehdiebin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 4);
        k_02.\u00d200000(voidsuper.returnforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 3);
        return k_02;
    }
}

