/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.kurtisane.Hure;
import helden.model.DDZprofessionen.kurtisane.VarianteKurtisane;

public class Kurtisane
extends BasisDDZProfessionMitGeweihter {
    private P O\u00d4\u00f4O00;
    private P \u00f8\u00d3\u00f4O00;

    public Kurtisane() {
    }

    public Kurtisane(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getHure() {
        if (this.\u00f8\u00d3\u00f4O00 == null) {
            this.\u00f8\u00d3\u00f4O00 = new Hure();
        }
        return this.\u00f8\u00d3\u00f4O00;
    }

    @Override
    public String getID() {
        return "P131";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getKurtisane() {
        if (this.O\u00d4\u00f4O00 == null) {
            this.O\u00d4\u00f4O00 = new VarianteKurtisane();
        }
        return this.O\u00d4\u00f4O00;
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

