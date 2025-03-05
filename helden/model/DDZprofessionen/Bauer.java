/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.bauer.Erntehelfer;
import helden.model.DDZprofessionen.bauer.Feldsklave;
import helden.model.DDZprofessionen.bauer.Freibauer;
import helden.model.DDZprofessionen.bauer.Gaertner;
import helden.model.DDZprofessionen.bauer.Gutsherr;
import helden.model.DDZprofessionen.bauer.Knecht;
import helden.model.DDZprofessionen.bauer.Leibeigener;
import helden.model.DDZprofessionen.bauer.Mueller;
import helden.model.DDZprofessionen.bauer.Pflanzer;
import helden.model.DDZprofessionen.bauer.Viehzuechter;
import helden.model.DDZprofessionen.bauer.Winzer;

public class Bauer
extends BasisDDZProfessionMitGeweihter {
    private P \u00d80\u00d8O00;
    private P \u00f40\u00d8O00;
    private P privatesuperif;
    private P \u00d50\u00d8O00;
    private P O0\u00d8O00;
    private P \u00d30\u00d8O00;
    private P newnewif;
    private P \u00f8\u00f8\u00d6O00;
    private P returnnewif;
    private P \u00d40\u00d8O00;
    private P o0\u00d8O00;

    public Bauer() {
    }

    public Bauer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getErntehelfer() {
        if (this.\u00d80\u00d8O00 == null) {
            this.\u00d80\u00d8O00 = new Erntehelfer();
        }
        return this.\u00d80\u00d8O00;
    }

    public P getFeldsklave() {
        if (this.\u00f40\u00d8O00 == null) {
            this.\u00f40\u00d8O00 = new Feldsklave();
        }
        return this.\u00f40\u00d8O00;
    }

    public P getFreibauer() {
        if (this.privatesuperif == null) {
            this.privatesuperif = new Freibauer();
        }
        return this.privatesuperif;
    }

    public P getGaertner() {
        if (this.returnnewif == null) {
            this.returnnewif = new Gaertner();
        }
        return this.returnnewif;
    }

    public P getGutsherr() {
        if (this.\u00d50\u00d8O00 == null) {
            this.\u00d50\u00d8O00 = new Gutsherr();
        }
        return this.\u00d50\u00d8O00;
    }

    @Override
    public String getID() {
        return "P138";
    }

    public P getKnecht() {
        if (this.O0\u00d8O00 == null) {
            this.O0\u00d8O00 = new Knecht();
        }
        return this.O0\u00d8O00;
    }

    public P getLeibeigener() {
        if (this.\u00d30\u00d8O00 == null) {
            this.\u00d30\u00d8O00 = new Leibeigener();
        }
        return this.\u00d30\u00d8O00;
    }

    public P getMueller() {
        if (this.o0\u00d8O00 == null) {
            this.o0\u00d8O00 = new Mueller();
        }
        return this.o0\u00d8O00;
    }

    public P getPflanzer() {
        if (this.\u00d40\u00d8O00 == null) {
            this.\u00d40\u00d8O00 = new Pflanzer();
        }
        return this.\u00d40\u00d8O00;
    }

    public P getViehzuechter() {
        if (this.newnewif == null) {
            this.newnewif = new Viehzuechter();
        }
        return this.newnewif;
    }

    public P getWinzer() {
        if (this.\u00f8\u00f8\u00d6O00 == null) {
            this.\u00f8\u00f8\u00d6O00 = new Winzer();
        }
        return this.\u00f8\u00f8\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer = new StringBuffer("Bauer");
            if (this.varianteGewaehlt()) {
                stringBuffer.append(": ");
                stringBuffer.append(this.getVariante().toString());
            }
            return stringBuffer.toString();
        }
        stringBuffer = new StringBuffer("B\u00e4uerin");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getErntehelfer());
        this.addAlleVarianten(this.getFeldsklave());
        this.addAlleVarianten(this.getFreibauer());
        this.addAlleVarianten(this.getGutsherr());
        this.addAlleVarianten(this.getKnecht());
        this.addAlleVarianten(this.getLeibeigener());
        this.addAlleVarianten(this.getViehzuechter());
        this.addAlleVarianten(this.getWinzer());
        this.addAlleVarianten(this.getGaertner());
        this.addAlleVarianten(this.getPflanzer());
        this.addAlleVarianten(this.getMueller());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getErntehelfer());
        this.addMoeglicheVariante(this.getFeldsklave());
        this.addMoeglicheVariante(this.getFreibauer());
        this.addMoeglicheVariante(this.getGutsherr());
        this.addMoeglicheVariante(this.getKnecht());
        this.addMoeglicheVariante(this.getLeibeigener());
        this.addMoeglicheVariante(this.getViehzuechter());
        this.addMoeglicheVariante(this.getWinzer());
        this.addMoeglicheVariante(this.getMueller());
    }
}

