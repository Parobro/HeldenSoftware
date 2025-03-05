/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.bauer;

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
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public abstract class Bauer
extends N {
    public Bauer(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ziege");
        arrayList.add("Packesel");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Bauer";
        }
        return "B\u00e4urin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                return new objectsuper_0(this.getProfession(), this.getProfession().getSetting().getGelaendekunden(), 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d30\u00d2000, "Ackerland/Dorf"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d8\u00d5\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f4\u00d5\u00d8000);
                arrayList.add(E.\u00d5\u00d5\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.o00000(E.newnewString, 3);
        k_02.o00000(voidsuper.ifforObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 1);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f80\u00d6000, 1);
        k_02.o00000(voidsuper.StringvoidObject, 1);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 5);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 1);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d2\u00d6000, 6);
        k_02.o00000(voidsuper.\u00d5o\u00d8000, 2);
        k_02.o00000(voidsuper.oO\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.o00000(voidsuper.returnifObject, 2);
        k_02.o00000(voidsuper.\u00f8\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00d5\u00d6000, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

