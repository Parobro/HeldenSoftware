/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.profession.grenzjaeger.GrenzjaegerVariante;

public class Grenzjaeger
extends BasisDDZProfessionMitGeweihter {
    private P O\u00d3\u00d8O00;

    public Grenzjaeger() {
    }

    public Grenzjaeger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getGrenzjaeger() {
        if (this.O\u00d3\u00d8O00 == null) {
            this.O\u00d3\u00d8O00 = new GrenzjaegerVariante();
        }
        return this.O\u00d3\u00d8O00;
    }

    @Override
    public String getID() {
        return "P104";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Grenzj\u00e4ger";
        }
        return "Grenzj\u00e4gerin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getGrenzjaeger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getGrenzjaeger());
    }
}

