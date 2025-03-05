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
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;
import java.util.Vector;

public class Aves
extends I {
    public Aves() {
        super("Aves", 9);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Pferd");
        arrayList.add("Boot");
        arrayList.add("Kamel");
        arrayList.add("Schlitten");
        arrayList.add("Kompass");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<helden.framework.C.I> getEmpfohleneVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.\u00d8\u00f6o000);
        arrayList.add(helden.framework.C.I.\u00f5\u00f60000);
        arrayList.add(helden.framework.C.I.\u00d4\u00f8o000);
        arrayList.add(helden.framework.C.I.\u00d4\u00d60000);
        arrayList.add(helden.framework.C.I.\u00d4oo000);
        arrayList.add(helden.framework.C.I.\u00d8\u00f60000);
        arrayList.add(helden.framework.C.I.forclasssuper);
        return arrayList;
    }

    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>();
        vector.add(b_0.\u00f8\u00f4\u00d2000);
        vector.add(b_0.\u00d5\u00f4\u00d2000);
        vector.add(b_0.\u00f4\u00f4\u00d2000);
        vector.add(b_0.returnwhilesuper);
        return vector;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    public Vector<voidsuper> getMirakelminustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.addAll(N.floatsuper().\u00d4O0000());
        vector.remove(E.\u00f4\u00d6\u00d8000);
        vector.remove(E.newnewString);
        return vector;
    }

    @Override
    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.\u00f8\u00f4\u00d6000);
        vector.add(voidsuper.o\u00d3\u00d6000);
        vector.add(voidsuper.O\u00f6\u00d5000);
        vector.add(voidsuper.thisinterfaceObject);
        vector.add(voidsuper.\u00d30\u00d8000);
        vector.add(voidsuper.StringclassObject);
        vector.add(voidsuper.StringvoidObject);
        vector.add(voidsuper.\u00d40\u00d8000);
        vector.add(voidsuper.\u00d3\u00f4\u00d6000);
        vector.add(voidsuper.nullObjectObject);
        vector.add(voidsuper.ifnullObject);
        vector.add(voidsuper.o\u00f8\u00d5000);
        return vector;
    }

    @Override
    public ArrayList<P> getSegnungen() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.nullnewnew.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d2\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.returnclassObject.toString()));
        arrayList.add(oooo_0.o00000(while.ifinterface.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2O\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d5\u00d4000.toString()));
        return arrayList;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f4\u00f6000.toString()));
        arrayList.addAll(this.getSegnungen());
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f5O000.toString()));
        arrayList.add(oooo_0.o00000(while.whileObjectsuper.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6O0000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5o\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f8\u00f6000.toString()));
        arrayList.add(oooo_0.o00000(while.whileintObject.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.nullsuperString);
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{6, 4, 4};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00d5o\u00d8000);
                arrayList.add(voidsuper.\u00d5O\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.returnforObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.thisvoidObject, 2);
        k_02.o00000(voidsuper.newnewObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.returnwhileObject, 2);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d5000, 3);
        k_02.o00000(voidsuper.O0\u00d6000, 2);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.forclassObject, 2);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 5);
        k_02.o00000(voidsuper.StringclassObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.o00000(voidsuper.StringvoidObject, 3);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.nullObjectObject, 5);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.o00000(voidsuper.oo\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper3, 6);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.ifnullObject, 5);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.privateObjectObject, 3);
        k_02.o00000(voidsuper.returnifObject, 1);
        k_02.o00000(voidsuper.\u00f4\u00d4\u00d5000, 3);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.OO0000);
        arrayList.add(helden.framework.C.I.\u00d3\u00d6o000);
        arrayList.add(helden.framework.C.I.newif);
        arrayList.add(helden.framework.C.I.\u00d4OO000);
        arrayList.add(helden.framework.C.I.\u00d30\u00d2000);
        arrayList.add(helden.framework.C.I.\u00f5\u00d30000);
        arrayList.add(helden.framework.C.I.newreturnsuper);
        arrayList.add(helden.framework.C.I.Stringintsuper);
        arrayList.add(helden.framework.C.I.\u00f4\u00f5o000);
        arrayList.add(helden.framework.C.I.newfor);
        arrayList.add(helden.framework.C.I.\u00d3Oo000);
        arrayList.add(helden.framework.C.I.ifStringsuper);
        arrayList.add(helden.framework.C.I.Ooo000);
        arrayList.add(helden.framework.C.I.\u00d8\u00d6O000);
        arrayList.add(helden.framework.C.I.\u00d4\u00d8O000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.StringthisObject));
        arrayList.add(new for(while.returnsuper));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d50000));
        J j2 = (J)K.o00000(helden.framework.C.I.\u00d50o000);
        j2.oO0000(7);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00d30000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d3o000.toString(), new Object[]{"Aves"}));
        return oo0O;
    }

    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelminustalente());
    }

    public void setzeMirakelplustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelplustalente());
    }

    @Override
    public String toString() {
        return "Aves";
    }

    @Override
    public boolean istZeitaufwendig() {
        return false;
    }
}

