/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.windundwettermagus;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;
import java.util.Vector;

public class WindUndWettermagus
extends helden.framework.int.N {
    private Oo0O \u00f5\u00d6\u00f6000 = new Oo0O();

    public WindUndWettermagus() {
        super("Wind- und Wettermagus, UdW", 3);
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
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.\u00d8\u00f5\u00d2000, 1);
        k_02.\u00d200000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.ifinterfaceObject.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00f5o\u00d6000);
                arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
                arrayList.add(voidsuper.ifnullObject);
                arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
                arrayList.add(voidsuper.oo\u00d8000);
                arrayList.add(voidsuper.\u00d3\u00f8\u00d6000);
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 3);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.\u00d200000(E.\u00d5\u00d4\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.returnprivateObject, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 5);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 6);
        k_02.\u00d200000(voidsuper.thisclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f4o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.iffloatObject));
        arrayList.add(new for(while.\u00d2\u00d6\u00d2000));
        arrayList.add(new for(while.\u00f8\u00f6\u00d5000));
        arrayList.add(new for(while.o\u00f8\u00d3000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        switch (n) {
            case 0: {
                return o00o_0.o00000(this.getProfession(), helden.framework.C.K.o00000(this.getZauber()), 2);
            }
        }
        throw new c_1();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5\u00d3O000));
        M m = helden.framework.C.K.o00000(this.getZauber());
        m.o00000(this.getZauber(Zauber.\u00d4O\u00d3000));
        m.o00000(this.getZauber(Zauber.\u00d4\u00f6\u00d3000));
        m.o00000(this.getZauber(Zauber.\u00d40\u00d5000));
        oo0O.\u00d300000(m);
        oo0O.new(this.\u00f5\u00d6\u00f6000);
        return oo0O;
    }

    @Override
    protected K getRepraesentation(Zauber zauber) {
        return K.\u00d400000;
    }

    protected Vector<KonkreterZauber> getZauber() {
        Vector<KonkreterZauber> vector = new Vector<KonkreterZauber>(28);
        vector.add(this.getZauber(Zauber.\u00d4\u00f8\u00d3000));
        vector.add(this.getZauber(Zauber.newfornew));
        vector.add(this.getZauber(Zauber.\u00d3\u00f6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00f8o\u00d4000));
        vector.add(this.getZauber(Zauber.O\u00d3\u00d4000));
        vector.add(this.getZauber(Zauber.Stringpublicnew));
        vector.add(this.getZauber(Zauber.\u00f4\u00f5\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d8\u00d3\u00d3000));
        vector.add(this.getZauber(Zauber.ifnewnew));
        vector.add(this.getZauber(Zauber.\u00f5\u00d6\u00d3000));
        vector.add(this.getZauber(Zauber.\u00d30\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d80\u00d4000));
        return vector;
    }
}

