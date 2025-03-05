/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.herold.HeroldVariante;

public class Herold
extends L {
    private P o0\u00d5O00;

    public Herold() {
    }

    public Herold(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getHerold() {
        if (this.o0\u00d5O00 == null) {
            this.o0\u00d5O00 = new HeroldVariante();
        }
        return this.o0\u00d5O00;
    }

    @Override
    public String getID() {
        return "P34";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.istMaennlich()) {
            stringBuilder.append("Herold");
        } else {
            stringBuilder.append("Heroldin");
        }
        return stringBuilder.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getHerold());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHerold());
    }
}

