/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.archaischerhandwerkersued;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.archaischerhandwerkersued.VarianteArchaischerHandwerkerDesSuedens;

public class Fleischer
extends VarianteArchaischerHandwerkerDesSuedens {
    public Fleischer() {
        super("Fleischer/Metzger/Schlachter", 2);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Fleischer/Metzger/Schlachter";
        }
        return "Fleischerin/Metzgerin/Schlachterin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.\u00d200000(voidsuper.oO\u00d6000, 7);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d5\u00d6000, 3);
        return k_02;
    }
}

