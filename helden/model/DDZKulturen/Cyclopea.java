/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.oo0o_2;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.Bettler;
import helden.model.DDZprofessionen.BosMagier;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Edelhandwerker;
import helden.model.DDZprofessionen.Einbrecher;
import helden.model.DDZprofessionen.Entdecker;
import helden.model.DDZprofessionen.Fernhaendler;
import helden.model.DDZprofessionen.Fischer;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Hoefling;
import helden.model.DDZprofessionen.Hofkuenstler;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Legionaer;
import helden.model.DDZprofessionen.Privatlehrer;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Rattenfaenger;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Seefahrer;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Taugenichts;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.TochterSatu;
import helden.model.ProfessionenFabrik;
import helden.model.kultur.Zyklopeninseln;
import helden.model.profession.Schelm;
import java.util.ArrayList;

public class Cyclopea
extends Zyklopeninseln {
    public Cyclopea() {
    }

    public Cyclopea(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(g2);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public String getID() {
        return "K53";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Cyclopea";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00f5\u00f5\u00f4000;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        arrayList.add(G.o\u00f4\u00f5000);
        return new oo0o_2(this, arrayList, 1, "W\u00e4hle die Zweitsprache");
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        Gardist gardist = new Gardist(this.getGeschlecht(), g2, g3);
        gardist.removeMoeglicheVariante(gardist.getRechtswahrer());
        arrayList.add(gardist);
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Legionaer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        Botenreiter botenreiter = new Botenreiter(this.getGeschlecht(), g2, g3);
        botenreiter.clearMoeglicheVarianten();
        botenreiter.addMoeglicheVariante(botenreiter.getBotenlaeufer());
        arrayList.add(botenreiter);
        arrayList.add(new Entdecker(this.getGeschlecht(), g2, g3));
        Fernhaendler fernhaendler = new Fernhaendler(this.getGeschlecht(), g2, g3);
        fernhaendler.clearMoeglicheVarianten();
        fernhaendler.addMoeglicheVariante(fernhaendler.getKauffahrer());
        arrayList.add(fernhaendler);
        arrayList.add(new Fischer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Seefahrer(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenGesellschaft(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Bettler(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Einbrecher(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Hofkuenstler(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Hoefling(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Privatlehrer(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Taugenichts(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Edelhandwerker(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Rattenfaenger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        Alchemist alchemist = new Alchemist(this.getGeschlecht(), g2, g3);
        alchemist.clearMoeglicheVarianten();
        alchemist.addMoeglicheVariante(alchemist.getLehrmeisterNMB());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeister());
        arrayList.add(alchemist);
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.clearMoeglicheVarianten();
        druide.addMoeglicheVariante(druide.getHaindruide());
        druide.addMoeglicheVariante(druide.getHueterderMacht());
        arrayList.add(druide);
        arrayList.add(new BosMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new TochterSatu(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d8\u00d8\u00f5000;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.getZweitLehrsprache() == null || this.getZweitLehrsprache().size() == 0;
    }

    @Override
    public boolean istMutterspracheGewaehlt() {
        return false;
    }

    @Override
    public String toString() {
        return "Cyclopea";
    }

    @Override
    protected void setzeAlleVarianten() {
    }

    @Override
    protected void setzeMoeglicheVarianten() {
    }
}

