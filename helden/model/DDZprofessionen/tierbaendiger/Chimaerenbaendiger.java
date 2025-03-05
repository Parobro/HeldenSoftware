/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.tierbaendiger;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.tierbaendiger.VarianteTierbaendiger;

public class Chimaerenbaendiger
extends VarianteTierbaendiger {
    public Chimaerenbaendiger() {
        super("Chim\u00e4renb\u00e4ndiger", 2);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Chim\u00e4renb\u00e4ndiger";
        }
        return "Chim\u00e4renb\u00e4ndigerin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.whilethisString, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        return k_02;
    }
}

