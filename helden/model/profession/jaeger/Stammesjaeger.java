/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.jaeger;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.jaeger.VarianteJaeger;
import java.util.ArrayList;

public class Stammesjaeger
extends VarianteJaeger {
    public Stammesjaeger() {
        super("Stammesj\u00e4ger", 2);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Stammesj\u00e4ger";
        }
        return "Stammesj\u00e4gerin";
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                arrayList.add(E.\u00d4\u00d4\u00d8000);
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                ++n;
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.ifforObject);
                arrayList.add(voidsuper.\u00d5O\u00d6000);
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00d8\u00d3\u00d8000);
                ++n;
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f80\u00d8000, 2);
        k_02.\u00d200000(E.o\u00d6\u00d8000, 1);
        return k_02;
    }
}

