/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
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

public class Vinsalt
extends StandardMagierVariante {
    public Vinsalt() {
        super("Vinsalt", 22);
        this.oO\u00d2O00 = "wei\u00df";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
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
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 8;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        for (I i2 : this.getUngeeigneteVorteile()) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(i2));
        }
        return bedingungsVerknuepfung;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.Stringwhilenew.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 1);
        k_02.o00000(voidsuper.returnprivateObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d5000, 3);
        k_02.o00000(voidsuper.O0\u00d6000, 5);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.forpublicObject, 3);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 2);
        k_02.o00000(voidsuper.StringclassObject, 4);
        k_02.o00000(voidsuper.\u00d5\u00d3\u00d8000, 4);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 4);
        k_02.o00000(voidsuper.oo\u00d6000, 4);
        k_02.o00000(voidsuper.o\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.thisintObject, 2);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f5\u00d6\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 1);
        k_02.o00000(G.newwhileString, 4);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 7);
        k_02.o00000(G.\u00d5\u00d4\u00f5000, 5);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 5);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 6);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 6);
        k_02.o00000(voidsuper.StringObjectObject, 5);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 6);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 6);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d8\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00f6\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.ifthisObject), 5);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d5000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d5000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d5\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d6\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.newfornew), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00f8\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d40\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.O\u00d3\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f5\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d3\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d50\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d5\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.privatefloatnew), 3);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00f4\u00d4000), 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.whilereturn);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d8\u00d4\u00d5000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)helden.framework.C.K.o00000(I.thisdo);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)helden.framework.C.K.o00000(I.O\u00f4O000);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00f4o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5oo000, "Bek\u00e4mpfung von Krankheiten, Seuchen und Beherrschungen, Schutz des Lebens", 8));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.whilenewsuper, 1500));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00d2O0000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00d8o0000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.floatObject, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f8\u00d2000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00d4o\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00f8\u00d5\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d3000, K.\u00f8O0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d5\u00d8\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8o\u00d4000));
        arrayList.add(this.getZauber(Zauber.ifthisObject));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.O\u00d2\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00d4o\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d5\u00d3000));
    }

    @Override
    public String toString() {
        return "Anatomische Akademie zu Vinsalt";
    }
}

