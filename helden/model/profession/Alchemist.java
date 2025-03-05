/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.alchimist.AlAnfa;
import helden.model.profession.alchimist.BasisAlchimist;
import helden.model.profession.alchimist.Festum;
import helden.model.profession.alchimist.Kammerjaeger;
import helden.model.profession.alchimist.Khunchom;
import helden.model.profession.alchimist.Mengbilla;
import helden.model.profession.alchimist.Methumis;
import helden.model.profession.alchimist.Norburg;
import helden.model.profession.alchimist.RoterSalamander;
import helden.model.profession.alchimist.Unau;
import helden.model.profession.alchimist.Zwergisch;

public class Alchemist
extends L {
    private P \u00d4\u00d2\u00d5O00;
    private P Stringclassint;
    private P nullclassint;
    private P \u00d8\u00d2\u00d5O00;
    private P O\u00d4\u00d5O00;
    private P \u00f8o\u00d5O00;
    private P \u00f4\u00d3\u00d5O00;
    private P forclassint;
    private P \u00d5\u00d3\u00d5O00;
    private P returnStringint;
    private P \u00d8\u00d3\u00d5O00;
    private P \u00f5\u00d3\u00d5O00;
    private P \u00d5\u00d2\u00d5O00;
    private P \u00f8\u00d3\u00d5O00;
    private P \u00d8o\u00d5O00;
    private P privateclassint;
    private P o\u00d3\u00d5O00;
    private P o\u00d2\u00d5O00;
    private P O\u00d3\u00d5O00;
    private P \u00d4\u00d3\u00d5O00;
    private P \u00f5o\u00d5O00;
    private P \u00f4o\u00d5O00;
    private P \u00f5\u00d2\u00d5O00;
    private P O\u00d2\u00d5O00;
    private P \u00f4\u00d2\u00d5O00;
    private P \u00f8\u00d2\u00d5O00;
    private P thisclassint;
    private P ifStringint;
    private P \u00d3\u00d3\u00d5O00;
    private P whileStringint;
    private P \u00d3\u00d2\u00d5O00;

    public Alchemist() {
    }

    public Alchemist(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAlanfa() {
        if (this.\u00d5\u00d2\u00d5O00 == null) {
            this.\u00d5\u00d2\u00d5O00 = new AlAnfa("Alchimistische Fakult\u00e4t der Universit\u00e4t von Al'Anfa (magiebegabt)", 12, true);
        }
        return this.\u00d5\u00d2\u00d5O00;
    }

    public P getAlanfaNM() {
        if (this.\u00f8\u00d3\u00d5O00 == null) {
            this.\u00f8\u00d3\u00d5O00 = new AlAnfa("Alchimistische Fakult\u00e4t der Universit\u00e4t von Al'Anfa", 6, false);
        }
        return this.\u00f8\u00d3\u00d5O00;
    }

    public P getFestum() {
        if (this.\u00f8\u00d2\u00d5O00 == null) {
            this.\u00f8\u00d2\u00d5O00 = new Festum();
        }
        return this.\u00f8\u00d2\u00d5O00;
    }

    @Override
    public String getID() {
        return "P01";
    }

    public P getKammerjaeger() {
        if (this.thisclassint == null) {
            this.thisclassint = new Kammerjaeger("", 12, true);
        }
        return this.thisclassint;
    }

    public P getKammerjaegerNM() {
        if (this.ifStringint == null) {
            this.ifStringint = new Kammerjaeger("", 6, false);
        }
        return this.ifStringint;
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getKhunchom() {
        if (this.\u00d8o\u00d5O00 == null) {
            this.\u00d8o\u00d5O00 = new Khunchom();
        }
        return this.\u00d8o\u00d5O00;
    }

    public P getLehrmeister() {
        if (this.\u00d4\u00d2\u00d5O00 == null) {
            this.\u00d4\u00d2\u00d5O00 = new BasisAlchimist("Lehrmeister", 5, false);
        }
        return this.\u00d4\u00d2\u00d5O00;
    }

    public P getLehrmeisterNMB() {
        if (this.Stringclassint == null) {
            this.Stringclassint = new BasisAlchimist("Lehrmeister (magiebegabt)", 11, true);
        }
        return this.Stringclassint;
    }

    public P getMengbilla() {
        if (this.\u00d8\u00d3\u00d5O00 == null) {
            this.\u00d8\u00d3\u00d5O00 = new Mengbilla("Gilde der Alchimisten zu Mengbilla (magiebegabt)", 13, true);
        }
        return this.\u00d8\u00d3\u00d5O00;
    }

    public P getMengbillaNM() {
        if (this.\u00f5\u00d3\u00d5O00 == null) {
            this.\u00f5\u00d3\u00d5O00 = new Mengbilla("Gilde der Alchimisten zu Mengbilla", 7, false);
        }
        return this.\u00f5\u00d3\u00d5O00;
    }

    public P getMethumisArithmetik() {
        if (this.privateclassint == null) {
            this.privateclassint = new Methumis("Fakult\u00e4t der Alchimie der Herzog-Eolan-Universit\u00e4t zu Methumis (Arithmetik, magiebegabt)", 16, true, Methumis.Quadrivium.o00000);
        }
        return this.privateclassint;
    }

    public P getMethumisArithmetikNM() {
        if (this.o\u00d3\u00d5O00 == null) {
            this.o\u00d3\u00d5O00 = new Methumis("Fakult\u00e4t der Alchimie der Herzog-Eolan-Universit\u00e4t zu Methumis (Arithmetik)", 10, false, Methumis.Quadrivium.o00000);
        }
        return this.o\u00d3\u00d5O00;
    }

    public P getMethumisAstronomie() {
        if (this.\u00f4o\u00d5O00 == null) {
            this.\u00f4o\u00d5O00 = new Methumis("Fakult\u00e4t der Alchimie der Herzog-Eolan-Universit\u00e4t zu Methumis (Astronomie, magiebegabt)", 17, true, Methumis.Quadrivium.\u00d500000);
        }
        return this.\u00f4o\u00d5O00;
    }

    public P getMethumisAstronomieNM() {
        if (this.\u00f5\u00d2\u00d5O00 == null) {
            this.\u00f5\u00d2\u00d5O00 = new Methumis("Fakult\u00e4t der Alchimie der Herzog-Eolan-Universit\u00e4t zu Methumis (Astronomie)", 11, false, Methumis.Quadrivium.\u00d500000);
        }
        return this.\u00f5\u00d2\u00d5O00;
    }

    public P getMethumisGeometrie() {
        if (this.o\u00d2\u00d5O00 == null) {
            this.o\u00d2\u00d5O00 = new Methumis("Fakult\u00e4t der Alchimie der Herzog-Eolan-Universit\u00e4t zu Methumis (Geometrie, magiebegabt)", 16, true, Methumis.Quadrivium.\u00d300000);
        }
        return this.o\u00d2\u00d5O00;
    }

    public P getMethumisGeometrieNM() {
        if (this.O\u00d3\u00d5O00 == null) {
            this.O\u00d3\u00d5O00 = new Methumis("Fakult\u00e4t der Alchimie der Herzog-Eolan-Universit\u00e4t zu Methumis (Geometrie)", 10, false, Methumis.Quadrivium.\u00d300000);
        }
        return this.O\u00d3\u00d5O00;
    }

    public P getMethumisMusiklehre() {
        if (this.\u00d4\u00d3\u00d5O00 == null) {
            this.\u00d4\u00d3\u00d5O00 = new Methumis("Fakult\u00e4t der Alchimie der Herzog-Eolan-Universit\u00e4t zu Methumis (Musiklehre, magiebegabt)", 17, true, Methumis.Quadrivium.\u00d400000);
        }
        return this.\u00d4\u00d3\u00d5O00;
    }

    public P getMethumisMusiklehreNM() {
        if (this.\u00f5o\u00d5O00 == null) {
            this.\u00f5o\u00d5O00 = new Methumis("Fakult\u00e4t der Alchimie der Herzog-Eolan-Universit\u00e4t zu Methumis (Musiklehre)", 11, false, Methumis.Quadrivium.\u00d400000);
        }
        return this.\u00f5o\u00d5O00;
    }

    public P getNorburg() {
        if (this.O\u00d2\u00d5O00 == null) {
            this.O\u00d2\u00d5O00 = new Norburg("Spagyrischer Zweig der Halle des Lebens zu Norburg (magiebegabt)", 15, true);
        }
        return this.O\u00d2\u00d5O00;
    }

    public P getNorburgNM() {
        if (this.\u00f4\u00d2\u00d5O00 == null) {
            this.\u00f4\u00d2\u00d5O00 = new Norburg("Spagyrischer Zweig der Halle des Lebens zu Norburg", 9, false);
        }
        return this.\u00f4\u00d2\u00d5O00;
    }

    public P getRoterSalamanderAndergast() {
        if (this.nullclassint == null) {
            this.nullclassint = new RoterSalamander("Bund des Roten Salamanders (Andergast, magiebegabt)", 12, true, RoterSalamander.ORTE.\u00d400000);
        }
        return this.nullclassint;
    }

    public P getRoterSalamanderAnderGastNM() {
        if (this.\u00d8\u00d2\u00d5O00 == null) {
            this.\u00d8\u00d2\u00d5O00 = new RoterSalamander("Bund des Roten Salamanders (Andergast)", 6, false, RoterSalamander.ORTE.\u00d400000);
        }
        return this.\u00d8\u00d2\u00d5O00;
    }

    public P getRoterSalamanderBrabak() {
        if (this.O\u00d4\u00d5O00 == null) {
            this.O\u00d4\u00d5O00 = new RoterSalamander("Bund des Roten Salamanders (Brabak, magiebegabt)", 12, true, RoterSalamander.ORTE.\u00d500000);
        }
        return this.O\u00d4\u00d5O00;
    }

    public P getRoterSalamanderBrabakNM() {
        if (this.\u00f8o\u00d5O00 == null) {
            this.\u00f8o\u00d5O00 = new RoterSalamander("Bund des Roten Salamanders (Brabak)", 6, false, RoterSalamander.ORTE.\u00d500000);
        }
        return this.\u00f8o\u00d5O00;
    }

    public P getRoterSalamanderFasar() {
        if (this.\u00f4\u00d3\u00d5O00 == null) {
            this.\u00f4\u00d3\u00d5O00 = new RoterSalamander("Bund des Roten Salamanders (Fasar, magiebegabt)", 12, true, RoterSalamander.ORTE.\u00d300000);
        }
        return this.\u00f4\u00d3\u00d5O00;
    }

    public P getRoterSalamanderFasarNM() {
        if (this.forclassint == null) {
            this.forclassint = new RoterSalamander("Bund des Roten Salamanders (Fasar)", 6, false, RoterSalamander.ORTE.\u00d300000);
        }
        return this.forclassint;
    }

    public P getRoterSalamanderFestum() {
        if (this.\u00d5\u00d3\u00d5O00 == null) {
            this.\u00d5\u00d3\u00d5O00 = new RoterSalamander("Bund des Roten Salamanders (Festum, magiebegabt)", 12, true, RoterSalamander.ORTE.new);
        }
        return this.\u00d5\u00d3\u00d5O00;
    }

    public P getRoterSalamanderFestumNM() {
        if (this.returnStringint == null) {
            this.returnStringint = new RoterSalamander("Bund des Roten Salamanders (Festum)", 6, false, RoterSalamander.ORTE.new);
        }
        return this.returnStringint;
    }

    public P getUnau() {
        if (this.\u00d3\u00d3\u00d5O00 == null) {
            this.\u00d3\u00d3\u00d5O00 = new Unau("Alchimist aus Unau (magiebegabt)", 13, true);
        }
        return this.\u00d3\u00d3\u00d5O00;
    }

    public P getUnauNM() {
        if (this.whileStringint == null) {
            this.whileStringint = new Unau("Alchimist aus Unau", 7, false);
        }
        return this.whileStringint;
    }

    public P getZwergisch() {
        if (this.\u00d3\u00d2\u00d5O00 == null) {
            this.\u00d3\u00d2\u00d5O00 = new Zwergisch();
        }
        return this.\u00d3\u00d2\u00d5O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return true;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Alchimist");
        } else {
            stringBuffer.append("Alchimistin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getLehrmeister());
        this.addAlleVarianten(this.getLehrmeisterNMB());
        this.addAlleVarianten(this.getRoterSalamanderAndergast());
        this.addAlleVarianten(this.getRoterSalamanderAnderGastNM());
        this.addAlleVarianten(this.getRoterSalamanderBrabak());
        this.addAlleVarianten(this.getRoterSalamanderBrabakNM());
        this.addAlleVarianten(this.getRoterSalamanderFasar());
        this.addAlleVarianten(this.getRoterSalamanderFasarNM());
        this.addAlleVarianten(this.getRoterSalamanderFestum());
        this.addAlleVarianten(this.getRoterSalamanderFestumNM());
        this.addAlleVarianten(this.getMengbilla());
        this.addAlleVarianten(this.getMengbillaNM());
        this.addAlleVarianten(this.getAlanfa());
        this.addAlleVarianten(this.getAlanfaNM());
        this.addAlleVarianten(this.getKhunchom());
        this.addAlleVarianten(this.getMethumisArithmetik());
        this.addAlleVarianten(this.getMethumisArithmetikNM());
        this.addAlleVarianten(this.getMethumisGeometrie());
        this.addAlleVarianten(this.getMethumisGeometrieNM());
        this.addAlleVarianten(this.getMethumisMusiklehre());
        this.addAlleVarianten(this.getMethumisMusiklehreNM());
        this.addAlleVarianten(this.getMethumisAstronomie());
        this.addAlleVarianten(this.getMethumisAstronomieNM());
        this.addAlleVarianten(this.getNorburg());
        this.addAlleVarianten(this.getNorburgNM());
        this.addAlleVarianten(this.getFestum());
        this.addAlleVarianten(this.getKammerjaeger());
        this.addAlleVarianten(this.getKammerjaegerNM());
        this.addAlleVarianten(this.getUnau());
        this.addAlleVarianten(this.getUnauNM());
        this.addAlleVarianten(this.getZwergisch());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getLehrmeister());
        this.addMoeglicheVariante(this.getLehrmeisterNMB());
        this.addMoeglicheVariante(this.getRoterSalamanderAndergast());
        this.addMoeglicheVariante(this.getRoterSalamanderAnderGastNM());
        this.addMoeglicheVariante(this.getRoterSalamanderBrabak());
        this.addMoeglicheVariante(this.getRoterSalamanderBrabakNM());
        this.addMoeglicheVariante(this.getRoterSalamanderFasar());
        this.addMoeglicheVariante(this.getRoterSalamanderFasarNM());
        this.addMoeglicheVariante(this.getRoterSalamanderFestum());
        this.addMoeglicheVariante(this.getRoterSalamanderFestumNM());
        this.addMoeglicheVariante(this.getMengbilla());
        this.addMoeglicheVariante(this.getMengbillaNM());
        this.addMoeglicheVariante(this.getAlanfa());
        this.addMoeglicheVariante(this.getAlanfaNM());
        this.addMoeglicheVariante(this.getKhunchom());
        this.addMoeglicheVariante(this.getMethumisArithmetik());
        this.addMoeglicheVariante(this.getMethumisArithmetikNM());
        this.addMoeglicheVariante(this.getMethumisGeometrie());
        this.addMoeglicheVariante(this.getMethumisGeometrieNM());
        this.addMoeglicheVariante(this.getMethumisMusiklehre());
        this.addMoeglicheVariante(this.getMethumisMusiklehreNM());
        this.addMoeglicheVariante(this.getMethumisAstronomie());
        this.addMoeglicheVariante(this.getMethumisAstronomieNM());
        this.addMoeglicheVariante(this.getNorburg());
        this.addMoeglicheVariante(this.getNorburgNM());
        this.addMoeglicheVariante(this.getFestum());
        this.addMoeglicheVariante(this.getKammerjaeger());
        this.addMoeglicheVariante(this.getKammerjaegerNM());
    }
}

