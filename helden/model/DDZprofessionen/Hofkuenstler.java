/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.hofkuenstler.Bildhauer;
import helden.model.DDZprofessionen.hofkuenstler.Darsteller;
import helden.model.DDZprofessionen.hofkuenstler.Hofmusicus;
import helden.model.DDZprofessionen.hofkuenstler.Kalligraph;
import helden.model.DDZprofessionen.hofkuenstler.Maler;
import helden.model.DDZprofessionen.hofkuenstler.Tanzlehrer;

public class Hofkuenstler
extends BasisDDZProfessionMitGeweihter {
    private P Stringpublicif;
    private P O\u00d6\u00f4O00;
    private P \u00f8\u00d5\u00f4O00;
    private P o\u00d6\u00f4O00;
    private P \u00f5\u00d5\u00f4O00;
    private P \u00f4\u00d5\u00f4O00;

    public Hofkuenstler() {
    }

    public Hofkuenstler(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBildhauer() {
        if (this.O\u00d6\u00f4O00 == null) {
            this.O\u00d6\u00f4O00 = new Bildhauer();
        }
        return this.O\u00d6\u00f4O00;
    }

    public P getDarsteller() {
        if (this.o\u00d6\u00f4O00 == null) {
            this.o\u00d6\u00f4O00 = new Darsteller();
        }
        return this.o\u00d6\u00f4O00;
    }

    public P getHofmusicus() {
        if (this.\u00f8\u00d5\u00f4O00 == null) {
            this.\u00f8\u00d5\u00f4O00 = new Hofmusicus();
        }
        return this.\u00f8\u00d5\u00f4O00;
    }

    @Override
    public String getID() {
        return "P144";
    }

    public P getKalligraph() {
        if (this.\u00f4\u00d5\u00f4O00 == null) {
            this.\u00f4\u00d5\u00f4O00 = new Kalligraph();
        }
        return this.\u00f4\u00d5\u00f4O00;
    }

    public P getMaler() {
        if (this.Stringpublicif == null) {
            this.Stringpublicif = new Maler();
        }
        return this.Stringpublicif;
    }

    public P getTanzlehrer() {
        if (this.\u00f5\u00d5\u00f4O00 == null) {
            this.\u00f5\u00d5\u00f4O00 = new Tanzlehrer();
        }
        return this.\u00f5\u00d5\u00f4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Hofk\u00fcnstler");
        } else {
            stringBuffer.append("Hofk\u00fcnstlerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getMaler());
        this.addAlleVarianten(this.getBildhauer());
        this.addAlleVarianten(this.getHofmusicus());
        this.addAlleVarianten(this.getDarsteller());
        this.addAlleVarianten(this.getTanzlehrer());
        this.addAlleVarianten(this.getKalligraph());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMaler());
        this.addMoeglicheVariante(this.getBildhauer());
        this.addMoeglicheVariante(this.getHofmusicus());
        this.addMoeglicheVariante(this.getDarsteller());
        this.addMoeglicheVariante(this.getTanzlehrer());
    }
}

