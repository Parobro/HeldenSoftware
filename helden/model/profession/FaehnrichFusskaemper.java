/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.faehnrichFusskaempfer.AlAnfa;
import helden.model.profession.faehnrichFusskaempfer.Albenhus;
import helden.model.profession.faehnrichFusskaempfer.Festum;
import helden.model.profession.faehnrichFusskaempfer.Gareth;
import helden.model.profession.faehnrichFusskaempfer.Honingen;

public class FaehnrichFusskaemper
extends L {
    private P \u00d40\u00d2O00;
    private P thisdovoid;
    private P \u00d80\u00d2O00;
    private P \u00d50\u00d2O00;
    private P \u00d30\u00d2O00;

    public FaehnrichFusskaemper() {
    }

    public FaehnrichFusskaemper(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAlAnfa() {
        if (this.\u00d40\u00d2O00 == null) {
            this.\u00d40\u00d2O00 = new AlAnfa();
        }
        return this.\u00d40\u00d2O00;
    }

    public P getAlbenhus() {
        if (this.thisdovoid == null) {
            this.thisdovoid = new Albenhus();
        }
        return this.thisdovoid;
    }

    public P getFestum() {
        if (this.\u00d80\u00d2O00 == null) {
            this.\u00d80\u00d2O00 = new Festum();
        }
        return this.\u00d80\u00d2O00;
    }

    public P getGareth() {
        if (this.\u00d50\u00d2O00 == null) {
            this.\u00d50\u00d2O00 = new Gareth();
        }
        return this.\u00d50\u00d2O00;
    }

    public P getHoningen() {
        if (this.\u00d30\u00d2O00 == null) {
            this.\u00d30\u00d2O00 = new Honingen();
        }
        return this.\u00d30\u00d2O00;
    }

    @Override
    public String getID() {
        return "P85";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("F\u00e4hnrich der Fu\u00dfk\u00e4mpfer");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getAlAnfa());
        this.addAlleVarianten(this.getAlbenhus());
        this.addAlleVarianten(this.getFestum());
        this.addAlleVarianten(this.getGareth());
        this.addAlleVarianten(this.getHoningen());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getAlAnfa());
        this.addMoeglicheVariante(this.getAlbenhus());
        this.addMoeglicheVariante(this.getFestum());
        this.addMoeglicheVariante(this.getGareth());
        this.addMoeglicheVariante(this.getHoningen());
    }
}

