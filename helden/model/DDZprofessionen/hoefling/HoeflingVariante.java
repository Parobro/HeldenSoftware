/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.hoefling;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class HoeflingVariante
extends N {
    public HoeflingVariante() {
        super("H\u00f6fling", 2);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Reittier");
        arrayList.add("weiterer Luxus");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.thisdo);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.\u00d5\u00d5\u00d5000);
                arrayList.add(voidsuper.forpublicObject);
                arrayList.add(voidsuper.\u00f4o\u00d6000);
                arrayList.add(voidsuper.nullvoidObject);
                arrayList.add(voidsuper.\u00f5\u00f5\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00f5\u00d5000);
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
                arrayList.add(voidsuper.privateObjectObject);
                int[] nArray = new int[]{4, 3, 2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 3);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 3);
        k_02.\u00d200000(voidsuper.returnforObject, 1);
        k_02.\u00d200000(voidsuper.thisvoidObject, 1);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 3);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 5);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 4);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 3);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d6\u00d6000, 5);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.newif);
        arrayList.add(I.\u00f4\u00f8o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(20);
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

