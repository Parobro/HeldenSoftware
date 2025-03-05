/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.wundarzt;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.wundarzt.VarianteWundarzt;

public class Hebamme
extends VarianteWundarzt {
    public Hebamme() {
        super("Hebamme", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Hebamme";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        return k_02;
    }
}

