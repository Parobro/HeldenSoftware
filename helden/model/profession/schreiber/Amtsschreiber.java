/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schreiber;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.schreiber.VarianteSchreiber;

public class Amtsschreiber
extends VarianteSchreiber {
    public Amtsschreiber() {
        super("Amtsschreiber", 0);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Amtsschreiber";
        }
        return "Amtsschreiberin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, -1);
        k_02.\u00d200000(E.newnewString, -1);
        k_02.o00000(voidsuper.OO\u00d6000);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.o00000(voidsuper.O\u00f6\u00d5000);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, -1);
        k_02.\u00d200000(voidsuper.forpublicObject, -1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, -1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.new(I.\u00d8\u00f60000);
        J j2 = (J)K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(30);
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

