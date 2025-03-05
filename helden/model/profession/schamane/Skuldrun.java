/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.public;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;

public class Skuldrun
extends N {
    public Skuldrun() {
        super("Skuldrun", 2);
    }

    public Skuldrun(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Schmuckst\u00fccke aus Bernstein");
        arrayList.add("Schmuckst\u00fccke aus Elfenbein");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thisintsuper);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.whilenull);
        arrayList.add(I.Stringsuper);
        arrayList.add(I.ooO000);
        arrayList.add(I.forclasssuper);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.forvoid);
        arrayList.add(I.\u00d5\u00d40000);
        arrayList.add(I.\u00d8\u00d4O000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
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
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.\u00d8\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{3, 1};
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
        k_02.o00000(E.\u00d3\u00d5\u00d8000, 5);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.o00000(voidsuper.thisvoidObject, 2);
        k_02.o00000(voidsuper.newnewObject, 5);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.returnwhileObject, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.thisinterfaceObject, 1);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 3);
        k_02.o00000(voidsuper.StringvoidObject, 2);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 4);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.oo\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 5);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.o00000(voidsuper2, 4);
        k_02.o00000(voidsuper.StringObjectObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d3\u00f50000);
        arrayList.add(I.whilefor);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.o\u00d2O000);
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        if (n == 0) {
            ArrayList<public> arrayList = new ArrayList<public>();
            arrayList.add(K.o00000(I.Stringdo));
            arrayList.add(K.o00000(I.O\u00d30000));
            return new o00o_0(this.getProfession(), arrayList, 1);
        }
        throw new c_1();
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return "Skuldrun";
    }

    @Override
    protected helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.\u00d400000;
    }
}

