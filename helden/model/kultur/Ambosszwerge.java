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
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_2;
import helden.model.profession.Alchemist;
import helden.model.profession.Barde;
import helden.model.profession.Bauer;
import helden.model.profession.Bergmann;
import helden.model.profession.Botenreiter;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.Einbrecher;
import helden.model.profession.Fuhrmann;
import helden.model.profession.Gardist;
import helden.model.profession.Gelehrter;
import helden.model.profession.Geode;
import helden.model.profession.Geweihter;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hirte;
import helden.model.profession.Krieger;
import helden.model.profession.Magier;
import helden.model.profession.Prospektor;
import helden.model.profession.Schmuggler;
import helden.model.profession.Soeldner;
import helden.model.profession.Soldat;
import helden.model.profession.Wirt;
import helden.model.profession.Wundarzt;
import java.util.ArrayList;

public class Ambosszwerge
extends OooO {
    private P \u00d5\u00d4\u00f8000;

    public Ambosszwerge() {
    }

    public Ambosszwerge(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(g2);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00d4\u00d6\u00d8000, 3);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.\u00f8\u00d5\u00d8000, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 3);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, -2);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, -2);
        this.setTalentwert(voidsuper.\u00d50\u00d8000, 4);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f4\u00f6\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 3);
        this.setTalentwert(voidsuper.forObjectObject, 2);
        this.setTalentwert(voidsuper.\u00f5\u00d8\u00d5000, 3);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.\u00d5o0000);
        arrayList.add(I.\u00f4O0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.O\u00f8o000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.thisdo);
        arrayList.add(I.forvoid);
        arrayList.add(I.privateObjectsuper);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00f8O000);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K02";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Ambosszwerge";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d3\u00d4\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Zwergische Namen");
        return arrayList;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Kettenhemd, Lang"));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Kettenhemd, Halbarm"));
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        arrayList.add(G.newwhileString);
        return new oo0o_2(this, arrayList, 1, "Zweitsprache");
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.add(new Gardist(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Krieger krieger = new Krieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        krieger.clearMoeglicheVarianten();
        krieger.addMoeglicheVariante(krieger.getXorlosch());
        arrayList.add(krieger);
        arrayList.add(new Soldat(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Fuhrmann(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Schmuggler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        barde.clearMoeglicheVarianten();
        barde.addMoeglicheVariante(barde.getErzaehler());
        arrayList.add(barde);
        Einbrecher einbrecher = new Einbrecher(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        einbrecher.clearMoeglicheVarianten();
        einbrecher.addMoeglicheVariante(einbrecher.getGrabraeuber());
        arrayList.add(einbrecher);
        arrayList.add(new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Bauer bauer = new Bauer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        bauer.clearMoeglicheVarianten();
        bauer.addMoeglicheVariante(bauer.getFreibauer());
        bauer.addMoeglicheVariante(bauer.getViehzuechter());
        arrayList.add(bauer);
        Bergmann bergmann = new Bergmann(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        bergmann.addMoeglicheVariante(bergmann.getVarianteBergmann());
        bergmann.addMoeglicheVariante(bergmann.getPilzzuechter());
        bergmann.addMoeglicheVariante(bergmann.getSchachtfeger());
        arrayList.add(bergmann);
        Botenreiter botenreiter = new Botenreiter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        botenreiter.clearMoeglicheVarianten();
        botenreiter.addMoeglicheVariante(botenreiter.getStafettenlaeufer());
        arrayList.add(botenreiter);
        Edelhandwerker edelhandwerker = new Edelhandwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        edelhandwerker.removeMoeglicheVariante(edelhandwerker.getDrucker());
        edelhandwerker.removeMoeglicheVariante(edelhandwerker.getSchiffbauer());
        edelhandwerker.addMoeglicheVariante(edelhandwerker.getTresorbauer());
        arrayList.add(edelhandwerker);
        Gelehrter gelehrter = new Gelehrter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        gelehrter.clearMoeglicheVarianten();
        gelehrter.addMoeglicheVariante(gelehrter.getHistoriker());
        arrayList.add(gelehrter);
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.add(handwerker);
        arrayList.add(new Wirt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Wundarzt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        if (this.istMaennlich()) {
            arrayList.add(new Geode(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        }
        Alchemist alchemist = new Alchemist(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        alchemist.clearMoeglicheVarianten();
        alchemist.addMoeglicheVariante(alchemist.getZwergisch());
        arrayList.add(alchemist);
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getAngroschTradition());
        geweihter.addMoeglicheVariante(geweihter.getAngroschEsse());
        geweihter.addMoeglicheVariante(geweihter.getAngroschWacht());
        geweihter.addMoeglicheVariante(geweihter.getRondra());
        geweihter.addMoeglicheVariante(geweihter.getIngerimmIngraKult());
        geweihter.addMoeglicheVariante(geweihter.getIngerimmTraditionell());
        arrayList.add(geweihter);
        Magier magier = new Magier(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        magier.clearMoeglicheVarianten();
        magier.addMoeglicheVariante(magier.getFestum());
        magier.addMoeglicheVariante(magier.getGareth1());
        magier.addMoeglicheVariante(magier.getBethana());
        magier.addMoeglicheVariante(magier.getKhunchom());
        magier.addMoeglicheVariante(magier.getRashdulDaemonisch());
        magier.addMoeglicheVariante(magier.getRashdulElementar());
        arrayList.add(magier);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00f4\u00d6\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        oOOo.o00000(oooo_0.o00000(while.\u00d6\u00d5\u00d4000.toString().toString()));
        if (this.\u00d5\u00d4\u00f8000 != null) {
            oOOo.o00000(this.\u00d5\u00d4\u00f8000);
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.nullclass);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00f5\u00d50000);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d8o0000);
        j2.oO0000(6);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.\u00f5\u00f6o000);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        return oo0O;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.\u00d5\u00d4\u00f8000 == null;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.getZweitLehrsprache().size() == 0;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public String toString() {
        return "Ambosszwerge";
    }

    @Override
    public void waehleSonderfertigkeit(P p2) {
        this.\u00d5\u00d4\u00f8000 = p2;
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }
}

