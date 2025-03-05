/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.hoefling.HoeflingVariante;

public class Hoefling
extends BasisDDZProfessionMitGeweihter {
    private P \u00d8\u00f8\u00d8O00;

    public Hoefling() {
    }

    public Hoefling(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getHoefling() {
        if (this.\u00d8\u00f8\u00d8O00 == null) {
            this.\u00d8\u00f8\u00d8O00 = new HoeflingVariante();
        }
        return this.\u00d8\u00f8\u00d8O00;
    }

    @Override
    public String getID() {
        return "P130";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "H\u00f6fling";
        }
        return "Hofdame";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getHoefling());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHoefling());
    }
}

