/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.tierbaendiger;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.tierbaendiger.VarianteTierbaendiger;

public class Falkner
extends VarianteTierbaendiger {
    public Falkner() {
        super("Falkner", 2);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 0;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Falkner";
        }
        return "Falknerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.privatedosuper)) {
            return 8;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 3);
        return k_02;
    }
}

