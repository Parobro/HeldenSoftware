/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.streuner.Hochstapler;
import helden.model.profession.streuner.Schieber;
import helden.model.profession.streuner.Spieler;
import helden.model.profession.streuner.VarianteStreuner;
import helden.model.profession.streuner.Zuhaelter;

public class Streuner
extends L {
    private P returnfornull;
    private P \u00d50\u00d4O00;
    private P \u00d40\u00d4O00;
    private P \u00f40\u00d4O00;
    private P \u00d80\u00d4O00;

    public Streuner() {
    }

    public Streuner(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getHochstapler() {
        if (this.returnfornull == null) {
            this.returnfornull = new Hochstapler();
        }
        return this.returnfornull;
    }

    @Override
    public String getID() {
        return "P66";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getSchieber() {
        if (this.\u00d50\u00d4O00 == null) {
            this.\u00d50\u00d4O00 = new Schieber();
        }
        return this.\u00d50\u00d4O00;
    }

    public P getSpieler() {
        if (this.\u00d40\u00d4O00 == null) {
            this.\u00d40\u00d4O00 = new Spieler();
        }
        return this.\u00d40\u00d4O00;
    }

    public P getStreuner() {
        if (this.\u00d80\u00d4O00 == null) {
            this.\u00d80\u00d4O00 = new VarianteStreuner();
        }
        return this.\u00d80\u00d4O00;
    }

    public P getZuhaelter() {
        if (this.\u00f40\u00d4O00 == null) {
            this.\u00f40\u00d4O00 = new Zuhaelter();
        }
        return this.\u00f40\u00d4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Streuner");
        } else {
            stringBuffer.append("Streunerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getHochstapler());
        this.addAlleVarianten(this.getSchieber());
        this.addAlleVarianten(this.getSpieler());
        this.addAlleVarianten(this.getZuhaelter());
        this.addAlleVarianten(this.getStreuner());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHochstapler());
        this.addMoeglicheVariante(this.getSchieber());
        this.addMoeglicheVariante(this.getSpieler());
        this.addMoeglicheVariante(this.getZuhaelter());
        this.addMoeglicheVariante(this.getStreuner());
    }
}

