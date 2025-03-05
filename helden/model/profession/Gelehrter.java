/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.gelehrter.Anatom;
import helden.model.profession.gelehrter.Historiker;
import helden.model.profession.gelehrter.Mathematicus;
import helden.model.profession.gelehrter.Mawdli;
import helden.model.profession.gelehrter.Medicus;
import helden.model.profession.gelehrter.Philosoph;
import helden.model.profession.gelehrter.Rechtsgelehrter;
import helden.model.profession.gelehrter.Sprachenkundler;
import helden.model.profession.gelehrter.Sternkundiger;
import helden.model.profession.gelehrter.Voelkerkundler;
import helden.model.profession.gelehrter.Zahlenmystiker;

public class Gelehrter
extends L {
    private P \u00d80\u00d5O00;
    private P whilenewint;
    private P \u00f50\u00d5O00;
    private P \u00d40\u00d5O00;
    private P StringObjectint;
    private P OO\u00d5O00;
    private P \u00d50\u00d5O00;
    private P thisObjectint;
    private P \u00f40\u00d5O00;
    private P \u00d30\u00d5O00;
    private P \u00f80\u00d5O00;

    public Gelehrter() {
    }

    public Gelehrter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAnatom() {
        if (this.\u00d80\u00d5O00 == null) {
            this.\u00d80\u00d5O00 = new Anatom();
        }
        return this.\u00d80\u00d5O00;
    }

    public P getHistoriker() {
        if (this.whilenewint == null) {
            this.whilenewint = new Historiker();
        }
        return this.whilenewint;
    }

    @Override
    public String getID() {
        return "P27";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getMathematicus() {
        if (this.\u00f50\u00d5O00 == null) {
            this.\u00f50\u00d5O00 = new Mathematicus();
        }
        return this.\u00f50\u00d5O00;
    }

    public P getMawdli() {
        if (this.\u00d40\u00d5O00 == null) {
            this.\u00d40\u00d5O00 = new Mawdli();
        }
        return this.\u00d40\u00d5O00;
    }

    public P getMedicus() {
        if (this.StringObjectint == null) {
            this.StringObjectint = new Medicus();
        }
        return this.StringObjectint;
    }

    public P getPhilosoph() {
        if (this.OO\u00d5O00 == null) {
            this.OO\u00d5O00 = new Philosoph();
        }
        return this.OO\u00d5O00;
    }

    public P getRechtsgelehrter() {
        if (this.\u00d50\u00d5O00 == null) {
            this.\u00d50\u00d5O00 = new Rechtsgelehrter();
        }
        return this.\u00d50\u00d5O00;
    }

    public P getSprachenkundler() {
        if (this.thisObjectint == null) {
            this.thisObjectint = new Sprachenkundler();
        }
        return this.thisObjectint;
    }

    public P getSternkundiger() {
        if (this.\u00f40\u00d5O00 == null) {
            this.\u00f40\u00d5O00 = new Sternkundiger();
        }
        return this.\u00f40\u00d5O00;
    }

    public P getVoelkerkundler() {
        if (this.\u00d30\u00d5O00 == null) {
            this.\u00d30\u00d5O00 = new Voelkerkundler();
        }
        return this.\u00d30\u00d5O00;
    }

    public P getZahlenmystiker() {
        if (this.\u00f80\u00d5O00 == null) {
            this.\u00f80\u00d5O00 = new Zahlenmystiker();
        }
        return this.\u00f80\u00d5O00;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Gelehrter");
        } else {
            stringBuffer.append("Gelehrte");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getAnatom());
        this.addAlleVarianten(this.getHistoriker());
        this.addAlleVarianten(this.getMathematicus());
        this.addAlleVarianten(this.getMedicus());
        this.addAlleVarianten(this.getPhilosoph());
        this.addAlleVarianten(this.getRechtsgelehrter());
        this.addAlleVarianten(this.getSprachenkundler());
        this.addAlleVarianten(this.getSternkundiger());
        this.addAlleVarianten(this.getVoelkerkundler());
        this.addAlleVarianten(this.getZahlenmystiker());
        this.addAlleVarianten(this.getMawdli());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getAnatom());
        this.addMoeglicheVariante(this.getHistoriker());
        this.addMoeglicheVariante(this.getMathematicus());
        this.addMoeglicheVariante(this.getMedicus());
        this.addMoeglicheVariante(this.getPhilosoph());
        this.addMoeglicheVariante(this.getRechtsgelehrter());
        this.addMoeglicheVariante(this.getSprachenkundler());
        this.addMoeglicheVariante(this.getSternkundiger());
        this.addMoeglicheVariante(this.getVoelkerkundler());
    }
}

