/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.wirt.VarianteWirt;

public class Wirt
extends L {
    private P o\u00f5\u00d5O00;

    public Wirt() {
    }

    public Wirt(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P73";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getWirt() {
        if (this.o\u00f5\u00d5O00 == null) {
            this.o\u00f5\u00d5O00 = new VarianteWirt();
        }
        return this.o\u00f5\u00d5O00;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.istMaennlich()) {
            stringBuilder.append("Wirt");
        } else {
            stringBuilder.append("Wirtin");
        }
        return stringBuilder.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getWirt());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getWirt());
    }
}

