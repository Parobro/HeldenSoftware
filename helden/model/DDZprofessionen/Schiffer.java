/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.schiffer.Faehrmann;
import helden.model.DDZprofessionen.schiffer.Floesser;
import helden.model.DDZprofessionen.schiffer.Flusspirat;
import helden.model.DDZprofessionen.schiffer.Flussschiffer;
import helden.model.DDZprofessionen.schiffer.Lotse;

public class Schiffer
extends BasisDDZProfessionMitGeweihter {
    private P \u00f5\u00d4\u00f4O00;
    private P \u00f4\u00d4\u00f4O00;
    private P \u00d8\u00d4\u00f4O00;
    private P returnwhileif;
    private P \u00d5\u00d4\u00f4O00;

    public Schiffer() {
    }

    public Schiffer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getFaehrmann() {
        if (this.\u00f5\u00d4\u00f4O00 == null) {
            this.\u00f5\u00d4\u00f4O00 = new Faehrmann();
        }
        return this.\u00f5\u00d4\u00f4O00;
    }

    public P getFloesser() {
        if (this.returnwhileif == null) {
            this.returnwhileif = new Floesser();
        }
        return this.returnwhileif;
    }

    public P getFlusspirat() {
        if (this.\u00d5\u00d4\u00f4O00 == null) {
            this.\u00d5\u00d4\u00f4O00 = new Flusspirat();
        }
        return this.\u00d5\u00d4\u00f4O00;
    }

    public P getFlussschiffer() {
        if (this.\u00f4\u00d4\u00f4O00 == null) {
            this.\u00f4\u00d4\u00f4O00 = new Flussschiffer();
        }
        return this.\u00f4\u00d4\u00f4O00;
    }

    @Override
    public String getID() {
        return "P111";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getLotse() {
        if (this.\u00d8\u00d4\u00f4O00 == null) {
            this.\u00d8\u00d4\u00f4O00 = new Lotse();
        }
        return this.\u00d8\u00d4\u00f4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schiffer");
        } else {
            stringBuffer.append("Schifferin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getFaehrmann());
        this.addAlleVarianten(this.getFlussschiffer());
        this.addAlleVarianten(this.getLotse());
        this.addAlleVarianten(this.getFloesser());
        this.addAlleVarianten(this.getFlusspirat());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getFaehrmann());
        this.addMoeglicheVariante(this.getFlussschiffer());
        this.addMoeglicheVariante(this.getLotse());
        this.addMoeglicheVariante(this.getFloesser());
    }
}

