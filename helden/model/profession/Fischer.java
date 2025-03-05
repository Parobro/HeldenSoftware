/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.fischer.Bergungstaucher;
import helden.model.profession.fischer.Harpunier;
import helden.model.profession.fischer.Perlenfischer;
import helden.model.profession.fischer.Seefischer;
import helden.model.profession.fischer.Unterwasserjaeger;
import helden.model.profession.fischer.VarianteFischer;

public class Fischer
extends L {
    private P \u00f4\u00f4\u00d4O00;
    private P returnthisint;
    private P \u00d5\u00f4\u00d4O00;
    private P \u00d4\u00f4\u00d4O00;
    private P \u00d3\u00f4\u00d4O00;
    private P \u00d8\u00f4\u00d4O00;

    public Fischer() {
    }

    public Fischer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBergungstaucher() {
        if (this.\u00d4\u00f4\u00d4O00 == null) {
            this.\u00d4\u00f4\u00d4O00 = new Bergungstaucher();
        }
        return this.\u00d4\u00f4\u00d4O00;
    }

    public P getHarpunier() {
        if (this.\u00d3\u00f4\u00d4O00 == null) {
            this.\u00d3\u00f4\u00d4O00 = new Harpunier();
        }
        return this.\u00d3\u00f4\u00d4O00;
    }

    @Override
    public String getID() {
        return "P22";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getPerlenfischer() {
        if (this.\u00d5\u00f4\u00d4O00 == null) {
            this.\u00d5\u00f4\u00d4O00 = new Perlenfischer();
        }
        return this.\u00d5\u00f4\u00d4O00;
    }

    public P getSeefischer() {
        if (this.returnthisint == null) {
            this.returnthisint = new Seefischer();
        }
        return this.returnthisint;
    }

    public P getUnterwasserjaeger() {
        if (this.\u00d8\u00f4\u00d4O00 == null) {
            this.\u00d8\u00f4\u00d4O00 = new Unterwasserjaeger();
        }
        return this.\u00d8\u00f4\u00d4O00;
    }

    public P getVarianteFischer() {
        if (this.\u00f4\u00f4\u00d4O00 == null) {
            this.\u00f4\u00f4\u00d4O00 = new VarianteFischer();
        }
        return this.\u00f4\u00f4\u00d4O00;
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Fischer");
        } else {
            stringBuffer.append("Fischerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteFischer());
        this.addAlleVarianten(this.getSeefischer());
        this.addAlleVarianten(this.getPerlenfischer());
        this.addAlleVarianten(this.getBergungstaucher());
        this.addAlleVarianten(this.getHarpunier());
        this.addAlleVarianten(this.getUnterwasserjaeger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteFischer());
        this.addMoeglicheVariante(this.getSeefischer());
        this.addMoeglicheVariante(this.getPerlenfischer());
    }
}

