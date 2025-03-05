/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.BasisKrieger;

public class Punin
extends BasisKrieger {
    public Punin() {
        super("Punin", 21);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d8\u00d6\u00d8000, 4);
        k_02.\u00d200000(E.O\u00d6\u00d8000, 5);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(E.\u00f4\u00d4\u00d8000, 6);
        k_02.\u00d200000(E.ifthisString, 4);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        return k_02;
    }

    @Override
    public String toString() {
        return "K\u00f6nigliches Kriegerseminar zu Punin";
    }
}

