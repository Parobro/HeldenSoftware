/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.schwertgeselle.Adersin;
import helden.model.profession.schwertgeselle.BrilliantzwergischerSchwertgeselle;
import helden.model.profession.schwertgeselle.Buskur;
import helden.model.profession.schwertgeselle.DomTalfan;
import helden.model.profession.schwertgeselle.Essalio;
import helden.model.profession.schwertgeselle.Ishannah;
import helden.model.profession.schwertgeselle.Khunchomer;
import helden.model.profession.schwertgeselle.Marwan;
import helden.model.profession.schwertgeselle.Rafim;
import helden.model.profession.schwertgeselle.Rashdul;
import helden.model.profession.schwertgeselle.Uinin;

public class Schwertgeselle
extends L {
    private P returnifint;
    private P \u00d3\u00f6\u00d5O00;
    private P O\u00f8\u00d5O00;
    private P ififint;
    private P \u00d4\u00f6\u00d5O00;
    private P \u00f5\u00f6\u00d5O00;
    private P newifint;
    private P \u00f8\u00f6\u00d5O00;
    private P \u00f4\u00f6\u00d5O00;
    private P \u00d5\u00f6\u00d5O00;
    private P \u00d8\u00f6\u00d5O00;

    public Schwertgeselle() {
    }

    public Schwertgeselle(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAdersin() {
        if (this.returnifint == null) {
            this.returnifint = new Adersin();
        }
        return this.returnifint;
    }

    public P getBrilliantzwergischerSchwertgeselle() {
        if (this.\u00d4\u00f6\u00d5O00 == null) {
            this.\u00d4\u00f6\u00d5O00 = new BrilliantzwergischerSchwertgeselle();
        }
        return this.\u00d4\u00f6\u00d5O00;
    }

    public P getBuskur() {
        if (this.\u00d8\u00f6\u00d5O00 == null) {
            this.\u00d8\u00f6\u00d5O00 = new Buskur();
        }
        return this.\u00d8\u00f6\u00d5O00;
    }

    public P getDonTalfans() {
        if (this.\u00d5\u00f6\u00d5O00 == null) {
            this.\u00d5\u00f6\u00d5O00 = new DomTalfan();
        }
        return this.\u00d5\u00f6\u00d5O00;
    }

    public P getEssalio() {
        if (this.O\u00f8\u00d5O00 == null) {
            this.O\u00f8\u00d5O00 = new Essalio();
        }
        return this.O\u00f8\u00d5O00;
    }

    @Override
    public String getID() {
        return "P59";
    }

    public P getIshannah() {
        if (this.newifint == null) {
            this.newifint = new Ishannah();
        }
        return this.newifint;
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getKhunchomer() {
        if (this.\u00f4\u00f6\u00d5O00 == null) {
            this.\u00f4\u00f6\u00d5O00 = new Khunchomer();
        }
        return this.\u00f4\u00f6\u00d5O00;
    }

    public P getMarwan() {
        if (this.\u00f5\u00f6\u00d5O00 == null) {
            this.\u00f5\u00f6\u00d5O00 = new Marwan();
        }
        return this.\u00f5\u00f6\u00d5O00;
    }

    public P getRafim() {
        if (this.ififint == null) {
            this.ififint = new Rafim();
        }
        return this.ififint;
    }

    public P getRashdul() {
        if (this.\u00f8\u00f6\u00d5O00 == null) {
            this.\u00f8\u00f6\u00d5O00 = new Rashdul();
        }
        return this.\u00f8\u00f6\u00d5O00;
    }

    public P getUinin() {
        if (this.\u00d3\u00f6\u00d5O00 == null) {
            this.\u00d3\u00f6\u00d5O00 = new Uinin();
        }
        return this.\u00d3\u00f6\u00d5O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schwertgeselle");
        } else {
            stringBuffer.append("Schwertgesellin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(" nach ");
            stringBuffer.append(this.getVariante().toString());
        }
        if (this.varianteGewaehlt() && this.getVariante() == this.getBrilliantzwergischerSchwertgeselle()) {
            stringBuffer = new StringBuffer(this.getBrilliantzwergischerSchwertgeselle().toString());
        }
        if (this.varianteGewaehlt() && this.getVariante() == this.getMarwan()) {
            stringBuffer = new StringBuffer(this.getMarwan().toString());
        }
        if (this.varianteGewaehlt() && this.getVariante() == this.getIshannah()) {
            stringBuffer = new StringBuffer(this.getIshannah().toString());
        }
        if (this.varianteGewaehlt() && this.getVariante() == this.getBuskur()) {
            stringBuffer = new StringBuffer(this.getBuskur().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getAdersin());
        this.addAlleVarianten(this.getUinin());
        this.addAlleVarianten(this.getEssalio());
        this.addAlleVarianten(this.getRafim());
        this.addAlleVarianten(this.getBrilliantzwergischerSchwertgeselle());
        this.addAlleVarianten(this.getMarwan());
        this.addAlleVarianten(this.getIshannah());
        this.addAlleVarianten(this.getDonTalfans());
        this.addAlleVarianten(this.getBuskur());
        this.addAlleVarianten(this.getRashdul());
        this.addAlleVarianten(this.getKhunchomer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getAdersin());
        this.addMoeglicheVariante(this.getUinin());
        this.addMoeglicheVariante(this.getEssalio());
        if (this.istMaennlich()) {
            this.addMoeglicheVariante(this.getRafim());
            this.addMoeglicheVariante(this.getRashdul());
            this.addMoeglicheVariante(this.getKhunchomer());
        }
    }
}

