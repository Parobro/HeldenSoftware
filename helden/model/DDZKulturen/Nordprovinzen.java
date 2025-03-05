/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.F;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZKulturen.Haranija;
import helden.model.DDZKulturen.Koschzwerge;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.BosMagier;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Edelhandwerker;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Gelehrter;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Hoefling;
import helden.model.DDZprofessionen.Hofkuenstler;
import helden.model.DDZprofessionen.Karawanenfuehrer;
import helden.model.DDZprofessionen.Legionaer;
import helden.model.DDZprofessionen.Privatlehrer;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Taugenichts;
import helden.model.DDZprofessionen.TochterSatu;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Schelm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Nordprovinzen
extends OooO
implements F {
    public static final P \u00d3\u00d60O00 = new P("Nordmarken", 2, false);
    public static final P nullintreturn = new P("Windehag", 2, false);
    public static final P \u00d5\u00d50O00 = new P("Wengenholm", 3, false);
    public static final P \u00f5\u00d50O00 = new P("Garetia", 2, false);
    public static final P thisintreturn = new P("Grenzgebiete", 2, false);
    public static final P \u00f8\u00d50O00 = new P("Perricum", 2, false);
    public static final P o\u00d60O00 = new P("Stadt", 0, true);
    public static final P O\u00d60O00 = new P("Oberschicht", 2, true);
    private List<o0oo_2> Stringintreturn;
    private Iterator<o0oo_2> \u00f4\u00d50O00;
    private helden.framework.D.P \u00d8\u00d50O00;

    public Nordprovinzen() {
    }

    public Nordprovinzen(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.nullsuperString, 1);
        this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.addTalentwert(E.o\u00d6\u00d8000, 1);
        this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.addTalentwert(voidsuper.ifforObject, 1);
        this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.addTalentwert(voidsuper.oo\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        if (this.istVariante(\u00d3\u00d60O00)) {
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        }
        if (this.istVariante(nullintreturn)) {
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        }
        if (this.istVariante(\u00d5\u00d50O00)) {
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.thisvoidObject, 1);
            this.addTalentwert(G.\u00d3\u00d4\u00f5000, 4);
        }
        if (this.istVariante(\u00f5\u00d50O00)) {
            this.addTalentwert(voidsuper.returnforObject, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.thisvoidObject, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        }
        if (this.istVariante(thisintreturn)) {
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        }
        if (this.istVariante(\u00f8\u00d50O00)) {
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
            this.addTalentwert(G.newwhileString, 4);
        }
        if (this.istVariante(o\u00d60O00)) {
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, -1);
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, -1);
        }
        if (this.istVariante(O\u00d60O00)) {
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 1);
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
        }
    }

    @Override
    public String getID() {
        return "K70";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Nordprovinzen";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d3\u00f8\u00f5000;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<helden.framework.D.P> arrayList = new ArrayList<helden.framework.D.P>();
        arrayList.add(oooo_0.o00000(while.\u00f6o\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d4O000.toString()));
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        return this.\u00f4\u00d50O00.next();
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(nullintreturn)) {
            arrayList.add(new for(while.\u00f6o\u00d5000));
            arrayList.add(new for(while.ifinterfaceObject));
        }
        return new void(this, arrayList, 1);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        if (this.istVariante(O\u00d60O00)) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.\u00f5\u00f5\u00d2000, (Integer)7));
            bedingungsVerknuepfung.addBedingung(Bedingung.hatRassenID("R19"));
        }
        return bedingungsVerknuepfung;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Gardist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Legionaer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenReiseWildnis(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Botenreiter(this.getGeschlecht(), g2, g3));
        Botenreiter botenreiter = new Botenreiter(this.getGeschlecht(), g2, g3);
        botenreiter.removeMoeglicheVariante(botenreiter.getZensor());
        arrayList.add(botenreiter);
        arrayList.remove(new Karawanenfuehrer(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenGesellschaft(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Hofkuenstler(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Hoefling(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Privatlehrer(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Taugenichts(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Edelhandwerker(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Gelehrter(this.getGeschlecht(), g2, g3));
        Alchemist alchemist = new Alchemist(this.getGeschlecht(), g2, g3);
        alchemist.clearMoeglicheVarianten();
        alchemist.addMoeglicheVariante(alchemist.getLehrmeisterNMB());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeister());
        arrayList.add(alchemist);
        arrayList.add(new Druide(this.getGeschlecht(), g2, g3));
        arrayList.add(new BosMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new TochterSatu(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d40\u00f6000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (this.istVariante(\u00d5\u00d50O00)) {
            oOOo.o00000(oooo_0.o00000(while.\u00f6o\u00d5000.toString()));
        }
        if (this.istVariante(\u00d3\u00d60O00) && this.\u00d8\u00d50O00 != null) {
            oOOo.o00000(this.\u00d8\u00d50O00);
        }
        return oOOo;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        for<String> for_;
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(\u00d5\u00d50O00)) {
            for_ = new for<String>(while.\u00d2o\u00f5000, false);
            for_.add(new Koschzwerge().getKulturkundeBezeichnung());
            arrayList.add(for_);
        }
        if (this.istVariante(\u00f5\u00d50O00)) {
            arrayList.add(new for(while.\u00d2\u00d4O000));
        }
        if (this.istVariante(\u00f8\u00d50O00)) {
            for_ = new for(while.\u00d2o\u00f5000, false);
            for_.add(new Haranija().getKulturkundeBezeichnung());
            arrayList.add(for_);
        }
        return arrayList;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.istVariante(\u00d3\u00d60O00) && this.\u00d8\u00d50O00 == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.\u00f4\u00d50O00 == null) {
            this.setTalentAuswahlListe();
        }
        return this.\u00f4\u00d50O00.hasNext();
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return this.istVariante(nullintreturn) && this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Nordprovinzen");
        for (P p2 : this.getGewaehlteVarianten()) {
            stringBuffer.append(": ");
            stringBuffer.append(p2.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleSonderfertigkeit(helden.framework.D.P p2) {
        this.\u00d8\u00d50O00 = p2;
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    protected void addTalentAuswahl(ArrayList<oo0o_0> arrayList, int n) {
        this.Stringintreturn.add(new o0oo_2(this, arrayList, new int[]{n}));
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    protected void setTalentAuswahlListe() {
        ArrayList<oo0o_0> arrayList;
        this.Stringintreturn = new ArrayList<o0oo_2>();
        ArrayList<oo0o_0> arrayList2 = new ArrayList<oo0o_0>();
        arrayList2.add(E.\u00d3\u00d6\u00d8000);
        arrayList2.add(E.\u00d3\u00d5\u00d8000);
        this.addTalentAuswahl(arrayList2, 1);
        ArrayList<oo0o_0> arrayList3 = new ArrayList<oo0o_0>();
        arrayList3.add(voidsuper.\u00d3\u00d8\u00d5000);
        arrayList3.add(voidsuper.\u00d4\u00d4\u00d5000);
        arrayList3.add(voidsuper.returnifObject);
        this.addTalentAuswahl(arrayList3, 1);
        ArrayList<oo0o_0> arrayList4 = new ArrayList<oo0o_0>();
        arrayList4.add(voidsuper.forvoidObject);
        arrayList4.add(voidsuper.\u00d8O\u00d8000);
        arrayList4.add(voidsuper.oO\u00d6000);
        arrayList4.add(voidsuper.Oo\u00d6000);
        arrayList4.add(voidsuper.\u00f5\u00d8\u00d5000);
        arrayList4.add(voidsuper.\u00d5\u00d6\u00d6000);
        arrayList4.add(voidsuper.\u00f8\u00d3\u00d6000);
        arrayList4.add(voidsuper.newreturnObject);
        this.addTalentAuswahl(arrayList4, 1);
        if (this.istVariante(o\u00d60O00)) {
            arrayList = new ArrayList<oo0o_0>(arrayList4);
            this.addTalentAuswahl(arrayList, 1);
        }
        if (!this.istVariante(o\u00d60O00)) {
            arrayList = new ArrayList();
            arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
            arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
            this.addTalentAuswahl(arrayList, 1);
        }
        if (this.istVariante(O\u00d60O00)) {
            arrayList = new ArrayList();
            arrayList.add(E.thissuperString);
            arrayList.add(E.ifthisString);
            arrayList.add(E.\u00f8\u00d5\u00d8000);
            this.addTalentAuswahl(arrayList, 1);
        }
        arrayList = new ArrayList();
        if (this.istVariante(\u00d3\u00d60O00)) {
            arrayList.add(E.\u00f5\u00d3\u00d8000);
            arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
            arrayList.add(voidsuper.returnprivateObject);
        }
        if (this.istVariante(nullintreturn) || this.istVariante(thisintreturn)) {
            arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
            arrayList.add(voidsuper.returnprivateObject);
        }
        if (!arrayList.isEmpty()) {
            this.addTalentAuswahl(arrayList, 1);
        }
        ArrayList<oo0o_0> arrayList5 = new ArrayList<oo0o_0>();
        if (this.istVariante(\u00d3\u00d60O00)) {
            arrayList5.add(G.\u00d8\u00f4\u00f5000);
            arrayList5.add(G.\u00d5\u00f8\u00f4000);
            arrayList5.add(G.\u00d5\u00d6\u00f5000);
            arrayList5.add(G.\u00d3\u00d4\u00f5000);
            arrayList5.add(G.o\u00f4\u00f5000);
        }
        if (this.istVariante(nullintreturn)) {
            arrayList5.add(G.\u00d8\u00f4\u00f5000);
            arrayList5.add(G.o\u00f4\u00f5000);
        }
        if (this.istVariante(\u00f5\u00d50O00)) {
            arrayList5.add(G.\u00d8\u00f4\u00f5000);
            arrayList5.add(G.\u00d5\u00f8\u00f4000);
            arrayList5.add(G.\u00d5\u00d6\u00f5000);
        }
        if (this.istVariante(thisintreturn)) {
            arrayList5.add(G.\u00f8\u00f6\u00f5000);
            arrayList5.add(G.\u00d8\u00f4\u00f5000);
            arrayList5.add(G.\u00d5\u00f8\u00f4000);
            arrayList5.add(G.\u00d5\u00d6\u00f5000);
            arrayList5.add(G.\u00d3\u00d4\u00f5000);
        }
        if (!arrayList5.isEmpty()) {
            this.addTalentAuswahl(arrayList5, 3);
        }
        this.\u00f4\u00d50O00 = this.Stringintreturn.iterator();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(O\u00d60O00);
        this.addAlleVarianten(o\u00d60O00);
        this.addAlleVarianten(\u00f5\u00d50O00);
        this.addAlleVarianten(thisintreturn);
        this.addAlleVarianten(\u00d3\u00d60O00);
        this.addAlleVarianten(\u00f8\u00d50O00);
        this.addAlleVarianten(\u00d5\u00d50O00);
        this.addAlleVarianten(nullintreturn);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.thispublicsuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(O\u00d60O00);
        this.addMoeglicheVariante(o\u00d60O00);
        this.addMoeglicheVariante(\u00f5\u00d50O00);
        this.addMoeglicheVariante(thisintreturn);
        this.addMoeglicheVariante(\u00d3\u00d60O00);
        this.addMoeglicheVariante(\u00f8\u00d50O00);
        this.addMoeglicheVariante(\u00d5\u00d50O00);
        this.addMoeglicheVariante(nullintreturn);
    }
}

