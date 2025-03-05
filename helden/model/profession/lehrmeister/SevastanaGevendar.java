/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class SevastanaGevendar
extends LehrmeisterBase {
    public SevastanaGevendar() {
        super("Sch\u00fcler der Sevastana Gevendar", "Sch\u00fclerin der Sevastana Gevendar", 22, false);
        this.\u00d4O\u00d2O00 = "keine";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("gute Seekarten (Selemgrund)");
        arrayList.add("gute Seekarten (Goldenen Bucht)");
        arrayList.add("Prunkrobe");
        arrayList.add("verfluchtes Kunstobjekt");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d4\u00d60000);
        arrayList.add(I.O\u00d4O000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
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
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 10;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 10;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 10;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.\u00f5\u00f6o000));
        return bedingungsVerknuepfung;
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
        arrayList.add(oooo_0.o00000(while.o\u00f50000.toString()));
        arrayList.add(oooo_0.o00000(while.ifinterfaceObject.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.\u00d3\u00f8\u00d3000));
                arrayList.add(this.getZauber(Zauber.O\u00d3\u00d4000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.o00000(voidsuper.returnprivateObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 1);
        k_02.o00000(voidsuper.O0\u00d6000, 1);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.thisinterfaceObject, 3);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 2);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.o00000(voidsuper.StringvoidObject, 2);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 3);
        k_02.o00000(voidsuper.nullObjectObject, 4);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.o00000(voidsuper.oo\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(G.newwhileString, 4);
        k_02.o00000(G.\u00d8\u00d3\u00f5000, 3);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 5);
        k_02.o00000(voidsuper.thisclassObject, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d8\u00d8\u00d5000, 3);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d6\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.newfornew), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00d2\u00d5000), 6);
        k_02.o00000(this.getZauber(Zauber.forinterfacenew), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00f6\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f4o\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d40\u00d5000), 6);
        k_02.o00000(this.getZauber(Zauber.o\u00d3\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d8\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d2000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d8\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f40\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d3\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d50\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d5\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d4\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.OOO000);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.oo\u00f6000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.newclasssuper));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.forsupersuper));
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d50o000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)helden.framework.C.K.o00000(I.\u00d3O0000);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.O\u00d5o000, "Elfen", 5));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.O\u00d5o000, "Horasier", 5));
        J j4 = (J)helden.framework.C.K.o00000(I.whilenewsuper);
        j4.oO0000(1000);
        oo0O.\u00d300000(j4);
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(6, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4O\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.privateintnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f5\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.whilereturnnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ifwhilenew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newwhilenew, K.\u00f8O0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.newfornew));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00d2\u00d5000));
        arrayList.add(this.getZauber(Zauber.forinterfacenew));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00f6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f4o\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00d40\u00d5000));
    }

    @Override
    public String toString() {
        return "Sch\u00fcler der Sevastana Gevendar";
    }
}

