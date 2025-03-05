/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.ritter.BasisRitter;
import helden.model.profession.ritter.Knappe;
import helden.model.profession.ritter.KnappeNostergast;
import helden.model.profession.ritter.KnappeTraditionellenRitters;
import helden.model.profession.ritter.RitterAltenSchlags;

public class Ritter
extends L {
    private P \u00d8\u00f5\u00d3O00;
    private P ififnull;
    private P \u00f5\u00f5\u00d3O00;
    private P \u00f8\u00f5\u00d3O00;
    private P \u00f4\u00f5\u00d3O00;

    public Ritter() {
    }

    public Ritter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P61";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getKnappe() {
        if (this.\u00f5\u00f5\u00d3O00 == null) {
            this.\u00f5\u00f5\u00d3O00 = new Knappe();
        }
        return this.\u00f5\u00f5\u00d3O00;
    }

    public P getKnappeNostergast() {
        if (this.\u00f4\u00f5\u00d3O00 == null) {
            this.\u00f4\u00f5\u00d3O00 = new KnappeNostergast();
        }
        return this.\u00f4\u00f5\u00d3O00;
    }

    public P getKnappeTraditonell() {
        if (this.\u00f8\u00f5\u00d3O00 == null) {
            this.\u00f8\u00f5\u00d3O00 = new KnappeTraditionellenRitters();
        }
        return this.\u00f8\u00f5\u00d3O00;
    }

    public P getRitter() {
        if (this.\u00d8\u00f5\u00d3O00 == null) {
            this.\u00d8\u00f5\u00d3O00 = new BasisRitter();
        }
        return this.\u00d8\u00f5\u00d3O00;
    }

    public P getRitterAltenSchlags() {
        if (this.ififnull == null) {
            this.ififnull = new RitterAltenSchlags();
        }
        return this.ififnull;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Ritter");
        } else {
            stringBuffer.append("Ritterin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append("/");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getRitter());
        this.addAlleVarianten(this.getRitterAltenSchlags());
        this.addAlleVarianten(this.getKnappe());
        this.addAlleVarianten(this.getKnappeTraditonell());
        this.addAlleVarianten(this.getKnappeNostergast());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getRitter());
        this.addMoeglicheVariante(this.getRitterAltenSchlags());
        this.addMoeglicheVariante(this.getKnappe());
        this.addMoeglicheVariante(this.getKnappeTraditonell());
    }
}

