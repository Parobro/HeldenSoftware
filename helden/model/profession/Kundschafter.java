/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.kundschafter.KundschafterVariante;

public class Kundschafter
extends L {
    private P \u00f40\u00d2O00;

    public Kundschafter() {
    }

    public Kundschafter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P45";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getKundschafter() {
        if (this.\u00f40\u00d2O00 == null) {
            this.\u00f40\u00d2O00 = new KundschafterVariante();
        }
        return this.\u00f40\u00d2O00;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Kundschafter";
        }
        return "Kundschafterin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getKundschafter());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getKundschafter());
    }
}

