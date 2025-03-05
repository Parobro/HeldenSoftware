/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.barde;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.barde.Barde;

public class VarianteBarde
extends Barde {
    public VarianteBarde() {
        super("Barde", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Barde";
        }
        return "Bardin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.newnewObject, 4);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.forclassObject, 1);
        k_02.\u00d200000(voidsuper.privateObjectObject, 5);
        k_02.\u00d200000(voidsuper.returnifObject, 1);
        return k_02;
    }
}

