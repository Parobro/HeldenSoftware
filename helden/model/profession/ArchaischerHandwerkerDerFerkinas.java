/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.archaischerhandwerkerferkina.Bogenbauer;
import helden.model.profession.archaischerhandwerkerferkina.Brauer;
import helden.model.profession.archaischerhandwerkerferkina.Faerber;
import helden.model.profession.archaischerhandwerkerferkina.Fleischer;
import helden.model.profession.archaischerhandwerkerferkina.Gerber;
import helden.model.profession.archaischerhandwerkerferkina.Sattler;
import helden.model.profession.archaischerhandwerkerferkina.Seiler;
import helden.model.profession.archaischerhandwerkerferkina.Toepfer;
import helden.model.profession.archaischerhandwerkerferkina.Weber;

public class ArchaischerHandwerkerDerFerkinas
extends L {
    private P O\u00f4\u00d3O00;
    private P thisintnull;
    private P \u00f8\u00d8\u00d3O00;
    private P \u00d8\u00d8\u00d3O00;
    private P \u00f4\u00d8\u00d3O00;
    private P \u00d5\u00d8\u00d3O00;
    private P \u00f5\u00d8\u00d3O00;
    private P \u00d4\u00d8\u00d3O00;
    private P Stringintnull;

    public ArchaischerHandwerkerDerFerkinas() {
    }

    public ArchaischerHandwerkerDerFerkinas(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBogenbauer() {
        if (this.O\u00f4\u00d3O00 == null) {
            this.O\u00f4\u00d3O00 = new Bogenbauer();
        }
        return this.O\u00f4\u00d3O00;
    }

    public P getBrauer() {
        if (this.thisintnull == null) {
            this.thisintnull = new Brauer();
        }
        return this.thisintnull;
    }

    public P getFaerber() {
        if (this.\u00f8\u00d8\u00d3O00 == null) {
            this.\u00f8\u00d8\u00d3O00 = new Faerber();
        }
        return this.\u00f8\u00d8\u00d3O00;
    }

    public P getFleischer() {
        if (this.\u00d8\u00d8\u00d3O00 == null) {
            this.\u00d8\u00d8\u00d3O00 = new Fleischer();
        }
        return this.\u00d8\u00d8\u00d3O00;
    }

    public P getGerber() {
        if (this.\u00f4\u00d8\u00d3O00 == null) {
            this.\u00f4\u00d8\u00d3O00 = new Gerber();
        }
        return this.\u00f4\u00d8\u00d3O00;
    }

    @Override
    public String getID() {
        return "P81";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getSattler() {
        if (this.\u00d5\u00d8\u00d3O00 == null) {
            this.\u00d5\u00d8\u00d3O00 = new Sattler();
        }
        return this.\u00d5\u00d8\u00d3O00;
    }

    public P getSeiler() {
        if (this.\u00f5\u00d8\u00d3O00 == null) {
            this.\u00f5\u00d8\u00d3O00 = new Seiler();
        }
        return this.\u00f5\u00d8\u00d3O00;
    }

    public P getToepfer() {
        if (this.\u00d4\u00d8\u00d3O00 == null) {
            this.\u00d4\u00d8\u00d3O00 = new Toepfer();
        }
        return this.\u00d4\u00d8\u00d3O00;
    }

    public P getWeber() {
        if (this.Stringintnull == null) {
            this.Stringintnull = new Weber();
        }
        return this.Stringintnull;
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Archaischer Handwerker der Ferkinas");
        } else {
            stringBuffer.append("Archaische Handwerkerin der Ferkinas");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBogenbauer());
        this.addAlleVarianten(this.getBrauer());
        this.addAlleVarianten(this.getFaerber());
        this.addAlleVarianten(this.getFleischer());
        this.addAlleVarianten(this.getGerber());
        this.addAlleVarianten(this.getSattler());
        this.addAlleVarianten(this.getSeiler());
        this.addAlleVarianten(this.getToepfer());
        this.addAlleVarianten(this.getWeber());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBogenbauer());
        this.addMoeglicheVariante(this.getBrauer());
        this.addMoeglicheVariante(this.getFaerber());
        this.addMoeglicheVariante(this.getFleischer());
        this.addMoeglicheVariante(this.getGerber());
        this.addMoeglicheVariante(this.getSattler());
        this.addMoeglicheVariante(this.getSeiler());
        this.addMoeglicheVariante(this.getToepfer());
        this.addMoeglicheVariante(this.getWeber());
    }
}

