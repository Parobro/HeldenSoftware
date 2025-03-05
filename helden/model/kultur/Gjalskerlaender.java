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
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.Barde;
import helden.model.profession.Bauer;
import helden.model.profession.Fischer;
import helden.model.profession.Gladiator;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hirte;
import helden.model.profession.Jaeger;
import helden.model.profession.Karawanenfuehrer;
import helden.model.profession.Kundschafter;
import helden.model.profession.Prospektor;
import helden.model.profession.Schamane;
import helden.model.profession.Soeldner;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Tierbaendiger;
import helden.model.profession.Tierkrieger;
import helden.model.profession.Wundarzt;
import java.util.ArrayList;

public class Gjalskerlaender
extends OooO {
    private int \u00d4O\u00f8000 = 0;

    public Gjalskerlaender() {
    }

    public Gjalskerlaender(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.setTalentwert(E.newnewString, 3);
        this.setTalentwert(E.o\u00d6\u00d8000, 2);
        this.setTalentwert(E.\u00f8\u00d5\u00d8000, 1);
        this.setTalentwert(voidsuper.ifforObject, 2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnprivateObject, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 2);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 3);
        this.setTalentwert(voidsuper.oo\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(G.O\u00d8\u00f5000, 6);
        this.setTalentwert(G.\u00f8\u00f6\u00f5000, 4);
        this.setTalentwert(voidsuper.\u00f80\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.newif);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K20";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Gjalskerl\u00e4nder";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 6;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d8\u00d3\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Gjalskerl\u00e4nder Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d4O\u00f8000) {
            case 0: {
                arrayList.add(voidsuper.oO\u00d6000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                int[] nArray = new int[]{2};
                ++this.\u00d4O\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        return null;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        Gladiator gladiator = new Gladiator(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        gladiator.clearMoeglicheVarianten();
        gladiator.addMoeglicheVariante(gladiator.getSchaukaempfer());
        arrayList.add(gladiator);
        arrayList.add(new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getGjalskerland());
        arrayList.add(stammeskrieger);
        arrayList.add(new Fischer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Jaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Karawanenfuehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Kundschafter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Prospektor prospektor = new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor.clearMoeglicheVarianten();
        prospektor.addMoeglicheVariante(prospektor.getSammler());
        arrayList.add(prospektor);
        Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        barde.clearMoeglicheVarianten();
        barde.addMoeglicheVariante(barde.getSkalde());
        arrayList.add(barde);
        Bauer bauer = new Bauer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        bauer.clearMoeglicheVarianten();
        bauer.addMoeglicheVariante(bauer.getViehzuechter());
        arrayList.add(bauer);
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeNordens());
        arrayList.add(handwerker);
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Wundarzt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Tierkrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Schamane schamane = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schamane.clearMoeglicheVarianten();
        schamane.addMoeglicheVariante(schamane.getBrenchiDun());
        arrayList.add(schamane);
        Haendler haendler = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d40\u00f5000;
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
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.nullObjectsuper);
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

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.nullnewsuper));
        arrayList.add(new for(while.\u00f6o\u00d5000));
        arrayList.add(new for(while.\u00d50\u00d3000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.o\u00d3O000));
        J j2 = (J)K.o00000(I.\u00f5\u00f6o000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.whilereturn);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d4O\u00f8000 < 1;
    }

    @Override
    public String toString() {
        return "Gjalskerl\u00e4nder";
    }

    @Override
    protected int getBasisGPKosten() {
        return 9;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.returnwhilesuper, 1);
        this.putModifikator(b_0.thispublicsuper, 5);
    }
}

