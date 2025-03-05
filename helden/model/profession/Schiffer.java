/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.schiffer.Faehrmann;
import helden.model.profession.schiffer.Floesser;
import helden.model.profession.schiffer.Flusspirat;
import helden.model.profession.schiffer.Flussschiffer;
import helden.model.profession.schiffer.Lotse;

public class Schiffer
extends L {
    private P \u00d3\u00d6oO00;
    private P whilenullvoid;
    private P o\u00d6oO00;
    private P O\u00d6oO00;
    private P \u00f8\u00d5oO00;

    public Schiffer() {
    }

    public Schiffer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getFaehrmann() {
        if (this.\u00d3\u00d6oO00 == null) {
            this.\u00d3\u00d6oO00 = new Faehrmann();
        }
        return this.\u00d3\u00d6oO00;
    }

    public P getFloesser() {
        if (this.O\u00d6oO00 == null) {
            this.O\u00d6oO00 = new Floesser();
        }
        return this.O\u00d6oO00;
    }

    public P getFlusspirat() {
        if (this.\u00f8\u00d5oO00 == null) {
            this.\u00f8\u00d5oO00 = new Flusspirat();
        }
        return this.\u00f8\u00d5oO00;
    }

    public P getFlussschiffer() {
        if (this.whilenullvoid == null) {
            this.whilenullvoid = new Flussschiffer();
        }
        return this.whilenullvoid;
    }

    @Override
    public String getID() {
        return "P55";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getLotse() {
        if (this.o\u00d6oO00 == null) {
            this.o\u00d6oO00 = new Lotse();
        }
        return this.o\u00d6oO00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schiffer");
        } else {
            stringBuffer.append("Schifferin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getFaehrmann());
        this.addAlleVarianten(this.getFlussschiffer());
        this.addAlleVarianten(this.getLotse());
        this.addAlleVarianten(this.getFloesser());
        this.addAlleVarianten(this.getFlusspirat());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getFaehrmann());
        this.addMoeglicheVariante(this.getFlussschiffer());
        this.addMoeglicheVariante(this.getLotse());
        this.addMoeglicheVariante(this.getFloesser());
    }
}

