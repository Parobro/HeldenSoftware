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
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.Geweihter;
import java.util.ArrayList;

public abstract class Boron
extends I {
    public Boron(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<helden.framework.C.I> getEmpfohleneVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.OO\u00d2000);
        arrayList.add(helden.framework.C.I.O\u00d80000);
        arrayList.add(helden.framework.C.I.\u00d4\u00d5o000);
        arrayList.add(helden.framework.C.I.O\u00d30000);
        arrayList.add(helden.framework.C.I.o\u00f4o000);
        arrayList.add(helden.framework.C.I.\u00d8\u00f60000);
        arrayList.add(helden.framework.C.I.O\u00f6o000);
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
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSegnungen() {
        return oooo_0.\u00d200000();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00d5\u00d5000.toString()));
        arrayList.addAll(this.getSegnungen());
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f5O000.toString()));
        helden.framework.int.P p2 = ((Geweihter)this.getProfession()).getBoronDienerGolgaris();
        if (!this.getProfession().hatVariante(p2)) {
            arrayList.add(oooo_0.o00000(while.\u00d6O0000.toString()));
        }
        arrayList.add(oooo_0.o00000(while.nullnullclass.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5o0000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00f5\u00f5\u00d5000);
                arrayList.add(voidsuper.thisintObject);
                arrayList.add(voidsuper.\u00d3\u00d6\u00d5000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new IllegalStateException("Keine weitere Auswahl");
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(E.newnewString, 2);
        k_02.o00000(voidsuper.returnforObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 5);
        k_02.o00000(voidsuper.newnewObject, 1);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.O0\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.thisinterfaceObject, 6);
        k_02.o00000(voidsuper.StringclassObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 5);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 5);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(G.\u00d3\u00f8\u00f5000, 6);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 6);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.StringObjectObject, 3);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f5\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.whilethissuper);
        arrayList.add(K.o00000(helden.framework.C.I.thisintsuper, new Object[]{"D\u00e4monen"}));
        arrayList.add(helden.framework.C.I.\u00f800000);
        arrayList.add(helden.framework.C.I.OO0000);
        arrayList.add(helden.framework.C.I.\u00d8Oo000);
        arrayList.add(helden.framework.C.I.newif);
        arrayList.add(helden.framework.C.I.nullclass);
        arrayList.add(helden.framework.C.I.\u00d4OO000);
        arrayList.add(helden.framework.C.I.o\u00f5O000);
        arrayList.add(helden.framework.C.I.\u00d30\u00d2000);
        arrayList.add(helden.framework.C.I.whilereturn);
        arrayList.add(helden.framework.C.I.\u00f4\u00f5o000);
        arrayList.add(helden.framework.C.I.\u00d3\u00d8o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.privatereturn));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00f5O000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d3o000.toString(), new Object[]{"Boron"}));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }
}

