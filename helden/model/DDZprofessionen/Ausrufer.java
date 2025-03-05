/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;

public class Ausrufer
extends BasisDDZProfessionMitGeweihter {
    private P ifwhileif;

    public Ausrufer() {
    }

    public Ausrufer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAusrufer() {
        if (this.ifwhileif == null) {
            this.ifwhileif = new helden.model.DDZprofessionen.ausrufer.Ausrufer();
        }
        return this.ifwhileif;
    }

    @Override
    public String getID() {
        return "P120";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.varianteGewaehlt()) {
            if (this.istMaennlich()) {
                stringBuilder.append("Ausrufer");
            } else {
                stringBuilder.append("Ausruferin");
            }
        } else {
            stringBuilder.append(super.toString());
        }
        return stringBuilder.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getAusrufer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getAusrufer());
    }
}

