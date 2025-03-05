/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.gardist.Akademiegardist;
import helden.model.DDZprofessionen.gardist.Dorfbuettel;
import helden.model.DDZprofessionen.gardist.Rechtswahrer;
import helden.model.DDZprofessionen.gardist.Schliesser;
import helden.model.DDZprofessionen.gardist.Stadtgardist;
import helden.model.DDZprofessionen.gardist.Strassenwaechter;

public class Gardist
extends BasisDDZProfessionMitGeweihter {
    private P \u00d3\u00d4\u00d8O00;
    private P O\u00d4\u00d8O00;
    private P o\u00d4\u00d8O00;
    private P \u00f8\u00d3\u00d8O00;
    private P Stringclassif;
    private P nullclassif;

    public Gardist() {
    }

    public Gardist(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAkademiegardist() {
        if (this.nullclassif == null) {
            this.nullclassif = new Akademiegardist();
        }
        return this.nullclassif;
    }

    public P getDorfbuettel() {
        if (this.O\u00d4\u00d8O00 == null) {
            this.O\u00d4\u00d8O00 = new Dorfbuettel();
        }
        return this.O\u00d4\u00d8O00;
    }

    @Override
    public String getID() {
        return "P93";
    }

    public P getRechtswahrer() {
        if (this.\u00f8\u00d3\u00d8O00 == null) {
            this.\u00f8\u00d3\u00d8O00 = new Rechtswahrer();
        }
        return this.\u00f8\u00d3\u00d8O00;
    }

    public P getSchliesser() {
        if (this.Stringclassif == null) {
            this.Stringclassif = new Schliesser();
        }
        return this.Stringclassif;
    }

    public P getStadtgardist() {
        if (this.\u00d3\u00d4\u00d8O00 == null) {
            this.\u00d3\u00d4\u00d8O00 = new Stadtgardist();
        }
        return this.\u00d3\u00d4\u00d8O00;
    }

    public P getStrassenwaechter() {
        if (this.o\u00d4\u00d8O00 == null) {
            this.o\u00d4\u00d8O00 = new Strassenwaechter();
        }
        return this.o\u00d4\u00d8O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (!this.varianteGewaehlt()) {
            if (this.istMaennlich()) {
                stringBuffer.append("Gardist");
            } else {
                stringBuffer.append("Gardistin");
            }
        } else {
            stringBuffer.append(super.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getRechtswahrer());
        this.addAlleVarianten(this.getStadtgardist());
        this.addAlleVarianten(this.getDorfbuettel());
        this.addAlleVarianten(this.getStrassenwaechter());
        this.addAlleVarianten(this.getSchliesser());
        this.addAlleVarianten(this.getAkademiegardist());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getStadtgardist());
        this.addMoeglicheVariante(this.getDorfbuettel());
        this.addMoeglicheVariante(this.getStrassenwaechter());
        this.addMoeglicheVariante(this.getSchliesser());
        this.addMoeglicheVariante(this.getAkademiegardist());
        this.addMoeglicheVariante(this.getRechtswahrer());
    }
}

