/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.gelehrter;

import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.gelehrter.BasisGelehrter;

public class Medicus
extends BasisGelehrter {
    public Medicus() {
        super("Medicus", "Medicus", 6, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Gift"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kochen"), 4);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

