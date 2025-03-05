/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.bettler;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.while;
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

public class BettlerVariante
extends N {
    public BettlerVariante() {
        super("Bettler", 0);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.privateclass);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.newStringsuper);
        arrayList.add(I.\u00d4\u00d8O000);
        arrayList.add(I.ifStringsuper);
        arrayList.add(I.Ooo000);
        arrayList.add(I.newfor);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d4000.toString()));
        arrayList.add(K.o00000(voidsuper.\u00d30\u00d8000, "Betteln"));
        arrayList.add(K.o00000(voidsuper.O\u00f6\u00d5000, "Ortseinsch\u00e4tzung"));
        arrayList.add(oooo_0.o00000(while.\u00d30\u00d2000, "Stadtteil/Kleinstadt"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(G.StringdoString);
                arrayList.add(G.o\u00f8\u00f5000);
                int[] nArray = new int[]{5, 2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.O\u00d3\u00d6000);
                arrayList.add(voidsuper.O\u00d8\u00d5000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.OO\u00d6000);
                arrayList.add(voidsuper.whilenewObject);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 1);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.\u00d200000(E.newnewString, 3);
        k_02.\u00d200000(voidsuper.returnforObject, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.thisvoidObject, 4);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 3);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 6);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 5);
        k_02.\u00d200000(voidsuper.forclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 6);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.returnifObject, 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00f4O0000);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.privateclasssuper);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.o\u00f8O000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d8\u00f60000, "Bettler, Bettelv\u00f6gte, Travia-Geweihte, Gardisten");
        j2.oO0000(18);
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

