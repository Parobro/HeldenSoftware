/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.schriftsteller.Pamphletist;
import helden.model.profession.schriftsteller.VarianteSchriftsteller;

public class Schriftsteller
extends L {
    private P \u00d5\u00f8\u00d4O00;
    private P \u00d4\u00f8\u00d4O00;

    public Schriftsteller() {
    }

    public Schriftsteller(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P58";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getPamphletist() {
        if (this.\u00d5\u00f8\u00d4O00 == null) {
            this.\u00d5\u00f8\u00d4O00 = new Pamphletist();
        }
        return this.\u00d5\u00f8\u00d4O00;
    }

    public P getSchriftsteller() {
        if (this.\u00d4\u00f8\u00d4O00 == null) {
            this.\u00d4\u00f8\u00d4O00 = new VarianteSchriftsteller();
        }
        return this.\u00d4\u00f8\u00d4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schriftsteller");
        } else {
            stringBuffer.append("Schriftstellerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getPamphletist());
        this.addAlleVarianten(this.getSchriftsteller());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getPamphletist());
        this.addMoeglicheVariante(this.getSchriftsteller());
    }
}

