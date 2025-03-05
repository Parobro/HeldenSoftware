/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.haendler;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.haendler.Haendler;

public class FahrenderHaendler
extends Haendler {
    public FahrenderHaendler() {
        super("Fahrender H\u00e4ndler", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Fahrender H\u00e4ndler";
        }
        return "Fahrende H\u00e4ndlerin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.whilethisString, 2);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.nullObjectObject, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        return k_02;
    }
}

