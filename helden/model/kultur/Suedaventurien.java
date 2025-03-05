/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Amazone;
import helden.model.profession.Bauer;
import helden.model.profession.Druide;
import helden.model.profession.Fischer;
import helden.model.profession.Gardist;
import helden.model.profession.Geweihter;
import helden.model.profession.Haendler;
import helden.model.profession.Hexe;
import helden.model.profession.Hirte;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Rattenfaenger;
import helden.model.profession.Ritter;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Schreiber;
import helden.model.profession.Soeldner;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Tageloehner;
import helden.model.profession.Zaubertaenzer;
import java.util.ArrayList;
import java.util.Iterator;

public class Suedaventurien
extends OooO {
    public static final P \u00f5\u00d5\u00f8000 = new P("keine Spezialisierung", 0, false);
    public static final P O\u00d8\u00f8000 = new P("Stadtstaat Al'Anfa", 2, false);
    public static final P o\u00d6\u00f8000 = new P("Stadtstaat Brabak", 2, false);
    public static final P \u00d8\u00d6\u00f8000 = new P("Stadtstaat Charypso", 2, false);
    public static final P \u00f4\u00d6\u00f8000 = new P("Stadtstaat Chorhop", 2, false);
    public static final P \u00f4\u00d5\u00f8000 = new P("Stadtstaat H\u00f4t-Alem", 2, false);
    public static final P thissuperreturn = new P("Stadtstaat Khefu", 2, false);
    public static final P whilethisreturn = new P("Stadtstaat Mengbilla", 2, false);
    public static final P \u00d5\u00d6\u00f8000 = new P("Stadtstaat Mirham", 2, false);
    public static final P \u00f5\u00d6\u00f8000 = new P("Stadtstaat Sylla", 2, false);
    public static final P \u00d4\u00d6\u00f8000 = new P("Kolonialhafen", 3, false);
    public static final P ifthisreturn = new P("Dschungeldorf/Plantage", 0, false);
    public static final P \u00f8\u00d6\u00f8000 = new P("Selem", 2, false);
    public static final P O\u00d6\u00f8000 = new P("Maraskanische Exilanten in Al'Anfa", 2, true);
    private int \u00f8\u00d5\u00f8000 = 0;
    private G Stringsuperreturn = null;
    private G \u00d3\u00d6\u00f8000 = null;

    public Suedaventurien() {
    }

    public Suedaventurien(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        if (this.Stringsuperreturn == null) {
            this.Stringsuperreturn = g2;
            if (g2.equals(G.whilewhileString)) {
                this.\u00d3\u00d6\u00f8000 = G.\u00d8\u00d8\u00f5000;
            }
            if (g2.equals(G.\u00d5\u00f8\u00f5000)) {
                this.\u00d3\u00d6\u00f8000 = G.\u00f4\u00d4\u00f5000;
            }
            if (g2.equals(G.thissuperclass)) {
                this.\u00d3\u00d6\u00f8000 = G.\u00f4\u00d4\u00f5000;
            }
            return;
        }
        if (this.\u00d3\u00d6\u00f8000 == null) {
            this.\u00d3\u00d6\u00f8000 = g2;
            return;
        }
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(g2);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(E.\u00f4\u00d4\u00d8000, 1);
        this.setTalentwert(voidsuper.returnprivateObject, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, 1);
        this.setTalentwert(voidsuper.forclassObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        if (!this.istVariante(\u00f8\u00d6\u00f8000)) {
            this.setTalentwert(G.newwhileString, 4);
            this.setTalentwert(G.\u00d5o\u00f5000, 4);
        }
        this.setTalentwert(voidsuper.thisclassObject, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        if (this.floatif()) {
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 2);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
        }
        if (this.istVariante(o\u00d6\u00f8000)) {
            this.addTalentwert(G.\u00d8\u00d3\u00f5000, 2);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
        }
        if (this.istVariante(O\u00d8\u00f8000)) {
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 2);
        }
        if (this.istVariante(\u00d8\u00d6\u00f8000) || this.istVariante(\u00f5\u00d6\u00f8000)) {
            this.addTalentwert(voidsuper.returnprivateObject, 1);
            this.addTalentwert(voidsuper.thisclassObject, 1);
        }
        if (this.istVariante(whilethisreturn)) {
            this.addTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
        }
        if (this.istVariante(thissuperreturn)) {
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
        }
        if (this.istVariante(\u00d5\u00d6\u00f8000)) {
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
        }
        if (this.istVariante(\u00f4\u00d5\u00f8000)) {
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(G.\u00d5o\u00f5000, 4);
        }
        if (this.istVariante(\u00f4\u00d6\u00f8000)) {
            this.addTalentwert(G.newwhileString, 2);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
        }
        if (this.istVariante(\u00d4\u00d6\u00f8000)) {
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(G.\u00d5o\u00f5000, 2);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 2);
        }
        if (this.istVariante(ifthisreturn)) {
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.addTalentwert(E.\u00f4\u00d4\u00d8000, 1);
            this.removeTalent(voidsuper.O\u00f6\u00d5000);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.o\u00d5\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
        }
        if (this.istVariante(O\u00d6\u00f8000)) {
            this.addTalentwert(E.returnnewString, 2);
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.forclassObject, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.thisintObject, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d3\u00d6000, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.thisdo);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.privateclass);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00f5\u00d50000);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K34";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "S\u00fcdaventurien";
    }

    @Override
    public G getMuttersprache() {
        if (this.istVariante(\u00f8\u00d6\u00f8000) && !this.istVariante(O\u00d6\u00f8000)) {
            return this.Stringsuperreturn;
        }
        return G.whilewhileString;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("S\u00fcdl\u00e4ndische Namen");
        return arrayList;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        if (this.Stringsuperreturn == null) {
            ArrayList<G> arrayList = new ArrayList<G>();
            arrayList.add(G.whilewhileString);
            arrayList.add(G.thissuperclass);
            arrayList.add(G.newwhileString);
            arrayList.add(G.\u00d5\u00f8\u00f5000);
            return new oo0o_2(this, arrayList, 1, "Muttersprache");
        }
        if (this.\u00d3\u00d6\u00f8000 == null) {
            ArrayList<G> arrayList = new ArrayList<G>();
            arrayList.add(G.\u00d3o\u00f5000);
            arrayList.add(G.\u00d8\u00d8\u00f5000);
            return new oo0o_2(this, arrayList, 1, "Schrift zur Muttersprache");
        }
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        arrayList.add(G.thissuperclass);
        arrayList.add(G.newwhileString);
        arrayList.add(G.\u00d5\u00f8\u00f5000);
        arrayList.remove(this.Stringsuperreturn);
        return new oo0o_2(this, arrayList, 1, "Zweitsprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f8\u00d5\u00f8000) {
            case 0: {
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00f8\u00d5\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                if (this.istVariante(ifthisreturn)) {
                    arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                    arrayList.add(voidsuper.\u00d5\u00d6\u00d5000);
                    int[] nArray = new int[]{1};
                    ++this.\u00f8\u00d5\u00f8000;
                    return new o0oo_2(this, arrayList, nArray);
                }
                arrayList.add(voidsuper.thisintObject);
                arrayList.add(voidsuper.StringObjectObject);
                int[] nArray = new int[]{1};
                ++this.\u00f8\u00d5\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(G.whilewhileString);
                arrayList.add(G.thissuperclass);
                arrayList.add(G.newwhileString);
                arrayList.add(G.\u00d5\u00f8\u00f5000);
                arrayList.add(G.\u00d5o\u00f5000);
                arrayList.remove(this.Stringsuperreturn);
                arrayList.remove(this.getZweitLehrsprache().get(0));
                int[] nArray = new int[]{4};
                ++this.\u00f8\u00d5\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        L l3;
        L l4;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.addAll(ProfessionenFabrik.getKriegerischeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Amazone(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Ritter(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
        Soeldner soeldner = new Soeldner(this.getGeschlecht(), g2, g3);
        arrayList.remove(soeldner);
        soeldner.addMoeglicheVariante(soeldner.getSklavenAufseher());
        arrayList.add(soeldner);
        if (this.istVariante(O\u00d8\u00f8000)) {
            l4 = new Gardist(this.getGeschlecht(), g2, g3);
            arrayList.remove(l4);
            l4.addMoeglicheVariante(((Gardist)l4).getStadtDesSchweigens());
            arrayList.add(l4);
        }
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
        l4 = new Hirte(this.getGeschlecht(), g2, g3);
        arrayList.remove(l4);
        l4.addMoeglicheVariante(((Hirte)l4).getKleintierzuechter());
        l4.addMoeglicheVariante(((Hirte)l4).getWasserbueffelhirte());
        arrayList.add(l4);
        Fischer fischer = new Fischer(this.getGeschlecht(), g2, g3);
        arrayList.remove(fischer);
        fischer.addMoeglicheVariante(fischer.getBergungstaucher());
        arrayList.add(fischer);
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getHehler());
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
        Bauer bauer = new Bauer(this.getGeschlecht(), g2, g3);
        arrayList.remove(bauer);
        bauer.addMoeglicheVariante(bauer.getGaertner());
        bauer.addMoeglicheVariante(bauer.getPflanzer());
        arrayList.add(bauer);
        Rattenfaenger rattenfaenger = new Rattenfaenger(this.getGeschlecht(), g2, g3);
        arrayList.remove(rattenfaenger);
        rattenfaenger.addMoeglicheVariante(rattenfaenger.getKrokodillero());
        arrayList.add(rattenfaenger);
        Tageloehner tageloehner = new Tageloehner(this.getGeschlecht(), g2, g3);
        arrayList.remove(tageloehner);
        tageloehner.addMoeglicheVariante(tageloehner.getLastentraeger());
        tageloehner.addMoeglicheVariante(tageloehner.getPalmschneider());
        arrayList.add(tageloehner);
        if (this.istVariante(thissuperreturn)) {
            l3 = new Schreiber(this.getGeschlecht(), g2, g3);
            arrayList.remove(l3);
            l3.addMoeglicheVariante(((Schreiber)l3).getSeshshemet());
            arrayList.add(l3);
        }
        arrayList.add(new Druide(this.getGeschlecht(), g2, g3));
        l3 = new Alchemist(this.getGeschlecht(), g2, g3);
        l3.addMoeglicheVariante(((Alchemist)l3).getKammerjaeger());
        l3.addMoeglicheVariante(((Alchemist)l3).getKammerjaegerNM());
        arrayList.add(l3);
        Hexe hexe = new Hexe(this.getGeschlecht(), g2, g3);
        hexe.removeMoeglicheVariante(hexe.getTochterDerErde());
        arrayList.add(hexe);
        if (!this.istMaennlich()) {
            l2 = new Zaubertaenzer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Zaubertaenzer)l2).getTulamidischeSharisad());
            l2.addMoeglicheVariante(((Zaubertaenzer)l2).getTulamidischeSharisadMagisch());
            arrayList.add(l2);
        }
        arrayList.add(new Magier(this.getGeschlecht(), g2, g3));
        arrayList.add(new Scharlatan(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        l2 = new Lehrmeister(this.getGeschlecht(), g2, g3);
        l2.addMoeglicheVariante(((Lehrmeister)l2).getSchuelerderXavieraKarsidian());
        l2.addMoeglicheVariante(((Lehrmeister)l2).getSefira());
        arrayList.add(l2);
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.add12G();
        geweihter.addMoeglicheVariante(geweihter.getBoronAlAnfa());
        geweihter.removeMoeglicheVariante(geweihter.getFirunHueterDerJagd());
        geweihter.removeMoeglicheVariante(geweihter.getFirunWaldlaeufer());
        geweihter.addMoeglicheVariante(geweihter.getAves());
        geweihter.addMoeglicheVariante(geweihter.getGolgaritGeweiht());
        geweihter.addMoeglicheVariante(geweihter.getNandus());
        geweihter.addMoeglicheVariante(geweihter.getNandusMarktschreiber());
        geweihter.addMoeglicheVariante(geweihter.getNandusVolkslehrer());
        geweihter.addMoeglicheVariante(geweihter.getNandusRechtshelfer());
        geweihter.addMoeglicheVariante(geweihter.getBundDesWahrenGlaubens());
        geweihter.addMoeglicheVariante(geweihter.getNandusStratege());
        arrayList.add(geweihter);
        Ordenskrieger ordenskrieger = new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        ordenskrieger.clearMoeglicheVarianten();
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getBannstrahlUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getGolgaritUngeweiht());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getRabengardeLand());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getRabengardeSee());
        ordenskrieger.addMoeglicheVariante(ordenskrieger.getRahjaKavalier());
        arrayList.add(ordenskrieger);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        if (this.istVariante(\u00f8\u00d6\u00f8000) && !this.istVariante(O\u00d6\u00f8000)) {
            return this.\u00d3\u00d6\u00f8000;
        }
        return G.\u00d8\u00d8\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.forObject);
        arrayList.add(I.newnew);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(\u00f8\u00d6\u00f8000)) {
            for<String> for_ = new for<String>(while.\u00d2o\u00f5000);
            for_.add("Stammesachaz");
            arrayList.add(for_);
            arrayList.add(new for(while.nullnewsuper));
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (!this.istVariante(ifthisreturn)) {
            oo0O.\u00d300000(K.o00000(I.\u00d4oo000));
        }
        if (this.istVariante(O\u00d6\u00f8000)) {
            J j2 = (J)K.o00000(I.thisdo);
            j2.oO0000(5);
            oo0O.\u00d300000(j2);
            J j3 = (J)K.o00000(I.\u00d50o000);
            j3.oO0000(5);
            oo0O.\u00d300000(j3);
            return oo0O;
        }
        return oo0O;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        if (this.istVariante(O\u00d6\u00f8000)) {
            ArrayList<G> arrayList = new ArrayList<G>();
            arrayList.add(G.newwhileString);
            this.setZweitLehrsprache(arrayList);
            return false;
        }
        return this.istVariante(\u00f8\u00d6\u00f8000) && (this.Stringsuperreturn == null || this.\u00d3\u00d6\u00f8000 == null || this.getZweitLehrsprache().size() == 0);
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(ifthisreturn)) {
            return this.\u00f8\u00d5\u00f8000 < 2;
        }
        if (this.istVariante(\u00f8\u00d6\u00f8000)) {
            return this.\u00f8\u00d5\u00f8000 < 3;
        }
        return this.\u00f8\u00d5\u00f8000 < 1;
    }

    @Override
    public boolean istMutterschriftGewaehlt() {
        return true;
    }

    @Override
    public boolean istMutterspracheGewaehlt() {
        return true;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public void setzeMuttersprache(G g2) {
        this.Stringsuperreturn = g2;
    }

    @Override
    public void setzeMuttersSchriftSrache(G g2) {
        this.\u00d3\u00d6\u00f8000 = g2;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("S\u00fcdaventurien");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 2;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00f5\u00d5\u00f8000);
        this.addAlleVarianten(O\u00d8\u00f8000);
        this.addAlleVarianten(o\u00d6\u00f8000);
        this.addAlleVarianten(\u00d8\u00d6\u00f8000);
        this.addAlleVarianten(\u00f4\u00d6\u00f8000);
        this.addAlleVarianten(\u00f4\u00d5\u00f8000);
        this.addAlleVarianten(thissuperreturn);
        this.addAlleVarianten(whilethisreturn);
        this.addAlleVarianten(\u00d5\u00d6\u00f8000);
        this.addAlleVarianten(\u00f5\u00d6\u00f8000);
        this.addAlleVarianten(\u00d4\u00d6\u00f8000);
        this.addAlleVarianten(ifthisreturn);
        this.addAlleVarianten(\u00f8\u00d6\u00f8000);
        this.addAlleVarianten(O\u00d6\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        if (this.istVariante(O\u00d6\u00f8000)) {
            this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00f5\u00d5\u00f8000);
        this.addMoeglicheVariante(O\u00d8\u00f8000);
        this.addMoeglicheVariante(o\u00d6\u00f8000);
        this.addMoeglicheVariante(\u00d8\u00d6\u00f8000);
        this.addMoeglicheVariante(\u00f4\u00d6\u00f8000);
        this.addMoeglicheVariante(\u00f4\u00d5\u00f8000);
        this.addMoeglicheVariante(thissuperreturn);
        this.addMoeglicheVariante(whilethisreturn);
        this.addMoeglicheVariante(\u00d5\u00d6\u00f8000);
        this.addMoeglicheVariante(\u00f5\u00d6\u00f8000);
        this.addMoeglicheVariante(\u00d4\u00d6\u00f8000);
        this.addMoeglicheVariante(ifthisreturn);
        this.addMoeglicheVariante(\u00f8\u00d6\u00f8000);
        this.addMoeglicheVariante(O\u00d6\u00f8000);
    }

    private boolean floatif() {
        return this.istVariante(O\u00d8\u00f8000) || this.istVariante(o\u00d6\u00f8000) || this.istVariante(\u00d8\u00d6\u00f8000) || this.istVariante(\u00f4\u00d6\u00f8000) || this.istVariante(\u00f4\u00d5\u00f8000) || this.istVariante(thissuperreturn) || this.istVariante(thissuperreturn) || this.istVariante(whilethisreturn) || this.istVariante(\u00d5\u00d6\u00f8000) || this.istVariante(\u00f5\u00d6\u00f8000);
    }
}

