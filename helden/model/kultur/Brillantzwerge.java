/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oOoO.for;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Ausrufer;
import helden.model.profession.Barde;
import helden.model.profession.Bergmann;
import helden.model.profession.Botenreiter;
import helden.model.profession.Dieb;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.Gardist;
import helden.model.profession.Gaukler;
import helden.model.profession.Geode;
import helden.model.profession.Geweihter;
import helden.model.profession.Haendler;
import helden.model.profession.Herold;
import helden.model.profession.Hofkuenstler;
import helden.model.profession.Karawanenfuehrer;
import helden.model.profession.Krieger;
import helden.model.profession.Magier;
import helden.model.profession.Ordenskrieger;
import helden.model.profession.Privatlehrer;
import helden.model.profession.Schriftsteller;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Seefahrer;
import helden.model.profession.Soeldner;
import helden.model.profession.Spitzel;
import helden.model.profession.Streuner;
import helden.model.profession.Taugenichts;
import java.util.ArrayList;

public class Brillantzwerge
extends OooO
implements for {
    private J thispublicclass = null;
    protected int \u00d8O\u00f8000 = 0;

    public Brillantzwerge() {
    }

    public Brillantzwerge(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.thispublicclass = (J)public_;
        this.thispublicclass.oO0000(5);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(g2);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00d4\u00d6\u00d8000, 2);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, -2);
        this.setTalentwert(voidsuper.\u00d50\u00d8000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f4\u00f6\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 3);
        this.setTalentwert(G.\u00f4\u00d6\u00f5000, 6);
        this.setTalentwert(voidsuper.forObjectObject, 1);
        this.setTalentwert(voidsuper.\u00d5o\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d5000, 3);
        this.setTalentwert(voidsuper.O\u00d8\u00d5000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K08";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Brillantzwerge";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d3\u00d4\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Zwergische Namen");
        return arrayList;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        arrayList.add(G.newwhileString);
        return new oo0o_2(this, arrayList, 1, "Zweitsprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d8O\u00f8000) {
            case 0: {
                arrayList.add(E.thissuperString);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d8O\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.O\u00f5\u00d6000);
                arrayList.add(voidsuper.privateclassObject);
                arrayList.add(voidsuper.StringfloatObject);
                int[] nArray = new int[]{3};
                ++this.\u00d8O\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        if (this.thispublicclass == null) {
            ArrayList<public> arrayList = new ArrayList<public>();
            arrayList.add(K.o00000(I.O\u00f4O000));
            arrayList.add(K.o00000(I.\u00d50o000));
            return new o00o_0(this, arrayList, 1);
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.add(new Gardist(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Krieger krieger = new Krieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        krieger.addMoeglicheVariante(krieger.getXorlosch());
        arrayList.add(krieger);
        Schwertgeselle schwertgeselle = new Schwertgeselle(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schwertgeselle.addMoeglicheVariante(schwertgeselle.getBrilliantzwergischerSchwertgeselle());
        arrayList.add(schwertgeselle);
        arrayList.add(new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Botenreiter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Karawanenfuehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Seefahrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Ausrufer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        barde.clearMoeglicheVarianten();
        barde.addMoeglicheVariante(barde.getErzaehler());
        arrayList.add(barde);
        Botenreiter botenreiter = new Botenreiter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        botenreiter.clearMoeglicheVarianten();
        botenreiter.addMoeglicheVariante(botenreiter.getStafettenlaeufer());
        arrayList.add(botenreiter);
        arrayList.add(new Dieb(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Herold(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hofkuenstler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Schriftsteller(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Privatlehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Spitzel(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Streuner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Taugenichts(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Bergmann bergmann = new Bergmann(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(bergmann);
        bergmann.addMoeglicheVariante(bergmann.getVarianteBergmann());
        bergmann.addMoeglicheVariante(bergmann.getPilzzuechter());
        bergmann.addMoeglicheVariante(bergmann.getSchachtfeger());
        arrayList.add(bergmann);
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
        geweihter.addMoeglicheVariante(geweihter.getRondra());
        geweihter.addMoeglicheVariante(geweihter.getIngerimmIngraKult());
        geweihter.addMoeglicheVariante(geweihter.getIngerimmTraditionell());
        geweihter.addMoeglicheVariante(geweihter.getPhex());
        geweihter.addMoeglicheVariante(geweihter.getPhexBetrueger());
        geweihter.addMoeglicheVariante(geweihter.getPhexBeutelschneider());
        geweihter.addMoeglicheVariante(geweihter.getPhexFassadenkletterer());
        geweihter.addMoeglicheVariante(geweihter.getPhexHaendler());
        geweihter.addMoeglicheVariante(geweihter.getPhexHehler());
        geweihter.addMoeglicheVariante(geweihter.getPhexIntrigant());
        geweihter.addMoeglicheVariante(geweihter.getHesindePastori());
        geweihter.addMoeglicheVariante(geweihter.getHesindeSatori());
        geweihter.addMoeglicheVariante(geweihter.getHesindeFreidenker());
        geweihter.addMoeglicheVariante(geweihter.getHesindeDraconiter());
        geweihter.addMoeglicheVariante(geweihter.getRahja());
        arrayList.add(geweihter);
        arrayList.add(new Ordenskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Magier magier = new Magier(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        magier.clearMoeglicheVarianten();
        magier.addMoeglicheVariante(magier.getFestum());
        magier.addMoeglicheVariante(magier.getGareth1());
        magier.addMoeglicheVariante(magier.getBethana());
        magier.addMoeglicheVariante(magier.getKhunchom());
        magier.addMoeglicheVariante(magier.getRashdulDaemonisch());
        magier.addMoeglicheVariante(magier.getRashdulElementar());
        magier.addMoeglicheVariante(magier.getZorgan());
        magier.addMoeglicheVariante(magier.getGrangor());
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
        oOOo.o00000(oooo_0.o00000(while.\u00d6\u00d5\u00d4000.toString()));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.OO0000);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00d3\u00f8O000);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(this.thispublicclass);
        J j2 = (J)K.o00000(I.\u00d8o0000);
        j2.oO0000(6);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.\u00f5\u00f6o000);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        return oo0O;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.getZweitLehrsprache().size() == 0;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d8O\u00f8000 < 2;
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        return this.thispublicclass == null;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public String toString() {
        return "Brillantzwerge";
    }

    @Override
    protected int getBasisGPKosten() {
        return 3;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, 1);
        this.putModifikator(b_0.\u00d5\u00f4\u00d2000, 1);
    }
}

