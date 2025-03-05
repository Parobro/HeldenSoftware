/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.bordmagus.BordmagusVariante;

public class Bordmagus
extends L {
    private P o\u00d8\u00d2O00;

    public Bordmagus() {
    }

    public Bordmagus(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBordmagus() {
        if (this.o\u00d8\u00d2O00 == null) {
            this.o\u00d8\u00d2O00 = new BordmagusVariante();
        }
        return this.o\u00d8\u00d2O00;
    }

    @Override
    public String getID() {
        return "P82";
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
        return "Bordmagus (UdW)";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBordmagus());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBordmagus());
    }
}

