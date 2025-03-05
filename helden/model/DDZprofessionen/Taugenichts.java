/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.taugenichts.Streitkaempfer;
import helden.model.DDZprofessionen.taugenichts.VarianteTaugenichts;

public class Taugenichts
extends BasisDDZProfessionMitGeweihter {
    private P \u00d4\u00d4\u00f4O00;
    private P \u00d3\u00d4\u00f4O00;

    public Taugenichts() {
    }

    public Taugenichts(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P127";
    }

    public P getStreitkaempfer() {
        if (this.\u00d3\u00d4\u00f4O00 == null) {
            this.\u00d3\u00d4\u00f4O00 = new Streitkaempfer();
        }
        return this.\u00d3\u00d4\u00f4O00;
    }

    public P getTaugenichts() {
        if (this.\u00d4\u00d4\u00f4O00 == null) {
            this.\u00d4\u00d4\u00f4O00 = new VarianteTaugenichts();
        }
        return this.\u00d4\u00d4\u00f4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Taugenichts");
        if (this.varianteGewaehlt()) {
            stringBuffer.append("/");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getTaugenichts());
        this.addAlleVarianten(this.getStreitkaempfer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getTaugenichts());
        this.addMoeglicheVariante(this.getStreitkaempfer());
    }
}

