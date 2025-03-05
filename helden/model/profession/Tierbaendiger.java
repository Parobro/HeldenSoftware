/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.tierbaendiger.Falkner;
import helden.model.profession.tierbaendiger.Hundefuehrer;
import helden.model.profession.tierbaendiger.VarianteTierbaendiger;
import helden.model.profession.tierbaendiger.Zureiter;

public class Tierbaendiger
extends L {
    private P \u00f4\u00d6oO00;
    private P \u00d8\u00d6oO00;
    private P \u00f5\u00d6oO00;
    private P Stringintvoid;

    public Tierbaendiger() {
    }

    public Tierbaendiger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getFalkner() {
        if (this.\u00d8\u00d6oO00 == null) {
            this.\u00d8\u00d6oO00 = new Falkner();
        }
        return this.\u00d8\u00d6oO00;
    }

    public P getHundefuehrer() {
        if (this.\u00f5\u00d6oO00 == null) {
            this.\u00f5\u00d6oO00 = new Hundefuehrer();
        }
        return this.\u00f5\u00d6oO00;
    }

    @Override
    public String getID() {
        return "P70";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getTierbaendigerVariante() {
        if (this.\u00f4\u00d6oO00 == null) {
            this.\u00f4\u00d6oO00 = new VarianteTierbaendiger();
        }
        return this.\u00f4\u00d6oO00;
    }

    public P getZureiter() {
        if (this.Stringintvoid == null) {
            this.Stringintvoid = new Zureiter();
        }
        return this.Stringintvoid;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Tierb\u00e4ndiger");
        } else {
            stringBuffer.append("Tierb\u00e4ndigerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getTierbaendigerVariante());
        this.addAlleVarianten(this.getFalkner());
        this.addAlleVarianten(this.getHundefuehrer());
        this.addAlleVarianten(this.getZureiter());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getTierbaendigerVariante());
        this.addMoeglicheVariante(this.getFalkner());
        this.addMoeglicheVariante(this.getHundefuehrer());
        this.addMoeglicheVariante(this.getZureiter());
    }
}

