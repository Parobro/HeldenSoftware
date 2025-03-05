/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.stabsfaehnrich.Vinsalt;
import helden.model.profession.stabsfaehnrich.Wehrheim;

public class Stabsfaehnrich
extends L {
    private P \u00d4\u00d4\u00d5O00;
    private P \u00d3\u00d4\u00d5O00;

    public Stabsfaehnrich() {
    }

    public Stabsfaehnrich(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P90";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getvinsalt() {
        if (this.\u00d3\u00d4\u00d5O00 == null) {
            this.\u00d3\u00d4\u00d5O00 = new Vinsalt();
        }
        return this.\u00d3\u00d4\u00d5O00;
    }

    public P getwehrheim() {
        if (this.\u00d4\u00d4\u00d5O00 == null) {
            this.\u00d4\u00d4\u00d5O00 = new Wehrheim();
        }
        return this.\u00d4\u00d4\u00d5O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("F\u00e4hnrich: Stabsf\u00e4hnrich");
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getwehrheim());
        this.addAlleVarianten(this.getvinsalt());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getwehrheim());
        this.addMoeglicheVariante(this.getvinsalt());
    }
}

