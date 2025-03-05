/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.botenreiter;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.botenreiter.VarianteBotenreiter;

public class BlauePfeile
extends VarianteBotenreiter {
    public BlauePfeile() {
        super("Blaue Pfeile", 2);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Blaue Pfeile";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 1);
        return k_02;
    }
}

