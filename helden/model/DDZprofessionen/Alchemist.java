/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.alchimist.BasisAlchimistDDZ;
import helden.model.DDZprofessionen.alchimist.ChamibalChymiaderDracheneiSchulezuYashhualay;
import helden.model.DDZprofessionen.alchimist.GrolmischerGoldmacher;
import helden.model.DDZprofessionen.alchimist.HorasLaboratorienzuBelenas;
import helden.model.DDZprofessionen.alchimist.SchulederSchwarzenWasserzuElem;

public class Alchemist
extends BasisDDZProfessionMitGeweihter {
    private P o\u00f6\u00d8O00;
    private P nullintif;
    private P \u00f8\u00f5\u00d8O00;
    private P \u00d4\u00f6\u00d8O00;
    private P \u00d3\u00f6\u00d8O00;
    private P O\u00f6\u00d8O00;

    public Alchemist() {
    }

    public Alchemist(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getChamibalChymiaderDracheneiSchulezuYashhualay() {
        if (this.\u00d4\u00f6\u00d8O00 == null) {
            this.\u00d4\u00f6\u00d8O00 = new ChamibalChymiaderDracheneiSchulezuYashhualay();
        }
        return this.\u00d4\u00f6\u00d8O00;
    }

    public P getGrolmischerGoldmacher() {
        if (this.O\u00f6\u00d8O00 == null) {
            this.O\u00f6\u00d8O00 = new GrolmischerGoldmacher();
        }
        return this.O\u00f6\u00d8O00;
    }

    public P getHorasLaboratorienzuBelenas() {
        if (this.\u00f8\u00f5\u00d8O00 == null) {
            this.\u00f8\u00f5\u00d8O00 = new HorasLaboratorienzuBelenas();
        }
        return this.\u00f8\u00f5\u00d8O00;
    }

    @Override
    public String getID() {
        return "P119";
    }

    public P getLehrmeister() {
        if (this.o\u00f6\u00d8O00 == null) {
            this.o\u00f6\u00d8O00 = new BasisAlchimistDDZ("Lehrmeister", 5, false);
        }
        return this.o\u00f6\u00d8O00;
    }

    public P getLehrmeisterNMB() {
        if (this.nullintif == null) {
            this.nullintif = new BasisAlchimistDDZ("Lehrmeister (magiebegabt)", 10, true);
        }
        return this.nullintif;
    }

    public P getSchulederSchwarzenWasserzuElem() {
        if (this.\u00d3\u00f6\u00d8O00 == null) {
            this.\u00d3\u00f6\u00d8O00 = new SchulederSchwarzenWasserzuElem();
        }
        return this.\u00d3\u00f6\u00d8O00;
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
        this.addAlleVarianten(this.getHorasLaboratorienzuBelenas());
        this.addAlleVarianten(this.getChamibalChymiaderDracheneiSchulezuYashhualay());
        this.addAlleVarianten(this.getGrolmischerGoldmacher());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getLehrmeister());
        this.addMoeglicheVariante(this.getLehrmeisterNMB());
        this.addMoeglicheVariante(this.getHorasLaboratorienzuBelenas());
        this.addMoeglicheVariante(this.getChamibalChymiaderDracheneiSchulezuYashhualay());
    }
}

