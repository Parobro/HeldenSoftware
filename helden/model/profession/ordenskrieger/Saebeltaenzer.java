/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.ordenskrieger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class Saebeltaenzer
extends N {
    public Saebeltaenzer() {
        super("S\u00e4belt\u00e4nzer", 17);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Pferd");
        arrayList.add("prachtvoller S\u00e4bel");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "S\u00e4belt\u00e4nzer";
        }
        return "S\u00e4belt\u00e4nzerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00d4\u00d8o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00f5\u00d6000.toString()));
        arrayList.add(oooo_0.o00000(while.iffloatObject.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d3\u00f6000.toString()));
        arrayList.add(oooo_0.o00000(while.newint.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d3\u00f8\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(G.whilewhileString);
                arrayList.add(G.newwhileString);
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(E.newnewString, 5);
        k_02.o00000(E.\u00f4\u00d4\u00d8000, 6);
        k_02.o00000(voidsuper.o\u00d2\u00d8000, 5);
        k_02.o00000(voidsuper.ifforObject, 5);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 5);
        k_02.o00000(voidsuper.\u00d5O\u00d6000, 2);
        k_02.o00000(voidsuper.returnforObject, 4);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.o00000(voidsuper.newnewObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 7);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 3);
        k_02.o00000(voidsuper.StringvoidObject, 1);
        k_02.o00000(voidsuper.\u00f4o\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.o00000(voidsuper.oo\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper3, 4);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.privateObjectObject, 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(K.o00000(I.thisintsuper, new Object[]{"D\u00e4monen"}));
        arrayList.add(I.newif);
        arrayList.add(I.ifStringsuper);
        arrayList.add(I.\u00d4\u00d8O000);
        arrayList.add(I.Ooo000);
        arrayList.add(I.O\u00d40000);
        arrayList.add(I.\u00d8\u00d6O000);
        arrayList.add(I.\u00d4\u00f4o000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d3Oo000);
        arrayList.add(I.Stringintsuper);
        arrayList.add(I.\u00d3\u00f8O000);
        arrayList.add(I.\u00f4\u00d40000);
        arrayList.add(I.\u00f4\u00f4o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d3\u00f4\u00f5000));
        arrayList.add(new for(while.\u00d2\u00d6\u00d6000));
        arrayList.add(new for(while.\u00f50o000));
        arrayList.add(new for(while.\u00d2\u00d8\u00f6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.OO0000));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Rahja"}));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000));
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "zivilisierte Umgangsformen; h\u00f6fisches Leben", 6));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

