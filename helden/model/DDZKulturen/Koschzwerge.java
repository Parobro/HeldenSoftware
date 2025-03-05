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
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Dieb;
import helden.model.DDZprofessionen.Edelhandwerker;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Gaukler;
import helden.model.DDZprofessionen.Geode;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Karawanenfuehrer;
import helden.model.DDZprofessionen.Privatlehrer;
import helden.model.DDZprofessionen.Seefahrer;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.DDZprofessionen.Streuner;
import helden.model.ProfessionenFabrik;
import helden.model.kultur.Huegelzwerge;
import helden.model.profession.Geweihter;
import helden.model.profession.Krieger;
import java.util.ArrayList;

public class Koschzwerge
extends Huegelzwerge {
    public Koschzwerge() {
    }

    public Koschzwerge(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(G.\u00f4\u00d6\u00f5000, 6);
    }

    @Override
    public String getID() {
        return "K60";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Koschzwerge";
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
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenReiseWildnis(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Botenreiter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Karawanenfuehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Seefahrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Strassenraeuber(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Ausrufer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        barde.clearMoeglicheVarianten();
        barde.addMoeglicheVariante(barde.getErzaehler());
        arrayList.add(barde);
        arrayList.add(new Dieb(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Gaukler gaukler = new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        gaukler.removeMoeglicheVariante(gaukler.getAkrobat());
        arrayList.add(gaukler);
        arrayList.add(new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Privatlehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Streuner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
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
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.o\u00f6\u00f8000 < 3;
    }

    @Override
    public String toString() {
        return "Koschzwerge";
    }
}

