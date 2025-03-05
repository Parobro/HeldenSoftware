/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.fuhrmann.FuhrmannVariante;

public class Fuhrmann
extends L {
    private P forintint;

    public Fuhrmann() {
    }

    public Fuhrmann(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getFuhrmann() {
        if (this.forintint == null) {
            this.forintint = new FuhrmannVariante();
        }
        return this.forintint;
    }

    @Override
    public String getID() {
        return "P24";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Fuhrmann";
        }
        return "Fuhrfrau";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getFuhrmann());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getFuhrmann());
    }
}

