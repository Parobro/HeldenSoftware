/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.gaukler.Akrobat;
import helden.model.profession.gaukler.Dompteur;
import helden.model.profession.gaukler.Musikus;
import helden.model.profession.gaukler.Possenreisser;
import helden.model.profession.gaukler.Schauspieler;
import helden.model.profession.gaukler.Schlangenbeschwoerer;
import helden.model.profession.gaukler.Vagant;
import helden.model.profession.gaukler.VarianteGaukler;

public class Gaukler
extends L {
    private P Stringintint;
    private P \u00f5\u00f4\u00d5O00;
    private P O\u00f5\u00d5O00;
    private P thisintint;
    private P \u00f4\u00f4\u00d5O00;
    private P \u00d8\u00f4\u00d5O00;
    private P \u00d5\u00f4\u00d5O00;
    private P \u00f8\u00f4\u00d5O00;

    public Gaukler() {
    }

    public Gaukler(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAkrobat() {
        if (this.\u00f5\u00f4\u00d5O00 == null) {
            this.\u00f5\u00f4\u00d5O00 = new Akrobat();
        }
        return this.\u00f5\u00f4\u00d5O00;
    }

    public P getDompteur() {
        if (this.O\u00f5\u00d5O00 == null) {
            this.O\u00f5\u00d5O00 = new Dompteur();
        }
        return this.O\u00f5\u00d5O00;
    }

    @Override
    public String getID() {
        return "P26";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getMusikus() {
        if (this.thisintint == null) {
            this.thisintint = new Musikus();
        }
        return this.thisintint;
    }

    public P getPossenreisser() {
        if (this.\u00f4\u00f4\u00d5O00 == null) {
            this.\u00f4\u00f4\u00d5O00 = new Possenreisser();
        }
        return this.\u00f4\u00f4\u00d5O00;
    }

    public P getSchauspieler() {
        if (this.\u00d8\u00f4\u00d5O00 == null) {
            this.\u00d8\u00f4\u00d5O00 = new Schauspieler();
        }
        return this.\u00d8\u00f4\u00d5O00;
    }

    public P getSchlangenbeschwoerer() {
        if (this.\u00f8\u00f4\u00d5O00 == null) {
            this.\u00f8\u00f4\u00d5O00 = new Schlangenbeschwoerer();
        }
        return this.\u00f8\u00f4\u00d5O00;
    }

    public P getStandardGaukler() {
        if (this.Stringintint == null) {
            this.Stringintint = new VarianteGaukler();
        }
        return this.Stringintint;
    }

    public P getVagant() {
        if (this.\u00d5\u00f4\u00d5O00 == null) {
            this.\u00d5\u00f4\u00d5O00 = new Vagant();
        }
        return this.\u00d5\u00f4\u00d5O00;
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
        this.addMoeglicheVariante(this.getSchlangenbeschwoerer());
    }
}

