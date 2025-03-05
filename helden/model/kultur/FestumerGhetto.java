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
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.model.profession.Bettler;
import helden.model.profession.Dieb;
import helden.model.profession.Domestik;
import helden.model.profession.Einbrecher;
import helden.model.profession.Gardist;
import helden.model.profession.Gaukler;
import helden.model.profession.Geweihter;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Prospektor;
import helden.model.profession.Rattenfaenger;
import helden.model.profession.Schamane;
import helden.model.profession.Schiffer;
import helden.model.profession.Schmuggler;
import helden.model.profession.Seefahrer;
import helden.model.profession.Soeldner;
import helden.model.profession.Strassenraeuber;
import helden.model.profession.Streuner;
import helden.model.profession.Tageloehner;
import helden.model.profession.Tierbaendiger;
import helden.model.profession.Wirt;
import helden.model.profession.Wundarzt;
import java.util.ArrayList;
import java.util.List;

public class FestumerGhetto
extends OooO {
    public FestumerGhetto() {
    }

    public FestumerGhetto(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 2);
        this.setTalentwert(E.\u00d8\u00d5\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.returnprivateObject, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.thisvoidObject, 2);
        this.setTalentwert(voidsuper.whilenewObject, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.setTalentwert(voidsuper.O0\u00d6000, 1);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, 3);
        this.setTalentwert(voidsuper.thisinterfaceObject, 3);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 2);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.Oo\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 2);
        this.setTalentwert(voidsuper.returnifObject, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d3\u00d6000, 2);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00d50o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K16";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Goblins";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d8\u00f4\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Goblinische Namen");
        return arrayList;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Gardist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        Prospektor prospektor = new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor.clearMoeglicheVarianten();
        prospektor.addMoeglicheVariante(prospektor.getKraeutersammler());
        arrayList.add(prospektor);
        arrayList.add(new Schiffer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Seefahrer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bettler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Dieb(this.getGeschlecht(), g2, g3));
        arrayList.add(new Einbrecher(this.getGeschlecht(), g2, g3));
        Gaukler gaukler = new Gaukler(this.getGeschlecht(), g2, g3);
        gaukler.clearMoeglicheVarianten();
        gaukler.addMoeglicheVariante(gaukler.getDompteur());
        arrayList.add(gaukler);
        Streuner streuner = new Streuner(this.getGeschlecht(), g2, g3);
        streuner.clearMoeglicheVarianten();
        streuner.addMoeglicheVariante(streuner.getSchieber());
        arrayList.add(streuner);
        Domestik domestik = new Domestik(this.getGeschlecht(), g2, g3);
        domestik.clearMoeglicheVarianten();
        domestik.addMoeglicheVariante(domestik.getHausknecht());
        domestik.addMoeglicheVariante(domestik.getHaussklave());
        arrayList.add(domestik);
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Rattenfaenger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tageloehner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wirt(this.getGeschlecht(), g2, g3));
        if (!this.istMaennlich()) {
            arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
        }
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getFirunWaldlaeufer());
        geweihter.addMoeglicheVariante(geweihter.getPeraineLand());
        geweihter.addMoeglicheVariante(geweihter.getPeraineStadt());
        arrayList.add(geweihter);
        if (!this.istMaennlich()) {
            l2 = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Schamane)l2).getFestumerGoblinSchamane());
            arrayList.add(l2);
        }
        l2 = new Haendler(this.getGeschlecht(), g2, g3);
        l2.clearMoeglicheVarianten();
        l2.addMoeglicheVariante(((Haendler)l2).getTauschhaendler());
        arrayList.add(l2);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return null;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00d6\u00d2000));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.thisdo);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.\u00f5\u00d50000);
        return arrayList;
    }

    @Override
    public List<for> getVerbilligteSonderfertigkeiten() {
        List<for> list = super.getVerbilligteSonderfertigkeiten();
        for<String> for_ = new for<String>(while.\u00d2o\u00f5000, false);
        for_.add("Bornland");
        list.add(for_);
        return list;
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
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList = super.getZweitLehrsprache();
        arrayList.add(G.whilewhileString);
        return arrayList;
    }

    @Override
    public void setSprachen(int n, boolean bl) {
        super.setSprachen(n, bl);
    }

    @Override
    public String toString() {
        return "Festumer Ghetto";
    }

    @Override
    protected int getBasisGPKosten() {
        return 6;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, -1);
        this.putModifikator(b_0.newwhilesuper, 1);
        this.putModifikator(b_0.thispublicsuper, -2);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
    }
}

