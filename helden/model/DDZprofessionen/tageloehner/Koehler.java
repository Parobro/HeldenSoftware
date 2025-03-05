/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.tageloehner;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.tageloehner.VarianteTageloehner;
import java.util.ArrayList;

public class Koehler
extends VarianteTageloehner {
    public Koehler() {
        super("K\u00f6hler", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "K\u00f6hler";
        }
        return "K\u00f6hlerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.nullObjectsuper);
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f8\u00d5\u00d8000, 1);
        k_02.\u00d200000(voidsuper.ifforObject, -1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.thisvoidObject, 1);
        k_02.o00000(voidsuper.O\u00f6\u00d5000);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 3);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.nullObjectObject);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        return k_02;
    }
}

