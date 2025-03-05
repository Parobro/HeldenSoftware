/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.Ausrufer;
import helden.model.DDZprofessionen.Barde;
import helden.model.DDZprofessionen.Bergmann;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Dieb;
import helden.model.DDZprofessionen.Edelhandwerker;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Gaukler;
import helden.model.DDZprofessionen.Geode;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Hofkuenstler;
import helden.model.DDZprofessionen.Karawanenfuehrer;
import helden.model.DDZprofessionen.Privatlehrer;
import helden.model.DDZprofessionen.Seefahrer;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Spitzel;
import helden.model.DDZprofessionen.Streuner;
import helden.model.DDZprofessionen.Taugenichts;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Geweihter;
import helden.model.profession.Krieger;
import java.util.ArrayList;

public class Brillantzwerge
extends helden.model.kultur.Brillantzwerge {
    public Brillantzwerge() {
    }

    public Brillantzwerge(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(G.\u00f8\u00f6\u00f5000, 3);
        this.addTalentwert(G.\u00d8\u00f4\u00f5000, 2);
    }

    @Override
    public String getID() {
        return "K59";
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.add(new Gardist(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Krieger krieger = new Krieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        krieger.addMoeglicheVariante(krieger.getXorlosch());
        arrayList.add(krieger);
        arrayList.add(new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenReiseWildnis(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Botenreiter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Karawanenfuehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Seefahrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Ausrufer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        barde.clearMoeglicheVarianten();
        barde.addMoeglicheVariante(barde.getErzaehler());
        arrayList.add(barde);
        Botenreiter botenreiter = new Botenreiter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        botenreiter.clearMoeglicheVarianten();
        botenreiter.addMoeglicheVariante(botenreiter.getStafettenlaeufer());
        arrayList.add(botenreiter);
        arrayList.add(new Dieb(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hofkuenstler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Privatlehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Spitzel(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Streuner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Taugenichts(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Bergmann bergmann = new Bergmann(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(bergmann);
        bergmann.addMoeglicheVariante(bergmann.getVarianteBergmann());
        bergmann.addMoeglicheVariante(bergmann.getPilzzuechter());
        bergmann.addMoeglicheVariante(bergmann.getSchachtfeger());
        arrayList.add(bergmann);
        Edelhandwerker edelhandwerker = new Edelhandwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(edelhandwerker);
        edelhandwerker.addMoeglicheVariante(edelhandwerker.getTresorbauer());
        arrayList.add(edelhandwerker);
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
    public boolean istZweitLehrspracheGewaehlt() {
        return false;
    }
}

