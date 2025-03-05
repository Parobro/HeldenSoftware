/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Barde;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Fischer;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Karawanenfuehrer;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.Wundarzt;
import helden.model.profession.Schamane;
import helden.model.profession.Tierkrieger;
import java.util.ArrayList;

public class Gjalskerlaender
extends helden.model.kultur.Gjalskerlaender {
    private int \u00d5O\u00f8000 = 0;

    public Gjalskerlaender() {
    }

    public Gjalskerlaender(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.removeTalent(G.O\u00d8\u00f5000);
        this.removeTalent(G.\u00f8\u00f6\u00f5000);
    }

    @Override
    public String getID() {
        return "K78";
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d5O\u00f8000) {
            case 0: {
                arrayList.add(voidsuper.oO\u00d6000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                int[] nArray = new int[]{2};
                ++this.\u00d5O\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.nullsuperclass);
                arrayList.add(G.O\u00d8\u00f5000);
                int[] nArray = new int[]{6};
                ++this.\u00d5O\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.nullsuperclass);
                arrayList.add(G.O\u00d8\u00f5000);
                arrayList.add(G.o\u00f4\u00f5000);
                arrayList.removeAll(this.getGewaehlteTalente());
                int[] nArray = new int[]{4};
                ++this.\u00d5O\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        return null;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        Gladiator gladiator = new Gladiator(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        gladiator.clearMoeglicheVarianten();
        gladiator.addMoeglicheVariante(gladiator.getSchaukaempfer());
        arrayList.add(gladiator);
        arrayList.add(new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getGjalskerland());
        arrayList.add(stammeskrieger);
        arrayList.add(new Fischer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Jaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Karawanenfuehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Kundschafter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Prospektor prospektor = new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor.clearMoeglicheVarianten();
        prospektor.addMoeglicheVariante(prospektor.getSammler());
        arrayList.add(prospektor);
        Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        barde.clearMoeglicheVarianten();
        barde.addMoeglicheVariante(barde.getSkalde());
        arrayList.add(barde);
        Bauer bauer = new Bauer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        bauer.clearMoeglicheVarianten();
        bauer.addMoeglicheVariante(bauer.getViehzuechter());
        arrayList.add(bauer);
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeNordens());
        arrayList.add(handwerker);
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Wundarzt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Tierkrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Schamane schamane = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schamane.clearMoeglicheVarianten();
        schamane.addMoeglicheVariante(schamane.getBrenchiDun());
        arrayList.add(schamane);
        Haendler haendler = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d5O\u00f8000 < 3;
    }
}

