/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.kaempfer;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.kaempfer.Kaempfer;

public class AuelfischerKaempfer
extends Kaempfer {
    public AuelfischerKaempfer() {
        super("Auelfischer K\u00e4mpfer", 7);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Auelfischer K\u00e4mpfer";
        }
        return "Auelfische K\u00e4mpferin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.returnprivateObject, 2);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

