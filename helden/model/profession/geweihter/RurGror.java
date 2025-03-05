/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class RurGror
extends N {
    public RurGror() {
        this("RurGror", 2);
    }

    public RurGror(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("wertvolles Buch");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Priester von Rur und Gror";
        }
        return "Priesterin von Rur und Gror";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.\u00d5o0000);
        arrayList.add(I.OO\u00d2000);
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.\u00d8\u00f60000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
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
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(G.whilewhileString);
                arrayList.add(G.newwhileString);
                return new returnsuper(this.getProfession(), arrayList, 10, 10);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f6\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.returnprivateObject);
                arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.nullObjectObject);
                arrayList.add(voidsuper.\u00d5\u00d4\u00d6000);
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.o\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
                int[] nArray = new int[]{4, 3};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
                arrayList.add(voidsuper.privateObjectObject);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.returnnewString, 1);
        k_02.o00000(E.newnewString, 1);
        k_02.o00000(voidsuper.returnforObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.thisvoidObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.o00000(voidsuper.O0\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.thisinterfaceObject, 5);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 3);
        k_02.o00000(voidsuper.StringclassObject, 6);
        k_02.o00000(voidsuper.StringvoidObject, 1);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.oo\u00d6000, 6);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.o00000(voidsuper.thisintObject, 5);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 6);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 5);
        k_02.o00000(voidsuper.\u00d5\u00f5\u00d5000, 4);
        k_02.o00000(G.\u00f4\u00d2\u00f5000, 6);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 8);
        k_02.o00000(G.\u00d3o\u00f5000, 6);
        k_02.o00000(G.\u00f8\u00f8\u00f4000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.returnifObject, 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.whilefor);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000));
        J j2 = (J)K.o00000(I.\u00d50o000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.\u00d5\u00f60000);
        j3.oO0000(7);
        oo0O.\u00d300000(j3);
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

