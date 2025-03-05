/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.haendler.FahrenderHaendler;
import helden.model.profession.haendler.Geldwechsler;
import helden.model.profession.haendler.Grosshaendler;
import helden.model.profession.haendler.Hausierer;
import helden.model.profession.haendler.Hehler;
import helden.model.profession.haendler.Kraemer;
import helden.model.profession.haendler.Tauschhaendler;

public class Haendler
extends L {
    private P O0\u00d5O00;
    private P returnnewint;
    private P ifnewint;
    private P \u00f4\u00f8\u00d4O00;
    private P \u00f5\u00f8\u00d4O00;
    private P \u00d8\u00f8\u00d4O00;
    private P \u00f8\u00f8\u00d4O00;

    public Haendler() {
    }

    public Haendler(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getFahrenderHaendler() {
        if (this.ifnewint == null) {
            this.ifnewint = new FahrenderHaendler();
        }
        return this.ifnewint;
    }

    public P getGeldwechsler() {
        if (this.returnnewint == null) {
            this.returnnewint = new Geldwechsler();
        }
        return this.returnnewint;
    }

    public P getGrosshaendler() {
        if (this.\u00f5\u00f8\u00d4O00 == null) {
            this.\u00f5\u00f8\u00d4O00 = new Grosshaendler();
        }
        return this.\u00f5\u00f8\u00d4O00;
    }

    public P getHausierer() {
        if (this.\u00f4\u00f8\u00d4O00 == null) {
            this.\u00f4\u00f8\u00d4O00 = new Hausierer();
        }
        return this.\u00f4\u00f8\u00d4O00;
    }

    public P getHehler() {
        if (this.\u00d8\u00f8\u00d4O00 == null) {
            this.\u00d8\u00f8\u00d4O00 = new Hehler();
        }
        return this.\u00d8\u00f8\u00d4O00;
    }

    @Override
    public String getID() {
        return "P32";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getKraemer() {
        if (this.O0\u00d5O00 == null) {
            this.O0\u00d5O00 = new Kraemer();
        }
        return this.O0\u00d5O00;
    }

    public P getTauschhaendler() {
        if (this.\u00f8\u00f8\u00d4O00 == null) {
            this.\u00f8\u00f8\u00d4O00 = new Tauschhaendler();
        }
        return this.\u00f8\u00f8\u00d4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("H\u00e4ndler");
        } else {
            stringBuffer.append("H\u00e4ndlerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getKraemer());
        this.addAlleVarianten(this.getFahrenderHaendler());
        this.addAlleVarianten(this.getGeldwechsler());
        this.addAlleVarianten(this.getHausierer());
        this.addAlleVarianten(this.getGrosshaendler());
        this.addAlleVarianten(this.getTauschhaendler());
        this.addAlleVarianten(this.getHehler());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getKraemer());
        this.addMoeglicheVariante(this.getFahrenderHaendler());
        this.addMoeglicheVariante(this.getGeldwechsler());
        this.addMoeglicheVariante(this.getHausierer());
        this.addMoeglicheVariante(this.getGrosshaendler());
        this.addMoeglicheVariante(this.getHehler());
    }
}

