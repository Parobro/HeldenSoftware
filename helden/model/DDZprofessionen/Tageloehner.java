/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.tageloehner.Bauhelfer;
import helden.model.DDZprofessionen.tageloehner.Holzfaeller;
import helden.model.DDZprofessionen.tageloehner.Koehler;
import helden.model.DDZprofessionen.tageloehner.Lastentraeger;
import helden.model.DDZprofessionen.tageloehner.Palmschneider;
import helden.model.DDZprofessionen.tageloehner.Schauerleute;

public class Tageloehner
extends BasisDDZProfessionMitGeweihter {
    private P o0\u00f4O00;
    private P \u00f8\u00f8\u00d8O00;
    private P ififif;
    private P \u00f5\u00f8\u00d8O00;
    private P \u00f4\u00f8\u00d8O00;
    private P O0\u00f4O00;

    public Tageloehner() {
    }

    public Tageloehner(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBauhelfer() {
        if (this.o0\u00f4O00 == null) {
            this.o0\u00f4O00 = new Bauhelfer();
        }
        return this.o0\u00f4O00;
    }

    public P getHolzfaeller() {
        if (this.\u00f8\u00f8\u00d8O00 == null) {
            this.\u00f8\u00f8\u00d8O00 = new Holzfaeller();
        }
        return this.\u00f8\u00f8\u00d8O00;
    }

    @Override
    public String getID() {
        return "P146";
    }

    public P getKoehler() {
        if (this.O0\u00f4O00 == null) {
            this.O0\u00f4O00 = new Koehler();
        }
        return this.O0\u00f4O00;
    }

    public P getLastentraeger() {
        if (this.\u00f5\u00f8\u00d8O00 == null) {
            this.\u00f5\u00f8\u00d8O00 = new Lastentraeger();
        }
        return this.\u00f5\u00f8\u00d8O00;
    }

    public P getPalmschneider() {
        if (this.\u00f4\u00f8\u00d8O00 == null) {
            this.\u00f4\u00f8\u00d8O00 = new Palmschneider();
        }
        return this.\u00f4\u00f8\u00d8O00;
    }

    public P getSchauerleute() {
        if (this.ififif == null) {
            this.ififif = new Schauerleute();
        }
        return this.ififif;
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

