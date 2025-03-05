/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oOoO.void;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZKulturen.Elem;
import helden.model.DDZKulturen.Suedaventurien;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Fischer;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.DDZprofessionen.Tageloehner;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.profession.Schamane;
import java.util.ArrayList;

public class VerloreneStaemme
extends helden.model.kultur.VerloreneStaemme {
    public VerloreneStaemme() {
    }

    public VerloreneStaemme(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "K83";
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        for<String> for_ = new for<String>(while.\u00d2o\u00f5000, false);
        for_.add(new BosparanischesReich(Geschlecht.\u00d400000).getKulturkundeBezeichnung());
        arrayList.add(for_);
        for_ = new for(while.\u00d2o\u00f5000, false);
        for_.add(new Suedaventurien(Geschlecht.\u00d400000).getKulturkundeBezeichnung());
        arrayList.add(for_);
        for_ = new for(while.\u00d2o\u00f5000, false);
        for_.add(new Elem(Geschlecht.\u00d400000).getKulturkundeBezeichnung());
        arrayList.add(for_);
        return new void(this, arrayList, 1);
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.waehleVariante(stammeskrieger.getWaldmensch());
        arrayList.add(stammeskrieger);
        Soeldner soeldner = new Soeldner(this.getGeschlecht(), g2, g3);
        arrayList.add(soeldner);
        arrayList.add(new Fischer(this.getGeschlecht(), g2, g3));
        Hirte hirte = new Hirte(this.getGeschlecht(), g2, g3);
        arrayList.add(hirte);
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bauer(this.getGeschlecht(), g2, g3));
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeSuedAventuriens());
        arrayList.add(handwerker);
        Tageloehner tageloehner = new Tageloehner(this.getGeschlecht(), g2, g3);
        tageloehner.clearMoeglicheVarianten();
        tageloehner.addMoeglicheVariante(tageloehner.getLastentraeger());
        arrayList.add(tageloehner);
        Schamane schamane = new Schamane(this.getGeschlecht(), g2, g3);
        schamane.clearMoeglicheVarianten();
        schamane.waehleVariante(schamane.getMedizinmannVerloreneStaemme());
        arrayList.add(schamane);
        Haendler haendler = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d8\u00d80000));
        return arrayList;
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(fordoclass);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(fordoclass);
    }
}

