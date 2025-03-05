/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.botenreiter.Botenlaeufer;
import helden.model.DDZprofessionen.botenreiter.Stafettenlaeufer;
import helden.model.DDZprofessionen.botenreiter.VarianteBotenreiter;
import helden.model.DDZprofessionen.botenreiter.Zensor;

public class Botenreiter
extends BasisDDZProfessionMitGeweihter {
    private P \u00d3\u00d3\u00d8O00;
    private P \u00d4\u00d3\u00d8O00;
    private P whileStringif;
    private P o\u00d3\u00d8O00;

    public Botenreiter() {
    }

    public Botenreiter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBotenlaeufer() {
        if (this.\u00d4\u00d3\u00d8O00 == null) {
            this.\u00d4\u00d3\u00d8O00 = new Botenlaeufer();
        }
        return this.\u00d4\u00d3\u00d8O00;
    }

    @Override
    public String getID() {
        return "P91";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getStafettenlaeufer() {
        if (this.whileStringif == null) {
            this.whileStringif = new Stafettenlaeufer();
        }
        return this.whileStringif;
    }

    public P getVarianteBotenreiter() {
        if (this.\u00d3\u00d3\u00d8O00 == null) {
            this.\u00d3\u00d3\u00d8O00 = new VarianteBotenreiter();
        }
        return this.\u00d3\u00d3\u00d8O00;
    }

    public P getZensor() {
        if (this.o\u00d3\u00d8O00 == null) {
            this.o\u00d3\u00d8O00 = new Zensor();
        }
        return this.o\u00d3\u00d8O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Botenreiter");
        } else {
            stringBuffer.append("Botenreiterin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(super.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBotenlaeufer());
        this.addAlleVarianten(this.getZensor());
        this.addAlleVarianten(this.getStafettenlaeufer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBotenlaeufer());
        this.addMoeglicheVariante(this.getZensor());
    }
}

