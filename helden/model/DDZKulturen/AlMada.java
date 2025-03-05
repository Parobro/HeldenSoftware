/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.C.I;
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
import helden.framework.oOoO.F;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZKulturen.DiamantenesSultanat;
import helden.model.DDZprofessionen.BosMagier;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grenzjaeger;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Hoefling;
import helden.model.DDZprofessionen.Hofkuenstler;
import helden.model.DDZprofessionen.Kophta;
import helden.model.DDZprofessionen.Lakai;
import helden.model.DDZprofessionen.Mudramul;
import helden.model.DDZprofessionen.Rattenfaenger;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Seefahrer;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.TochterSatu;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Schelm;
import java.util.ArrayList;

public class AlMada
extends OooO
implements F {
    public static final P o\u00d20O00 = new P("Stadt", 1, true);
    public static final P O\u00d20O00 = new P("Oberschicht", 2, true);
    private int whilereturnreturn = 0;
    private G \u00f8o0O00 = null;

    public AlMada() {
    }

    public AlMada(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        this.\u00f8o0O00 = g2;
        ArrayList<G> arrayList = new ArrayList<G>();
        if (g2.equals(G.\u00d3\u00f8\u00f5000)) {
            arrayList.add(G.\u00f5\u00f6\u00f5000);
        } else {
            arrayList.add(G.\u00d3\u00f8\u00f5000);
        }
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.nullsuperString, 1);
        this.addTalentwert(E.newnewString, 1);
        this.addTalentwert(voidsuper.\u00d5O\u00d6000, 2);
        this.addTalentwert(voidsuper.O0\u00d6000, 1);
        this.addTalentwert(voidsuper.thisinterfaceObject, 1);
        this.addTalentwert(voidsuper.\u00d30\u00d8000, 2);
        this.addTalentwert(voidsuper.nullObjectObject, 1);
        this.addTalentwert(voidsuper.oo\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
        if (this.istVariante(o\u00d20O00)) {
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
        }
        if (this.istVariante(O\u00d20O00)) {
            this.addTalentwert(E.newnewString, 1);
            this.addTalentwert(E.\u00f4\u00d4\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 1);
            this.addTalentwert(voidsuper.O0\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 1);
            this.addTalentwert(G.\u00f8\u00f8\u00f4000, 3);
        }
    }

    @Override
    public String getID() {
        return "K63";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Emirat Al'Mada";
    }

    @Override
    public G getMuttersprache() {
        return this.\u00f8o0O00;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        return arrayList;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        arrayList.add(G.\u00f5\u00f6\u00f5000);
        return new oo0o_2(this, arrayList, 1, "Muttersprache, nicht gew\u00e4hlte Sprache wird zur Zeitsprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.whilereturnreturn) {
            case 0: {
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{1};
                ++this.whilereturnreturn;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                if (this.istVariante(o\u00d20O00)) {
                    arrayList.add(voidsuper.oO\u00d6000);
                    arrayList.add(voidsuper.Oo\u00d6000);
                    arrayList.add(voidsuper.O\u00f5\u00d6000);
                    arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                    arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
                    arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
                    arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                    arrayList.add(voidsuper.\u00f4\u00f6\u00d6000);
                    arrayList.add(voidsuper.returnifObject);
                    arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                    arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                    arrayList.add(voidsuper.newreturnObject);
                }
                int[] nArray = new int[]{1};
                ++this.whilereturnreturn;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        for<String> for_ = new for<String>(while.\u00d2o\u00f5000, false);
        for_.add(new BosparanischesReich().getKulturkundeBezeichnung());
        arrayList.add(for_);
        for_ = new for(while.\u00d2o\u00f5000, false);
        for_.add(new DiamantenesSultanat().getKulturkundeBezeichnung());
        arrayList.add(for_);
        return new void(this, arrayList, 1);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        if (this.istVariante(O\u00d20O00)) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(b_0.\u00f5\u00f5\u00d2000, (Integer)7));
            bedingungsVerknuepfung.addBedingung(Bedingung.hatRassenID("R20"));
        }
        return bedingungsVerknuepfung;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Gardist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenReiseWildnis(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Grenzjaeger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Seefahrer(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Botenreiter(this.getGeschlecht(), g2, g3));
        Botenreiter botenreiter = new Botenreiter(this.getGeschlecht(), g2, g3);
        botenreiter.removeMoeglicheVariante(botenreiter.getZensor());
        arrayList.add(botenreiter);
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenGesellschaft(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Hofkuenstler(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Hoefling(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Lakai(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Rattenfaenger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        Tierbaendiger tierbaendiger = new Tierbaendiger(this.getGeschlecht(), g2, g3);
        tierbaendiger.removeMoeglicheVariante(tierbaendiger.getChimaerenbaendiger());
        arrayList.add(tierbaendiger);
        arrayList.add(new BosMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kophta(this.getGeschlecht(), g2, g3));
        arrayList.add(new Mudramul(this.getGeschlecht(), g2, g3));
        arrayList.add(new TochterSatu(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        if (this.\u00f8o0O00 == null || this.\u00f8o0O00.equals(G.\u00d3\u00f8\u00f5000)) {
            return G.\u00d40\u00f6000;
        }
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
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d4oo000));
        return oo0O;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.\u00f8o0O00 == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.whilereturnreturn < 2;
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    @Override
    public boolean istMutterspracheGewaehlt() {
        return true;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public void setzeMuttersprache(G g2) {
        this.\u00f8o0O00 = g2;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Emirat Al'Mada");
        for (P p2 : this.getGewaehlteVarianten()) {
            stringBuffer.append(" - ");
            stringBuffer.append(p2.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected int getBasisGPKosten() {
        return 2;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(O\u00d20O00);
        this.addAlleVarianten(o\u00d20O00);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(O\u00d20O00);
        this.addMoeglicheVariante(o\u00d20O00);
    }
}

