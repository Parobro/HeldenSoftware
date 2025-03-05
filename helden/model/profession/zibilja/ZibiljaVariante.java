/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.zibilja;

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
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class ZibiljaVariante
extends N {
    public ZibiljaVariante() {
        super("Zibilja", 5);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("200 Jahre alter Seffer Manich");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.\u00d8\u00d4O000);
        arrayList.add(I.while);
        arrayList.add(I.\u00d3\u00d4O000);
        arrayList.add(I.ooO000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.\u00d8\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.o\u00d8O000.toString()));
        arrayList.add(oooo_0.o00000(while.nullwhilenew.toString()));
        arrayList.add(oooo_0.o00000(while.forwhileObject.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00d5\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f60\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.whileclasssuper.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d2\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d5\u00f5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList = new ArrayList();
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{5, 5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.newnewObject, 4);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 5);
        k_02.\u00d200000(voidsuper.forpublicObject, 4);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 3);
        k_02.\u00d200000(voidsuper.nullObjectObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 3);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 5);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(G.Stringsuperclass, 8);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.StringObjectObject, 4);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.privateObjectObject, 4);
        k_02.\u00d200000(voidsuper.\u00f4\u00f8\u00d6000, 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.newreturnsuper);
        arrayList.add(I.\u00f4\u00d40000);
        arrayList.add(I.whilefor);
        arrayList.add(I.o\u00d2O000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d3\u00d8\u00d6000));
        arrayList.add(new for(while.newObjectString));
        arrayList.add(new for(while.privateifObject));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f5\u00d8o000));
        oo0O.\u00d300000(K.o00000(I.\u00d4\u00d30000));
        oo0O.\u00d300000(K.o00000(I.O\u00d30000));
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00d3o000));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return "Zibilja";
    }
}

