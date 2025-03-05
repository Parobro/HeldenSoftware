/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.privatlehrer.PrivatlehrerVariante;

public class Privatlehrer
extends L {
    private P newthisint;

    public Privatlehrer() {
    }

    public Privatlehrer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P50";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getPrivatlehrer() {
        if (this.newthisint == null) {
            this.newthisint = new PrivatlehrerVariante();
        }
        return this.newthisint;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Privatlehrer";
        }
        return "Privatlehrerin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getPrivatlehrer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getPrivatlehrer());
    }
}

