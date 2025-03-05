/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.hofkuenstler.Bildhauer;
import helden.model.profession.hofkuenstler.Darsteller;
import helden.model.profession.hofkuenstler.Hofmusicus;
import helden.model.profession.hofkuenstler.Kalligraph;
import helden.model.profession.hofkuenstler.Maler;
import helden.model.profession.hofkuenstler.Tanzlehrer;

public class Hofkuenstler
extends L {
    private P o\u00f4\u00d5O00;
    private P \u00d3\u00f4\u00d5O00;
    private P whilenullint;
    private P \u00d4\u00f4\u00d5O00;
    private P O\u00f4\u00d5O00;
    private P \u00f8\u00d8\u00d5O00;

    public Hofkuenstler() {
    }

    public Hofkuenstler(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBildhauer() {
        if (this.\u00d3\u00f4\u00d5O00 == null) {
            this.\u00d3\u00f4\u00d5O00 = new Bildhauer();
        }
        return this.\u00d3\u00f4\u00d5O00;
    }

    public P getDarsteller() {
        if (this.\u00d4\u00f4\u00d5O00 == null) {
            this.\u00d4\u00f4\u00d5O00 = new Darsteller();
        }
        return this.\u00d4\u00f4\u00d5O00;
    }

    public P getHofmusicus() {
        if (this.whilenullint == null) {
            this.whilenullint = new Hofmusicus();
        }
        return this.whilenullint;
    }

    @Override
    public String getID() {
        return "P38";
    }

    public P getKalligraph() {
        if (this.\u00f8\u00d8\u00d5O00 == null) {
            this.\u00f8\u00d8\u00d5O00 = new Kalligraph();
        }
        return this.\u00f8\u00d8\u00d5O00;
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getMaler() {
        if (this.o\u00f4\u00d5O00 == null) {
            this.o\u00f4\u00d5O00 = new Maler();
        }
        return this.o\u00f4\u00d5O00;
    }

    public P getTanzlehrer() {
        if (this.O\u00f4\u00d5O00 == null) {
            this.O\u00f4\u00d5O00 = new Tanzlehrer();
        }
        return this.O\u00f4\u00d5O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Hofk\u00fcnstler");
        } else {
            stringBuffer.append("Hofk\u00fcnstlerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getMaler());
        this.addAlleVarianten(this.getBildhauer());
        this.addAlleVarianten(this.getHofmusicus());
        this.addAlleVarianten(this.getDarsteller());
        this.addAlleVarianten(this.getTanzlehrer());
        this.addAlleVarianten(this.getKalligraph());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMaler());
        this.addMoeglicheVariante(this.getBildhauer());
        this.addMoeglicheVariante(this.getHofmusicus());
        this.addMoeglicheVariante(this.getDarsteller());
        this.addMoeglicheVariante(this.getTanzlehrer());
    }
}

