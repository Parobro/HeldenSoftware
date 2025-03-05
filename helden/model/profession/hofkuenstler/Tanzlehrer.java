/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.hofkuenstler;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.hofkuenstler.Hofkuenstler;
import java.util.ArrayList;

public class Tanzlehrer
extends Hofkuenstler {
    public Tanzlehrer() {
        super("Tanzlehrer", 0);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Tanzlehrer";
        }
        return "Tanzlehrerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00f5O0000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 4);
        k_02.\u00d200000(voidsuper.returnforObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 4);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 4);
        return k_02;
    }
}

