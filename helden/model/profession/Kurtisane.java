/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.kurtisane.Hure;
import helden.model.profession.kurtisane.VarianteKurtisane;

public class Kurtisane
extends L {
    private P nullintnull;
    private P o\u00f4\u00d3O00;

    public Kurtisane() {
    }

    public Kurtisane(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getHure() {
        if (this.o\u00f4\u00d3O00 == null) {
            this.o\u00f4\u00d3O00 = new Hure();
        }
        return this.o\u00f4\u00d3O00;
    }

    @Override
    public String getID() {
        return "P46";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getKurtisane() {
        if (this.nullintnull == null) {
            this.nullintnull = new VarianteKurtisane();
        }
        return this.nullintnull;
    }

    @Override
    public String toString() {
        if (this.varianteGewaehlt()) {
            return this.getVariante().toString();
        }
        if (this.istMaennlich()) {
            return "Gesellschafter";
        }
        return "Kurtisane";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getKurtisane());
        this.addAlleVarianten(this.getHure());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getKurtisane());
        this.addMoeglicheVariante(this.getHure());
    }
}

