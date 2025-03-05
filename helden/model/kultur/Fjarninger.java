/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
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
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Jaeger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Schamane;
import helden.model.profession.Soeldner;
import helden.model.profession.Stammeskrieger;
import java.util.ArrayList;

public class Fjarninger
extends OooO {
    private int \u00d3\u00f4\u00f8000 = 0;

    public Fjarninger() {
    }

    public Fjarninger(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.\u00d3\u00d5\u00d8000, 1);
        this.setTalentwert(E.\u00f8\u00d5\u00d8000, 2);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        this.setTalentwert(voidsuper.returnprivateObject, -2);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d8\u00d3\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, -1);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 3);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 4);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f80\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d5\u00d40000);
        arrayList.add(I.o\u00f5O000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K18";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Fjarninger";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d8\u00d3\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Fjarninger Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        switch (this.\u00d3\u00f4\u00f8000) {
            case 0: {
                ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
                arrayList.add(G.nullsuperclass);
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.O\u00d8\u00f5000);
                int[] nArray = new int[]{4};
                ++this.\u00d3\u00f4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        Soeldner soeldner = new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        soeldner.clearMoeglicheVarianten();
        soeldner.addMoeglicheVariante(soeldner.getLeichtesFussvolk());
        soeldner.addMoeglicheVariante(soeldner.getLeichtesFussvolk2());
        soeldner.addMoeglicheVariante(soeldner.getSchweresFussvolk());
        soeldner.addMoeglicheVariante(soeldner.getSchuetze());
        soeldner.addMoeglicheVariante(soeldner.getRekkerFotskari());
        arrayList.add(soeldner);
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getFjarninger());
        arrayList.add(stammeskrieger);
        arrayList.add(new Jaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Kundschafter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeNordens());
        arrayList.add(handwerker);
        Schamane schamane = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schamane.clearMoeglicheVarianten();
        schamane.addMoeglicheVariante(schamane.getSkuldrun());
        schamane.addMoeglicheVariante(schamane.getSkuldrunHeiler());
        schamane.addMoeglicheVariante(schamane.getSkuldrunMammutSeher());
        schamane.addMoeglicheVariante(schamane.getSkuldrunZauberschmied());
        arrayList.add(schamane);
        Haendler haendler = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
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
        oOOo.o00000(oooo_0.o00000(while.\u00d50\u00d3000.toString()));
        oOOo.o00000(oooo_0.o00000(while.\u00f6o\u00d5000.toString()));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.privateinterface);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.nullclass);
        arrayList.add(I.Ooo000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.newfor);
        arrayList.add(I.OOO000);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d3Oo000);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.\u00d8\u00f50000);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.newnew);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00d30000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f5O0000));
        oo0O.\u00d300000(K.o00000(I.o\u00d3O000));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d4O000));
        J j2 = (J)K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.\u00f5\u00f6o000);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        M m = (M)K.o00000(I.\u00d8\u00f8O000);
        m.\u00d2o0000();
        m.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper.toString());
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d3\u00f4\u00f8000 < 1;
    }

    @Override
    public String toString() {
        return "Fjarninger";
    }

    @Override
    protected int getBasisGPKosten() {
        return 11;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, 1);
        this.putModifikator(b_0.newwhilesuper, -1);
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.privatedosuper, 1);
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 2);
        this.putModifikator(b_0.thispublicsuper, 6);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -1);
    }
}

