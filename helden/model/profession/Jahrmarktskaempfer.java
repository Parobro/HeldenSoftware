/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;

public class Jahrmarktskaempfer
extends L {
    private P newStringnull;

    public Jahrmarktskaempfer() {
    }

    public Jahrmarktskaempfer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P87";
    }

    public P getJahrmarktskaempfer() {
        if (this.newStringnull == null) {
            this.newStringnull = new helden.model.profession.jahrmarktskaempfer.Jahrmarktskaempfer();
        }
        return this.newStringnull;
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
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Jahrmarktsk\u00e4mpfer");
        } else {
            stringBuffer.append("Jahrmarktsk\u00e4mpferin");
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getJahrmarktskaempfer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getJahrmarktskaempfer());
    }
}

