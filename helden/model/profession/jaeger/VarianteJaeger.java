/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.jaeger;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class VarianteJaeger
extends N {
    public VarianteJaeger() {
        super("J\u00e4ger", 11);
    }

    public VarianteJaeger(String string, int n) {
        super(string, 11 + n);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Packtier");
        arrayList.add("Ausgebildeter Jagdhund");
        arrayList.add("Ausgebildeter Jagdfalke");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "J\u00e4ger";
        }
        return "J\u00e4gerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f50O000);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ooO000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = new k_0<b_0>();
        k_02.o00000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                return new objectsuper_0(this.getProfession(), this.getProfession().getSetting().getGelaendekunden(), 1);
            }
            case 1: {
                return new objectsuper_0(this.getProfession(), this.getSetting().getSF(while.\u00f6\u00d5\u00d2000), 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                ++n;
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                ++n;
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.ifforObject);
                arrayList.add(voidsuper.\u00d5O\u00d6000);
                arrayList.add(voidsuper.thisclassObject);
                ++n;
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.forvoidObject);
                ++n;
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.oO\u00d6000);
                arrayList.add(voidsuper.Oo\u00d6000);
                ++n;
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 3);
        k_02.o00000(E.newnewString, 2);
        k_02.o00000(E.o\u00d6\u00d8000, 3);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.o00000(voidsuper.returnforObject, 5);
        k_02.o00000(voidsuper.returnprivateObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.thisvoidObject, 5);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 5);
        k_02.o00000(voidsuper.returnwhileObject, 1);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 6);
        k_02.o00000(voidsuper.\u00d5\u00d6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00f80\u00d6000, 2);
        k_02.o00000(voidsuper.StringvoidObject, 3);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 5);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.o00000(voidsuper.returnifObject, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.nullclass);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for<String>("Jagdrevier", while.\u00d30\u00d2000, false));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

