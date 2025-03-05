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
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Ausrufer;
import helden.model.profession.Barde;
import helden.model.profession.Botenreiter;
import helden.model.profession.Dieb;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.Gardist;
import helden.model.profession.Gaukler;
import helden.model.profession.Gelehrter;
import helden.model.profession.Geode;
import helden.model.profession.Geweihter;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Karawanenfuehrer;
import helden.model.profession.Krieger;
import helden.model.profession.Magier;
import helden.model.profession.Privatlehrer;
import helden.model.profession.Schriftsteller;
import helden.model.profession.Seefahrer;
import helden.model.profession.Soeldner;
import helden.model.profession.Soldat;
import helden.model.profession.Strassenraeuber;
import helden.model.profession.Streuner;
import java.util.ArrayList;

public class Huegelzwerge
extends OooO {
    protected int o\u00f6\u00f8000 = 0;

    public Huegelzwerge() {
    }

    public Huegelzwerge(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00d4\u00d6\u00d8000, 2);
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 2);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.\u00f5\u00d5\u00d8000, 1);
        this.setTalentwert(voidsuper.returnprivateObject, 2);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 3);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f4\u00f6\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.o\u00f6\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K23";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "H\u00fcgelzwerge";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d3\u00d4\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("H\u00fcgelzwergische Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.o\u00f6\u00f8000) {
            case 0: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                int[] nArray = new int[]{1};
                ++this.o\u00f6\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00d8O\u00d8000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                int[] nArray = new int[]{1};
                ++this.o\u00f6\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00d5o\u00d8000);
                int[] nArray = new int[]{1};
                ++this.o\u00f6\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                arrayList.add(G.\u00f4\u00d6\u00f5000);
                arrayList.add(G.\u00d8\u00d8\u00f5000);
                int[] nArray = new int[]{6};
                ++this.o\u00f6\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.add(new Gardist(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Krieger krieger = new Krieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        krieger.clearMoeglicheVarianten();
        krieger.addMoeglicheVariante(krieger.getXorlosch());
        arrayList.add(krieger);
        arrayList.add(new Soldat(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Botenreiter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Karawanenfuehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Seefahrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Strassenraeuber(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Ausrufer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        barde.clearMoeglicheVarianten();
        barde.addMoeglicheVariante(barde.getErzaehler());
        arrayList.add(barde);
        arrayList.add(new Dieb(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Gaukler gaukler = new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        gaukler.removeMoeglicheVariante(gaukler.getAkrobat());
        arrayList.add(gaukler);
        arrayList.add(new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Schriftsteller(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Privatlehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Streuner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Gelehrter gelehrter = new Gelehrter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(gelehrter);
        gelehrter.removeMoeglicheVariante(gelehrter.getMawdli());
        arrayList.add(gelehrter);
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(handwerker);
        arrayList.add(handwerker);
        Edelhandwerker edelhandwerker = new Edelhandwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(edelhandwerker);
        edelhandwerker.addMoeglicheVariante(edelhandwerker.getTresorbauer());
        arrayList.add(edelhandwerker);
        if (this.istMaennlich()) {
            arrayList.add(new Geode(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        }
        Alchemist alchemist = new Alchemist(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        alchemist.clearMoeglicheVarianten();
        alchemist.addMoeglicheVariante(alchemist.getZwergisch());
        arrayList.add(alchemist);
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getAngroschTradition());
        geweihter.addMoeglicheVariante(geweihter.getAngroschEsse());
        geweihter.addMoeglicheVariante(geweihter.getAngroschWacht());
        geweihter.addMoeglicheVariante(geweihter.getIngerimmIngraKult());
        geweihter.addMoeglicheVariante(geweihter.getIngerimmTraditionell());
        geweihter.addMoeglicheVariante(geweihter.getPeraineLand());
        geweihter.addMoeglicheVariante(geweihter.getPeraineStadt());
        geweihter.addMoeglicheVariante(geweihter.getTravia());
        arrayList.add(geweihter);
        Magier magier = new Magier(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        magier.clearMoeglicheVarianten();
        magier.addMoeglicheVariante(magier.getFestum());
        magier.addMoeglicheVariante(magier.getGareth1());
        magier.addMoeglicheVariante(magier.getBethana());
        magier.addMoeglicheVariante(magier.getKhunchom());
        magier.addMoeglicheVariante(magier.getRashdulDaemonisch());
        magier.addMoeglicheVariante(magier.getRashdulElementar());
        arrayList.add(magier);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00f4\u00d6\u00f5000;
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
        arrayList.add(I.whilethissuper);
        arrayList.add(I.OO0000);
        arrayList.add(I.newif);
        arrayList.add(I.nullclass);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00f5\u00f6o000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList = super.getZweitLehrsprache();
        arrayList.add(G.whilewhileString);
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.o\u00f6\u00f8000 < 4;
    }

    @Override
    public String toString() {
        return "H\u00fcgelzwerge";
    }

    @Override
    protected int getBasisGPKosten() {
        return 4;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00f8\u00f4\u00d2000, 1);
    }
}

