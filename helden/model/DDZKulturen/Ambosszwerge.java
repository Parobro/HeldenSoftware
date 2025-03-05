/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.Barde;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Bergmann;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Edelhandwerker;
import helden.model.DDZprofessionen.Einbrecher;
import helden.model.DDZprofessionen.Fuhrmann;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Gelehrter;
import helden.model.DDZprofessionen.Geode;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Wirt;
import helden.model.DDZprofessionen.Wundarzt;
import helden.model.profession.Geweihter;
import helden.model.profession.Krieger;
import java.util.ArrayList;

public class Ambosszwerge
extends helden.model.kultur.Ambosszwerge {
    private int forinterfaceclass;

    public Ambosszwerge() {
    }

    public Ambosszwerge(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "K58";
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.forinterfaceclass) {
            case 0: {
                arrayList.add(G.\u00d3\u00f8\u00f5000);
                arrayList.add(G.\u00f5\u00f6\u00f5000);
                arrayList.add(G.O\u00d8\u00f5000);
                arrayList.add(G.\u00d8\u00f4\u00f5000);
                arrayList.add(G.\u00d5\u00f8\u00f4000);
                int[] nArray = new int[]{3, 2};
                ++this.forinterfaceclass;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
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
        edelhandwerker.removeMoeglicheVariante(edelhandwerker.getSchiffbauer());
        edelhandwerker.addMoeglicheVariante(edelhandwerker.getTresorbauer());
        arrayList.add(edelhandwerker);
        Gelehrter gelehrter = new Gelehrter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        gelehrter.clearMoeglicheVarianten();
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
        alchemist.addMoeglicheVariante(alchemist.getLehrmeister());
        arrayList.add(alchemist);
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getAngroschTradition());
        geweihter.addMoeglicheVariante(geweihter.getAngroschEsse());
        geweihter.addMoeglicheVariante(geweihter.getAngroschWacht());
        arrayList.add(geweihter);
        arrayList.add(new Goetterdiener(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        return arrayList;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.forinterfaceclass < 1;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return false;
    }
}

