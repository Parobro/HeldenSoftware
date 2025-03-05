/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.wundarzt.Brutfleger;
import helden.model.DDZprofessionen.wundarzt.Feldscher;
import helden.model.DDZprofessionen.wundarzt.Hebamme;
import helden.model.DDZprofessionen.wundarzt.QuacksalberZahnreisser;
import helden.model.DDZprofessionen.wundarzt.VarianteWundarzt;

public class Wundarzt
extends BasisDDZProfessionMitGeweihter {
    private P whilenewif;
    private P \u00d5O\u00d8O00;
    private P \u00d3O\u00d8O00;
    private P oO\u00d8O00;
    private P \u00d4O\u00d8O00;

    public Wundarzt() {
    }

    public Wundarzt(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBrutfleger() {
        if (this.\u00d4O\u00d8O00 == null) {
            this.\u00d4O\u00d8O00 = new Brutfleger();
        }
        return this.\u00d4O\u00d8O00;
    }

    public P getFeldscher() {
        if (this.\u00d5O\u00d8O00 == null) {
            this.\u00d5O\u00d8O00 = new Feldscher();
        }
        return this.\u00d5O\u00d8O00;
    }

    public P getHebamme() {
        if (this.\u00d3O\u00d8O00 == null) {
            this.\u00d3O\u00d8O00 = new Hebamme();
        }
        return this.\u00d3O\u00d8O00;
    }

    @Override
    public String getID() {
        return "P136";
    }

    public P getQuacksalberZahnreisser() {
        if (this.oO\u00d8O00 == null) {
            this.oO\u00d8O00 = new QuacksalberZahnreisser();
        }
        return this.oO\u00d8O00;
    }

    public P getWundarztVarainate() {
        if (this.whilenewif == null) {
            this.whilenewif = new VarianteWundarzt();
        }
        return this.whilenewif;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Wundarzt");
        } else {
            stringBuffer.append("Wund\u00e4rztin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append("; " + super.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getWundarztVarainate());
        this.addAlleVarianten(this.getFeldscher());
        this.addAlleVarianten(this.getHebamme());
        this.addAlleVarianten(this.getQuacksalberZahnreisser());
        this.addAlleVarianten(this.getBrutfleger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getWundarztVarainate());
        this.addMoeglicheVariante(this.getFeldscher());
        this.addMoeglicheVariante(this.getHebamme());
        this.addMoeglicheVariante(this.getQuacksalberZahnreisser());
    }
}

