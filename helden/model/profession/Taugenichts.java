/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.taugenichts.Dilettant;
import helden.model.profession.taugenichts.Stutzer;
import helden.model.profession.taugenichts.VarianteTaugenichts;

public class Taugenichts
extends L {
    private P forsuperint;
    private P \u00d5\u00f6\u00d4O00;
    private P \u00d8\u00f6\u00d4O00;

    public Taugenichts() {
    }

    public Taugenichts(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getDilettant() {
        if (this.\u00d8\u00f6\u00d4O00 == null) {
            this.\u00d8\u00f6\u00d4O00 = new Dilettant();
        }
        return this.\u00d8\u00f6\u00d4O00;
    }

    @Override
    public String getID() {
        return "P69";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getStutzer() {
        if (this.\u00d5\u00f6\u00d4O00 == null) {
            this.\u00d5\u00f6\u00d4O00 = new Stutzer();
        }
        return this.\u00d5\u00f6\u00d4O00;
    }

    public P getTaugenichts() {
        if (this.forsuperint == null) {
            this.forsuperint = new VarianteTaugenichts();
        }
        return this.forsuperint;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Taugenichts");
        if (this.varianteGewaehlt()) {
            stringBuffer.append("/");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getTaugenichts());
        this.addAlleVarianten(this.getStutzer());
        this.addAlleVarianten(this.getDilettant());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getTaugenichts());
        this.addMoeglicheVariante(this.getStutzer());
        this.addMoeglicheVariante(this.getDilettant());
    }
}

