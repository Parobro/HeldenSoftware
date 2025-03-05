/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.schelm.Hofnarr;
import helden.model.profession.schelm.Klabauterlehrling;
import helden.model.profession.schelm.Possenreisser;
import helden.model.profession.schelm.Schoepfer;
import helden.model.profession.schelm.Vagabund;
import helden.model.profession.schelm.Visionaer;

public class Schelm
extends L {
    private P O\u00d6\u00d5O00;
    private P \u00f8\u00d5\u00d5O00;
    private P o\u00d6\u00d5O00;
    private P nullvoidint;
    private P \u00f4\u00d5\u00d5O00;
    private P Stringvoidint;
    private P \u00f5\u00d5\u00d5O00;

    public Schelm() {
    }

    public Schelm(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getHofnarr() {
        if (this.O\u00d6\u00d5O00 == null) {
            this.O\u00d6\u00d5O00 = new Hofnarr();
        }
        return this.O\u00d6\u00d5O00;
    }

    @Override
    public String getID() {
        return "P54";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getKlabauterlehrling() {
        if (this.\u00f8\u00d5\u00d5O00 == null) {
            this.\u00f8\u00d5\u00d5O00 = new Klabauterlehrling();
        }
        return this.\u00f8\u00d5\u00d5O00;
    }

    public P getPossenreisser() {
        if (this.o\u00d6\u00d5O00 == null) {
            this.o\u00d6\u00d5O00 = new Possenreisser();
        }
        return this.o\u00d6\u00d5O00;
    }

    public P getSchelm() {
        if (this.\u00f5\u00d5\u00d5O00 == null) {
            this.\u00f5\u00d5\u00d5O00 = new helden.model.profession.schelm.Schelm();
        }
        return this.\u00f5\u00d5\u00d5O00;
    }

    public P getSchoepfer() {
        if (this.nullvoidint == null) {
            this.nullvoidint = new Schoepfer();
        }
        return this.nullvoidint;
    }

    public P getVagabund() {
        if (this.\u00f4\u00d5\u00d5O00 == null) {
            this.\u00f4\u00d5\u00d5O00 = new Vagabund();
        }
        return this.\u00f4\u00d5\u00d5O00;
    }

    public P getVisionaer() {
        if (this.Stringvoidint == null) {
            this.Stringvoidint = new Visionaer();
        }
        return this.Stringvoidint;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schelm");
        } else {
            stringBuffer.append("Schelmin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(", ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getHofnarr());
        this.addAlleVarianten(this.getKlabauterlehrling());
        this.addAlleVarianten(this.getPossenreisser());
        this.addAlleVarianten(this.getSchelm());
        this.addAlleVarianten(this.getSchoepfer());
        this.addAlleVarianten(this.getVagabund());
        this.addAlleVarianten(this.getVisionaer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHofnarr());
        this.addMoeglicheVariante(this.getKlabauterlehrling());
        this.addMoeglicheVariante(this.getPossenreisser());
        this.addMoeglicheVariante(this.getSchelm());
        this.addMoeglicheVariante(this.getSchoepfer());
        this.addMoeglicheVariante(this.getVagabund());
        this.addMoeglicheVariante(this.getVisionaer());
    }
}

