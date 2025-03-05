/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.tageloehner;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.tageloehner.VarianteTageloehner;
import java.util.ArrayList;

public class Bauhelfer
extends VarianteTageloehner {
    public Bauhelfer() {
        super("Bauhelfer", 2);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Bauhelfer";
        }
        return "Bauhelferin";
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.add(voidsuper.\u00f4\u00f6\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                arrayList.add(voidsuper.oo\u00d8000);
                int[] nArray = new int[]{3, 1};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 3);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.OOO000);
        arrayList.add(I.newnew);
        return arrayList;
    }
}

