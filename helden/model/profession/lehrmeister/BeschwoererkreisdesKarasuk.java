/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class BeschwoererkreisdesKarasuk
extends LehrmeisterBase {
    public BeschwoererkreisdesKarasuk() {
        super("Sch\u00fcler des Beschw\u00f6rerkreis des Karasuk", "Sch\u00fclerin des Beschw\u00f6rerkreis des Karasuk", 15, false);
        this.\u00d4O\u00d2O00 = "keine";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Totensch\u00e4del mit Seele");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.thisintsuper);
        M m = (M)helden.framework.C.K.o00000(I.\u00f5\u00f6O000);
        m.o00000(o00O.\u00f600000);
        arrayList.add(m);
        arrayList.add(helden.framework.C.K.o00000("Immunit\u00e4t gegen Gift"));
        arrayList.add(I.\u00f5OO000);
        arrayList.add(helden.framework.C.K.o00000("Wesen der Nacht"));
        arrayList.add(helden.framework.C.K.o00000("Albino"));
        arrayList.add(helden.framework.C.K.o00000("Arroganz"));
        arrayList.add(helden.framework.C.K.o00000("Fluch der Finsternis"));
        arrayList.add(helden.framework.C.K.o00000("Goldgier"));
        arrayList.add(helden.framework.C.K.o00000("Glasknochen"));
        arrayList.add(helden.framework.C.K.o00000("Gr\u00f6\u00dfenwahn"));
        arrayList.add(helden.framework.C.K.o00000("K\u00e4lteresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Lichtempfindlich"));
        arrayList.add(helden.framework.C.K.o00000("Lichtscheu"));
        arrayList.add(helden.framework.C.K.o00000("Niedrige Lebenskraft"));
        arrayList.add(helden.framework.C.K.o00000("Resistenz gegen Gift"));
        arrayList.add(helden.framework.C.K.o00000("Resistenz gegen Krankheiten"));
        arrayList.add(helden.framework.C.K.o00000("Schlaflosigkeit"));
        arrayList.add(helden.framework.C.K.o00000("Schlafst\u00f6rungen"));
        arrayList.add(helden.framework.C.K.o00000("Schlechter Ruf"));
        arrayList.add(helden.framework.C.K.o00000("Schneller alternd"));
        arrayList.add(helden.framework.C.K.o00000("Stigma"));
        arrayList.add(helden.framework.C.K.o00000("Sucht"));
        arrayList.add(helden.framework.C.K.o00000("\u00dcbler Geruch"));
        arrayList.add(helden.framework.C.K.o00000("Unansehnlich"));
        arrayList.add(helden.framework.C.K.o00000("Verpflichtungen"));
        arrayList.add(helden.framework.C.K.o00000("Widerw\u00e4rtiges Aussehen"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("FF"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KO"))) {
            return 11;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) {
            return 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
        bedingungsVerknuepfung2.addBedingung(Bedingung.hatNicht(I.whilereturn));
        bedingungsVerknuepfung.addBedingung(bedingungsVerknuepfung2);
        return bedingungsVerknuepfung;
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Blutmagie"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.StringwhileString));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d5\u00d2000));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geografie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sch\u00e4tzen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Bosparano"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Zhayad"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Tulamidya"), 3);
        k_02.\u00d200000(G.\u00d40\u00f6000, 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Zhayad"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Seele"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Feenfreund"));
        arrayList.add(helden.framework.C.K.o00000("Hohe Lebenskraft"));
        arrayList.add(helden.framework.C.K.o00000("Koboldfreund"));
        arrayList.add(helden.framework.C.K.o00000("Schnelle Heilung"));
        arrayList.add(helden.framework.C.K.o00000("Tierfreund"));
        arrayList.add(helden.framework.C.K.o00000("Dunkelangst"));
        arrayList.add(helden.framework.C.K.o00000("Krankhafte Reinlichkeit"));
        arrayList.add(helden.framework.C.K.o00000("Krankheitsanf\u00e4llig"));
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.o\u00d6\u00d5000), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00f8\u00d2\u00d8000)).get(0), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00d3\u00f6\u00d3000)).get(0)));
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.\u00f8\u00d2\u00d8000), for.o00000(helden.framework.d.oooo_0.o00000(while.o\u00d6\u00d5000)).get(0), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00d3\u00f6\u00d3000)).get(0)));
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.\u00d3\u00f6\u00d3000), for.o00000(helden.framework.d.oooo_0.o00000(while.o\u00d6\u00d5000)).get(0), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00f8\u00d2\u00d8000)).get(0)));
        arrayList.addAll(this.getAuswahl(new String[]{"Bewegung st\u00f6ren", "Fulminictus", "Geisterbann", "Motoricus", "Nuntiovolo", "Paralysis", "Skelettarius", "Tlalucs Odem"}, new Integer[]{7, 6, 6}, true));
        arrayList.addAll(this.getAuswahl(new String[]{"Gardianum", "Geisterruf", "Invocatio minor", "Pentagramma", "Schwarzer Schrecken", "Totes Handle"}, new Integer[]{6, 5, 5}, true));
        arrayList.addAll(this.getAuswahl(new String[]{"Invocatio maior", "Nekropathia", "Transversalis"}, new Integer[]{5}, true));
        arrayList.addAll(this.getAuswahl(new String[]{"Flim Flam", "Manifesto", "Odem"}, new Integer[]{4}, false));
        arrayList.addAll(this.getAuswahl(new String[]{"Armatrutz", "Blitz dich find", "Exposami", "Menetekel", "Plumbumbarum", "Silentium", "Somnigravis"}, new Integer[]{3, 3, 3}, false));
        arrayList.addAll(this.getAuswahl(new String[]{"Band und Fessel", "Bewegung st\u00f6ren", "Claudibus", "Cryptographo", "Custodosigil", "Dunkelheit", "Foramen", "Fulminictus", "Geisterbann", "Motoricus", "Nuntiovolo", "Paralysis", "Skelettarius", "Tlalucs Odem"}, new Integer[]{3, 2, 2}, false));
        arrayList.addAll(this.getAuswahl(new String[]{"Analys", "Gardianum", "Geisterruf", "Invocatio minor", "Pentagramma", "Schwarzer Schrecken", "Totes Handle"}, new Integer[]{2}, false));
        arrayList.addAll(this.getAuswahl(new String[]{"Invocatio maior", "Nekropathia", "Transversalis"}, new Integer[]{2}, false));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.addAll(for.\u00d200000("Zauberzeichen: Bann- und Schutzkreis gegen niedere D\u00e4monen"));
        arrayList.addAll(for.\u00d200000("Zauberzeichen: Schutzkreis gegen Untote"));
        arrayList.addAll(for.\u00d200000("Gebieter der Rotte"));
        arrayList.addAll(for.\u00d200000("Nekromant"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        public public_ = helden.framework.C.K.o00000("Gesucht", 2);
        public_.Object("zw\u00f6lfg\u00f6ttlichen Landen");
        oo0O.\u00d300000(public_);
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Randgruppe", "potenzielle D\u00e4monenverehrer"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d5\u00d4000, K.\u00f800000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d5\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O0\u00d3000, K.thisObject, ""));
        this.o00000(waehlbareZauber);
        return waehlbareZauber;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

