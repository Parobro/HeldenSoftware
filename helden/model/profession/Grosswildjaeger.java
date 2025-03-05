/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.grosswildjaeger.Kopfgeldjaeger;
import helden.model.profession.grosswildjaeger.Sklavenjaeger;
import helden.model.profession.grosswildjaeger.VarianteGrosswildjaeger;

public class Grosswildjaeger
extends L {
    private P \u00d4\u00f4\u00d3O00;
    private P \u00d3\u00f4\u00d3O00;
    private P \u00d5\u00f4\u00d3O00;

    public Grosswildjaeger() {
    }

    public Grosswildjaeger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P31";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getKopfgeldjaeger() {
        if (this.\u00d5\u00f4\u00d3O00 == null) {
            this.\u00d5\u00f4\u00d3O00 = new Kopfgeldjaeger();
        }
        return this.\u00d5\u00f4\u00d3O00;
    }

    public P getSklavenjaeger() {
        if (this.\u00d3\u00f4\u00d3O00 == null) {
            this.\u00d3\u00f4\u00d3O00 = new Sklavenjaeger();
        }
        return this.\u00d3\u00f4\u00d3O00;
    }

    public P getVarianteGrosswildjaeger() {
        if (this.\u00d4\u00f4\u00d3O00 == null) {
            this.\u00d4\u00f4\u00d3O00 = new VarianteGrosswildjaeger();
        }
        return this.\u00d4\u00f4\u00d3O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Gro\u00dfwildj\u00e4ger");
        } else {
            stringBuffer.append("Gro\u00dfwildj\u00e4gerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteGrosswildjaeger());
        this.addAlleVarianten(this.getSklavenjaeger());
        this.addAlleVarianten(this.getKopfgeldjaeger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteGrosswildjaeger());
        this.addMoeglicheVariante(this.getSklavenjaeger());
        this.addMoeglicheVariante(this.getKopfgeldjaeger());
    }
}

