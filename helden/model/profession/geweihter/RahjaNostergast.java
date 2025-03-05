/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.private_0;
import helden.framework.oooo.s_1;
import helden.model.profession.geweihter.Rahja;
import java.util.ArrayList;
import java.util.Vector;

public class RahjaNostergast
extends Rahja
implements private_0 {
    private int \u00d8\u00d3\u00f5O00 = 0;
    private Vector<voidsuper> \u00f4\u00d3\u00f5O00;

    public RahjaNostergast() {
        super("RahjaNostergast", 20);
    }

    public RahjaNostergast(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Einfaches Reitpferd aus Teshkaler Zucht");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.ifif);
        arrayList.add(I.privateclasssuper);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.newfor);
        arrayList.add(I.\u00d50o000);
        return arrayList;
    }

    @Override
    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>();
        vector.add(b_0.whilewhilesuper);
        vector.add(b_0.\u00f8\u00f4\u00d2000);
        vector.add(b_0.\u00d5\u00f4\u00d2000);
        vector.add(b_0.\u00f4\u00f4\u00d2000);
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
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 8;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public Vector<voidsuper> getMirakelminustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.addAll(N.floatsuper().\u00d4O0000());
        vector.remove(E.\u00f4\u00d6\u00d8000);
        vector.remove(E.newnewString);
        vector.add(voidsuper.nullvoidObject);
        return vector;
    }

    @Override
    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.\u00d4\u00d2\u00d8000);
        vector.add(voidsuper.\u00d5O\u00d6000);
        vector.add(voidsuper.o\u00d3\u00d6000);
        vector.add(voidsuper.\u00d40\u00d6000);
        vector.add(voidsuper.\u00d5\u00d5\u00d5000);
        vector.add(voidsuper.\u00d8\u00d5\u00d6000);
        vector.add(voidsuper.thisinterfaceObject);
        vector.add(voidsuper.\u00d30\u00d8000);
        vector.add(voidsuper.StringclassObject);
        return vector;
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        return k_02;
    }

    @Override
    public s_1 getNextMirakeltalentAuswahl() {
        ++this.\u00d8\u00d3\u00f5O00;
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
        arrayList.add(voidsuper.o\u00d2\u00d8000);
        arrayList.add(voidsuper.\u00d8O\u00d8000);
        arrayList.add(voidsuper.O0\u00d6000);
        arrayList.add(voidsuper.\u00f4\u00f8\u00d5000);
        arrayList.add(voidsuper.OO\u00d6000);
        arrayList.add(voidsuper.StringObjectObject);
        arrayList.add(voidsuper.\u00f5O\u00d6000);
        arrayList.add(voidsuper.privateObjectObject);
        arrayList.add(voidsuper.ififObject);
        arrayList.add(voidsuper.newnewObject);
        arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
        arrayList.add(voidsuper.StringfloatObject);
        arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
        arrayList.add(voidsuper.\u00d4\u00d8\u00d6000);
        arrayList.add(voidsuper.\u00d3\u00f8\u00d6000);
        arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
        return new s_1(this, arrayList, 2);
    }

    @Override
    public ArrayList<P> getSegnungen() {
        return oooo_0.\u00d200000();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.iffloatObject.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f80000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6O\u00d3000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 3: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.newnewString, -2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, -1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, -1);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.StringObjectObject, -1);
        k_02.\u00d200000(voidsuper.privateObjectObject, -2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.thisintsuper);
        arrayList.add(I.OO0000);
        arrayList.add(I.newif);
        arrayList.add(I.ifStringsuper);
        arrayList.add(I.\u00d4\u00d8O000);
        arrayList.add(I.Ooo000);
        arrayList.add(I.O\u00d40000);
        arrayList.add(I.\u00d8\u00d6O000);
        arrayList.add(I.\u00d4\u00f4o000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d3Oo000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.newreturnsuper);
        arrayList.add(I.Stringintsuper);
        arrayList.add(I.\u00d3\u00f8O000);
        arrayList.add(I.\u00f4\u00d40000);
        arrayList.add(I.newStringsuper);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.\u00f4\u00f4o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00f8\u00d6O000));
        arrayList.add(new for(while.\u00f8\u00d6\u00f6000));
        return arrayList;
    }

    @Override
    public boolean hatMehrMirakeltalentAuswahl() {
        return this.\u00d8\u00d3\u00f5O00 < 1;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelminustalente());
    }

    @Override
    public void setzeMirakelplustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelplustalente());
        vector.addAll(this.\u00f4\u00d3\u00f5O00);
    }

    @Override
    public String toString() {
        return "Rahja aus Andergast/Nostria (UdW)";
    }

    @Override
    public void waehleMirakeltalent(voidsuper voidsuper2) {
        this.\u00f4\u00d3\u00f5O00.add(voidsuper2);
    }
}

