/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.o00O;
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
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public class Brabak
extends StandardMagierVariante {
    public Brabak() {
        super("Brabak", 30);
        this.oO\u00d2O00 = "schwarz";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("3+2 wahre Namen (Summe Qualit\u00e4ten 25)");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.thisintsuper);
        arrayList.add(I.returnStringsuper);
        arrayList.add(I.O\u00d2o000);
        arrayList.add(I.\u00d8\u00d4O000);
        arrayList.add(I.\u00d4\u00d30000);
        arrayList.add(I.\u00d8\u00d60000);
        arrayList.add(I.\u00d3\u00d3O000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 14;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
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
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.whilereturn));
        return bedingungsVerknuepfung;
    }

    @Override
    public int getPermanenteASP() {
        return -2;
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.\u00f8O0000;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.o0\u00d4000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f8\u00d3\u00f6000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d2\u00f8\u00f6000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d5\u00f80000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f6\u00f5\u00d5000.toString()));
                arrayList.add(oooo_0.o00000(while.returnfloat.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f8\u00d2o000.toString()));
                arrayList.add(oooo_0.o00000(while.o\u00d6\u00d5000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d3\u00f6\u00d3000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.newinterfacesuper.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f6\u00f8\u00d4000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.\u00f5\u00f5\u00d5000, "D\u00e4monologie"));
        arrayList.add(oooo_0.o00000(while.privateifObject.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d2\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d5\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00f8\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(this.getZauber(Zauber.\u00f5\u00d3\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d5\u00d2\u00d3000));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.\u00d4\u00f4\u00d3000));
                arrayList.add(this.getZauber(Zauber.\u00f4\u00d8\u00d3000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(this.getZauber(Zauber.newifnew));
                arrayList.add(this.getZauber(Zauber.\u00d3\u00f8\u00d4000));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d3\u00d4\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 5);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 4);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 7);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisintObject, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 6);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(G.\u00d50\u00f5000, 8);
        k_02.\u00d200000(G.\u00d3\u00f8\u00f5000, 6);
        k_02.\u00d200000(G.\u00f5\u00f6\u00f5000, 4);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 8);
        k_02.\u00d200000(G.\u00d3o\u00f5000, 6);
        k_02.\u00d200000(G.nullpublicString, 7);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 7);
        k_02.\u00d200000(this.getZauber(Zauber.ifthisObject), 4);
        k_02.\u00d200000(this.getZauber(Zauber.nullinterfacesuper), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00d5\u00d3000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00d6\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d2\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f4\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d4\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.newfornew), 2);
        k_02.\u00d200000(this.getZauber(Zauber.Stringpublicnew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00d2\u00d5000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.oO\u00d5000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5O\u00d5000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.ifnewnew), 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00d8\u00d6000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d2\u00f8\u00d3000));
        arrayList.add(new for(while.\u00d8\u00d8\u00d3000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        arrayList.add(new for(while.o\u00f5\u00d3000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.new(I.\u00d50o000);
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d50o000);
        j2.oO0000(8);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f4\u00f8o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.whilenewsuper, 1500));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        for (KonkreterZauber konkreterZauber : ZauberFabrik.getInstance().mindestVerbreitung(3, helden.framework.OOoO.K.\u00f8O0000, o00O.\u00d4\u00d30000, this.getSetting())) {
            waehlbareZauber.add(konkreterZauber);
        }
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitungDaemonisch(3, helden.framework.OOoO.K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d2000, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d2\u00d5000, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f5\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.forinterfacenew, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d5\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d30\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f40\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4o\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f4\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.ifthisObject));
        arrayList.add(this.getZauber(Zauber.nullinterfacesuper));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d2\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d4\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f4\u00d4000));
    }

    @Override
    public String toString() {
        return "Dunkle Halle der Geister zu Brabak";
    }
}

