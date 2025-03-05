/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.godi.GodiVariante;

public class Godi
extends L {
    private P \u00d3\u00f8\u00d4O00;

    public Godi() {
    }

    public Godi(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getGodi() {
        if (this.\u00d3\u00f8\u00d4O00 == null) {
            this.\u00d3\u00f8\u00d4O00 = new GodiVariante();
        }
        return this.\u00d3\u00f8\u00d4O00;
    }

    @Override
    public String getID() {
        return "P78";
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
        if (this.istMaennlich()) {
            return "Godi (Seher) (UdW)";
        }
        return "Godi (Seherin) (UdW)";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getGodi());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getGodi());
    }
}

