/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.hofkuenstler;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public abstract class Hofkuenstler
extends N {
    public Hofkuenstler() {
        super("Hofkuenstler", 0);
    }

    public Hofkuenstler(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hochwertiges Handwerksger\u00e4t");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Hofk\u00fcnstler";
        }
        return "Hofk\u00fcnstlerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.O\u00f60000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.thisdo);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00d4\u00d8o000);
        arrayList.add(I.\u00d3\u00d30000);
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
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.o00000(E.newnewString, 1);
        k_02.o00000(voidsuper.\u00d5O\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d5000, 3);
        k_02.o00000(voidsuper.O0\u00d6000, 5);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 3);
        k_02.o00000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.o00000(voidsuper.oo\u00d6000, 2);
        k_02.o00000(voidsuper.o\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper3, 6);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.\u00d4\u00f4o000);
        arrayList.add(I.newStringsuper);
        arrayList.add(I.\u00d3Oo000);
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

