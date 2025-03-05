/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.kurtisane;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class Hure
extends N {
    public Hure() {
        super("Hure/Lustknabe", 0);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Lustknabe";
        }
        return "Hure";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.privateclass);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f6\u00f5o000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d30\u00d2000, "Kleinstadt/Stadtteil"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 3);
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 1);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.o00000(E.newnewString, 3);
        k_02.o00000(voidsuper.o\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 4);
        k_02.o00000(voidsuper.returnforObject, 3);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.o00000(voidsuper.thisvoidObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 2);
        k_02.o00000(voidsuper.whilenewObject, 2);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d5000, 5);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 5);
        k_02.o00000(voidsuper.thisinterfaceObject, 5);
        k_02.o00000(voidsuper.forclassObject, 2);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 4);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.O\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.O\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.returnifObject, 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.newif);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00f4\u00f4o000);
        arrayList.add(I.\u00f4\u00f8o000);
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

