/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.streuner.Hochstapler;
import helden.model.DDZprofessionen.streuner.Schieber;
import helden.model.DDZprofessionen.streuner.Spieler;
import helden.model.DDZprofessionen.streuner.VarianteStreuner;
import helden.model.DDZprofessionen.streuner.Zuhaelter;

public class Streuner
extends BasisDDZProfessionMitGeweihter {
    private P \u00f4O\u00d8O00;
    private P \u00d8O\u00d8O00;
    private P thisObjectif;
    private P StringObjectif;
    private P \u00f5O\u00d8O00;

    public Streuner() {
    }

    public Streuner(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getHochstapler() {
        if (this.\u00f4O\u00d8O00 == null) {
            this.\u00f4O\u00d8O00 = new Hochstapler();
        }
        return this.\u00f4O\u00d8O00;
    }

    @Override
    public String getID() {
        return "P134";
    }

    public P getSchieber() {
        if (this.\u00d8O\u00d8O00 == null) {
            this.\u00d8O\u00d8O00 = new Schieber();
        }
        return this.\u00d8O\u00d8O00;
    }

    public P getSpieler() {
        if (this.thisObjectif == null) {
            this.thisObjectif = new Spieler();
        }
        return this.thisObjectif;
    }

    public P getStreuner() {
        if (this.\u00f5O\u00d8O00 == null) {
            this.\u00f5O\u00d8O00 = new VarianteStreuner();
        }
        return this.\u00f5O\u00d8O00;
    }

    public P getZuhaelter() {
        if (this.StringObjectif == null) {
            this.StringObjectif = new Zuhaelter();
        }
        return this.StringObjectif;
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

