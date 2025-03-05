/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.barde.Erzaehler;
import helden.model.profession.barde.Runajasko;
import helden.model.profession.barde.Skalde;
import helden.model.profession.barde.VarianteBarde;

public class Barde
extends L {
    private P \u00d8\u00d6\u00d5O00;
    private P \u00f4\u00d6\u00d5O00;
    private P forvoidint;
    private P \u00d5\u00d6\u00d5O00;

    public Barde() {
    }

    public Barde(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getErzaehler() {
        if (this.\u00f4\u00d6\u00d5O00 == null) {
            this.\u00f4\u00d6\u00d5O00 = new Erzaehler();
        }
        return this.\u00f4\u00d6\u00d5O00;
    }

    @Override
    public String getID() {
        return "P06";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getRunajasko() {
        if (this.\u00d5\u00d6\u00d5O00 == null) {
            this.\u00d5\u00d6\u00d5O00 = new Runajasko();
        }
        return this.\u00d5\u00d6\u00d5O00;
    }

    public P getSkalde() {
        if (this.forvoidint == null) {
            this.forvoidint = new Skalde();
        }
        return this.forvoidint;
    }

    public P getVarianteBarde() {
        if (this.\u00d8\u00d6\u00d5O00 == null) {
            this.\u00d8\u00d6\u00d5O00 = new VarianteBarde();
        }
        return this.\u00d8\u00d6\u00d5O00;
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
        this.addAlleVarianten(this.getRunajasko());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteBarde());
        this.addMoeglicheVariante(this.getErzaehler());
        this.addMoeglicheVariante(this.getSkalde());
    }
}

