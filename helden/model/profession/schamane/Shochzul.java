/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.Vector;

public class Shochzul
extends N {
    public Shochzul() {
        super("Shochzul", 8);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Beutelchen mit Edelsteinen");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thisintsuper);
        arrayList.add(I.\u00f8o0000);
        arrayList.add(I.\u00f5\u00f40000);
        arrayList.add(I.\u00f8oO000);
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00d8\u00f6O000);
        arrayList.add(I.\u00d4oO000);
        arrayList.add(I.o\u00f50000);
        arrayList.add(I.Stringdo);
        arrayList.add(I.while);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.\u00f5\u00f4o000);
        arrayList.add(I.\u00f400000);
        arrayList.add(I.\u00f8\u00d6o000);
        arrayList.add(I.privatedo);
        arrayList.add(I.\u00f8\u00d6O000);
        arrayList.add(I.\u00f8\u00d5O000);
        arrayList.add(I.\u00d8\u00d4O000);
        arrayList.add(I.\u00d8\u00d60000);
        arrayList.add(I.O\u00d3O000);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.o\u00d3o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 14;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        Vector<KostenArt> vector = new Vector<KostenArt>();
        vector.add(new KostenArt("vSF-Pool", "Kraft des Tieres"){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                return KostenEntry.kostenBereich.\u00d800000.equals((Object)kostenBereich2) && (object instanceof oooo_0 || object instanceof Q && ((Q)object).\u00d4\u00d30000() instanceof oooo_0);
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.\u00d800000);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 100;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        });
        return vector;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00f8\u00f5\u00d2000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d30\u00f5000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d3\u00f4\u00f4000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d2\u00d8000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.nullif.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00f6\u00d4\u00d6000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.returnObjectclass.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00f5\u00d3000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.fornull.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.forthisnew.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00f6\u00d80000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d4\u00f6000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00f5o\u00d2000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.thisreturnObject.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d5\u00d3\u00f5000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 3);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.o00000(E.newnewString, 1);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.o00000(voidsuper.returnforObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 5);
        k_02.o00000(voidsuper.newnewObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.thisinterfaceObject, 1);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 2);
        k_02.o00000(voidsuper.StringvoidObject, 1);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 5);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d50\u00d8000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper2, 2);
        k_02.o00000(G.\u00d8\u00d2\u00f5000, 2);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 3);
        k_02.o00000(voidsuper.StringObjectObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.privateObjectObject, 3);
        k_02.o00000(voidsuper.\u00d3\u00d4\u00d6000, 2);
        k_02.o00000(voidsuper.newforObject, 1);
        k_02.o00000(voidsuper.O\u00d6\u00d6000, 0);
        k_02.o00000(voidsuper.o\u00f8\u00d6000, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f50000);
        arrayList.add(I.\u00d3\u00d3O000);
        arrayList.add(I.whilereturn);
        arrayList.add(I.o\u00d2O000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.privatethisObject));
        arrayList.add(new for(while.\u00d2\u00f80000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f5\u00d8o000));
        M m = (M)K.o00000(I.\u00d3\u00d20000);
        m.\u00d2o0000();
        m.o00000("Wind");
        m.o00000("Fels");
        m.o00000("Wasser");
        oo0O.\u00d300000(m);
        oo0O.\u00d300000(K.o00000(I.O\u00d30000));
        J j2 = (J)K.o00000(I.\u00d8o0000);
        j2.oO0000(6);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "Religion", 6));
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "St\u00e4dtisches Treiben", 6));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return "Shochzul";
    }
}

