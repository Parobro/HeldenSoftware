/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.bettler.BettlerVariante;

public class Bettler
extends L {
    private P newnullint;

    public Bettler() {
    }

    public Bettler(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBettler() {
        if (this.newnullint == null) {
            this.newnullint = new BettlerVariante();
        }
        return this.newnullint;
    }

    @Override
    public String getID() {
        return "P09";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Bettler";
        }
        return "Bettlerin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBettler());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBettler());
    }
}

