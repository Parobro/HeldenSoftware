/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.elitekaempfer.Gesichtsloser;
import helden.model.DDZprofessionen.elitekaempfer.Kataphrakt;
import helden.model.DDZprofessionen.elitekaempfer.Nurbadi;
import helden.model.DDZprofessionen.elitekaempfer.Praetorianer;

public class Elitekaempfer
extends BasisDDZProfessionMitGeweihter {
    private P \u00d4o\u00f4O00;
    private P \u00d3o\u00f4O00;
    private P \u00d5o\u00f4O00;
    private P newforif;

    public Elitekaempfer() {
    }

    public Elitekaempfer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getGesichtsloser() {
        if (this.\u00d5o\u00f4O00 == null) {
            this.\u00d5o\u00f4O00 = new Gesichtsloser();
        }
        return this.\u00d5o\u00f4O00;
    }

    @Override
    public String getID() {
        return "P92";
    }

    public P getKataphrakt() {
        if (this.newforif == null) {
            this.newforif = new Kataphrakt();
        }
        return this.newforif;
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getNurbadi() {
        if (this.\u00d4o\u00f4O00 == null) {
            this.\u00d4o\u00f4O00 = new Nurbadi();
        }
        return this.\u00d4o\u00f4O00;
    }

    public P getPraetorianer() {
        if (this.\u00d3o\u00f4O00 == null) {
            this.\u00d3o\u00f4O00 = new Praetorianer();
        }
        return this.\u00d3o\u00f4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Elitek\u00e4mpfer");
        } else {
            stringBuffer.append("Elitek\u00e4mpferin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getGesichtsloser());
        this.addAlleVarianten(this.getKataphrakt());
        this.addAlleVarianten(this.getNurbadi());
        this.addAlleVarianten(this.getPraetorianer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getGesichtsloser());
        this.addMoeglicheVariante(this.getKataphrakt());
        this.addMoeglicheVariante(this.getNurbadi());
        this.addMoeglicheVariante(this.getPraetorianer());
    }
}

