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
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.Barde;
import helden.model.profession.Bauer;
import helden.model.profession.Bergmann;
import helden.model.profession.Geode;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Kundschafter;
import helden.model.profession.Prospektor;
import helden.model.profession.Rattenfaenger;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Tageloehner;
import helden.model.profession.Wirt;
import helden.model.profession.Wundarzt;
import java.util.ArrayList;

public class Brobim
extends OooO {
    protected int O\u00f4\u00f8000 = 0;

    public Brobim() {
    }

    public Brobim(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.nullsuperString, 2);
        this.addTalentwert(E.\u00f5\u00d3\u00d8000, 2);
        this.addTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.addTalentwert(E.newnewString, 2);
        this.addTalentwert(voidsuper.ifforObject, 1);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.addTalentwert(voidsuper.\u00d40\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
        this.addTalentwert(voidsuper.StringvoidObject, 1);
        this.addTalentwert(voidsuper.\u00d50\u00d8000, 2);
        this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 3);
        this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
        this.addTalentwert(voidsuper.forObjectObject, 1);
        this.addTalentwert(voidsuper.\u00f80\u00d8000, 2);
        this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.addTalentwert(voidsuper.o\u00f6\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.o\u00d50000);
        arrayList.add(I.\u00d5O0000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.privateObject);
        arrayList.add(I.OOO000);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00f5\u00d6O000);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d3\u00f8O000);
        arrayList.add(I.newStringsuper);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K51";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Brobim";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d3\u00d4\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.O\u00f4\u00f8000) {
            case 0: {
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                int[] nArray = new int[]{1};
                ++this.O\u00f4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.\u00d80\u00f6000);
                arrayList.add(G.\u00d5\u00f8\u00f4000);
                arrayList.add(G.nullsuperclass);
                int[] nArray = new int[]{3};
                ++this.O\u00f4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                arrayList.add(voidsuper.returnifObject);
                int[] nArray = new int[]{1};
                ++this.O\u00f4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.whileStringObject);
                arrayList.add(voidsuper.oO\u00d6000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.privateclassObject);
                arrayList.add(voidsuper.\u00f4\u00f6\u00d5000);
                arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                arrayList.add(voidsuper.oo\u00d8000);
                int[] nArray = new int[]{3, 2};
                ++this.O\u00f4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 4: {
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                arrayList.add(E.\u00d5\u00d4\u00d8000);
                int[] nArray = new int[]{1};
                ++this.O\u00f4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        ArrayList<super> arrayList = new ArrayList<super>();
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getBrobim());
        arrayList.add(stammeskrieger);
        Grosswildjaeger grosswildjaeger = new Grosswildjaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        grosswildjaeger.clearMoeglicheVarianten();
        grosswildjaeger.addMoeglicheVariante(grosswildjaeger.getSklavenjaeger());
        arrayList.add(grosswildjaeger);
        arrayList.add(new Kundschafter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        barde.clearMoeglicheVarianten();
        barde.addMoeglicheVariante(barde.getErzaehler());
        arrayList.add(barde);
        Bauer bauer = new Bauer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        bauer.clearMoeglicheVarianten();
        bauer.addMoeglicheVariante(bauer.getFreibauer());
        bauer.addMoeglicheVariante(bauer.getViehzuechter());
        arrayList.add(bauer);
        Bergmann bergmann = new Bergmann(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        bergmann.addMoeglicheVariante(bergmann.getVarianteBergmann());
        bergmann.addMoeglicheVariante(bergmann.getPilzzuechter());
        bergmann.addMoeglicheVariante(bergmann.getSchachtfeger());
        arrayList.add(bergmann);
        arrayList.add(new Rattenfaenger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Tageloehner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Wirt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Wundarzt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        if (this.istMaennlich()) {
            l2 = new Geode(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Geode)l2).getBrobim());
            arrayList.add(l2);
        }
        l2 = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(l2);
        l2.addMoeglicheVariante(((Haendler)l2).getTauschhaendler());
        arrayList.add(l2);
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
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.nullclass);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00d3\u00d3O000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.\u00d8o0000);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        J j4 = (J)K.o00000(I.\u00d5\u00f60000, "andere Zwergenv\u00f6lker");
        j4.oO0000(5);
        oo0O.\u00d300000(j4);
        M m = (M)K.o00000(I.\u00d8\u00f8O000);
        m.\u00d2o0000();
        m.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super.toString());
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.O\u00f4\u00f8000 < 5;
    }

    @Override
    public String toString() {
        return "Brobim";
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.whilewhilesuper, 1);
        this.putModifikator(b_0.O\u00f5\u00d2000, -1);
    }
}

