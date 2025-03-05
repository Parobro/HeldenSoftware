/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.kristallomant.KristallomantVariante;

public class Kristallomant
extends L {
    private P \u00d30\u00d3O00;

    public Kristallomant() {
    }

    public Kristallomant(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P44";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getKristallomant() {
        if (this.\u00d30\u00d3O00 == null) {
            this.\u00d30\u00d3O00 = new KristallomantVariante();
        }
        return this.\u00d30\u00d3O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.istMaennlich()) {
            stringBuilder.append("Kristallomant");
        } else {
            stringBuilder.append("Kristallomantin");
        }
        return stringBuilder.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getKristallomant());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getKristallomant());
    }
}

