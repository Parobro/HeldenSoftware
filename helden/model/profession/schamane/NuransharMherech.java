/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.schamane.Nuranshar;

public class NuransharMherech
extends Nuranshar {
    public NuransharMherech() {
        super("Nuransh\u00e2r (Mherech)", 4);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 0;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
        return k_02;
    }

    @Override
    public String toString() {
        return "Nuransh\u00e2r (Mheresh)";
    }
}

