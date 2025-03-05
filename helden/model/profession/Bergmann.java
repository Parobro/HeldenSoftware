/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.bergmann.Pilzzuechter;
import helden.model.profession.bergmann.Schachtfeger;
import helden.model.profession.bergmann.VarianteBergmann;

public class Bergmann
extends L {
    private P \u00d3\u00f6\u00d4O00;
    private P \u00d4\u00f6\u00d4O00;
    private P nullsuperint;

    public Bergmann() {
    }

    public Bergmann(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P08";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getPilzzuechter() {
        if (this.\u00d4\u00f6\u00d4O00 == null) {
            this.\u00d4\u00f6\u00d4O00 = new Pilzzuechter();
        }
        return this.\u00d4\u00f6\u00d4O00;
    }

    public P getSchachtfeger() {
        if (this.nullsuperint == null) {
            this.nullsuperint = new Schachtfeger();
        }
        return this.nullsuperint;
    }

    public P getVarianteBergmann() {
        if (this.\u00d3\u00f6\u00d4O00 == null) {
            this.\u00d3\u00f6\u00d4O00 = new VarianteBergmann();
        }
        return this.\u00d3\u00f6\u00d4O00;
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Bergmann");
        } else {
            stringBuffer.append("Bergfrau");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteBergmann());
        this.addAlleVarianten(this.getPilzzuechter());
        this.addAlleVarianten(this.getSchachtfeger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteBergmann());
    }
}

