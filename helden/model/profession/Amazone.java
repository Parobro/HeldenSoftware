/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.amazone.AmazoneVariante;

public class Amazone
extends L {
    private P \u00d8\u00f6\u00d3O00;

    public Amazone() {
    }

    public Amazone(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAmazone() {
        if (this.\u00d8\u00f6\u00d3O00 == null) {
            this.\u00d8\u00f6\u00d3O00 = new AmazoneVariante();
        }
        return this.\u00d8\u00f6\u00d3O00;
    }

    @Override
    public String getID() {
        return "P02";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        return "Amazone";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getAmazone());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getAmazone());
    }
}

