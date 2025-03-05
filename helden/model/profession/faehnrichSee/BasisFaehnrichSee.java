/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.faehnrichSee;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class BasisFaehnrichSee
extends N {
    public BasisFaehnrichSee() {
        super("F\u00e4hnrich zur See", 21);
    }

    public BasisFaehnrichSee(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.thisdo);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.thispublicsuper, 3);
        k_02.o00000(b_0.\u00d3\u00f4\u00d2000, 1);
        return k_02;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.\u00f5\u00f6o000));
        return bedingungsVerknuepfung;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(K.o00000(voidsuper.nullvoidObject, "Seegefechte"));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d3\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d8\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.\u00d4\u00d6\u00d8000, 2);
        k_02.o00000(E.\u00f4\u00d3\u00d8000, 4);
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.o00000(voidsuper.ifforObject, 3);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 4);
        k_02.o00000(voidsuper.returnprivateObject, 4);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 5);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 2);
        k_02.o00000(voidsuper.O0\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.thisinterfaceObject, 5);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 2);
        k_02.o00000(voidsuper.StringclassObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 3);
        k_02.o00000(voidsuper.StringvoidObject, 4);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.nullObjectObject, 3);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.o00000(voidsuper.oo\u00d6000, 1);
        k_02.o00000(voidsuper.o\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.nullvoidObject, 7);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 1);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f5\u00d6\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 4);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 4);
        k_02.o00000(voidsuper.thisclassObject, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.ifnullObject, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d8\u00d8\u00d5000, 6);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.newif);
        arrayList.add(I.OO0000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.\u00d2\u00d3\u00f6000));
        arrayList.add(new for(while.\u00d60\u00d5000));
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("K\u00fcrass");
        arrayList.add(new for(arrayList2, while.\u00d8\u00d3\u00d2000, false));
        arrayList2 = new ArrayList();
        arrayList2.add("Steuermann");
        arrayList.add(for.o00000(voidsuper.\u00d8\u00d8\u00d5000, arrayList2, 1));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d5oo000, "Gehorsam, Loyalit\u00e4t, Ehrenhaftigkeit");
        j2.oO0000(10);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.whilenewsuper, 2000));
        return oo0O;
    }
}

