/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.haendler.FahrenderHaendler;
import helden.model.DDZprofessionen.haendler.Geldwechsler;
import helden.model.DDZprofessionen.haendler.Grosshaendler;
import helden.model.DDZprofessionen.haendler.Hausierer;
import helden.model.DDZprofessionen.haendler.Hehler;
import helden.model.DDZprofessionen.haendler.Kraemer;
import helden.model.DDZprofessionen.haendler.Tauschhaendler;

public class Haendler
extends BasisDDZProfessionMitGeweihter {
    private P Stringintif;
    private P \u00d4\u00f5\u00d8O00;
    private P \u00f4\u00f5\u00d8O00;
    private P thisintif;
    private P \u00d8\u00f5\u00d8O00;
    private P \u00d5\u00f5\u00d8O00;
    private P \u00f5\u00f5\u00d8O00;

    public Haendler() {
    }

    public Haendler(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getFahrenderHaendler() {
        if (this.\u00f4\u00f5\u00d8O00 == null) {
            this.\u00f4\u00f5\u00d8O00 = new FahrenderHaendler();
        }
        return this.\u00f4\u00f5\u00d8O00;
    }

    public P getGeldwechsler() {
        if (this.\u00d4\u00f5\u00d8O00 == null) {
            this.\u00d4\u00f5\u00d8O00 = new Geldwechsler();
        }
        return this.\u00d4\u00f5\u00d8O00;
    }

    public P getGrosshaendler() {
        if (this.\u00d8\u00f5\u00d8O00 == null) {
            this.\u00d8\u00f5\u00d8O00 = new Grosshaendler();
        }
        return this.\u00d8\u00f5\u00d8O00;
    }

    public P getHausierer() {
        if (this.thisintif == null) {
            this.thisintif = new Hausierer();
        }
        return this.thisintif;
    }

    public P getHehler() {
        if (this.\u00d5\u00f5\u00d8O00 == null) {
            this.\u00d5\u00f5\u00d8O00 = new Hehler();
        }
        return this.\u00d5\u00f5\u00d8O00;
    }

    @Override
    public String getID() {
        return "P126";
    }

    public P getKraemer() {
        if (this.Stringintif == null) {
            this.Stringintif = new Kraemer();
        }
        return this.Stringintif;
    }

    public P getTauschhaendler() {
        if (this.\u00f5\u00f5\u00d8O00 == null) {
            this.\u00f5\u00f5\u00d8O00 = new Tauschhaendler();
        }
        return this.\u00f5\u00f5\u00d8O00;
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

