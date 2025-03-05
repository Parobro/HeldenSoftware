/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schreiber;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.schreiber.VarianteSchreiber;
import java.util.ArrayList;

public class Seshshemet
extends VarianteSchreiber {
    public Seshshemet() {
        super("Sesh'shemet", 1);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Sesh'shem";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.thisdo);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00d3\u00d30000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 8;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 3: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.ifnullObject);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, -1);
        k_02.o00000(E.newnewString);
        k_02.o00000(voidsuper.OO\u00d6000);
        k_02.\u00d200000(voidsuper.thisvoidObject, -1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.o00000(voidsuper.O\u00f6\u00d5000);
        k_02.\u00d200000(voidsuper.forpublicObject, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d6\u00d6000, 3);
        k_02.\u00d200000(G.\u00f4\u00d4\u00f5000, 6);
        k_02.\u00d200000(G.thissuperclass, 6);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        return k_02;
    }
}

