/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.gladiator.AlAnfa;
import helden.model.profession.gladiator.Fasar;
import helden.model.profession.gladiator.Schaukaempfer;

public class Gladiator
extends L {
    private P \u00f4O\u00d4O00;
    private P \u00d8O\u00d4O00;
    private P \u00f5O\u00d4O00;

    public Gladiator() {
    }

    public Gladiator(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAlAnfa() {
        if (this.\u00d8O\u00d4O00 == null) {
            this.\u00d8O\u00d4O00 = new AlAnfa();
        }
        return this.\u00d8O\u00d4O00;
    }

    public P getFasar() {
        if (this.\u00f4O\u00d4O00 == null) {
            this.\u00f4O\u00d4O00 = new Fasar();
        }
        return this.\u00f4O\u00d4O00;
    }

    @Override
    public String getID() {
        return "P30";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getSchaukaempfer() {
        if (this.\u00f5O\u00d4O00 == null) {
            this.\u00f5O\u00d4O00 = new Schaukaempfer();
        }
        return this.\u00f5O\u00d4O00;
    }

    @Override
    public boolean istErstProfession() {
        return this.istVariante(this.getFasar());
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        if (this.varianteGewaehlt()) {
            return this.getVariante().toString();
        }
        if (this.istMaennlich()) {
            return "Gladiator/Schauk\u00e4mpfer";
        }
        return "Gladiatorin/Schauk\u00e4mpferin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getFasar());
        this.addAlleVarianten(this.getAlAnfa());
        this.addAlleVarianten(this.getSchaukaempfer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getFasar());
        this.addMoeglicheVariante(this.getAlAnfa());
        this.addMoeglicheVariante(this.getSchaukaempfer());
    }
}

