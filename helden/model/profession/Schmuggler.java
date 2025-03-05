/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.schmuggler.VarianteSchmuggler;
import helden.model.profession.schmuggler.Zoellner;

public class Schmuggler
extends L {
    private P o\u00d6\u00d4O00;
    private P whileprivatenull;

    public Schmuggler() {
    }

    public Schmuggler(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P56";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getSchmuggler() {
        if (this.o\u00d6\u00d4O00 == null) {
            this.o\u00d6\u00d4O00 = new VarianteSchmuggler();
        }
        return this.o\u00d6\u00d4O00;
    }

    public P getZoellner() {
        if (this.whileprivatenull == null) {
            this.whileprivatenull = new Zoellner();
        }
        return this.whileprivatenull;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schmuggler");
        } else {
            stringBuffer.append("Schmugglerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getSchmuggler());
        this.addAlleVarianten(this.getZoellner());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getSchmuggler());
        this.addMoeglicheVariante(this.getZoellner());
    }
}

