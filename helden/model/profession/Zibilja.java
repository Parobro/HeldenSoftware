/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.zibilja.ZibiljaVariante;

public class Zibilja
extends L {
    private P \u00d4\u00d6\u00d4O00;

    public Zibilja() {
    }

    public Zibilja(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P77";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getZibilja() {
        if (this.\u00d4\u00d6\u00d4O00 == null) {
            this.\u00d4\u00d6\u00d4O00 = new ZibiljaVariante();
        }
        return this.\u00d4\u00d6\u00d4O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        return "Zibilja";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getZibilja());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getZibilja());
    }
}

