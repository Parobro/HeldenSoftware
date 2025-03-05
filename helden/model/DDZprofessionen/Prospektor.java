/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.prospektor.Goldsucher;
import helden.model.DDZprofessionen.prospektor.Kraeutersammler;
import helden.model.DDZprofessionen.prospektor.Sammler;

public class Prospektor
extends BasisDDZProfessionMitGeweihter {
    private P privatefloatif;
    private P \u00f5O\u00f4O00;
    private P \u00f4O\u00f4O00;

    public Prospektor() {
    }

    public Prospektor(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getGoldsucher() {
        if (this.privatefloatif == null) {
            this.privatefloatif = new Goldsucher();
        }
        return this.privatefloatif;
    }

    @Override
    public String getID() {
        return "P110";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getKraeutersammler() {
        if (this.\u00f5O\u00f4O00 == null) {
            this.\u00f5O\u00f4O00 = new Kraeutersammler();
        }
        return this.\u00f5O\u00f4O00;
    }

    public P getSammler() {
        if (this.\u00f4O\u00f4O00 == null) {
            this.\u00f4O\u00f4O00 = new Sammler();
        }
        return this.\u00f4O\u00f4O00;
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Prospektor");
        } else {
            stringBuffer.append("Prospektorin");
        }
        if (this.varianteGewaehlt() && this.getVariante() == this.getGoldsucher()) {
            if (this.istMaennlich()) {
                stringBuffer.append(" oder Goldsucher");
            } else {
                stringBuffer.append(" oder Goldsucherin");
            }
        } else if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getGoldsucher());
        this.addAlleVarianten(this.getKraeutersammler());
        this.addAlleVarianten(this.getSammler());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getGoldsucher());
        this.addMoeglicheVariante(this.getKraeutersammler());
        this.addMoeglicheVariante(this.getSammler());
    }
}

