/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Barde;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Bergmann;
import helden.model.DDZprofessionen.Geode;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Rattenfaenger;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Tageloehner;
import helden.model.DDZprofessionen.Wirt;
import helden.model.DDZprofessionen.Wundarzt;
import java.util.ArrayList;

public class Brobim
extends helden.model.kultur.Brobim {
    public Brobim() {
    }

    public Brobim(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(voidsuper.StringvoidObject, 1);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
    }

    @Override
    public String getID() {
        return "K62";
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
                arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                arrayList.add(voidsuper.returnifObject);
                int[] nArray = new int[]{1};
                ++this.O\u00f4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
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
            case 3: {
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
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter;
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
            basisDDZProfessionMitGeweihter = new Geode(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Geode)basisDDZProfessionMitGeweihter).getBrobim());
            arrayList.add(basisDDZProfessionMitGeweihter);
        }
        basisDDZProfessionMitGeweihter = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(basisDDZProfessionMitGeweihter);
        basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Haendler)basisDDZProfessionMitGeweihter).getTauschhaendler());
        arrayList.add(basisDDZProfessionMitGeweihter);
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.O\u00f4\u00f8000 < 4;
    }
}

