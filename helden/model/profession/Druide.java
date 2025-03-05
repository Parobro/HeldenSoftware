/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.druide.Eiselementarist;
import helden.model.profession.druide.Erzelementarist;
import helden.model.profession.druide.Feuerelementarist;
import helden.model.profession.druide.Haindruide;
import helden.model.profession.druide.HueterderMacht;
import helden.model.profession.druide.Humuselementarist;
import helden.model.profession.druide.Luftelementarist;
import helden.model.profession.druide.MehrerderMacht;
import helden.model.profession.druide.Sumupriester;
import helden.model.profession.druide.Wasserelementarist;

public class Druide
extends L {
    private P forObjectnull;
    private P privateObjectnull;
    private P \u00d80\u00d3O00;
    private P oO\u00d3O00;
    private P \u00f80\u00d3O00;
    private P \u00d40\u00d3O00;
    private P \u00f40\u00d3O00;
    private P \u00f50\u00d3O00;
    private P OO\u00d3O00;
    private P \u00d50\u00d3O00;

    public Druide() {
    }

    public Druide(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getEiselementarist() {
        if (this.\u00d50\u00d3O00 == null) {
            this.\u00d50\u00d3O00 = new Eiselementarist();
        }
        return this.\u00d50\u00d3O00;
    }

    public P getErzelementarist() {
        if (this.OO\u00d3O00 == null) {
            this.OO\u00d3O00 = new Erzelementarist();
        }
        return this.OO\u00d3O00;
    }

    public P getFeuerelementarist() {
        if (this.\u00f80\u00d3O00 == null) {
            this.\u00f80\u00d3O00 = new Feuerelementarist();
        }
        return this.\u00f80\u00d3O00;
    }

    public P getHaindruide() {
        if (this.forObjectnull == null) {
            this.forObjectnull = new Haindruide();
        }
        return this.forObjectnull;
    }

    public P getHueterderMacht() {
        if (this.privateObjectnull == null) {
            this.privateObjectnull = new HueterderMacht();
        }
        return this.privateObjectnull;
    }

    public P getHumuselementarist() {
        if (this.\u00d40\u00d3O00 == null) {
            this.\u00d40\u00d3O00 = new Humuselementarist();
        }
        return this.\u00d40\u00d3O00;
    }

    @Override
    public String getID() {
        return "P16";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getLuftelementarist() {
        if (this.\u00f50\u00d3O00 == null) {
            this.\u00f50\u00d3O00 = new Luftelementarist();
        }
        return this.\u00f50\u00d3O00;
    }

    public P getMehrerderMacht() {
        if (this.\u00d80\u00d3O00 == null) {
            this.\u00d80\u00d3O00 = new MehrerderMacht();
        }
        return this.\u00d80\u00d3O00;
    }

    public P getSumupriester() {
        if (this.oO\u00d3O00 == null) {
            this.oO\u00d3O00 = new Sumupriester();
        }
        return this.oO\u00d3O00;
    }

    public P getWasserelementarist() {
        if (this.\u00f40\u00d3O00 == null) {
            this.\u00f40\u00d3O00 = new Wasserelementarist();
        }
        return this.\u00f40\u00d3O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istVeteranErlaubt() {
        return false;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Druide");
        } else {
            stringBuffer.append("Druidin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getHaindruide());
        this.addAlleVarianten(this.getHueterderMacht());
        this.addAlleVarianten(this.getMehrerderMacht());
        this.addAlleVarianten(this.getSumupriester());
        this.addAlleVarianten(this.getFeuerelementarist());
        this.addAlleVarianten(this.getHumuselementarist());
        this.addAlleVarianten(this.getWasserelementarist());
        this.addAlleVarianten(this.getLuftelementarist());
        this.addAlleVarianten(this.getErzelementarist());
        this.addAlleVarianten(this.getEiselementarist());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHaindruide());
        this.addMoeglicheVariante(this.getHueterderMacht());
        this.addMoeglicheVariante(this.getMehrerderMacht());
        this.addMoeglicheVariante(this.getSumupriester());
    }
}

