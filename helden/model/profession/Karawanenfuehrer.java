/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.karawanenfuehrer.Salzgaenger;
import helden.model.profession.karawanenfuehrer.VarianteKarawanenfuehrer;

public class Karawanenfuehrer
extends L {
    private P \u00d4\u00d6\u00d5O00;
    private P \u00d3\u00d6\u00d5O00;

    public Karawanenfuehrer() {
    }

    public Karawanenfuehrer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P41";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getSalzgaenger() {
        if (this.\u00d3\u00d6\u00d5O00 == null) {
            this.\u00d3\u00d6\u00d5O00 = new Salzgaenger();
        }
        return this.\u00d3\u00d6\u00d5O00;
    }

    public P getVarianteKarawanenfuehrer() {
        if (this.\u00d4\u00d6\u00d5O00 == null) {
            this.\u00d4\u00d6\u00d5O00 = new VarianteKarawanenfuehrer();
        }
        return this.\u00d4\u00d6\u00d5O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Karawanenf\u00fchrer");
        } else {
            stringBuffer.append("Karawanenf\u00fchrerin");
        }
        if (this.varianteGewaehlt() && this.getVariante() == this.getSalzgaenger()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteKarawanenfuehrer());
        this.addAlleVarianten(this.getSalzgaenger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteKarawanenfuehrer());
    }
}

