/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class MagistraKiranya
extends LehrmeisterBase {
    public MagistraKiranya() {
        super("Sch\u00fcler der Magistra Kiranya", "Sch\u00fclerin der Magistra Kiranya", 20, false);
        this.\u00d4O\u00d2O00 = "keine";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00f5\u00f5\u00f4000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Haselbusch geformter Zauberstab");
        arrayList.add("elfisches Musikinstrument");
        arrayList.add("verziertes Gewand");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d3\u00d30000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
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
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.StringwhileString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000.toString()));
        arrayList.add(oooo_0.o00000(while.StringthisString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d8\u00f4000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.returnprivateObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.thisvoidObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.thisinterfaceObject, 1);
        k_02.o00000(voidsuper.forpublicObject, 2);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 1);
        k_02.o00000(voidsuper.\u00f80\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.nullObjectObject, 1);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.o00000(voidsuper.oo\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 5);
        k_02.o00000(voidsuper.thisintObject, 2);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(G.\u00f4\u00d3\u00f5000, 3);
        k_02.o00000(G.\u00d3\u00f8\u00f5000, 3);
        k_02.o00000(G.whilewhileString, 2);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 6);
        k_02.o00000(G.\u00d5\u00d4\u00f5000, 2);
        k_02.o00000(G.\u00d40\u00f6000, 3);
        k_02.o00000(voidsuper.thisclassObject, 3);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.returnifObject, 2);
        k_02.o00000(voidsuper.\u00f5\u00d5\u00d6000, 2);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00d5\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d5\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00d8\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.O\u00d3\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 5);
        k_02.o00000(this.getZauber(Zauber.privateintnew), 3);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f4\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 3);
        k_02.o00000(this.getZauber(Zauber.forinterfacenew), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.nullinterfacesuper), 3);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d3\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d5\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f4\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d5000), 2);
        k_02.o00000(this.getZauber(Zauber.ifwhilenew), 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.oo\u00f6000));
        arrayList.add(new for(while.\u00d6\u00f5\u00d4000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.thisifclass));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f5\u00f40000, 1));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.forsupersuper));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d50o000, 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.thisdo, 5));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "gesellschaftliches Leben", 5));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(6, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f40\u00d5000, K.\u00d8o0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d5\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00d5\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d3o\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00d8\u00d3000));
        arrayList.add(this.getZauber(Zauber.O\u00d3\u00d5000));
        arrayList.add(this.getZauber(Zauber.ifnewnew));
    }

    @Override
    public String toString() {
        return "Sch\u00fcler der Magistra Kiranya";
    }
}

