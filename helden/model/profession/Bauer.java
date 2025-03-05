/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.bauer.Erntehelfer;
import helden.model.profession.bauer.Feldsklave;
import helden.model.profession.bauer.Freibauer;
import helden.model.profession.bauer.Gaertner;
import helden.model.profession.bauer.Gutsherr;
import helden.model.profession.bauer.Knecht;
import helden.model.profession.bauer.Leibeigener;
import helden.model.profession.bauer.Mueller;
import helden.model.profession.bauer.Pflanzer;
import helden.model.profession.bauer.Viehzuechter;
import helden.model.profession.bauer.Winzer;

public class Bauer
extends L {
    private P \u00d5\u00f8\u00d3O00;
    private P forfloatnull;
    private P \u00f4\u00f6\u00d3O00;
    private P \u00d3\u00f8\u00d3O00;
    private P Stringfloatnull;
    private P o\u00f8\u00d3O00;
    private P O\u00f8\u00d3O00;
    private P \u00f5\u00f6\u00d3O00;
    private P \u00d4\u00f8\u00d3O00;
    private P nullfloatnull;
    private P \u00f8\u00f6\u00d3O00;

    public Bauer() {
    }

    public Bauer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getErntehelfer() {
        if (this.\u00d5\u00f8\u00d3O00 == null) {
            this.\u00d5\u00f8\u00d3O00 = new Erntehelfer();
        }
        return this.\u00d5\u00f8\u00d3O00;
    }

    public P getFeldsklave() {
        if (this.forfloatnull == null) {
            this.forfloatnull = new Feldsklave();
        }
        return this.forfloatnull;
    }

    public P getFreibauer() {
        if (this.\u00f4\u00f6\u00d3O00 == null) {
            this.\u00f4\u00f6\u00d3O00 = new Freibauer();
        }
        return this.\u00f4\u00f6\u00d3O00;
    }

    public P getGaertner() {
        if (this.\u00d4\u00f8\u00d3O00 == null) {
            this.\u00d4\u00f8\u00d3O00 = new Gaertner();
        }
        return this.\u00d4\u00f8\u00d3O00;
    }

    public P getGutsherr() {
        if (this.\u00d3\u00f8\u00d3O00 == null) {
            this.\u00d3\u00f8\u00d3O00 = new Gutsherr();
        }
        return this.\u00d3\u00f8\u00d3O00;
    }

    @Override
    public String getID() {
        return "P07";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getKnecht() {
        if (this.Stringfloatnull == null) {
            this.Stringfloatnull = new Knecht();
        }
        return this.Stringfloatnull;
    }

    public P getLeibeigener() {
        if (this.o\u00f8\u00d3O00 == null) {
            this.o\u00f8\u00d3O00 = new Leibeigener();
        }
        return this.o\u00f8\u00d3O00;
    }

    public P getMueller() {
        if (this.\u00f8\u00f6\u00d3O00 == null) {
            this.\u00f8\u00f6\u00d3O00 = new Mueller();
        }
        return this.\u00f8\u00f6\u00d3O00;
    }

    public P getPflanzer() {
        if (this.nullfloatnull == null) {
            this.nullfloatnull = new Pflanzer();
        }
        return this.nullfloatnull;
    }

    public P getViehzuechter() {
        if (this.O\u00f8\u00d3O00 == null) {
            this.O\u00f8\u00d3O00 = new Viehzuechter();
        }
        return this.O\u00f8\u00d3O00;
    }

    public P getWinzer() {
        if (this.\u00f5\u00f6\u00d3O00 == null) {
            this.\u00f5\u00f6\u00d3O00 = new Winzer();
        }
        return this.\u00f5\u00f6\u00d3O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer = new StringBuffer("Bauer");
            if (this.varianteGewaehlt()) {
                stringBuffer.append(": ");
                stringBuffer.append(this.getVariante().toString());
            }
            return stringBuffer.toString();
        }
        stringBuffer = new StringBuffer("B\u00e4uerin");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getErntehelfer());
        this.addAlleVarianten(this.getFeldsklave());
        this.addAlleVarianten(this.getFreibauer());
        this.addAlleVarianten(this.getGutsherr());
        this.addAlleVarianten(this.getKnecht());
        this.addAlleVarianten(this.getLeibeigener());
        this.addAlleVarianten(this.getViehzuechter());
        this.addAlleVarianten(this.getWinzer());
        this.addAlleVarianten(this.getGaertner());
        this.addAlleVarianten(this.getPflanzer());
        this.addAlleVarianten(this.getMueller());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getErntehelfer());
        this.addMoeglicheVariante(this.getFeldsklave());
        this.addMoeglicheVariante(this.getFreibauer());
        this.addMoeglicheVariante(this.getGutsherr());
        this.addMoeglicheVariante(this.getKnecht());
        this.addMoeglicheVariante(this.getLeibeigener());
        this.addMoeglicheVariante(this.getViehzuechter());
        this.addMoeglicheVariante(this.getWinzer());
        this.addMoeglicheVariante(this.getMueller());
    }
}

