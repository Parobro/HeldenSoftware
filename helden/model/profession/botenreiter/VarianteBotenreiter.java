/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.botenreiter;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class VarianteBotenreiter
extends N {
    public VarianteBotenreiter() {
        super("Botenreiter", 0);
    }

    public VarianteBotenreiter(String string, int n) {
        super(string, 0 + n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Erfahrenes Pferd");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Botenreiter";
        }
        return "Botenreiterin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.o\u00f4o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00d3\u00d30000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4, 4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
                arrayList.add(voidsuper.thisclassObject);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.newnewString, 1);
        k_02.o00000(voidsuper.ifforObject, 3);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d5O\u00d6000, 5);
        k_02.o00000(voidsuper.returnprivateObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.o00000(voidsuper.O0\u00d6000, 4);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.o00000(voidsuper.thisinterfaceObject, 1);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.StringvoidObject, 5);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.nullObjectObject, 3);
        k_02.o00000(voidsuper.o\u00f4\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.ifnullObject, 5);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper3, 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.newif);
        arrayList.add(I.nullclass);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.newfor);
        arrayList.add(I.privateclass);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                ArrayList<P> arrayList2 = this.getProfession().getSetting().getGelaendekunden();
                for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
                    arrayList.add(new for(P.new(arrayList2.get(i2).toString())));
                }
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.nullifString));
        arrayList.add(new for<String>("\u00dcbliche Strecke", while.\u00d30\u00d2000, false));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

