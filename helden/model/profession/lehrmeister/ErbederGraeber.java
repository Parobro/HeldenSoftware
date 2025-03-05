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
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class ErbederGraeber
extends LehrmeisterBase {
    public ErbederGraeber() {
        super("Erbe der Gr\u00e4ber", "Erbin der Gr\u00e4ber", 21, false);
        this.\u00d4O\u00d2O00 = "keine";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.newwhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Gegenstand mit 1 pAsP");
        arrayList.add("Abschrift Zauberbuches");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Astrale Regeneration"));
        arrayList.add(helden.framework.C.K.o00000("Astralmacht"));
        arrayList.add(helden.framework.C.K.o00000("Ausdauernder Zauberer"));
        arrayList.add(helden.framework.C.K.o00000("Feste Matrix"));
        arrayList.add(helden.framework.C.K.o00000("Gebildet"));
        arrayList.add(helden.framework.C.K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(helden.framework.C.K.o00000("Hohe Magieresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Immunit\u00e4t gegen Gift"));
        arrayList.add(helden.framework.C.K.o00000("Immunit\u00e4t gegen Krankheiten"));
        arrayList.add(helden.framework.C.K.o00000("Resistenz gegen Gift"));
        arrayList.add(helden.framework.C.K.o00000("Resistenz gegen Krankheiten"));
        arrayList.add(helden.framework.C.K.o00000("Richtungssinn"));
        arrayList.add(helden.framework.C.K.o00000("Artefaktgebunden"));
        arrayList.add(helden.framework.C.K.o00000("Eitelkeit"));
        arrayList.add(helden.framework.C.K.o00000("Feind"));
        arrayList.add(helden.framework.C.K.o00000("Feste Gewohnheit"));
        arrayList.add(helden.framework.C.K.o00000("Goldgier"));
        arrayList.add(helden.framework.C.K.o00000("Thesisgebunden"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
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
            return 11;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("FF"))) {
            return 11;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) {
            return 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.StringwhileString));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d5\u00d2000));
        arrayList.add(helden.framework.d.oooo_0.o00000("Verbotene Pforten"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gassenwissen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Baukunst"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kryptographie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachenkunde"), 4);
        k_02.\u00d200000(G.\u00d50\u00f5000, 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Urtulamidya"), 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Zhayad"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Urtulamidya"), 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Tulamidya"), 8);
        k_02.\u00d200000(G.\u00f4\u00d4\u00f5000, 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Seele"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 5);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000(I.\u00d5\u00d6O000));
        arrayList.add(helden.framework.C.K.o00000(I.whilethissuper));
        arrayList.add(helden.framework.C.K.o00000(I.\u00f4O\u00d2000));
        arrayList.add(helden.framework.C.K.o00000("Guter Ruf"));
        arrayList.add(helden.framework.C.K.o00000("Veteran"));
        arrayList.add(helden.framework.C.K.o00000("Aberglaube"));
        arrayList.add(helden.framework.C.K.o00000("Animalische Magie"));
        arrayList.add(helden.framework.C.K.o00000("Arkanophobie"));
        arrayList.add(helden.framework.C.K.o00000("Niedrige Magieresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Prinzipientreue"));
        arrayList.add(helden.framework.C.K.o00000("Raumangst"));
        arrayList.add(helden.framework.C.K.o00000("Totenangst"));
        arrayList.add(helden.framework.C.K.o00000("Ungebildet"));
        arrayList.add(helden.framework.C.K.o00000("Unstet"));
        arrayList.add(helden.framework.C.K.o00000("Unvertr\u00e4glichkeit mit verarbeitetem Metall"));
        arrayList.add(helden.framework.C.K.o00000("Wilde Magie"));
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d4\u00d5000), for.o00000(helden.framework.d.oooo_0.o00000(while.o\u00d6\u00d5000)).get(0)));
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.o\u00d6\u00d5000), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d4\u00d5000)).get(0)));
        String[] stringArray = new String[]{"Applicatus Zauberspeicher", "Balsam Salabunde", "Band und Fessel", "Claudibus Clavistibor", "Cryptographo Zauberschrift", "Custodosigil Diebesbann", "D\u00e4monenbann", "Dunkelheit", "Duplicatus Doppelbild", "Foramen Foraminor", "Geisterbann", "Ignifaxius Flammenstrahl", "Memorans Ged\u00e4chtniskraft", "Motoricus", "Objectovoco", "Penetrizzel Tiefenblick", "Unber\u00fchrt von Satinav"};
        for (Integer n : new Integer[]{7, 6, 6}) {
            oooo_02 = new oooo_0(1, this);
            arrayList.add(oooo_02);
            for (String string : stringArray) {
                if (string.equals("D\u00e4monenbann")) {
                    Object object = Zauber.O\u00d8\u00d3000.getVarianten().iterator();
                    while (object.hasNext()) {
                        String string2 = object.next();
                        oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(KonkreterZauber.getZauber(string, K.\u00f8O0000, string2), n, true)));
                    }
                    continue;
                }
                oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(string), n, true)));
            }
            this.removeGewaehlte(oooo_02);
        }
        Object[] objectArray = new String[]{"Aerofugo", "Analys", "Auris Nasus", "Blick in die Vergangenheit", "Desintegratus", "Gardianum", "Geisterruf", "Invocatio minor", "Totes Handle", "Widerwille", "Zauberklinge"};
        for (Integer n : new Integer[]{6, 5, 5}) {
            oooo_02 = new oooo_0(1, this);
            arrayList.add(oooo_02);
            for (Object object : objectArray) {
                oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.getZauber((String)object), n, true)));
            }
            this.removeGewaehlte(oooo_02);
        }
        Object[] objectArray2 = new String[]{"Arcanovi", "Caldofrigo", "Invocatio maior", "Nekropathia", "Stein wandle", "Xenographus"};
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        for (Object object : objectArray2) {
            oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.getZauber((String)object), 5, true)));
        }
        this.removeGewaehlte(oooo_02);
        Object[] objectArray3 = new String[]{"Flim Flam", "Manifesto", "Odem"};
        for (Integer n : new Integer[]{4, 2}) {
            oooo_02 = new oooo_0(1, this);
            arrayList.add(oooo_02);
            for (Object object : objectArray3) {
                oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.getZauber((String)object), n, false)));
            }
            this.removeGewaehlte(oooo_02);
        }
        Object[] objectArray4 = new String[]{"Aeolitus", "Armatrutz", "Blitz dich find", "Illusion aufl\u00f6sen", "Menetekel", "Plumbumbarum", "Ruhe K\u00f6rper", "Silentium", "Somnigravis"};
        for (Integer n : new Integer[]{4, 3, 3}) {
            oooo_02 = new oooo_0(1, this);
            arrayList.add(oooo_02);
            for (Object object : objectArray4) {
                oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.getZauber((String)object), n, false)));
            }
            this.removeGewaehlte(oooo_02);
        }
        Object[] objectArray5 = new String[]{"Balsam", "Band und Fessel", "Claudibus", "Cryptographo", "Custodosigil", "Dunkelheit", "Duplicatus", "Foramen", "Geisterbann", "Ignifaxius", "Motoricus", "Objectovoco", "Penetrizzel", "Skelettarius", "Unber\u00fchrt von Satinav"};
        for (Integer n : new Integer[]{3, 2}) {
            oooo_02 = new oooo_0(1, this);
            arrayList.add(oooo_02);
            for (Object object : objectArray5) {
                oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.getZauber((String)object), n, false)));
            }
            this.removeGewaehlte(oooo_02);
        }
        Object[] objectArray6 = new String[]{"Aerofugo", "Aerogelo", "Analys", "Auris Nasus", "Blick in die Vergangenheit", "Desintegratus", "Gardianum", "Geisterruf", "Invocatio minor", "Totes Handle", "Widerwille"};
        for (Integer n : new Integer[]{2}) {
            oooo_02 = new oooo_0(1, this);
            arrayList.add(oooo_02);
            for (Object object : objectArray6) {
                oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.getZauber((String)object), n, false)));
            }
            this.removeGewaehlte(oooo_02);
        }
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.addAll(for.\u00d200000("Blutmagie"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Arroganz", 5));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verpflichtungen", "Qabalya"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00f8O0000, this.getSetting()));
        this.o00000(waehlbareZauber);
        return waehlbareZauber;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

