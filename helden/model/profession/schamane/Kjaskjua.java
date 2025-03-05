/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class Kjaskjua
extends N {
    public Kjaskjua() {
        super("Kaskjua", 7);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hundeschlitten");
        arrayList.add("Karrenschlitten");
        arrayList.add("erprobtes Paavi-Pony");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Kasknuk (Nivesen-Schamane)";
        }
        return "Kaskju (Nivesen-Schamanin)";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f8o0000);
        arrayList.add(I.\u00f5\u00f40000);
        arrayList.add(I.\u00f8oO000);
        arrayList.add(I.\u00d8\u00f6O000);
        arrayList.add(I.\u00d4oO000);
        arrayList.add(I.o\u00f50000);
        arrayList.add(I.Stringdo);
        arrayList.add(I.while);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.ooO000);
        arrayList.add(I.nullfloat);
        arrayList.add(I.\u00d5\u00f4O000);
        arrayList.add(I.\u00f400000);
        arrayList.add(I.\u00f8\u00d6o000);
        arrayList.add(I.privatedo);
        arrayList.add(I.\u00f8\u00d6O000);
        arrayList.add(I.\u00f8\u00d5O000);
        arrayList.add(I.\u00d8\u00d60000);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.o\u00d5O000);
        arrayList.add(I.o\u00d3o000);
        return arrayList;
    }

    @Override
    public ArrayList<I> getEntfernteKutlurVorteile() {
        ArrayList<I> arrayList = super.getEntfernteKutlurVorteile();
        arrayList.add(I.whilereturn);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
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
        k_02.o00000(b_0.\u00d8\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.thiswhilesuper.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f4\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6o\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.nullif.toString()));
        arrayList.add(oooo_0.o00000(while.returnObjectclass.toString()));
        arrayList.add(oooo_0.o00000(while.fornull.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5O\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d80000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5o\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.whilevoidclass.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f4\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f5\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d6000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.o00000(voidsuper.newnewObject, 5);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.returnwhileObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.StringclassObject, 3);
        k_02.o00000(voidsuper.StringvoidObject, 3);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 5);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.o00000(voidsuper.nullObjectObject, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d2\u00d6000, 1);
        k_02.o00000(voidsuper.Oo\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 3);
        k_02.o00000(voidsuper.StringObjectObject, 3);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 5);
        k_02.o00000(voidsuper.privateObjectObject, 4);
        k_02.o00000(voidsuper.\u00d3\u00d4\u00d6000, 2);
        k_02.o00000(voidsuper.newforObject, 1);
        k_02.o00000(voidsuper.O\u00d6\u00d6000, 1);
        k_02.o00000(voidsuper.o\u00f8\u00d6000, 0);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f50000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnStringsuper);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d3\u00d3O000);
        arrayList.add(I.whilereturn);
        arrayList.add(I.o\u00d2O000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d8\u00d2\u00d8000));
        arrayList.add(new for(while.o\u00d4\u00d3000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f5\u00d8o000));
        M m = (M)K.o00000(I.\u00d3\u00d20000);
        m.\u00d2o0000();
        m.o00000("Wind");
        m.o00000("Eis");
        m.o00000("Feuer");
        oo0O.\u00d300000(m);
        oo0O.\u00d300000(K.o00000(I.o0\u00d2000));
        oo0O.\u00d300000(K.o00000(I.\u00d4\u00d30000));
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "Religion", 8));
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "Geld", 8));
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "Adelsherrschaft", 8));
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

