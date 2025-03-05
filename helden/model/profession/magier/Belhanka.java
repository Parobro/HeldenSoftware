/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public class Belhanka
extends StandardMagierVariante {
    public Belhanka() {
        super("Belhanka", 25);
        this.oO\u00d2O00 = "grau";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        arrayList.add(G.newwhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d3\u00d4O000);
        arrayList.add(I.\u00f4\u00f80000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.O\u00d5o000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.thisfloat));
        return bedingungsVerknuepfung;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        if (zauber.equals(Zauber.\u00d8\u00f6\u00d4000) || zauber.equals(Zauber.\u00f4\u00d6\u00d3000)) {
            return K.\u00f4o0000;
        }
        return K.\u00f8O0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f6\u00f8\u00d8000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(E.newnewString, 1);
        k_02.\u00d200000(E.\u00d3\u00d4\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.newnewObject, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 3);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.nullObjectObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 5);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 5);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(G.\u00d3\u00f8\u00f5000, 8);
        k_02.\u00d200000(G.\u00d5\u00f8\u00f4000, 4);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 8);
        k_02.\u00d200000(G.\u00d3o\u00f5000, 4);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.\u00d200000(this.getZauber(Zauber.nullclassnew), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00d6\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f6\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4O\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d5\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.ifwhilenew), 7);
        k_02.\u00d200000(this.getZauber(Zauber.ifnewnew), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.newfornew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00f8\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f6\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d3\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f4\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.Stringpublicnew), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00d3\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f6\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00d6\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.OO0000);
        arrayList.add(I.thisdo);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d8oo000);
        arrayList.add(I.\u00d3\u00d3O000);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.thisfloat);
        arrayList.add(I.o\u00d5O000);
        arrayList.remove(I.\u00d4oo000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.newclasssuper));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.whilenewsuper, 1000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = new WaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00d5\u00d2\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00f5\u00d3\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d4\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullinterfacesuper, K.\u00f800000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3O\u00d5000, K.\u00f800000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5o\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.oO\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d3000, K.\u00f8O0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.nullclassnew));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00d6\u00d4000));
        arrayList.add(this.getZauber(Zauber.O\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f4O\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.ifwhilenew));
        arrayList.add(this.getZauber(Zauber.ifnewnew));
    }

    @Override
    public String toString() {
        return "Akademie der Geistesreisen zu Belhanka";
    }
}

