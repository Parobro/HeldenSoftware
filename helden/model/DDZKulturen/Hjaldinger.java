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
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZKulturen.Cyclopea;
import helden.model.DDZprofessionen.Bader;
import helden.model.DDZprofessionen.Barde;
import helden.model.DDZprofessionen.Bergmann;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Fernhaendler;
import helden.model.DDZprofessionen.Fischer;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.OlafjordMagier;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Schiffer;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Seefahrer;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Wundarzt;
import helden.model.profession.Schelm;
import java.util.ArrayList;

public class Hjaldinger
extends OooO {
    public static final P o\u00d30O00 = new P("Hjaldinger", 0, false);
    public static final P \u00d4\u00d30O00 = new P("Binnenland", 1, false);
    public static final P nullvoidreturn = new P("Swellt-Siedler", 0, false);
    public static final P \u00d3\u00d30O00 = new P("Cyclopea-Besatzer", 1, false);
    private int \u00d8\u00d30O00 = 0;
    private ArrayList<o0oo_2> forvoidreturn;
    private ArrayList<ArrayList<for>> \u00d5\u00d30O00;

    public Hjaldinger() {
    }

    public Hjaldinger(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.addTalentwert(E.\u00d5\u00d4\u00d8000, 2);
        this.addTalentwert(voidsuper.ifforObject, 1);
        this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.addTalentwert(voidsuper.returnprivateObject, 3);
        this.addTalentwert(voidsuper.\u00d40\u00d6000, 3);
        this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00f80\u00d6000, 3);
        this.addTalentwert(voidsuper.StringvoidObject, 3);
        this.addTalentwert(voidsuper.oo\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 4);
        this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
        this.addTalentwert(voidsuper.thisclassObject, 2);
        this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 2);
        if (this.istVariante(\u00d4\u00d30O00)) {
            this.addTalentwert(E.\u00f8\u00d5\u00d8000, 1);
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.returnprivateObject, -1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, -2);
            this.addTalentwert(voidsuper.StringvoidObject, -1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
            this.removeTalent(voidsuper.\u00d8\u00d8\u00d5000);
            this.addTalentwert(voidsuper.thisclassObject, -1);
        }
        if (this.istVariante(nullvoidreturn)) {
            this.addTalentwert(voidsuper.\u00f80\u00d6000, -1);
            this.addTalentwert(voidsuper.thisclassObject, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, -1);
        }
        if (this.istVariante(\u00d3\u00d30O00)) {
            this.addTalentwert(E.newnewString, 1);
            this.addTalentwert(E.\u00d5\u00d4\u00d8000, -1);
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d6000, -1);
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, -1);
            this.addTalentwert(voidsuper.thisintObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, -1);
        }
    }

    public void createWahlen() {
        this.\u00d5\u00d30O00 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        if (this.istVariante(\u00d3\u00d30O00)) {
            arrayList.add(new for(while.\u00f5\u00d6O000));
            arrayList.add(new for(while.\u00d5\u00f6\u00d2000));
            this.\u00d5\u00d30O00.add(arrayList);
        }
        if (this.istVariante(\u00d4\u00d30O00)) {
            arrayList = new ArrayList();
            arrayList.add(new for(while.\u00f6o\u00d5000));
            arrayList.add(new for(while.\u00d50\u00d3000));
            this.\u00d5\u00d30O00.add(arrayList);
        }
        if (this.istVariante(nullvoidreturn)) {
            arrayList = new ArrayList();
            arrayList.add(new for(while.nullnewsuper));
            arrayList.add(new for(while.\u00f5\u00d30000));
            this.\u00d5\u00d30O00.add(arrayList);
        }
    }

    public void genWahl() {
        int[] nArray;
        if (this.forvoidreturn != null) {
            return;
        }
        this.forvoidreturn = new ArrayList();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(G.\u00f8\u00f6\u00f5000);
        arrayList.add(G.\u00d8\u00f4\u00f5000);
        arrayList.add(G.O\u00d8\u00f5000);
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        if (this.istVariante(nullvoidreturn)) {
            arrayList.remove(G.\u00d3\u00f8\u00f5000);
            arrayList.add(G.nullsuperclass);
            arrayList.add(G.\u00d3\u00d4\u00f5000);
        }
        if (this.istVariante(\u00d3\u00d30O00)) {
            arrayList.remove(G.\u00f8\u00f6\u00f5000);
            arrayList.remove(G.\u00d8\u00f4\u00f5000);
            arrayList.remove(G.O\u00d8\u00f5000);
            arrayList.add(G.\u00f5\u00f5\u00f4000);
        }
        int[] nArray2 = new int[]{3, 2};
        this.forvoidreturn.add(new o0oo_2(this, arrayList, nArray2));
        if (this.istVariante(\u00d4\u00d30O00)) {
            arrayList = new ArrayList();
            arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
            arrayList.add(voidsuper.\u00d8O\u00d8000);
            arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
            arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
            arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
            arrayList.add(voidsuper.returnifObject);
            arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
            arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
            arrayList.add(voidsuper.newreturnObject);
            nArray = new int[]{1, 1};
            this.forvoidreturn.add(new o0oo_2(this, arrayList, nArray));
        }
        if (this.istVariante(nullvoidreturn)) {
            arrayList = new ArrayList();
            arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
            arrayList.add(voidsuper.\u00d5\u00d6\u00d5000);
            arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
            nArray = new int[]{1};
            this.forvoidreturn.add(new o0oo_2(this, arrayList, nArray));
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K57";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Hjaldinger";
    }

    @Override
    public int getMaximalSozialstatus() {
        if (this.istVariante(\u00d3\u00d30O00)) {
            return 11;
        }
        return 8;
    }

    @Override
    public G getMuttersprache() {
        return G.o\u00f4\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        o0oo_2 o0oo_22 = this.forvoidreturn.get(this.\u00d8\u00d30O00);
        ++this.\u00d8\u00d30O00;
        return o0oo_22;
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        return new void(this, this.\u00d5\u00d30O00.get(this.getGewaehlteVerbilligteSonderfertigkeiten().size()), 1);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        if (this.istVariante(\u00d3\u00d30O00)) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.\u00f5\u00f5\u00d2000, (Integer)5));
        }
        return bedingungsVerknuepfung;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        Fernhaendler fernhaendler = new Fernhaendler(this.getGeschlecht(), g2, g3);
        fernhaendler.clearMoeglicheVarianten();
        fernhaendler.addMoeglicheVariante(fernhaendler.getKauffahrer());
        arrayList.add(fernhaendler);
        arrayList.add(new Fischer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schiffer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Seefahrer(this.getGeschlecht(), g2, g3));
        Barde barde = new Barde(this.getGeschlecht(), g2, g3);
        barde.clearMoeglicheVarianten();
        barde.addMoeglicheVariante(barde.getSkalde());
        arrayList.add(barde);
        arrayList.add(new Haendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bader(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bergmann(this.getGeschlecht(), g2, g3));
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.removeMoeglicheVariante(druide.getMehrerderMacht());
        arrayList.add(druide);
        arrayList.add(new OlafjordMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00f8\u00f8\u00f5000;
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
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.privateinterface);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d5O\u00d2000);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (!this.istVariante(\u00d4\u00d30O00)) {
            arrayList.add(new for(while.ifinterfaceObject));
        }
        if (!this.istVariante(\u00d3\u00d30O00)) {
            arrayList.add(new for(while.\u00f5\u00d6O000));
        }
        if (this.istVariante(\u00d3\u00d30O00)) {
            for<String> for_ = new for<String>(while.\u00d2o\u00f5000, false);
            for_.add(new Cyclopea().getKulturkundeBezeichnung());
            arrayList.add(for_);
        }
        if (this.istVariante(\u00d4\u00d30O00) && super.getGewaehlteVerbilligteSonderfertigkeiten() != null) {
            arrayList.addAll(super.getGewaehlteVerbilligteSonderfertigkeiten());
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        this.genWahl();
        return this.\u00d8\u00d30O00 < this.forvoidreturn.size();
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        if (this.\u00d5\u00d30O00 == null) {
            this.createWahlen();
        }
        return this.getGewaehlteVerbilligteSonderfertigkeiten().size() < this.\u00d5\u00d30O00.size();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Hjaldinger");
        if (this.varianteGewaehlt() && !this.istVariante(o\u00d30O00)) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
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
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(o\u00d30O00);
        this.addAlleVarianten(\u00d4\u00d30O00);
        this.addAlleVarianten(nullvoidreturn);
        this.addAlleVarianten(\u00d3\u00d30O00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.thispublicsuper, 2);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(o\u00d30O00);
        this.addMoeglicheVariante(\u00d4\u00d30O00);
        this.addMoeglicheVariante(nullvoidreturn);
        this.addMoeglicheVariante(\u00d3\u00d30O00);
    }
}

