/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.streuner;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.streuner.VarianteStreuner;

public class Spieler
extends VarianteStreuner {
    public Spieler() {
        super("Spieler", 5);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Spieler";
        }
        return "Spielerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 14;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.OO\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.whilenewObject, -1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, -2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.forclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00d3\u00d6000, 5);
        k_02.\u00d200000(voidsuper.O\u00d8\u00d5000, -1);
        return k_02;
    }
}

