/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;

public class WindUndWettermagus
extends L {
    private P \u00d3O\u00d3O00;

    public WindUndWettermagus() {
    }

    public WindUndWettermagus(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P80";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getWindUndWettermagus() {
        if (this.\u00d3O\u00d3O00 == null) {
            this.\u00d3O\u00d3O00 = new helden.model.profession.windundwettermagus.WindUndWettermagus();
        }
        return this.\u00d3O\u00d3O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        return "Wind- und Wettermagus (UdW)";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getWindUndWettermagus());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getWindUndWettermagus());
    }
}

