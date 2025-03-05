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
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.I;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;
import java.util.Vector;

public abstract class Efferd
extends I {
    public Efferd(String string, int n) {
        super(string, n);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Kleines Boot");
        return arrayList;
    }

    @Override
    public ArrayList<helden.framework.C.I> getEmpfohleneVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.\u00f5O0000);
        arrayList.add(helden.framework.C.I.\u00d8\u00f6o000);
        arrayList.add(helden.framework.C.I.\u00d4\u00d5o000);
        arrayList.add(helden.framework.C.I.o\u00d8o000);
        arrayList.add(helden.framework.C.I.O\u00d30000);
        arrayList.add(helden.framework.C.I.\u00f8\u00d4O000);
        arrayList.add(helden.framework.C.I.\u00d8\u00f60000);
        arrayList.add(helden.framework.C.I.\u00d3O0000);
        arrayList.add(helden.framework.C.I.o\u00f5O000);
        return arrayList;
    }

    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>();
        vector.add(b_0.\u00f8\u00f4\u00d2000);
        vector.add(b_0.\u00d5\u00f4\u00d2000);
        vector.add(b_0.O\u00f5\u00d2000);
        vector.add(b_0.\u00f4\u00f4\u00d2000);
        vector.add(b_0.privatedosuper);
        vector.add(b_0.returnwhilesuper);
        return vector;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    public Vector<voidsuper> getMirakelminustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.\u00f40\u00d8000);
        vector.add(voidsuper.\u00f5o\u00d6000);
        vector.add(voidsuper.O\u00f5\u00d6000);
        vector.add(voidsuper.\u00f5\u00d8\u00d5000);
        vector.add(voidsuper.o\u00f6\u00d6000);
        vector.add(voidsuper.\u00d8\u00d8\u00d6000);
        return vector;
    }

    @Override
    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.returnprivateObject);
        vector.add(voidsuper.o\u00d3\u00d6000);
        vector.add(voidsuper.StringclassObject);
        vector.add(voidsuper.\u00d5\u00f6\u00d5000);
        vector.add(voidsuper.\u00f80\u00d6000);
        vector.add(voidsuper.StringvoidObject);
        vector.add(voidsuper.\u00d4O\u00d6000);
        vector.add(voidsuper.\u00d40\u00d8000);
        vector.add(voidsuper.\u00d3o\u00d8000);
        vector.add(voidsuper.thisclassObject);
        vector.add(voidsuper.\u00d8\u00d8\u00d5000);
        vector.add(voidsuper.whileifObject);
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
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d8o000.toString()));
        arrayList.addAll(this.getSegnungen());
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d3\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f5O000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00f6\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.nullnullclass.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.o00000(E.o\u00d6\u00d8000, 3);
        k_02.o00000(E.\u00d3\u00d5\u00d8000, 3);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.o00000(voidsuper.returnprivateObject, 5);
        k_02.o00000(voidsuper.newnewObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.o00000(voidsuper.O0\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.StringclassObject, 3);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f80\u00d6000, 3);
        k_02.o00000(voidsuper.StringvoidObject, 4);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 5);
        k_02.o00000(voidsuper.nullObjectObject, 3);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.o00000(voidsuper.oo\u00d6000, 5);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.o00000(G.\u00d3\u00f8\u00f5000, 6);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 6);
        k_02.o00000(voidsuper.thisclassObject, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4o\u00d8000, 1);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(K.o00000(helden.framework.C.I.thisintsuper, new Object[]{"D\u00e4monen"}));
        arrayList.add(helden.framework.C.I.whilethissuper);
        arrayList.add(helden.framework.C.I.\u00f800000);
        arrayList.add(helden.framework.C.I.o\u00f8O000);
        arrayList.add(helden.framework.C.I.\u00f5\u00f6o000);
        arrayList.add(helden.framework.C.I.\u00d8o0000);
        arrayList.add(helden.framework.C.I.\u00d40O000);
        arrayList.add(helden.framework.C.I.\u00d3\u00d8o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.o\u00d3\u00d6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00f5O000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d3o000.toString(), new Object[]{"Efferd"}));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f5\u00d50000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00d30000));
        return oo0O;
    }

    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelminustalente());
    }

    public void setzeMirakelplustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelplustalente());
    }
}

