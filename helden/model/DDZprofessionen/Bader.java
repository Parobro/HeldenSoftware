/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.bader.BaderVariante;

public class Bader
extends BasisDDZProfessionMitGeweihter {
    private P o\u00f8\u00d6O00;

    public Bader() {
    }

    public Bader(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBader() {
        if (this.o\u00f8\u00d6O00 == null) {
            this.o\u00f8\u00d6O00 = new BaderVariante();
        }
        return this.o\u00f8\u00d6O00;
    }

    @Override
    public String getID() {
        return "P137";
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Bader/Barbier";
        }
        return "Baderin/Barbierin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBader());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBader());
    }
}

