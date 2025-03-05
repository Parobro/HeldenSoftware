/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.hirte;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.hirte.VarianteHirte;

public class Schaefer
extends VarianteHirte {
    public Schaefer() {
        super("Sch\u00e4fer", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Sch\u00e4fer";
        }
        return "Sch\u00e4ferin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 4);
        return k_02;
    }
}

