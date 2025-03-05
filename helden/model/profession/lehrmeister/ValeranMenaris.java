/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class ValeranMenaris
extends LehrmeisterBase {
    public ValeranMenaris() {
        super("Sch\u00fcler des Valeran Menaris", "Sch\u00fclerin des Valeran Menaris", 0, false);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(helden.framework.C.K.o00000("Gutes Ged\u00e4chtnis"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        for (I i2 : this.getUngeeigneteVorteile()) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(i2));
        }
        return bedingungsVerknuepfung;
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(oooo_0.o00000(while.StringwhileString));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d2000));
        arrayList.add(oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d2\u00d6000));
        arrayList.add(oooo_0.o00000(while.\u00d2oO000));
        arrayList.add(oooo_0.o00000("Regeneration I"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 4);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Staatskunst"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Bosparano"), 6);
        k_02.\u00d200000(G.\u00f4\u00d3\u00f5000, 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 8);
        k_02.\u00d200000(G.\u00d40\u00f6000, 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        k_02.\u00d200000(this.getZauber("Analys"), 4);
        k_02.\u00d200000(this.getZauber("Attributo"), 6);
        k_02.\u00d200000(this.getZauber("Bannbaladin"), 6);
        k_02.\u00d200000(this.getZauber("Memorans"), 7);
        k_02.\u00d200000(this.getZauber("Psychostabilis"), 5);
        k_02.\u00d200000(this.getZauber("Salander"), 5);
        k_02.\u00d200000(this.getZauber("Respondami"), 6);
        k_02.\u00d200000(this.getZauber("Balsam"), 4);
        k_02.\u00d200000(this.getZauber("Beherrschung brechen"), 2);
        k_02.\u00d200000(this.getZauber("Flim Flam"), 3);
        k_02.\u00d200000(this.getZauber("Gardianum"), 4);
        k_02.\u00d200000(this.getZauber("Klarum Purum"), 3);
        k_02.\u00d200000(this.getZauber("Horriphobus"), 3);
        k_02.\u00d200000(this.getZauber("Odem"), 3);
        k_02.\u00d200000(this.getZauber("Paralysis"), 3);
        k_02.\u00d200000(this.getZauber("Verwandlung beenden"), 2);
        k_02.\u00d200000(this.getZauber("Xenographus"), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("J\u00e4hzorn"));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.addAll(for.\u00d200000("Eiserner Wille I"));
        arrayList.add(new for(while.\u00d8\u00d20000));
        arrayList.addAll(for.\u00d200000("Regeneration II"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Arroganz", 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 5));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verpflichtungen", "Lehrmeister"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, this.getSetting()));
        this.o00000(waehlbareZauber);
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber("Analys"));
        arrayList.add(this.getZauber("Attributo"));
        arrayList.add(this.getZauber("Bannbaladin"));
        arrayList.add(this.getZauber("Memorans"));
        arrayList.add(this.getZauber("Psychostabilis"));
        arrayList.add(this.getZauber("Salander"));
        arrayList.add(this.getZauber("Respondami"));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

