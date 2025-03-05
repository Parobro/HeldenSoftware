/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.C.I;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.AlhanischeZauberPriesterin;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Elitekaempfer;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Kurtisane;
import helden.model.DDZprofessionen.Lakai;
import helden.model.DDZprofessionen.Seefahrer;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.DDZprofessionen.Taugenichts;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.TochterSatu;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Zibilja;
import java.util.ArrayList;

public class Alhanien
extends OooO {
    public static final P o\u00d50O00 = new P("Stadt", 1, true);
    private int whilenullreturn = 0;

    public Alhanien() {
    }

    public Alhanien(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.nullsuperString, 2);
        this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00d8\u00d5\u00d6000, 1);
        this.addTalentwert(voidsuper.thisinterfaceObject, 1);
        this.addTalentwert(voidsuper.\u00d30\u00d8000, 2);
        this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 2);
        this.addTalentwert(voidsuper.oo\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.addTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
        if (this.istVariante(o\u00d50O00)) {
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, -1);
            this.addTalentwert(G.Stringsuperclass, 3);
            this.addTalentwert(voidsuper.\u00d5\u00d6\u00d6000, 1);
            this.addTalentwert(voidsuper.thisintObject, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.\u00d5\u00d3O000);
        arrayList.add(I.privateObject);
        arrayList.add(I.nullsuper);
        arrayList.add(I.\u00d50o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K68";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Alhanien";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00f8\u00f6\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.whilenullreturn) {
            case 0: {
                arrayList.add(E.\u00f4\u00d6\u00d8000);
                arrayList.add(E.newnewString);
                int[] nArray = new int[]{1};
                ++this.whilenullreturn;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                ++this.whilenullreturn;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.newnewObject);
                arrayList.add(voidsuper.\u00d4\u00d8\u00d6000);
                int[] nArray = new int[]{1};
                ++this.whilenullreturn;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                arrayList.add(G.\u00d3\u00f8\u00f5000);
                arrayList.add(G.\u00d3\u00d4\u00f5000);
                arrayList.add(G.\u00f5\u00f6\u00f5000);
                int[] nArray = new int[]{3};
                ++this.whilenullreturn;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                int[] nArray = new int[]{1};
                ++this.whilenullreturn;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        Elitekaempfer elitekaempfer = new Elitekaempfer(this.getGeschlecht(), g2, g3);
        elitekaempfer.clearMoeglicheVarianten();
        elitekaempfer.addMoeglicheVariante(elitekaempfer.getNurbadi());
        arrayList.add(elitekaempfer);
        arrayList.add(new Gardist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenReiseWildnis(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Botenreiter(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Seefahrer(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenGesellschaft(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Kurtisane(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Taugenichts(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Lakai(this.getGeschlecht(), g2, g3));
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
        arrayList.add(new TochterSatu(this.getGeschlecht(), g2, g3));
        arrayList.add(new AlhanischeZauberPriesterin(this.getGeschlecht(), g2, g3));
        arrayList.add(new Zibilja(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.Stringsuperclass;
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
        arrayList.add(I.\u00d5\u00f6O000);
        arrayList.add(I.\u00d30o000);
        arrayList.add(I.OO0000);
        arrayList.add(I.\u00f4\u00f50000);
        arrayList.add(I.privateObjectsuper);
        arrayList.add(I.privateclass);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00f4oO000);
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.whilenullreturn < 5;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Alhanien");
        for (P p2 : this.getGewaehlteVarianten()) {
            stringBuffer.append(" - ");
            stringBuffer.append(p2.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 1;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(o\u00d50O00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(o\u00d50O00);
    }
}

