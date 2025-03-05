/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.prospektor.Goldsucher;
import helden.model.profession.prospektor.Kraeutersammler;
import helden.model.profession.prospektor.Sammler;

public class Prospektor
extends L {
    private P \u00d8\u00f5oO00;
    private P thisfloatvoid;
    private P \u00d5\u00f5oO00;

    public Prospektor() {
    }

    public Prospektor(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getGoldsucher() {
        if (this.\u00d8\u00f5oO00 == null) {
            this.\u00d8\u00f5oO00 = new Goldsucher();
        }
        return this.\u00d8\u00f5oO00;
    }

    @Override
    public String getID() {
        return "P51";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getKraeutersammler() {
        if (this.thisfloatvoid == null) {
            this.thisfloatvoid = new Kraeutersammler();
        }
        return this.thisfloatvoid;
    }

    public P getSammler() {
        if (this.\u00d5\u00f5oO00 == null) {
            this.\u00d5\u00f5oO00 = new Sammler();
        }
        return this.\u00d5\u00f5oO00;
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Prospektor");
        } else {
            stringBuffer.append("Prospektorin");
        }
        if (this.varianteGewaehlt() && this.getVariante() == this.getGoldsucher()) {
            if (this.istMaennlich()) {
                stringBuffer.append(" oder Goldsucher");
            } else {
                stringBuffer.append(" oder Goldsucherin");
            }
        } else if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getGoldsucher());
        this.addAlleVarianten(this.getKraeutersammler());
        this.addAlleVarianten(this.getSammler());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getGoldsucher());
        this.addMoeglicheVariante(this.getKraeutersammler());
        this.addMoeglicheVariante(this.getSammler());
    }
}

