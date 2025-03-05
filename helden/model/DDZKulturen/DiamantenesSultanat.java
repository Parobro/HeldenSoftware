/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.C.I;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
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
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Elitekaempfer;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grenzjaeger;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kophta;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Mudramul;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Schelm;
import java.util.ArrayList;

public class DiamantenesSultanat
extends OooO {
    private ArrayList<o0oo_2> \u00d3\u00d50O00;
    private int \u00d4\u00d50O00 = 0;

    public DiamantenesSultanat() {
    }

    public DiamantenesSultanat(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.nullsuperString, 1);
        this.addTalentwert(E.newnewString, 1);
        this.addTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d5\u00d5\u00d5000, 1);
        this.addTalentwert(voidsuper.O0\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00d8\u00d5\u00d6000, 1);
        this.addTalentwert(voidsuper.thisinterfaceObject, 1);
        this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.addTalentwert(voidsuper.\u00f4o\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
        this.addTalentwert(voidsuper.oo\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00d5\u00d6\u00d6000, 1);
        this.addTalentwert(voidsuper.privatedoObject, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.privateclass);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.whilenewsuper);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K55";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Diamantenes Sultanat";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00f5\u00f6\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        o0oo_2 o0oo_22 = this.\u00d3\u00d50O00.get(this.\u00d4\u00d50O00);
        ++this.\u00d4\u00d50O00;
        return o0oo_22;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        Elitekaempfer elitekaempfer = new Elitekaempfer(this.getGeschlecht(), g2, g3);
        elitekaempfer.clearMoeglicheVarianten();
        elitekaempfer.addMoeglicheVariante(elitekaempfer.getKataphrakt());
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
        arrayList.remove(new Grenzjaeger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Hirte(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenGesellschaft(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), g2, g3));
        Alchemist alchemist = new Alchemist(this.getGeschlecht(), g2, g3);
        alchemist.clearMoeglicheVarianten();
        alchemist.addMoeglicheVariante(alchemist.getChamibalChymiaderDracheneiSchulezuYashhualay());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeisterNMB());
        alchemist.addMoeglicheVariante(alchemist.getLehrmeister());
        arrayList.add(alchemist);
        Kophta kophta = new Kophta(this.getGeschlecht(), g2, g3);
        kophta.clearMoeglicheVarianten();
        kophta.addMoeglicheVariante(kophta.getRashdul());
        kophta.addMoeglicheVariante(kophta.getYolFassar());
        arrayList.add(kophta);
        Mudramul mudramul = new Mudramul(this.getGeschlecht(), g2, g3);
        mudramul.clearMoeglicheVarianten();
        mudramul.addMoeglicheVariante(mudramul.getYashHualay());
        mudramul.addMoeglicheVariante(mudramul.getYasra());
        arrayList.add(mudramul);
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
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.forObject);
        arrayList.add(I.newnew);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for<String>("Wahl", while.\u00d30\u00d2000, false));
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.\u00d3\u00d50O00 == null) {
            this.setWahlen();
        }
        return this.\u00d4\u00d50O00 < this.\u00d3\u00d50O00.size();
    }

    public void setWahlen() {
        this.\u00d3\u00d50O00 = new ArrayList();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        arrayList.add(G.whilenewclass);
        arrayList.add(G.\u00d3\u00d4\u00f5000);
        arrayList.add(G.returnStringclass);
        int[] nArray = new int[]{1};
        this.\u00d3\u00d50O00.add(new o0oo_2(this, arrayList, nArray));
    }

    @Override
    public String toString() {
        return "Diamantenes Sultanat";
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
    }
}

