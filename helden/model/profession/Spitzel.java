/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.spitzel.Geheimagent;
import helden.model.profession.spitzel.Informant;
import helden.model.profession.spitzel.Nanduriat;

public class Spitzel
extends L {
    private P o0\u00d3O00;
    private P O0\u00d3O00;
    private P nullObjectnull;

    public Spitzel() {
    }

    public Spitzel(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getGeheimagent() {
        if (this.O0\u00d3O00 == null) {
            this.O0\u00d3O00 = new Geheimagent();
        }
        return this.O0\u00d3O00;
    }

    @Override
    public String getID() {
        return "P63";
    }

    public P getInformant() {
        if (this.o0\u00d3O00 == null) {
            this.o0\u00d3O00 = new Informant();
        }
        return this.o0\u00d3O00;
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getNanduriat() {
        if (this.nullObjectnull == null) {
            this.nullObjectnull = new Nanduriat();
        }
        return this.nullObjectnull;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Spitzel");
        } else {
            stringBuffer.append("Spitzelin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getInformant());
        this.addAlleVarianten(this.getGeheimagent());
        this.addAlleVarianten(this.getNanduriat());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getInformant());
        this.addMoeglicheVariante(this.getGeheimagent());
        this.addMoeglicheVariante(this.getNanduriat());
    }
}

