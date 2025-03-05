/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.ordenskrieger.BannstrahlUngeweiht;
import helden.model.profession.ordenskrieger.Gaenseritter;
import helden.model.profession.ordenskrieger.GolgaritUngeweiht;
import helden.model.profession.ordenskrieger.RabengardeLand;
import helden.model.profession.ordenskrieger.RabengardeSee;
import helden.model.profession.ordenskrieger.RahjaKavalier;
import helden.model.profession.ordenskrieger.Saebeltaenzer;

public class Ordenskrieger
extends L {
    private P O\u00f6\u00d3O00;
    private P thisfloatnull;
    private P whileifnull;
    private P \u00d4\u00f6\u00d3O00;
    private P \u00d5\u00f6\u00d3O00;
    private P \u00d3\u00f6\u00d3O00;
    private P o\u00f6\u00d3O00;

    public Ordenskrieger() {
    }

    public Ordenskrieger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBannstrahlUngeweiht() {
        if (this.O\u00f6\u00d3O00 == null) {
            this.O\u00f6\u00d3O00 = new BannstrahlUngeweiht();
        }
        return this.O\u00f6\u00d3O00;
    }

    public P getGaenseritter() {
        if (this.thisfloatnull == null) {
            this.thisfloatnull = new Gaenseritter();
        }
        return this.thisfloatnull;
    }

    public P getGolgaritUngeweiht() {
        if (this.whileifnull == null) {
            this.whileifnull = new GolgaritUngeweiht();
        }
        return this.whileifnull;
    }

    @Override
    public String getID() {
        return "P49";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getRabengardeLand() {
        if (this.\u00d4\u00f6\u00d3O00 == null) {
            this.\u00d4\u00f6\u00d3O00 = new RabengardeLand();
        }
        return this.\u00d4\u00f6\u00d3O00;
    }

    public P getRabengardeSee() {
        if (this.\u00d5\u00f6\u00d3O00 == null) {
            this.\u00d5\u00f6\u00d3O00 = new RabengardeSee();
        }
        return this.\u00d5\u00f6\u00d3O00;
    }

    public P getRahjaKavalier() {
        if (this.\u00d3\u00f6\u00d3O00 == null) {
            this.\u00d3\u00f6\u00d3O00 = new RahjaKavalier();
        }
        return this.\u00d3\u00f6\u00d3O00;
    }

    public P getSaebeltaenzer() {
        if (this.o\u00f6\u00d3O00 == null) {
            this.o\u00f6\u00d3O00 = new Saebeltaenzer();
        }
        return this.o\u00f6\u00d3O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Ordenskrieger");
        } else {
            stringBuffer.append("Ordenskriegerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBannstrahlUngeweiht());
        this.addAlleVarianten(this.getGaenseritter());
        this.addAlleVarianten(this.getGolgaritUngeweiht());
        this.addAlleVarianten(this.getRabengardeLand());
        this.addAlleVarianten(this.getRabengardeSee());
        this.addAlleVarianten(this.getSaebeltaenzer());
        this.addAlleVarianten(this.getRahjaKavalier());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBannstrahlUngeweiht());
        this.addMoeglicheVariante(this.getGaenseritter());
        this.addMoeglicheVariante(this.getGolgaritUngeweiht());
        this.addMoeglicheVariante(this.getRabengardeLand());
        this.addMoeglicheVariante(this.getRabengardeSee());
        this.addMoeglicheVariante(this.getSaebeltaenzer());
        this.addMoeglicheVariante(this.getRahjaKavalier());
    }
}

