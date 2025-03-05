/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.handwerker.Handwerker;

public class Mueller
extends Handwerker {
    public Mueller() {
        super("M\u00fcller", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "M\u00fcller";
        }
        return "M\u00fcllerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 4);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.privatedoObject, 2);
        return k_02;
    }
}

