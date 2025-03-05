/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.streuner;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.streuner.VarianteStreuner;

public class Hochstapler
extends VarianteStreuner {
    public Hochstapler() {
        super("Hochstapler", 3);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Hochstapler";
        }
        return "Hochstaplerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 4);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.forclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 3);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        return k_02;
    }
}

