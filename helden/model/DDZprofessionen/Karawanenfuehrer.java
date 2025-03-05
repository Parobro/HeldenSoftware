/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.karawanenfuehrer.Salzgaenger;
import helden.model.DDZprofessionen.karawanenfuehrer.VarianteKarawanenfuehrer;

public class Karawanenfuehrer
extends BasisDDZProfessionMitGeweihter {
    private P \u00f4\u00d8\u00f4O00;
    private P \u00d8\u00d8\u00f4O00;

    public Karawanenfuehrer() {
    }

    public Karawanenfuehrer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P108";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getSalzgaenger() {
        if (this.\u00d8\u00d8\u00f4O00 == null) {
            this.\u00d8\u00d8\u00f4O00 = new Salzgaenger();
        }
        return this.\u00d8\u00d8\u00f4O00;
    }

    public P getVarianteKarawanenfuehrer() {
        if (this.\u00f4\u00d8\u00f4O00 == null) {
            this.\u00f4\u00d8\u00f4O00 = new VarianteKarawanenfuehrer();
        }
        return this.\u00f4\u00d8\u00f4O00;
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

