/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.archaischerhandwerkersued.Bootsbauer;
import helden.model.profession.archaischerhandwerkersued.Faerber;
import helden.model.profession.archaischerhandwerkersued.Fleischer;
import helden.model.profession.archaischerhandwerkersued.Gerber;
import helden.model.profession.archaischerhandwerkersued.Huettenbauer;
import helden.model.profession.archaischerhandwerkersued.LuloaMaler;
import helden.model.profession.archaischerhandwerkersued.Sattler;
import helden.model.profession.archaischerhandwerkersued.Toepfer;
import helden.model.profession.archaischerhandwerkersued.VarianteArchaischerHandwerkerDesSuedens;
import helden.model.profession.archaischerhandwerkersued.Werkzeugmacher;

public class ArchaischerHandwerkerDesSuedens
extends L {
    private P \u00f80\u00d4O00;
    private P \u00d5O\u00d4O00;
    private P \u00d4O\u00d4O00;
    private P thisdonull;
    private P OO\u00d4O00;
    private P \u00d3O\u00d4O00;
    private P oO\u00d4O00;
    private P whilefornull;
    private P iffornull;
    private P \u00f50\u00d4O00;

    public ArchaischerHandwerkerDesSuedens() {
    }

    public ArchaischerHandwerkerDesSuedens(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBootsbauer() {
        if (this.\u00f80\u00d4O00 == null) {
            this.\u00f80\u00d4O00 = new Bootsbauer();
        }
        return this.\u00f80\u00d4O00;
    }

    public P getFaerber() {
        if (this.\u00d3O\u00d4O00 == null) {
            this.\u00d3O\u00d4O00 = new Faerber();
        }
        return this.\u00d3O\u00d4O00;
    }

    public P getFleischer() {
        if (this.oO\u00d4O00 == null) {
            this.oO\u00d4O00 = new Fleischer();
        }
        return this.oO\u00d4O00;
    }

    public P getGerber() {
        if (this.whilefornull == null) {
            this.whilefornull = new Gerber();
        }
        return this.whilefornull;
    }

    public P getHuettenbauer() {
        if (this.OO\u00d4O00 == null) {
            this.OO\u00d4O00 = new Huettenbauer();
        }
        return this.OO\u00d4O00;
    }

    @Override
    public String getID() {
        return "P03";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getLuloaMaler() {
        if (this.thisdonull == null) {
            this.thisdonull = new LuloaMaler();
        }
        return this.thisdonull;
    }

    public P getSattler() {
        if (this.iffornull == null) {
            this.iffornull = new Sattler();
        }
        return this.iffornull;
    }

    public P getToepfer() {
        if (this.\u00f50\u00d4O00 == null) {
            this.\u00f50\u00d4O00 = new Toepfer();
        }
        return this.\u00f50\u00d4O00;
    }

    public P getVarianteArchaischerSued() {
        if (this.\u00d5O\u00d4O00 == null) {
            this.\u00d5O\u00d4O00 = new VarianteArchaischerHandwerkerDesSuedens();
        }
        return this.\u00d5O\u00d4O00;
    }

    public P getWerkzeugmacher() {
        if (this.\u00d4O\u00d4O00 == null) {
            this.\u00d4O\u00d4O00 = new Werkzeugmacher();
        }
        return this.\u00d4O\u00d4O00;
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Archaischer Handwerker des S\u00fcdens");
        } else {
            stringBuffer.append("Archaische Handwerkerin des S\u00fcdens");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteArchaischerSued());
        this.addAlleVarianten(this.getBootsbauer());
        this.addAlleVarianten(this.getWerkzeugmacher());
        this.addAlleVarianten(this.getLuloaMaler());
        this.addAlleVarianten(this.getHuettenbauer());
        this.addAlleVarianten(this.getFaerber());
        this.addAlleVarianten(this.getFleischer());
        this.addAlleVarianten(this.getGerber());
        this.addAlleVarianten(this.getSattler());
        this.addAlleVarianten(this.getToepfer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
    }
}

