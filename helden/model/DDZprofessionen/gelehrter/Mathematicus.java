/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.gelehrter;

import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.gelehrter.BasisGelehrter;

public class Mathematicus
extends BasisGelehrter {
    public Mathematicus() {
        super("Mathematicus", "Mathematicus", 1, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Brett-/Kartenspiel"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kryptographie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Mechanik"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 2);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

