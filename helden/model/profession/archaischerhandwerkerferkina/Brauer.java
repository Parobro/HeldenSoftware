/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.archaischerhandwerkerferkina;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.archaischerhandwerkerferkina.ArchaischerHandwerkerDerFerkinas;

public class Brauer
extends ArchaischerHandwerkerDerFerkinas {
    public Brauer() {
        super("Brauer", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Brauer";
        }
        return "Brauerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 3);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8O\u00d8000, 7);
        return k_02;
    }
}

