/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.I;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;
import java.util.Vector;

public abstract class Peraine
extends I {
    public Peraine(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Maultier");
        arrayList.add("Pferd");
        arrayList.add("Kleiner Karren");
        arrayList.add("Buch \u00fcber Heilkunde");
        return arrayList;
    }

    @Override
    public ArrayList<helden.framework.C.I> getEmpfohleneVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.\u00d4\u00d5o000);
        arrayList.add(helden.framework.C.I.\u00d5\u00d50000);
        arrayList.add(helden.framework.C.I.o\u00f4o000);
        arrayList.add(helden.framework.C.I.\u00f8\u00d4O000);
        arrayList.add(helden.framework.C.I.\u00d3\u00d40000);
        arrayList.add(helden.framework.C.I.ooO000);
        arrayList.add(helden.framework.C.I.\u00f5\u00d50000);
        arrayList.add(helden.framework.C.I.o\u00d5O000);
        return arrayList;
    }

    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>();
        vector.add(b_0.newwhilesuper);
        vector.add(b_0.\u00f8\u00f4\u00d2000);
        vector.add(b_0.\u00d5\u00f4\u00d2000);
        vector.add(b_0.O\u00f5\u00d2000);
        return vector;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    public Vector<voidsuper> getMirakelminustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.addAll(N.floatsuper().\u00d4O0000());
        vector.remove(E.\u00f4\u00d6\u00d8000);
        vector.remove(E.newnewString);
        vector.add(voidsuper.\u00d5\u00d6\u00d5000);
        vector.add(voidsuper.\u00f80\u00d6000);
        vector.add(voidsuper.nullvoidObject);
        vector.add(voidsuper.oO\u00d6000);
        vector.add(voidsuper.Oo\u00d6000);
        return vector;
    }

    @Override
    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.\u00d8\u00d5\u00d6000);
        vector.add(voidsuper.thisinterfaceObject);
        vector.add(voidsuper.StringclassObject);
        vector.add(voidsuper.o\u00d5\u00d6000);
        vector.add(voidsuper.\u00d4\u00f6\u00d6000);
        vector.add(voidsuper.\u00d5\u00d2\u00d6000);
        vector.add(voidsuper.privatedoObject);
        vector.add(voidsuper.\u00f5\u00f5\u00d6000);
        vector.add(voidsuper.\u00d5\u00d5\u00d6000);
        vector.add(voidsuper.o\u00f6\u00d6000);
        vector.add(voidsuper.\u00f5\u00d5\u00d6000);
        return vector;
    }

    @Override
    public ArrayList<P> getSegnungen() {
        return oooo_0.\u00d200000();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>(22);
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.oo\u00f5000.toString()));
        arrayList.addAll(this.getSegnungen());
        arrayList.add(oooo_0.o00000(while.newinterface.toString()));
        arrayList.add(oooo_0.o00000(while.nullnullclass.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00f4\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00f5\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00d5o\u00d8000);
                arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                arrayList.add(voidsuper.returnifObject);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.newnewObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.O0\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.StringclassObject, 4);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d3\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.o00000(voidsuper.oo\u00d6000, 5);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper3, 4);
        k_02.o00000(voidsuper.\u00d5\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 5);
        k_02.o00000(voidsuper.StringObjectObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f8\u00f8\u00d5000, 4);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(K.o00000(helden.framework.C.I.thisintsuper, new Object[]{"D\u00e4monen"}));
        arrayList.add(helden.framework.C.I.OO0000);
        arrayList.add(helden.framework.C.I.o00000);
        arrayList.add(helden.framework.C.I.thisdo);
        arrayList.add(helden.framework.C.I.newif);
        arrayList.add(helden.framework.C.I.O\u00f4O000);
        arrayList.add(helden.framework.C.I.privateObjectsuper);
        arrayList.add(helden.framework.C.I.privateclass);
        arrayList.add(helden.framework.C.I.o\u00f8O000);
        arrayList.add(helden.framework.C.I.thisclass);
        arrayList.add(helden.framework.C.I.\u00d3\u00d8o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d2\u00d6\u00d2000));
        arrayList.add(new for(while.\u00d3\u00f5O000));
        arrayList.add(new for(while.\u00d3\u00d5\u00d8000));
        arrayList.add(new for(while.Stringnew));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00f5O000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d3o000.toString(), new Object[]{"Peraine"}));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return false;
    }

    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelminustalente());
    }

    public void setzeMirakelplustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelplustalente());
    }
}

