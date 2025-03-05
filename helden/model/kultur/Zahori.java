/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.model.profession.Ausrufer;
import helden.model.profession.Bader;
import helden.model.profession.Barde;
import helden.model.profession.Bettler;
import helden.model.profession.Dieb;
import helden.model.profession.Einbrecher;
import helden.model.profession.Fernhaendler;
import helden.model.profession.Fuhrmann;
import helden.model.profession.Gaukler;
import helden.model.profession.Geweihter;
import helden.model.profession.Gladiator;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hexe;
import helden.model.profession.Hirte;
import helden.model.profession.Hofkuenstler;
import helden.model.profession.Karawanenfuehrer;
import helden.model.profession.Kurtisane;
import helden.model.profession.Prospektor;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schmuggler;
import helden.model.profession.Soeldner;
import helden.model.profession.Streuner;
import helden.model.profession.Tierbaendiger;
import helden.model.profession.Wirt;
import helden.model.profession.Wundarzt;
import helden.model.profession.Zaubertaenzer;
import java.util.ArrayList;

public class Zahori
extends OooO {
    private int \u00f5O\u00f8000 = 0;
    private G \u00f4O\u00f8000 = null;

    public Zahori() {
    }

    public Zahori(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        this.\u00f4O\u00f8000 = g2;
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(E.\u00d5\u00d6\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.newnewObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d5000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.forclassObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 2);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.nullObjectObject, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
        this.setTalentwert(G.o\u00f8\u00f5000, 4);
        this.setTalentwert(voidsuper.\u00d5o\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.returnifObject, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00d5o0000);
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.O\u00f60000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d4\u00d60000);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d3\u00d4O000);
        arrayList.add(I.forclasssuper);
        arrayList.add(I.\u00f4\u00f80000);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.\u00d5\u00d6o000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.Stringdo);
        arrayList.add(I.privatesuper);
        arrayList.add(I.\u00d8O\u00d2000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K46";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Zahori";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public G getMuttersprache() {
        return G.newwhileString;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Zahori Namen");
        return arrayList;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3o\u00f5000);
        arrayList.add(G.\u00d8\u00d8\u00f5000);
        arrayList.add(G.whileStringclass);
        return new oo0o_2(this, arrayList, 1, "Schrift zur Muttersprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f5O\u00f8000) {
            case 0: {
                arrayList.add(voidsuper.o\u00d2\u00d8000);
                arrayList.add(voidsuper.OO\u00d6000);
                arrayList.add(voidsuper.whilenewObject);
                int[] nArray = new int[]{2};
                ++this.\u00f5O\u00f8000;
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
        Gladiator gladiator = new Gladiator(this.getGeschlecht(), g2, g3);
        gladiator.clearMoeglicheVarianten();
        gladiator.addMoeglicheVariante(gladiator.getSchaukaempfer());
        arrayList.add(gladiator);
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Fernhaendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Fuhrmann(this.getGeschlecht(), g2, g3));
        arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
        arrayList.add(new Karawanenfuehrer(this.getGeschlecht(), g2, g3));
        Prospektor prospektor = new Prospektor(this.getGeschlecht(), g2, g3);
        prospektor.clearMoeglicheVarianten();
        prospektor.addMoeglicheVariante(prospektor.getKraeutersammler());
        arrayList.add(prospektor);
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        barde.removeMoeglicheVariante(barde.getSkalde());
        arrayList.add(barde);
        arrayList.add(new Bettler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Dieb(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Einbrecher(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gaukler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Hofkuenstler(this.getGeschlecht(), g2, g3));
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
        haendler.clearMoeglicheVarianten();
        haendler.addMoeglicheVariante(haendler.getFahrenderHaendler());
        haendler.addMoeglicheVariante(haendler.getHausierer());
        arrayList.add(haendler);
        arrayList.add(new Kurtisane(this.getGeschlecht(), g2, g3));
        arrayList.add(new Streuner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Ausrufer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bader(this.getGeschlecht(), g2, g3));
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Wirt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
        arrayList.add(new Hexe(this.getGeschlecht(), g2, g3));
        arrayList.add(new Scharlatan(this.getGeschlecht(), g2, g3));
        Zaubertaenzer zaubertaenzer = new Zaubertaenzer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        zaubertaenzer.clearMoeglicheVarianten();
        zaubertaenzer.addMoeglicheVariante(zaubertaenzer.getZahorischerHazaqi());
        zaubertaenzer.addMoeglicheVariante(zaubertaenzer.getZahorischerHazaqiMagisch());
        arrayList.add(zaubertaenzer);
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getAves());
        geweihter.addMoeglicheVariante(geweihter.getPhex());
        geweihter.addMoeglicheVariante(geweihter.getRahja());
        geweihter.addMoeglicheVariante(geweihter.getTsa());
        geweihter.addMoeglicheVariante(geweihter.getTsaFreiheitskaempfer());
        geweihter.addMoeglicheVariante(geweihter.getTsaKoboldfreund());
        arrayList.add(geweihter);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return this.\u00f4O\u00f8000;
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
        arrayList.add(I.OO0000);
        arrayList.add(I.privateinterface);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d5oo000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d40O000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00f8o000));
        return oo0O;
    }

    @Override
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList = super.getZweitLehrsprache();
        arrayList.add(G.whilewhileString);
        return arrayList;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.\u00f4O\u00f8000 == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00f5O\u00f8000 < 1;
    }

    @Override
    public boolean istMutterschriftGewaehlt() {
        return true;
    }

    @Override
    public void setzeMuttersSchriftSrache(G g2) {
        this.\u00f4O\u00f8000 = g2;
    }

    @Override
    public String toString() {
        return "Zahori";
    }

    @Override
    protected int getBasisGPKosten() {
        return 2;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d5\u00f4\u00d2000, 1);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -1);
    }
}

