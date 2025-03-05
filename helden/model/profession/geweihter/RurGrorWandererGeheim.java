/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.RurGrorWanderer;

public class RurGrorWandererGeheim
extends RurGrorWanderer {
    public RurGrorWandererGeheim() {
        this("RurGrorWandererGeheim", 8);
    }

    public RurGrorWandererGeheim(String string, int n) {
        super(string, n);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Geheimer Wanderpriester von Rur und Gror";
        }
        return "Geheime Wanderpriesterin von Rur und Gror";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.returnforObject, 2);
        k_02.\u00d200000(voidsuper.thisvoidObject, 1);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.forclassObject, 3);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 3);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

