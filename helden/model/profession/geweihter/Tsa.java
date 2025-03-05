/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.I;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.private_0;
import helden.framework.oooo.s_1;
import java.util.ArrayList;
import java.util.Vector;

public class Tsa
extends I
implements private_0 {
    private int \u00f5\u00d3\u00f5O00 = 0;
    private Vector<voidsuper> ifStringfloat;

    public Tsa() {
        this("Tsa", 14);
    }

    public Tsa(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 7;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<helden.framework.C.I> getEmpfohleneVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.\u00f8o0000);
        arrayList.add(helden.framework.C.I.\u00f800000);
        arrayList.add(helden.framework.C.I.\u00f4O\u00d2000);
        arrayList.add(helden.framework.C.I.\u00d8Oo000);
        arrayList.add(helden.framework.C.I.whilereturnsuper);
        arrayList.add(helden.framework.C.I.\u00d5\u00d3O000);
        arrayList.add(helden.framework.C.I.\u00f4\u00f80000);
        arrayList.add(K.o00000(helden.framework.C.I.\u00d8\u00f8O000, new Object[]{oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000.toString()}));
        arrayList.add(helden.framework.C.I.\u00f5\u00d50000);
        arrayList.add(helden.framework.C.I.\u00f4\u00f5o000);
        arrayList.add(helden.framework.C.I.o\u00d2O000);
        arrayList.add(helden.framework.C.I.o\u00d5O000);
        return arrayList;
    }

    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>();
        vector.add(b_0.\u00f8\u00f4\u00d2000);
        vector.add(b_0.\u00d5\u00f4\u00d2000);
        vector.add(b_0.O\u00f5\u00d2000);
        vector.add(b_0.\u00f4\u00f4\u00d2000);
        return vector;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
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
        vector.add(voidsuper.\u00d5\u00d3\u00d8000);
        vector.add(voidsuper.nullvoidObject);
        vector.add(voidsuper.forvoidObject);
        vector.add(voidsuper.oO\u00d6000);
        vector.add(voidsuper.Oo\u00d6000);
        return vector;
    }

    @Override
    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.forclassObject);
        vector.add(voidsuper.newnewObject);
        vector.add(voidsuper.\u00d4\u00d8\u00d6000);
        vector.add(voidsuper.thisinterfaceObject);
        vector.add(voidsuper.\u00d30\u00d8000);
        vector.add(voidsuper.StringclassObject);
        vector.add(voidsuper.thisintObject);
        vector.add(voidsuper.\u00f8\u00f4\u00d5000);
        return vector;
    }

    @Override
    public s_1 getNextMirakeltalentAuswahl() {
        ++this.\u00f5\u00d3\u00f5O00;
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
        arrayList.add(voidsuper.\u00d8O\u00d8000);
        arrayList.add(voidsuper.o\u00f6\u00d5000);
        arrayList.add(voidsuper.O\u00f5\u00d6000);
        arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
        arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
        arrayList.add(voidsuper.\u00d8\u00f5\u00d6000);
        arrayList.add(voidsuper.\u00d8\u00d5\u00d6000);
        arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
        arrayList.add(voidsuper.\u00f4\u00f6\u00d6000);
        arrayList.add(voidsuper.\u00d8\u00d8\u00d6000);
        arrayList.add(voidsuper.o\u00d5\u00d6000);
        arrayList.add(voidsuper.O\u00f4\u00d5000);
        arrayList.add(voidsuper.ififObject);
        arrayList.add(voidsuper.returnifObject);
        arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
        arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
        arrayList.add(voidsuper.StringfloatObject);
        arrayList.add(voidsuper.whilewhileObject);
        arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
        arrayList.add(voidsuper.\u00d3\u00f8\u00d6000);
        arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
        arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
        arrayList.add(voidsuper.newreturnObject);
        arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
        arrayList.add(voidsuper.oo\u00d8000);
        arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
        arrayList.add(voidsuper.\u00f5\u00f5\u00d6000);
        arrayList.add(voidsuper.StringObjectObject);
        arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
        return new s_1(this, arrayList, 4);
    }

    @Override
    public ArrayList<P> getSegnungen() {
        return oooo_0.\u00d200000();
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00d5\u00d5\u00d4000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f5\u00f8\u00d8000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>(22);
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.oO\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.iffloatObject.toString()));
        arrayList.addAll(this.getSegnungen());
        arrayList.add(oooo_0.o00000(while.returnintString.toString()));
        arrayList.add(oooo_0.o00000(while.nullnullclass.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d3\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.whilepublicnew.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5Oo000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.newnewObject);
                arrayList.add(voidsuper.\u00d4\u00d8\u00d6000);
                int[] nArray = new int[]{4, 3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.o\u00d2\u00d8000);
                arrayList.add(voidsuper.OO\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.O0\u00d6000);
                arrayList.add(voidsuper.O\u00f6\u00d5000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.oo\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00f4\u00d5000);
                int[] nArray = new int[]{5, 4};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
                arrayList.add(voidsuper.StringObjectObject);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.\u00d4\u00d3\u00d6000);
                arrayList.add(voidsuper.o\u00f6\u00d5000);
                arrayList.add(voidsuper.O\u00f5\u00d6000);
                arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00d8\u00f5\u00d6000);
                arrayList.add(voidsuper.o\u00f6\u00d6000);
                arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
                arrayList.add(voidsuper.\u00d8\u00d8\u00d6000);
                arrayList.add(voidsuper.privateObjectObject);
                arrayList.add(voidsuper.returnifObject);
                arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                arrayList.add(voidsuper.StringfloatObject);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                arrayList.add(voidsuper.newreturnObject);
                int[] nArray = new int[]{4, 2, 2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.o00000(E.newnewString, 3);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 4);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.thisinterfaceObject, 5);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 3);
        k_02.o00000(voidsuper.StringclassObject, 5);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d3\u00d8000, 1);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.thisintObject, 4);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 4);
        k_02.o00000(voidsuper3, 6);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 5);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 6);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.privateObjectObject, 1);
        k_02.o00000(voidsuper.returnifObject, 1);
        k_02.o00000(voidsuper.returnthisString, 4);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(K.o00000(helden.framework.C.I.thisintsuper, new Object[]{"D\u00e4monen"}));
        arrayList.add(helden.framework.C.I.\u00d5o\u00d2000);
        arrayList.add(K.o00000(helden.framework.C.I.\u00d5o0000, new Object[]{oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000.toString()}));
        arrayList.add(helden.framework.C.I.\u00f4O0000);
        arrayList.add(helden.framework.C.I.OO0000);
        arrayList.add(helden.framework.C.I.o00000);
        arrayList.add(helden.framework.C.I.newif);
        arrayList.add(helden.framework.C.I.\u00d4\u00f4o000);
        arrayList.add(helden.framework.C.I.o\u00f5O000);
        arrayList.add(helden.framework.C.I.\u00d40O000);
        arrayList.add(helden.framework.C.I.whilenewsuper);
        arrayList.add(helden.framework.C.I.\u00d3\u00d3O000);
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                arrayList.add(new for(while.newfloatnew));
                arrayList.add(new for(while.returnclassnew));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00f5O000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d3o000.toString(), new Object[]{"Tsa"}));
        J j2 = (J)K.o00000(helden.framework.C.I.\u00d50o000);
        j2.oO0000(7);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public boolean hatMehrMirakeltalentAuswahl() {
        return this.\u00f5\u00d3\u00f5O00 < 1;
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
        vector.addAll(this.ifStringfloat);
    }

    @Override
    public String toString() {
        return "Tsa";
    }

    @Override
    public void waehleMirakeltalent(voidsuper voidsuper2) {
        this.ifStringfloat.add(voidsuper2);
    }
}

