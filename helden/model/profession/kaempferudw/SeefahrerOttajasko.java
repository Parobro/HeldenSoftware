/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.kaempferudw;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.kaempferudw.BasisKaempfer;

public class SeefahrerOttajasko
extends BasisKaempfer {
    public SeefahrerOttajasko() {
        super("SeefahrerOttajasko", 11);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "K\u00e4mpfer/Seefahrer aus einer Ottajasko (UdW)";
        }
        return "K\u00e4mpferin/Seefahrerin aus einer Ottajasko (UdW)";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f80\u00d6000, 1);
        k_02.\u00d200000(G.whilewhileString, 2);
        k_02.\u00d200000(voidsuper.thisclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 2);
        k_02.\u00d200000(voidsuper.nullObjectObject, 1);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.newreturnObject, 3);
        k_02.\u00d200000(voidsuper.oo\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 2);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

