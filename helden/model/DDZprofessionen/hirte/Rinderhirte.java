/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.hirte;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.hirte.VarianteHirte;

public class Rinderhirte
extends VarianteHirte {
    public Rinderhirte() {
        super("Rinderhirte", 5);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Rinderhirte";
        }
        return "Rinderhirtin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 1);
        k_02.\u00d200000(E.whilethisString, 5);
        k_02.\u00d200000(E.\u00f5\u00d5\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 5);
        k_02.o00000(voidsuper.returnwhileObject);
        return k_02;
    }
}

