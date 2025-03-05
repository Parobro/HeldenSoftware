/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.profession.Schamane;
import java.util.ArrayList;

public class Fjarninger
extends helden.model.kultur.Fjarninger {
    public Fjarninger() {
    }

    public Fjarninger(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00f80\u00d8000, 1);
    }

    @Override
    public String getID() {
        return "K77";
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        Soeldner soeldner = new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        soeldner.clearMoeglicheVarianten();
        soeldner.addMoeglicheVariante(soeldner.getLeichtesFussvolk());
        soeldner.addMoeglicheVariante(soeldner.getLeichtesFussvolk2());
        soeldner.addMoeglicheVariante(soeldner.getSchweresFussvolk());
        soeldner.addMoeglicheVariante(soeldner.getSchuetze());
        arrayList.add(soeldner);
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getFjarninger());
        arrayList.add(stammeskrieger);
        arrayList.add(new Jaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Kundschafter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeNordens());
        arrayList.add(handwerker);
        Schamane schamane = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schamane.clearMoeglicheVarianten();
        schamane.addMoeglicheVariante(schamane.getSkuldrun());
        schamane.addMoeglicheVariante(schamane.getSkuldrunHeiler());
        schamane.addMoeglicheVariante(schamane.getSkuldrunMammutSeher());
        schamane.addMoeglicheVariante(schamane.getSkuldrunZauberschmied());
        arrayList.add(schamane);
        Haendler haendler = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return false;
    }
}

