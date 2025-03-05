/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.wundarzt.Brutfleger;
import helden.model.profession.wundarzt.Feldscher;
import helden.model.profession.wundarzt.Hebamme;
import helden.model.profession.wundarzt.QuacksalberZahnreisser;
import helden.model.profession.wundarzt.VarianteWundarzt;

public class Wundarzt
extends L {
    private P privatesuperint;
    private P o\u00f8\u00d4O00;
    private P \u00f8\u00f6\u00d4O00;
    private P \u00f5\u00f6\u00d4O00;
    private P O\u00f8\u00d4O00;

    public Wundarzt() {
    }

    public Wundarzt(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBrutfleger() {
        if (this.O\u00f8\u00d4O00 == null) {
            this.O\u00f8\u00d4O00 = new Brutfleger();
        }
        return this.O\u00f8\u00d4O00;
    }

    public P getFeldscher() {
        if (this.o\u00f8\u00d4O00 == null) {
            this.o\u00f8\u00d4O00 = new Feldscher();
        }
        return this.o\u00f8\u00d4O00;
    }

    public P getHebamme() {
        if (this.\u00f8\u00f6\u00d4O00 == null) {
            this.\u00f8\u00f6\u00d4O00 = new Hebamme();
        }
        return this.\u00f8\u00f6\u00d4O00;
    }

    @Override
    public String getID() {
        return "P74";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getQuacksalberZahnreisser() {
        if (this.\u00f5\u00f6\u00d4O00 == null) {
            this.\u00f5\u00f6\u00d4O00 = new QuacksalberZahnreisser();
        }
        return this.\u00f5\u00f6\u00d4O00;
    }

    public P getWundarztVarainate() {
        if (this.privatesuperint == null) {
            this.privatesuperint = new VarianteWundarzt();
        }
        return this.privatesuperint;
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
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
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

