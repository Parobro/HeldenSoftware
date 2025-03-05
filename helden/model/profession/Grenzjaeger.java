/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.grenzjaeger.GrenzjaegerVariante;

public class Grenzjaeger
extends L {
    private P nullintint;

    public Grenzjaeger() {
    }

    public Grenzjaeger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getGrenzjaeger() {
        if (this.nullintint == null) {
            this.nullintint = new GrenzjaegerVariante();
        }
        return this.nullintint;
    }

    @Override
    public String getID() {
        return "P84";
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

