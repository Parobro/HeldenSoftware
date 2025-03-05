/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.bauer;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.bauer.Bauer;

public class Winzer
extends Bauer {
    public Winzer() {
        super("Winzer", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Winzer";
        }
        return "Winzerin";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, -1);
        k_02.o00000(voidsuper.\u00f5\u00d5\u00d6000);
        k_02.\u00d200000(voidsuper.\u00f4\u00d8\u00d6000, 4);
        return k_02;
    }
}

