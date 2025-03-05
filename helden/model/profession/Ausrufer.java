/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;

public class Ausrufer
extends L {
    private P \u00d3\u00d8\u00d5O00;

    public Ausrufer() {
    }

    public Ausrufer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAusrufer() {
        if (this.\u00d3\u00d8\u00d5O00 == null) {
            this.\u00d3\u00d8\u00d5O00 = new helden.model.profession.ausrufer.Ausrufer();
        }
        return this.\u00d3\u00d8\u00d5O00;
    }

    @Override
    public String getID() {
        return "P04";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.istMaennlich()) {
            stringBuilder.append("Ausrufer");
        } else {
            stringBuilder.append("Ausruferin");
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

