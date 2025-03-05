/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZKulturen.DiamantenesSultanat;
import helden.model.DDZKulturen.Suedaventurien;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.Elitekaempfer;
import helden.model.DDZprofessionen.Entdecker;
import helden.model.DDZprofessionen.Fernhaendler;
import helden.model.DDZprofessionen.Gelehrter;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Hoefling;
import helden.model.DDZprofessionen.Kophta;
import helden.model.DDZprofessionen.Kurtisane;
import helden.model.DDZprofessionen.Mudramul;
import helden.model.DDZprofessionen.Spitzel;
import helden.model.DDZprofessionen.Taugenichts;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.kultur.ArchaischeAchaz;
import helden.model.kultur.StammesAchaz;
import java.util.ArrayList;

public class Elem
extends OooO {
    private ArrayList<o0oo_2> \u00d3\u00d20O00;
    private int \u00d4\u00d20O00 = 0;

    public Elem() {
    }

    public Elem(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.nullsuperString, 3);
        this.addTalentwert(E.newnewString, 2);
        this.addTalentwert(E.\u00f4\u00d4\u00d8000, 2);
        this.addTalentwert(voidsuper.returnforObject, 1);
        this.addTalentwert(voidsuper.returnprivateObject, 1);
        this.addTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d5\u00d5\u00d5000, 2);
        this.addTalentwert(voidsuper.O0\u00d6000, 2);
        this.addTalentwert(voidsuper.O\u00f6\u00d5000, 2);
        this.addTalentwert(voidsuper.thisinterfaceObject, 1);
        this.addTalentwert(voidsuper.\u00d30\u00d8000, 2);
        this.addTalentwert(voidsuper.oo\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 2);
        this.addTalentwert(voidsuper.thisintObject, 2);
        this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00f5\u00d6\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 2);
        this.addTalentwert(G.thissuperclass, 3);
        this.addTalentwert(G.\u00f4\u00d4\u00f5000, 3);
        this.addTalentwert(voidsuper.\u00d8\u00d5\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 2);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thisintsuper);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00f4O0000);
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.whilenull);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.whileif);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.\u00d8\u00d8o000);
        arrayList.add(I.\u00f4\u00f8o000);
        arrayList.add(I.\u00f5\u00f80000);
        arrayList.add(I.\u00d4\u00d8o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K56";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Elem";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 15;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d5\u00f8\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        o0oo_2 o0oo_22 = this.\u00d3\u00d20O00.get(this.\u00d4\u00d20O00);
        ++this.\u00d4\u00d20O00;
        return o0oo_22;
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        for<String> for_ = new for<String>(while.\u00d2o\u00f5000, false);
        for_.add(new DiamantenesSultanat(Geschlecht.\u00d400000).getKulturkundeBezeichnung());
        arrayList.add(for_);
        for_ = new for(while.\u00d2o\u00f5000, false);
        for_.add(new ArchaischeAchaz(Geschlecht.\u00d400000).getKulturkundeBezeichnung());
        arrayList.add(for_);
        for_ = new for(while.\u00d2o\u00f5000, false);
        for_.add(new StammesAchaz(Geschlecht.\u00d400000).getKulturkundeBezeichnung());
        arrayList.add(for_);
        for_ = new for(while.\u00d2o\u00f5000, false);
        for_.add(new BosparanischesReich(Geschlecht.\u00d400000).getKulturkundeBezeichnung());
        arrayList.add(for_);
        for_ = new for(while.\u00d2o\u00f5000, false);
        for_.add(new Suedaventurien(Geschlecht.\u00d400000).getKulturkundeBezeichnung());
        arrayList.add(for_);
        for_ = new for<String>("Wudu", while.\u00d2o\u00f5000, false);
        arrayList.add(for_);
        return new void(this, arrayList, 1);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.\u00f5\u00f5\u00d2000, (Integer)7));
        return bedingungsVerknuepfung;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        Elitekaempfer elitekaempfer = new Elitekaempfer(this.getGeschlecht(), g2, g3);
        elitekaempfer.clearMoeglicheVarianten();
        elitekaempfer.addMoeglicheVariante(elitekaempfer.getKataphrakt());
        elitekaempfer.addMoeglicheVariante(elitekaempfer.getGesichtsloser());
        arrayList.add(elitekaempfer);
        arrayList.add(new Entdecker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Fernhaendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Haendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Hoefling(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kurtisane(this.getGeschlecht(), g2, g3));
        arrayList.add(new Spitzel(this.getGeschlecht(), g2, g3));
        arrayList.add(new Taugenichts(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gelehrter(this.getGeschlecht(), g2, g3));
        Tierbaendiger tierbaendiger = new Tierbaendiger(this.getGeschlecht(), g2, g3);
        tierbaendiger.clearMoeglicheVarianten();
        tierbaendiger.addMoeglicheVariante(tierbaendiger.getChimaerenbaendiger());
        arrayList.add(tierbaendiger);
        Alchemist alchemist = new Alchemist(this.getGeschlecht(), g2, g3);
        alchemist.clearMoeglicheVarianten();
        alchemist.addMoeglicheVariante(alchemist.getSchulederSchwarzenWasserzuElem());
        alchemist.addMoeglicheVariante(alchemist.getHorasLaboratorienzuBelenas());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeisterNMB());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeister());
        arrayList.add(alchemist);
        Kophta kophta = new Kophta(this.getGeschlecht(), g2, g3);
        kophta.clearMoeglicheVarianten();
        kophta.addMoeglicheVariante(kophta.getElburum());
        arrayList.add(kophta);
        Mudramul mudramul = new Mudramul(this.getGeschlecht(), g2, g3);
        mudramul.clearMoeglicheVarianten();
        mudramul.addMoeglicheVariante(mudramul.getYasra());
        arrayList.add(mudramul);
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00f4\u00d4\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.forintsuper);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.privateObject);
        arrayList.add(I.nullclass);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00f4oO000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.O\u00d5o000, "gegen Fremde und Rangniedere", 6));
        J j2 = (J)K.o00000(I.thisdo);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList = super.getZweitLehrsprache();
        arrayList.add(G.\u00f5\u00f6\u00f5000);
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.\u00d3\u00d20O00 == null) {
            this.setWahlen();
        }
        return this.\u00d4\u00d20O00 < this.\u00d3\u00d20O00.size();
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    public void setWahlen() {
        this.\u00d3\u00d20O00 = new ArrayList();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
        arrayList.remove(voidsuper.\u00d8\u00d5\u00d5000);
        arrayList.remove(voidsuper.\u00f4\u00d5\u00d6000);
        int[] nArray = new int[]{1, 1, 1};
        this.\u00d3\u00d20O00.add(new o0oo_2(this, arrayList, nArray));
    }

    @Override
    public String toString() {
        return "Elem";
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected int getBasisGPKosten() {
        return 4;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
    }
}

