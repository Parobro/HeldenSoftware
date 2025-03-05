/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.tageloehner.Bauhelfer;
import helden.model.profession.tageloehner.Holzfaeller;
import helden.model.profession.tageloehner.Koehler;
import helden.model.profession.tageloehner.Lastentraeger;
import helden.model.profession.tageloehner.Palmschneider;
import helden.model.profession.tageloehner.Schauerleute;

public class Tageloehner
extends L {
    private P O\u00f4\u00d2O00;
    private P ifthisnull;
    private P \u00f5\u00d8\u00d2O00;
    private P \u00f4\u00d8\u00d2O00;
    private P \u00d8\u00d8\u00d2O00;
    private P \u00f8\u00d8\u00d2O00;

    public Tageloehner() {
    }

    public Tageloehner(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBauhelfer() {
        if (this.O\u00f4\u00d2O00 == null) {
            this.O\u00f4\u00d2O00 = new Bauhelfer();
        }
        return this.O\u00f4\u00d2O00;
    }

    public P getHolzfaeller() {
        if (this.ifthisnull == null) {
            this.ifthisnull = new Holzfaeller();
        }
        return this.ifthisnull;
    }

    @Override
    public String getID() {
        return "P68";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getKoehler() {
        if (this.\u00f8\u00d8\u00d2O00 == null) {
            this.\u00f8\u00d8\u00d2O00 = new Koehler();
        }
        return this.\u00f8\u00d8\u00d2O00;
    }

    public P getLastentraeger() {
        if (this.\u00f4\u00d8\u00d2O00 == null) {
            this.\u00f4\u00d8\u00d2O00 = new Lastentraeger();
        }
        return this.\u00f4\u00d8\u00d2O00;
    }

    public P getPalmschneider() {
        if (this.\u00d8\u00d8\u00d2O00 == null) {
            this.\u00d8\u00d8\u00d2O00 = new Palmschneider();
        }
        return this.\u00d8\u00d8\u00d2O00;
    }

    public P getSchauerleute() {
        if (this.\u00f5\u00d8\u00d2O00 == null) {
            this.\u00f5\u00d8\u00d2O00 = new Schauerleute();
        }
        return this.\u00f5\u00d8\u00d2O00;
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Tagel\u00f6hner");
        } else {
            stringBuffer.append("Tagel\u00f6hnerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBauhelfer());
        this.addAlleVarianten(this.getHolzfaeller());
        this.addAlleVarianten(this.getSchauerleute());
        this.addAlleVarianten(this.getLastentraeger());
        this.addAlleVarianten(this.getPalmschneider());
        this.addAlleVarianten(this.getKoehler());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBauhelfer());
        this.addMoeglicheVariante(this.getHolzfaeller());
        this.addMoeglicheVariante(this.getSchauerleute());
        this.addMoeglicheVariante(this.getKoehler());
    }
}

