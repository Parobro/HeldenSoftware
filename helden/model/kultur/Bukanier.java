/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
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
import helden.model.profession.Bauer;
import helden.model.profession.Bettler;
import helden.model.profession.Dieb;
import helden.model.profession.Druide;
import helden.model.profession.Einbrecher;
import helden.model.profession.Fischer;
import helden.model.profession.Geweihter;
import helden.model.profession.Gladiator;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Hexe;
import helden.model.profession.Jaeger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Prospektor;
import helden.model.profession.Rattenfaenger;
import helden.model.profession.Schiffer;
import helden.model.profession.Schmuggler;
import helden.model.profession.Seefahrer;
import helden.model.profession.Soeldner;
import helden.model.profession.Strassenraeuber;
import helden.model.profession.Streuner;
import helden.model.profession.Tageloehner;
import helden.model.profession.Wirt;
import helden.model.profession.Wundarzt;
import java.util.ArrayList;

public class Bukanier
extends OooO {
    private int \u00d4o0O00 = 0;

    public Bukanier() {
    }

    public Bukanier(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.\u00d3\u00d6\u00d8000, 1);
        this.addTalentwert(E.nullsuperString, 1);
        this.addTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.addTalentwert(E.newnewString, 2);
        this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.addTalentwert(voidsuper.returnforObject, 1);
        this.addTalentwert(voidsuper.returnprivateObject, 3);
        this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
        this.addTalentwert(voidsuper.\u00f80\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.addTalentwert(G.newwhileString, 2);
        this.addTalentwert(G.\u00d5o\u00f5000, 2);
        this.addTalentwert(G.\u00d8\u00d3\u00f5000, 2);
        this.addTalentwert(voidsuper.thisclassObject, 2);
        this.addTalentwert(voidsuper.oO\u00d6000, 1);
        this.addTalentwert(voidsuper.Oo\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.addTalentwert(voidsuper.o\u00f6\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.privateclass);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K09";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Bukanier";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 6;
    }

    @Override
    public G getMuttersprache() {
        return G.whilewhileString;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d4o0O00) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d4o0O00;
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
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Fischer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schiffer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Seefahrer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bettler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Dieb(this.getGeschlecht(), g2, g3));
        arrayList.add(new Einbrecher(this.getGeschlecht(), g2, g3));
        arrayList.add(new Streuner(this.getGeschlecht(), g2, g3));
        Bauer bauer = new Bauer(this.getGeschlecht(), g2, g3);
        bauer.addMoeglicheVariante(bauer.getPflanzer());
        arrayList.add(bauer);
        arrayList.add(new Rattenfaenger(this.getGeschlecht(), g2, g3));
        Tageloehner tageloehner = new Tageloehner(this.getGeschlecht(), g2, g3);
        tageloehner.addMoeglicheVariante(tageloehner.getLastentraeger());
        arrayList.add(tageloehner);
        arrayList.add(new Wirt(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
        arrayList.add(new Druide(this.getGeschlecht(), g2, g3));
        Hexe hexe = new Hexe(this.getGeschlecht(), g2, g3);
        hexe.clearMoeglicheVarianten();
        hexe.addMoeglicheVariante(hexe.getFahrendeGemeinschaft());
        arrayList.add(hexe);
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), g2, g3);
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getPhex());
        geweihter.addMoeglicheVariante(geweihter.getPhexBetrueger());
        geweihter.addMoeglicheVariante(geweihter.getPhexBeutelschneider());
        geweihter.addMoeglicheVariante(geweihter.getPhexFassadenkletterer());
        geweihter.addMoeglicheVariante(geweihter.getPhexHaendler());
        geweihter.addMoeglicheVariante(geweihter.getPhexHehler());
        geweihter.addMoeglicheVariante(geweihter.getPhexIntrigant());
        geweihter.addMoeglicheVariante(geweihter.getEfferdKueste());
        geweihter.addMoeglicheVariante(geweihter.getEfferdBinnenland());
        geweihter.addMoeglicheVariante(geweihter.getSwafnir());
        arrayList.add(geweihter);
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
        haendler.clearMoeglicheVarianten();
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d8\u00d8\u00f5000;
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
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d5O\u00d2000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00f8o000));
        oo0O.\u00d300000(K.o00000(I.O\u00d5o000, "Misstrauen gegen Obrigkeit", 6));
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d4o0O00 < 1;
    }

    @Override
    public String toString() {
        return "Bukanier";
    }

    @Override
    protected int getBasisGPKosten() {
        return 2;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
        this.putModifikator(b_0.thispublicsuper, 2);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -1);
    }
}

