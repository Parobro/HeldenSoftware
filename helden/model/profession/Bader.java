/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.bader.BaderVariante;

public class Bader
extends L {
    private P o\u00f6\u00d5O00;

    public Bader() {
    }

    public Bader(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBader() {
        if (this.o\u00f6\u00d5O00 == null) {
            this.o\u00f6\u00d5O00 = new BaderVariante();
        }
        return this.o\u00f6\u00d5O00;
    }

    @Override
    public String getID() {
        return "P05";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
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

