/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.streuner;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.streuner.VarianteStreuner;

public class Schieber
extends VarianteStreuner {
    public Schieber() {
        super("Schieber", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Schieber";
        }
        return "Schieberin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.whilenewObject, -2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper.O\u00d3\u00d6000);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 3);
        return k_02;
    }
}

