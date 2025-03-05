/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.taugenichts;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.taugenichts.VarianteTaugenichts;
import java.util.ArrayList;

public class Stutzer
extends VarianteTaugenichts {
    public Stutzer() {
        super("Stutzer", 2);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Taugenichts/Stutzer";
        }
        return "Taugenichts/Stutzerin";
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{5, 2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(E.\u00f4\u00d6\u00d8000);
                arrayList.add(E.newnewString);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, -2);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, -1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, -1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, -2);
        return k_02;
    }
}

