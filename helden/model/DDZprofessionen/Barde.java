/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.barde.Erzaehler;
import helden.model.DDZprofessionen.barde.Skalde;
import helden.model.DDZprofessionen.barde.VarianteBarde;

public class Barde
extends BasisDDZProfessionMitGeweihter {
    private P O\u00f4\u00f4O00;
    private P o\u00f4\u00f4O00;
    private P \u00f8\u00d8\u00f4O00;

    public Barde() {
    }

    public Barde(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getErzaehler() {
        if (this.o\u00f4\u00f4O00 == null) {
            this.o\u00f4\u00f4O00 = new Erzaehler();
        }
        return this.o\u00f4\u00f4O00;
    }

    @Override
    public String getID() {
        return "P121";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getSkalde() {
        if (this.\u00f8\u00d8\u00f4O00 == null) {
            this.\u00f8\u00d8\u00f4O00 = new Skalde();
        }
        return this.\u00f8\u00d8\u00f4O00;
    }

    public P getVarianteBarde() {
        if (this.O\u00f4\u00f4O00 == null) {
            this.O\u00f4\u00f4O00 = new VarianteBarde();
        }
        return this.O\u00f4\u00f4O00;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            StringBuffer stringBuffer = new StringBuffer("Barde");
            if (!this.istVariante(this.getVarianteBarde()) && this.varianteGewaehlt()) {
                stringBuffer.append(": ");
                stringBuffer.append(this.getVariante().toString());
            }
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer = new StringBuffer("Bardin");
        if (!this.istVariante(this.getVarianteBarde()) && this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteBarde());
        this.addAlleVarianten(this.getErzaehler());
        this.addAlleVarianten(this.getSkalde());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteBarde());
        this.addMoeglicheVariante(this.getErzaehler());
        this.addMoeglicheVariante(this.getSkalde());
    }
}

