/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class Ilarist
extends LehrmeisterBase {
    public Ilarist() {
        super("Ilarist", "Ilaristin", 18, false);
        this.\u00d4O\u00d2O00 = "keine";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.newwhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("magischer Gegenstand 1 pAsP");
        arrayList.add("Abschrift altes Zauberbuch");
        arrayList.add("seltene Zauberthesis");
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
        arrayList.add(helden.framework.C.K.o00000("Artefaktgebunden"));
        arrayList.add(helden.framework.C.K.o00000("Eitelkeit"));
        arrayList.add(helden.framework.C.K.o00000("Feind"));
        arrayList.add(helden.framework.C.K.o00000("Feste Gewohnheit"));
        arrayList.add(helden.framework.C.K.o00000("Festgef\u00fcgtes Denken"));
        arrayList.add(helden.framework.C.K.o00000("Schlechter Ruf"));
        arrayList.add(helden.framework.C.K.o00000("Thesisgebunden"));
        arrayList.add(helden.framework.C.K.o00000("Weltfremd bzgl."));
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
            return 13;
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
        arrayList.add(K.o00000(voidsuper.thisintObject, "Magierphilosophie"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Bosparano"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Zhayad"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Urtulamidya"), 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Zhayad"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Chrmk"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Urtulamidya"), 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Tulamidya"), 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Nanduria"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Seele"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(helden.framework.C.K.o00000("Guter Ruf"));
        arrayList.add(helden.framework.C.K.o00000("Veteran"));
        arrayList.add(helden.framework.C.K.o00000("Aberglaube"));
        arrayList.add(helden.framework.C.K.o00000("Animalische Magie"));
        arrayList.add(helden.framework.C.K.o00000("Arkanophobie"));
        arrayList.add(helden.framework.C.K.o00000("Niedrige Magieresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Prinzipientreue"));
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
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.\u00f6\u00f8\u00f4000), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00d5\u00d8\u00f4000)).get(0)));
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.\u00d5\u00d8\u00f4000), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00f6\u00f8\u00f4000)).get(0)));
        arrayList.addAll(this.getAuswahl(new String[]{"Applicatus", "Balsam", "Band und Fessel", "Claudibus", "Cryptographo", "Corpofesso", "Custodosigil", "Duplicatus", "Foramen", "Ignifaxius", "Motoricus", "Objectovoco", "Paralysis", "Penetrizzel", "Skelettarius", "Unber\u00fchrt von Satinav"}, new Integer[]{7, 6, 6}, true));
        arrayList.addAll(this.getAuswahl(new String[]{"Analys", "Auris Nasus", "Blick in die Gedanken", "Ignorantia", "Widerwille"}, new Integer[]{6, 5, 5}, true));
        arrayList.addAll(this.getAuswahl(new String[]{"Oculus", "Reversalis"}, new Integer[]{5}, true));
        arrayList.addAll(this.getAuswahl(new String[]{"Aureolus", "Flim Flam", "Manifesto", "Odem"}, new Integer[]{4, 2}, false));
        arrayList.addAll(this.getAuswahl(new String[]{"Armatrutz", "Blitz dich", "Illusion aufl\u00f6sen", "Menetekel", "Plumbumbarum", "Reflectimago", "Silentium", "Unitatio", "Weihrauchwolke"}, new Integer[]{3, 3, 3}, false));
        arrayList.addAll(this.getAuswahl(new String[]{"Applicatus", "Balsam", "Band und Fessel", "Claudibus", "Cryptographo", "Custodosigil", "Dunkelheit", "Duplicatus", "Foramen", "Ignifaxius", "Motoricus", "Objectovoco", "Penetrizzel", "Unber\u00fchrt von Satinav"}, new Integer[]{3, 2}, false));
        arrayList.addAll(this.getAuswahl(new String[]{"Analys", "Auris Nasus", "Blick in die Gedanken", "Gardianum", "Ignorantia", "Widerwille"}, new Integer[]{2}, false));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verpflichtungen", "Qabalya"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, helden.framework.OOoO.K.\u00f8O0000, this.getSetting()));
        this.o00000(waehlbareZauber);
        return waehlbareZauber;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

