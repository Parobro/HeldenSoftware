/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.L;
import helden.framework.int.super;
import helden.model.DDZprofessionen.Barde;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Dieb;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.DDZprofessionen.Streuner;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.Wundarzt;
import helden.model.profession.Schamane;
import java.util.ArrayList;

public class Ferkina
extends helden.model.kultur.Ferkina {
    public Ferkina() {
    }

    public Ferkina(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(G.\u00f5\u00f6\u00f5000, 5);
    }

    @Override
    public String getID() {
        return "K76";
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.waehleVariante(stammeskrieger.getFerkina());
        arrayList.add(stammeskrieger);
        Botenreiter botenreiter = new Botenreiter(this.getGeschlecht(), g2, g3);
        botenreiter.clearMoeglicheVarianten();
        botenreiter.addMoeglicheVariante(botenreiter.getVarianteBotenreiter());
        botenreiter.addMoeglicheVariante(botenreiter.getBotenlaeufer());
        arrayList.add(botenreiter);
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Dieb(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Streuner(this.getGeschlecht(), g2, g3));
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeFerkina());
        arrayList.add(handwerker);
        Bauer bauer = new Bauer(this.getGeschlecht(), g2, g3);
        bauer.clearMoeglicheVarianten();
        bauer.addMoeglicheVariante(bauer.getViehzuechter());
        arrayList.add(bauer);
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
        arrayList.add(new Druide(this.getGeschlecht(), g2, g3));
        if (this.istMaennlich()) {
            l2 = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Schamane)l2).getNuranshar());
            l2.addMoeglicheVariante(((Schamane)l2).getNuransharMherech());
            l2.addMoeglicheVariante(((Schamane)l2).getNuransharShaiAian());
            l2.addMoeglicheVariante(((Schamane)l2).getNuransharThalusien());
            arrayList.add(l2);
        }
        l2 = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(l2);
        l2.addMoeglicheVariante(((Haendler)l2).getTauschhaendler());
        arrayList.add(l2);
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

