/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.alchimist;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.super;
import helden.framework.oOoO.returnsuper;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

public class BasisAlchimist
extends helden.framework.int.N {
    protected boolean \u00d8O\u00f5O00;

    public BasisAlchimist(String string, int n, boolean bl) {
        super(string, n);
        this.\u00d8O\u00f5O00 = bl;
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        if (this.\u00d8O\u00f5O00) {
            return 2;
        }
        return 0;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Alchemistische Ger\u00e4tschaften");
        arrayList.add("Fachb\u00fccher im Wert von 75D");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.ifprivate);
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.ifif);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.privateclass);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d4\u00d8o000);
        arrayList.add(I.\u00d3\u00f8O000);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        if (n == 0) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            for (Map.Entry<oo0o_0, Integer> entry : this.getTalentwerte(G.\u00d8\u00f8\u00f4000, G.\u00d3\u00d2\u00f5000, 0).o00000().entrySet()) {
                voidsuper voidsuper2;
                if (!(entry.getKey() instanceof voidsuper) || !(voidsuper2 = (voidsuper)entry.getKey()).getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000) && !voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super)) continue;
                arrayList.add(voidsuper2);
            }
            return new returnsuper(this.getProfession(), arrayList, 8, 2);
        }
        throw new c_1();
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = oooo_0.o00000(voidsuper.\u00f5o\u00d6000);
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        if (this.\u00d8O\u00f5O00) {
            arrayList.add(oooo_0.o00000(while.\u00f5\u00f6\u00d4000.toString()));
            arrayList.add(oooo_0.o00000(while.\u00f8\u00d8\u00d6000.toString()));
        }
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00d8O\u00d8000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.ififObject);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
                arrayList.add(voidsuper.privatedoObject);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(E.nullsuperString);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(E.\u00f4\u00d6\u00d8000);
                arrayList.add(E.newnewString);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 2);
        k_02.o00000(voidsuper.O0\u00d6000, 1);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 3);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d50\u00d8000, 2);
        k_02.o00000(voidsuper.oo\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f40\u00d8000, 1);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f4\u00f6\u00d5000, 1);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.thisintObject, 2);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 5);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper2, 1);
        k_02.o00000(voidsuper3, 6);
        k_02.o00000(G.\u00d5\u00d4\u00f5000, 5);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 7);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d5\u00d3\u00d6000, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d3\u00f50000);
        arrayList.add(I.\u00d4\u00f4o000);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.\u00f5\u00d30000);
        arrayList.add(I.Stringintsuper);
        arrayList.add(I.whilefor);
        arrayList.add(I.\u00f4\u00f5o000);
        if (this.\u00d8O\u00f5O00) {
            arrayList.add(I.\u00f8\u00d6o000);
            arrayList.add(I.\u00f5\u00f4o000);
            arrayList.add(I.O\u00d3O000);
        }
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                ArrayList<String> arrayList2 = new ArrayList<String>();
                arrayList2.add("Haltbarmachung");
                arrayList.add(for.o00000(voidsuper.o\u00f6\u00d6000, arrayList2, 1));
                arrayList2 = new ArrayList();
                arrayList2.add("Tr\u00e4nke");
                arrayList.add(for.o00000(voidsuper.o\u00f6\u00d6000, arrayList2, 1));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.iffloatObject));
        arrayList.add(new for(while.\u00d2\u00d6\u00d2000));
        arrayList.add(new for(while.\u00f8\u00f6\u00d5000));
        if (this.\u00d8O\u00f5O00) {
            arrayList.add(new for(while.\u00f6\u00d6\u00f5000));
            arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        }
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        switch (n) {
            case 0: {
                M<U> m = helden.framework.C.K.o00000();
                m.Object(voidsuper.\u00f5o\u00d6000);
                return o00o_0.o00000(this.getProfession(), m, 2);
            }
            case 1: {
                return o00o_0.o00000(this.getProfession(), helden.framework.C.K.o00000(this.getZauber()), 3);
            }
        }
        throw new c_1();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)helden.framework.C.K.o00000(I.privateclass);
        j2.oO0000(7);
        oo0O.\u00d300000(j2);
        if (this.\u00d8O\u00f5O00) {
            oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5\u00d3O000));
            M<U> m = helden.framework.C.K.o00000();
            m.\u00d2o0000();
            m.o00000(voidsuper.\u00f5o\u00d6000);
            oo0O.\u00d300000(m);
            M m2 = helden.framework.C.K.o00000(this.getZauber());
            m2.\u00d2o0000();
            m2.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000));
            m2.o00000(this.getZauber(Zauber.\u00d3o\u00d4000));
            oo0O.\u00d300000(m2);
        }
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    protected K getRepraesentation(Zauber zauber) {
        return K.\u00d400000;
    }

    protected Vector<KonkreterZauber> getZauber() {
        Vector<KonkreterZauber> vector = new Vector<KonkreterZauber>(28);
        vector.add(this.getZauber(Zauber.\u00d8\u00d6\u00d3000));
        vector.add(this.getZauber(Zauber.\u00d4\u00f8\u00d3000));
        vector.add(this.getZauber(Zauber.privateintnew));
        vector.add(this.getZauber(Zauber.\u00f8\u00f8\u00d2000));
        vector.add(this.getZauber(Zauber.newfornew));
        vector.add(this.getZauber(Zauber.\u00f8o\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d40\u00d4000));
        vector.add(this.getZauber(Zauber.O\u00d3\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f4\u00f4\u00d3000));
        vector.add(this.getZauber(Zauber.Stringpublicnew));
        vector.add(this.getZauber(Zauber.O\u00f6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d3o\u00d3000));
        vector.add(this.getZauber(Zauber.O\u00d5\u00d3000));
        vector.add(this.getZauber(Zauber.O\u00d2\u00d5000));
        vector.add(this.getZauber(Zauber.\u00f5\u00f8\u00d2000));
        vector.add(this.getZauber(Zauber.\u00d5\u00d5\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d50\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f5\u00d5\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f8\u00f8\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d4o\u00d5000));
        vector.add(this.getZauber(Zauber.\u00d8\u00d5\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f5\u00f8\u00d4000));
        vector.add(this.getZauber(Zauber.ifnewnew));
        vector.add(this.getZauber(Zauber.nullsupernew));
        vector.add(this.getZauber(Zauber.\u00f5\u00d3\u00d3000));
        vector.add(this.getZauber(Zauber.nullpublicnew));
        return vector;
    }
}

