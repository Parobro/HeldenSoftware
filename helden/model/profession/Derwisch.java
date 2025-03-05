/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.derwisch.DerwischVariante;

public class Derwisch
extends L {
    private P newnewint;

    public Derwisch() {
    }

    public Derwisch(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getDerwisch() {
        if (this.newnewint == null) {
            this.newnewint = new DerwischVariante();
        }
        return this.newnewint;
    }

    @Override
    public String getID() {
        return "P12";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.istMaennlich()) {
            stringBuilder.append("Derwisch");
        }
        return stringBuilder.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getDerwisch());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getDerwisch());
    }
}

