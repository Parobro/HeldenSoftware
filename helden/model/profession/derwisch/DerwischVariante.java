/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.derwisch;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;
import java.util.Vector;

public class DerwischVariante
extends N {
    private public \u00f50\u00f5O00;
    private public \u00f80\u00f5O00;
    private public privatesuperfloat;

    public DerwischVariante() {
        super("Derwisch", 9);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Geschultes Shadif");
        arrayList.add("Ausgebildetes Kamel");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00f4O0000);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.while);
        arrayList.add(I.Stringdo);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.\u00f5\u00f4o000);
        arrayList.add(I.ooO000);
        arrayList.add(I.\u00d5\u00f4O000);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = new k_0<b_0>();
        k_02.\u00d200000(b_0.thispublicsuper, 3);
        k_02.\u00d200000(b_0.\u00d8\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(K.o00000(voidsuper.privateObjectObject, "Rhythmusinstrument"));
        arrayList.add(oooo_0.o00000(while.newintsuper.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8o\u00d3000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                arrayList.add(E.O\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                ++n;
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00f4o\u00d6000);
                arrayList.add(voidsuper.\u00d3\u00d6\u00d5000);
                int[] nArray = new int[]{4, 1};
                ++n;
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 1);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(E.newnewString, 3);
        k_02.\u00d200000(E.\u00f4\u00d4\u00d8000, 2);
        k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.newnewObject, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 5);
        k_02.\u00d200000(voidsuper.nullvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(G.\u00f5\u00f6\u00f5000, 6);
        k_02.\u00d200000(G.whileStringclass, 6);
        k_02.\u00d200000(G.\u00f8\u00f8\u00f4000, 6);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.privateObjectObject, 7);
        k_02.\u00d200000(voidsuper.returnifObject, 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d8o\u00d2000);
        arrayList.add(I.returnStringsuper);
        arrayList.add(I.\u00f40O000);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.O\u00d2o000);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d3Oo000);
        arrayList.add(I.\u00f4\u00d40000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.forforclass));
        arrayList.add(new for(while.\u00f6o\u00d5000));
        arrayList.add(new for(while.nullifString));
        arrayList.add(new for(while.\u00f8\u00f8\u00d8000));
        arrayList.add(new for(while.newint));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        switch (n) {
            case 0: {
                return o00o_0.o00000(this.getProfession(), helden.framework.C.K.o00000(this.getZauber()), 3);
            }
        }
        throw new c_1();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5\u00d3O000));
        M<U> m = helden.framework.C.K.o00000();
        m.\u00d2o0000();
        m.o00000(voidsuper.privateObjectObject);
        m.o00000(voidsuper.StringvoidObject);
        m.o00000(voidsuper.\u00d4\u00f8\u00d5000);
        oo0O.\u00d300000(m);
        oo0O.\u00d300000(this.\u00f50\u00f5O00);
        oo0O.\u00d300000(this.\u00f80\u00f5O00);
        oo0O.\u00d300000(this.privatesuperfloat);
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d5oo000, "99 Gesetze");
        j2.oO0000(12);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d3\u00d30000, "Beni Dervez, Rastullahglauben, Kalifat"));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return "Derwisch";
    }

    @Override
    protected helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.\u00d400000;
    }

    protected Vector<KonkreterZauber> getZauber() {
        Vector<KonkreterZauber> vector = new Vector<KonkreterZauber>(28);
        vector.add(this.getZauber(Zauber.\u00d4\u00f8\u00d3000));
        vector.add(this.getZauber(Zauber.\u00d5\u00d8\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f8\u00f8\u00d2000));
        vector.add(this.getZauber(Zauber.newfornew));
        vector.add(this.getZauber(Zauber.\u00d4\u00d6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f8o\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d3\u00f6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d40\u00d4000));
        vector.add(this.getZauber(Zauber.O\u00d3\u00d4000));
        vector.add(this.getZauber(Zauber.forintnew));
        vector.add(this.getZauber(Zauber.\u00f80\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d8O\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f4\u00f4\u00d3000));
        vector.add(this.getZauber(Zauber.o\u00d8\u00d3000));
        vector.add(this.getZauber(Zauber.Stringpublicnew));
        vector.add(this.getZauber(Zauber.\u00f4O\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d3o\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f5\u00d4\u00d4000));
        vector.add(this.getZauber(Zauber.Stringsupernew));
        vector.add(this.getZauber(Zauber.o\u00d2\u00d5000));
        vector.add(this.getZauber(Zauber.\u00d4o\u00d4000));
        vector.add(this.getZauber(Zauber.StringObjectnew));
        vector.add(this.getZauber(Zauber.O\u00d2\u00d5000));
        vector.add(this.getZauber(Zauber.ifprivatesuper));
        vector.add(this.getZauber(Zauber.\u00f8\u00d2\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d4\u00d3\u00d5000));
        vector.add(this.getZauber(Zauber.\u00d50\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f5\u00d5\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f4\u00d6\u00d3000));
        vector.add(this.getZauber(Zauber.\u00d3o\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f8\u00f8\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d4o\u00d5000));
        vector.add(this.getZauber(Zauber.\u00d8\u00d5\u00d3000));
        vector.add(this.getZauber(Zauber.o\u00f6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f50\u00d5000));
        vector.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        vector.add(this.getZauber(Zauber.\u00d3\u00d2\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f4\u00d5\u00d3000));
        vector.add(this.getZauber(Zauber.\u00d50\u00d3000));
        vector.add(this.getZauber(Zauber.returnwhilenew));
        vector.add(this.getZauber(Zauber.ifnewnew));
        vector.add(this.getZauber(Zauber.returnreturnnew));
        vector.add(this.getZauber(Zauber.\u00d3\u00d2\u00d5000));
        return vector;
    }
}

