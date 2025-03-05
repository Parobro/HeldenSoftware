/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.bauer;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.bauer.Bauer;

public class Knecht
extends Bauer {
    public Knecht() {
        super("Knecht/Magd", 0);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Knecht";
        }
        return "Magd";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 2);
        return k_02;
    }
}

