/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.gelehrter;

import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.gelehrter.BasisGelehrter;

public class PhilosophMetaphysikerStaatskundler
extends BasisGelehrter {
    public PhilosophMetaphysikerStaatskundler() {
        super("Philosoph/Metaphysiker/Staatskundler", "Philosoph/Metaphysiker/Staatskundler", 2, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Staatskunst"), 3);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

