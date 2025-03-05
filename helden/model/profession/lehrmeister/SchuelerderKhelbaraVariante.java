/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class SchuelerderKhelbaraVariante
extends LehrmeisterBase {
    public SchuelerderKhelbaraVariante() {
        super("Sch\u00fcler der Khelbara", "Sch\u00fclerin der Khelbara", 27, false);
        this.\u00d4O\u00d2O00 = "keine";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.newwhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Abschrift eines Zauberbuches");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        M m = (M)helden.framework.C.K.o00000(I.\u00f5\u00f6O000);
        m.o00000(o00O.publicsuper);
        arrayList.add(m);
        arrayList.add(helden.framework.C.K.o00000("Feste Matrix"));
        arrayList.add(helden.framework.C.K.o00000("Gebildet"));
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(helden.framework.C.K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(helden.framework.C.K.o00000("Herausragendes Aussehen"));
        arrayList.add(helden.framework.C.K.o00000("Hohe Magieresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Immunit\u00e4t gegen Gift"));
        arrayList.add(helden.framework.C.K.o00000("Immunit\u00e4t gegen Krankheiten"));
        arrayList.add(helden.framework.C.K.o00000("Resistenz gegen Gift"));
        arrayList.add(helden.framework.C.K.o00000("Resistenz gegen Krankheiten"));
        arrayList.add(helden.framework.C.K.o00000("Schnelle Heilung"));
        arrayList.add(helden.framework.C.K.o00000("Artefaktgebunden"));
        arrayList.add(helden.framework.C.K.o00000("Br\u00fcnstigkeit"));
        arrayList.add(helden.framework.C.K.o00000("Eitelkeit"));
        arrayList.add(helden.framework.C.K.o00000("Feind"));
        arrayList.add(helden.framework.C.K.o00000("Feste Gewohnheit"));
        arrayList.add(helden.framework.C.K.o00000("Festgef\u00fcgtes Denken"));
        arrayList.add(helden.framework.C.K.o00000("Goldgier"));
        arrayList.add(helden.framework.C.K.o00000("Prinzipientreue"));
        arrayList.add(helden.framework.C.K.o00000("Schlechter Ruf"));
        arrayList.add(helden.framework.C.K.o00000("Speisegebote"));
        arrayList.add(helden.framework.C.K.o00000("Sucht"));
        arrayList.add(helden.framework.C.K.o00000("Thesisgebunden"));
        arrayList.add(helden.framework.C.K.o00000("Verschwendungssucht"));
        arrayList.add(helden.framework.C.K.o00000("Weltfremd bzgl."));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 14;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
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
        arrayList.add(oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(oooo_0.o00000(while.Stringwhilenew));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(oooo_0.o00000(while.StringwhileString));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d2000));
        arrayList.add(oooo_0.o00000("Verbotene Pforten"));
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
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bet\u00f6ren"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gassenwissen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Garethi"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Urtulamidya"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Zhayad"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Tulamidya"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Urtulamidya"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Zhayad"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Gift"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Seele"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        k_02.\u00d200000(this.getZauber("\u00c4ngste lindern"), 6);
        k_02.\u00d200000(this.getZauber("Balsam"), 7);
        k_02.\u00d200000(this.getZauber("Ruhe K\u00f6rper"), 6);
        k_02.\u00d200000(this.getZauber("Eigne \u00c4ngste"), 7);
        k_02.\u00d200000(this.getZauber("Invocatio minor"), 5);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.whilethisObject, K.thisObject, ""), 5);
        k_02.\u00d200000(this.getZauber("Visibili"), 5);
        k_02.\u00d200000(this.getZauber("Analys"), 4);
        k_02.\u00d200000(this.getZauber("Bannbaladin"), 4);
        k_02.\u00d200000(this.getZauber("Blick aufs Wesen"), 4);
        k_02.\u00d200000(this.getZauber("Corpofesso"), 4);
        k_02.\u00d200000(this.getZauber("Flim Flam"), 2);
        k_02.\u00d200000(this.getZauber("Gardianum"), 4);
        k_02.\u00d200000(this.getZauber("Horriphobus"), 3);
        k_02.\u00d200000(this.getZauber("Invocatio maior"), 3);
        k_02.\u00d200000(this.getZauber("Klarum Purum"), 4);
        k_02.\u00d200000(this.getZauber("Odem"), 3);
        k_02.\u00d200000(this.getZauber("Pentagramma"), 2);
        k_02.\u00d200000(this.getZauber("Respondami"), 3);
        k_02.\u00d200000(this.getZauber("Reversalis"), 3);
        k_02.\u00d200000(this.getZauber("Sensibar"), 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(helden.framework.C.K.o00000("Guter Ruf"));
        arrayList.add(helden.framework.C.K.o00000("Veteran"));
        arrayList.add(helden.framework.C.K.o00000("Aberglaube"));
        arrayList.add(helden.framework.C.K.o00000("Animalische Magie"));
        arrayList.add(helden.framework.C.K.o00000("Arkanophobie"));
        arrayList.add(helden.framework.C.K.o00000("Fettleibig"));
        arrayList.add(helden.framework.C.K.o00000("Niedrige Magieresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Prinzipientreue"));
        arrayList.add(helden.framework.C.K.o00000("Totenangst"));
        arrayList.add(helden.framework.C.K.o00000("Ungebildet"));
        arrayList.add(helden.framework.C.K.o00000("Unstet"));
        arrayList.add(helden.framework.C.K.o00000("Unvertr\u00e4glichkeit mit verarbeitetem Metall"));
        arrayList.add(helden.framework.C.K.o00000("Wilde Magie"));
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        switch (n) {
            case 0: {
                arrayList.add(new for(while.\u00d8\u00d20000));
                arrayList.add(new for(while.\u00d8\u00d4\u00d5000));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        return super.getVerbilligteSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.add(new for(while.newinterfacesuper));
        arrayList.add(new for(while.o\u00f5\u00d3000));
        arrayList.addAll(for.\u00d200000("Blutmagie"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Arroganz", 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verpflichtungen", "Lehrmeisterin"));
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
        arrayList.add(this.getZauber("\u00c4ngste lindern"));
        arrayList.add(this.getZauber("Balsam"));
        arrayList.add(this.getZauber("Ruhe K\u00f6rper"));
        arrayList.add(this.getZauber("Eigne \u00c4ngste"));
        arrayList.add(this.getZauber("Invocatio minor"));
        arrayList.add(KonkreterZauber.getZauber(Zauber.whilethisObject, K.thisObject, ""));
        arrayList.add(this.getZauber("Visibili"));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

