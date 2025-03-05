/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.gaukler.Akrobat;
import helden.model.DDZprofessionen.gaukler.Dompteur;
import helden.model.DDZprofessionen.gaukler.Musikus;
import helden.model.DDZprofessionen.gaukler.Possenreisser;
import helden.model.DDZprofessionen.gaukler.Schauspieler;
import helden.model.DDZprofessionen.gaukler.Schlangenbeschwoerer;
import helden.model.DDZprofessionen.gaukler.Vagant;
import helden.model.DDZprofessionen.gaukler.VarianteGaukler;

public class Gaukler
extends BasisDDZProfessionMitGeweihter {
    private P \u00f8o\u00f4O00;
    private P ifforif;
    private P o\u00d2\u00f4O00;
    private P \u00d8o\u00f4O00;
    private P \u00f5o\u00f4O00;
    private P \u00f4o\u00f4O00;
    private P returnforif;
    private P O\u00d2\u00f4O00;

    public Gaukler() {
    }

    public Gaukler(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAkrobat() {
        if (this.ifforif == null) {
            this.ifforif = new Akrobat();
        }
        return this.ifforif;
    }

    public P getDompteur() {
        if (this.o\u00d2\u00f4O00 == null) {
            this.o\u00d2\u00f4O00 = new Dompteur();
        }
        return this.o\u00d2\u00f4O00;
    }

    @Override
    public String getID() {
        return "P125";
    }

    public P getMusikus() {
        if (this.\u00d8o\u00f4O00 == null) {
            this.\u00d8o\u00f4O00 = new Musikus();
        }
        return this.\u00d8o\u00f4O00;
    }

    public P getPossenreisser() {
        if (this.\u00f5o\u00f4O00 == null) {
            this.\u00f5o\u00f4O00 = new Possenreisser();
        }
        return this.\u00f5o\u00f4O00;
    }

    public P getSchauspieler() {
        if (this.\u00f4o\u00f4O00 == null) {
            this.\u00f4o\u00f4O00 = new Schauspieler();
        }
        return this.\u00f4o\u00f4O00;
    }

    public P getSchlangenbeschwoerer() {
        if (this.O\u00d2\u00f4O00 == null) {
            this.O\u00d2\u00f4O00 = new Schlangenbeschwoerer();
        }
        return this.O\u00d2\u00f4O00;
    }

    public P getStandardGaukler() {
        if (this.\u00f8o\u00f4O00 == null) {
            this.\u00f8o\u00f4O00 = new VarianteGaukler();
        }
        return this.\u00f8o\u00f4O00;
    }

    public P getVagant() {
        if (this.returnforif == null) {
            this.returnforif = new Vagant();
        }
        return this.returnforif;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Gaukler");
        } else {
            stringBuffer.append("Gauklerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getStandardGaukler());
        this.addAlleVarianten(this.getAkrobat());
        this.addAlleVarianten(this.getDompteur());
        this.addAlleVarianten(this.getMusikus());
        this.addAlleVarianten(this.getPossenreisser());
        this.addAlleVarianten(this.getSchauspieler());
        this.addAlleVarianten(this.getVagant());
        this.addAlleVarianten(this.getSchlangenbeschwoerer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getStandardGaukler());
        this.addMoeglicheVariante(this.getAkrobat());
        this.addMoeglicheVariante(this.getDompteur());
        this.addMoeglicheVariante(this.getMusikus());
        this.addMoeglicheVariante(this.getPossenreisser());
        this.addMoeglicheVariante(this.getSchauspieler());
        this.addMoeglicheVariante(this.getVagant());
    }
}

