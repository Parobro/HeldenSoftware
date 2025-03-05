/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.C.I;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.Barde;
import helden.model.DDZprofessionen.Bettler;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Dieb;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Edelhandwerker;
import helden.model.DDZprofessionen.Elitekaempfer;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Gaukler;
import helden.model.DDZprofessionen.Gelehrter;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Kophta;
import helden.model.DDZprofessionen.Mudramul;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Streuner;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Schelm;
import java.util.ArrayList;

public class Tulamidenlande
extends OooO {
    private int O\u00d50O00 = 0;
    private ArrayList<o0oo_2> ifnullreturn;
    private P \u00f8\u00d40O00;

    public Tulamidenlande() {
    }

    public Tulamidenlande(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.nullsuperString, 1);
        this.addTalentwert(E.newnewString, 1);
        this.addTalentwert(voidsuper.ifforObject, 1);
        this.addTalentwert(voidsuper.\u00d5O\u00d6000, 1);
        this.addTalentwert(voidsuper.O0\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
        this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.addTalentwert(voidsuper.oo\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.addTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K54";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00f5\u00f6\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Tulamidische Namen");
        return arrayList;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<P> arrayList = new ArrayList<P>();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000("Diamantenes Sultanat");
        arrayList.add(u2);
        u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000("Haranija");
        arrayList.add(u2);
        u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000("Elem");
        arrayList.add(u2);
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        o0oo_2 o0oo_22 = this.ifnullreturn.get(this.O\u00d50O00);
        ++this.O\u00d50O00;
        return o0oo_22;
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.ifinterfaceObject));
        arrayList.add(new for(while.\u00d2\u00d4O000));
        arrayList.add(new for(while.\u00f6o\u00d5000));
        arrayList.add(new for(while.\u00f5\u00d30000));
        return new void(this, arrayList, 1);
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
        Gardist gardist = new Gardist(this.getGeschlecht(), g2, g3);
        gardist.removeMoeglicheVariante(gardist.getRechtswahrer());
        arrayList.add(gardist);
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenReiseWildnis(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Botenreiter(this.getGeschlecht(), g2, g3));
        Botenreiter botenreiter = new Botenreiter(this.getGeschlecht(), g2, g3);
        botenreiter.removeMoeglicheVariante(botenreiter.getZensor());
        arrayList.add(botenreiter);
        Barde barde = new Barde(this.getGeschlecht(), g2, g3);
        barde.clearMoeglicheVarianten();
        barde.removeMoeglicheVariante(barde.getErzaehler());
        arrayList.add(barde);
        arrayList.add(new Bettler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Dieb(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gaukler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Haendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Streuner(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Edelhandwerker(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Gelehrter(this.getGeschlecht(), g2, g3));
        Alchemist alchemist = new Alchemist(this.getGeschlecht(), g2, g3);
        alchemist.clearMoeglicheVarianten();
        alchemist.addMoeglicheVariante(alchemist.getChamibalChymiaderDracheneiSchulezuYashhualay());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeisterNMB());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeister());
        arrayList.add(alchemist);
        arrayList.add(new Druide(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kophta(this.getGeschlecht(), g2, g3));
        arrayList.add(new Mudramul(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00f8\u00f8\u00f4000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        if (this.\u00f8\u00d40O00 != null) {
            oOOo.o00000(this.\u00f8\u00d40O00);
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00f6O000);
        arrayList.add(I.\u00d30o000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        return arrayList;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.\u00f8\u00d40O00 == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.ifnullreturn == null) {
            this.setWahlen();
        }
        return this.O\u00d50O00 < this.ifnullreturn.size();
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    public void setWahlen() {
        this.ifnullreturn = new ArrayList();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(E.\u00f5\u00d3\u00d8000);
        arrayList.add(E.\u00f4\u00d4\u00d8000);
        arrayList.add(E.o\u00d6\u00d8000);
        int[] nArray = new int[]{1};
        this.ifnullreturn.add(new o0oo_2(this, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.add(E.\u00d3\u00d6\u00d8000);
        arrayList.add(E.\u00f5\u00d5\u00d8000);
        arrayList.add(E.\u00d3\u00d5\u00d8000);
        int[] nArray2 = new int[]{1};
        this.ifnullreturn.add(new o0oo_2(this, arrayList, nArray2));
        arrayList = new ArrayList();
        arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
        arrayList.add(voidsuper.returnprivateObject);
        int[] nArray3 = new int[]{1};
        this.ifnullreturn.add(new o0oo_2(this, arrayList, nArray3));
        arrayList = new ArrayList();
        arrayList.add(voidsuper.o\u00d5\u00d6000);
        arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
        int[] nArray4 = new int[]{1};
        this.ifnullreturn.add(new o0oo_2(this, arrayList, nArray4));
        arrayList = new ArrayList();
        arrayList.add(voidsuper.thisclassObject);
        arrayList.add(voidsuper.\u00d5o\u00d8000);
        arrayList.add(voidsuper.\u00d8\u00d8\u00d5000);
        int[] nArray5 = new int[]{1};
        this.ifnullreturn.add(new o0oo_2(this, arrayList, nArray5));
    }

    @Override
    public String toString() {
        return "Tulamidenlande";
    }

    @Override
    public void waehleSonderfertigkeit(P p2) {
        this.\u00f8\u00d40O00 = p2;
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected int getBasisGPKosten() {
        return 1;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.thispublicsuper, 1);
    }
}

