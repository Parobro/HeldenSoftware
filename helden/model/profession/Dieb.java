/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.dieb.DiebVariante;

public class Dieb
extends L {
    private P \u00f4\u00f6\u00d4O00;

    public Dieb() {
    }

    public Dieb(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getDieb() {
        if (this.\u00f4\u00f6\u00d4O00 == null) {
            this.\u00f4\u00f6\u00d4O00 = new DiebVariante();
        }
        return this.\u00f4\u00f6\u00d4O00;
    }

    @Override
    public String getID() {
        return "P14";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Dieb");
        } else {
            stringBuffer.append("Diebin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer = new StringBuffer();
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getDieb());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getDieb());
    }
}

