/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.seefahrer.Matrose;
import helden.model.profession.seefahrer.Navigator;
import helden.model.profession.seefahrer.Pirat;
import helden.model.profession.seefahrer.Robbenjaeger;
import helden.model.profession.seefahrer.Walfaenger;

public class Seefahrer
extends L {
    private P o\u00d8\u00d5O00;
    private P \u00f5\u00d6\u00d5O00;
    private P \u00f8\u00d6\u00d5O00;
    private P O\u00d8\u00d5O00;
    private P privatevoidint;

    public Seefahrer() {
    }

    public Seefahrer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P60";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getMatrose() {
        if (this.o\u00d8\u00d5O00 == null) {
            this.o\u00d8\u00d5O00 = new Matrose();
        }
        return this.o\u00d8\u00d5O00;
    }

    public P getNavigator() {
        if (this.privatevoidint == null) {
            this.privatevoidint = new Navigator();
        }
        return this.privatevoidint;
    }

    public P getPirat() {
        if (this.\u00f5\u00d6\u00d5O00 == null) {
            this.\u00f5\u00d6\u00d5O00 = new Pirat();
        }
        return this.\u00f5\u00d6\u00d5O00;
    }

    public P getRobbenjaeger() {
        if (this.O\u00d8\u00d5O00 == null) {
            this.O\u00d8\u00d5O00 = new Robbenjaeger();
        }
        return this.O\u00d8\u00d5O00;
    }

    public P getWalfaenger() {
        if (this.\u00f8\u00d6\u00d5O00 == null) {
            this.\u00f8\u00d6\u00d5O00 = new Walfaenger();
        }
        return this.\u00f8\u00d6\u00d5O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Seefahrer");
        } else {
            stringBuffer.append("Seefahrerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(", ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getMatrose());
        this.addAlleVarianten(this.getPirat());
        this.addAlleVarianten(this.getNavigator());
        this.addAlleVarianten(this.getRobbenjaeger());
        this.addAlleVarianten(this.getWalfaenger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMatrose());
        this.addMoeglicheVariante(this.getPirat());
        this.addMoeglicheVariante(this.getNavigator());
        this.addMoeglicheVariante(this.getRobbenjaeger());
        this.addMoeglicheVariante(this.getWalfaenger());
    }
}

