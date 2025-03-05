/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Boron;
import java.util.ArrayList;
import java.util.Vector;

public class BoronAlAnfa
extends Boron {
    public BoronAlAnfa() {
        super("Boron, Al'Anfaner Ritus", 8);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>();
        vector.add(b_0.whilewhilesuper);
        vector.add(b_0.newwhilesuper);
        vector.add(b_0.\u00f8\u00f4\u00d2000);
        vector.add(b_0.\u00d5\u00f4\u00d2000);
        return vector;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    public Vector<voidsuper> getMirakelminustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.OO\u00d6000);
        vector.add(voidsuper.newnewObject);
        vector.add(voidsuper.returnwhileObject);
        vector.add(voidsuper.\u00d4\u00d8\u00d6000);
        vector.add(voidsuper.\u00d40\u00d6000);
        vector.add(voidsuper.\u00d5\u00d5\u00d5000);
        vector.add(voidsuper.newnullObject);
        vector.add(voidsuper.\u00d8\u00f5\u00d6000);
        vector.add(voidsuper.\u00f5O\u00d6000);
        vector.add(voidsuper.privateObjectObject);
        return vector;
    }

    @Override
    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.returnforObject);
        vector.add(voidsuper.\u00d4\u00f8\u00d5000);
        vector.add(voidsuper.thisvoidObject);
        vector.add(voidsuper.\u00d8\u00d5\u00d6000);
        vector.add(voidsuper.thisinterfaceObject);
        vector.add(voidsuper.StringclassObject);
        vector.add(voidsuper.oo\u00d6000);
        vector.add(voidsuper.o\u00d5\u00d6000);
        vector.add(voidsuper.\u00f5o\u00d6000);
        vector.add(voidsuper.\u00f4\u00d5\u00d6000);
        vector.add(voidsuper.StringObjectObject);
        vector.add(voidsuper.\u00f4\u00d6\u00d5000);
        return vector;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00f5o000.toString()));
        arrayList.add(oooo_0.o00000(while.privateprivate.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(0);
            }
            case 1: {
                arrayList.add(G.\u00f5\u00f6\u00f5000);
                arrayList.add(G.\u00d5\u00f8\u00f5000);
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(G.\u00f8\u00f8\u00f4000);
                arrayList.add(G.\u00f4\u00d4\u00f5000);
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.newnewObject, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 3);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 1);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d6\u00d6000, 2);
        k_02.\u00d200000(G.\u00d3\u00d6\u00f5000, 6);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 2);
        return k_02;
    }

    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelminustalente());
    }

    public void setzeMirakelplustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelplustalente());
    }

    @Override
    public String toString() {
        return "Boron, Al'Anfaner Ritus";
    }
}

