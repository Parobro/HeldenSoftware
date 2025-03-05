/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
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
import helden.framework.oooo.private_0;
import helden.framework.oooo.s_1;
import java.util.ArrayList;
import java.util.Vector;

public abstract class Angrosch
extends N
implements private_0 {
    private int nullsuperfloat = 0;
    private Vector<voidsuper> \u00d30\u00f5O00;

    public Angrosch(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hochwertiges Werkzeug");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.OO\u00d2000);
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.thisdo);
        return arrayList;
    }

    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>();
        vector.add(b_0.newwhilesuper);
        vector.add(b_0.O\u00f5\u00d2000);
        vector.add(b_0.returnwhilesuper);
        vector.add(b_0.privatedosuper);
        return vector;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    public Vector<voidsuper> getMirakelminustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.o\u00d2\u00d8000);
        vector.add(voidsuper.\u00f4\u00f4\u00d6000);
        vector.add(voidsuper.OO\u00d6000);
        vector.add(voidsuper.returnprivateObject);
        vector.add(voidsuper.\u00d8\u00d3\u00d8000);
        vector.add(voidsuper.\u00f4\u00f8\u00d5000);
        vector.add(voidsuper.\u00d4O\u00d6000);
        vector.add(voidsuper.thisclassObject);
        vector.add(voidsuper.O\u00f6\u00d6000);
        vector.add(voidsuper.\u00d8\u00d8\u00d5000);
        vector.add(voidsuper.whileifObject);
        return vector;
    }

    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.\u00d4\u00f8\u00d5000);
        vector.add(voidsuper.thisinterfaceObject);
        vector.add(voidsuper.StringclassObject);
        vector.add(voidsuper.\u00d50\u00d8000);
        vector.add(voidsuper.\u00f40\u00d8000);
        vector.add(voidsuper.\u00f4\u00f6\u00d5000);
        vector.add(voidsuper.\u00f5\u00d2\u00d6000);
        vector.add(voidsuper.O\u00f4\u00d5000);
        return vector;
    }

    @Override
    public s_1 getNextMirakeltalentAuswahl() {
        ++this.nullsuperfloat;
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.add(voidsuper.whileStringObject);
        arrayList.add(voidsuper.forObjectObject);
        arrayList.add(voidsuper.o\u00f6\u00d5000);
        arrayList.add(voidsuper.\u00f80\u00d8000);
        arrayList.add(voidsuper.O\u00f5\u00d6000);
        arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
        arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
        arrayList.add(voidsuper.privateclassObject);
        arrayList.add(voidsuper.\u00d8\u00d8\u00d6000);
        arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
        arrayList.add(voidsuper.StringfloatObject);
        arrayList.add(voidsuper.oo\u00d8000);
        return new s_1(this, arrayList, 4);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.returnpublicnew.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d8\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6oo000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d2\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.returnclassObject.toString()));
        arrayList.add(oooo_0.o00000(while.ifinterface.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.Stringnull.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2O\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f50O000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d80\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f5O000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00f6\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8o\u00d6000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.whileStringObject);
                arrayList.add(voidsuper.forObjectObject);
                arrayList.add(voidsuper.o\u00f6\u00d5000);
                arrayList.add(voidsuper.privateclassObject);
                arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                arrayList.add(voidsuper.StringfloatObject);
                arrayList.add(voidsuper.oo\u00d8000);
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 3);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.o00000(voidsuper.newnewObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 2);
        k_02.o00000(voidsuper.O0\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.StringclassObject, 4);
        k_02.o00000(voidsuper.StringvoidObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d50\u00d8000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f40\u00d8000, 4);
        k_02.o00000(voidsuper.\u00f4\u00f6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper2, 2);
        k_02.o00000(G.\u00d80\u00f6000, 8);
        k_02.o00000(G.o\u00d5\u00f5000, 8);
        k_02.o00000(G.\u00f4\u00d6\u00f5000, 6);
        k_02.o00000(voidsuper.\u00f5\u00d8\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d8\u00d8\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f8\u00f5\u00d5000, 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.OO0000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.forsuper);
        arrayList.add(I.newif);
        arrayList.add(I.ifStringsuper);
        arrayList.add(I.\u00d8\u00d6O000);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.\u00d3\u00d8o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d8\u00d3o000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d5\u00f5O000));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Angrosch"}));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000));
        oo0O.\u00d300000(K.o00000(I.O\u00d5o000, "Geschuppte", 8));
        return oo0O;
    }

    @Override
    public boolean hatMehrMirakeltalentAuswahl() {
        return this.nullsuperfloat < 1;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelminustalente());
    }

    public void setzeMirakelplustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelplustalente());
        vector.addAll(this.\u00d30\u00f5O00);
    }

    @Override
    public void waehleMirakeltalent(voidsuper voidsuper2) {
        this.\u00d30\u00f5O00.add(voidsuper2);
    }
}

