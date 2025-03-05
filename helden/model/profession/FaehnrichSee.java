/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.faehnrichSee.BasisFaehnrichSee;
import helden.model.profession.faehnrichSee.FestumSee;
import helden.model.profession.faehnrichSee.Harben;

public class FaehnrichSee
extends L {
    private P O\u00f8oO00;
    private P newforvoid;
    private P o\u00f8oO00;
    private P \u00d3\u00f8oO00;

    public FaehnrichSee() {
    }

    public FaehnrichSee(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAlanfaSee() {
        if (this.o\u00f8oO00 == null) {
            this.o\u00f8oO00 = new FestumSee("Al'Anfa");
        }
        return this.o\u00f8oO00;
    }

    public P getBasis() {
        if (this.\u00d3\u00f8oO00 == null) {
            this.\u00d3\u00f8oO00 = new BasisFaehnrichSee();
        }
        return this.\u00d3\u00f8oO00;
    }

    public P getFestumSee() {
        if (this.newforvoid == null) {
            this.newforvoid = new FestumSee("Festum");
        }
        return this.newforvoid;
    }

    public P getHarben() {
        if (this.O\u00f8oO00 == null) {
            this.O\u00f8oO00 = new Harben();
        }
        return this.O\u00f8oO00;
    }

    @Override
    public String getID() {
        return "P20";
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
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("F\u00e4hnrich zur See");
        if (this.varianteGewaehlt() && !this.getVariante().toString().equals("")) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBasis());
        this.addAlleVarianten(this.getHarben());
        this.addAlleVarianten(this.getFestumSee());
        this.addAlleVarianten(this.getAlanfaSee());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBasis());
        this.addMoeglicheVariante(this.getHarben());
        this.addMoeglicheVariante(this.getFestumSee());
        this.addMoeglicheVariante(this.getAlanfaSee());
    }
}

