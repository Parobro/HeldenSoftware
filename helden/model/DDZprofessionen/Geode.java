/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.geode.Brobim;
import helden.model.DDZprofessionen.geode.DienerSumus;
import helden.model.DDZprofessionen.geode.HerrDerErde;

public class Geode
extends BasisDDZProfessionMitGeweihter {
    private P \u00d3\u00d2\u00f4O00;
    private P whileforif;
    private P \u00d4\u00d2\u00f4O00;

    public Geode() {
    }

    public Geode(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBrobim() {
        if (this.\u00d4\u00d2\u00f4O00 == null) {
            this.\u00d4\u00d2\u00f4O00 = new Brobim();
        }
        return this.\u00d4\u00d2\u00f4O00;
    }

    public P getDienerSumus() {
        if (this.\u00d3\u00d2\u00f4O00 == null) {
            this.\u00d3\u00d2\u00f4O00 = new DienerSumus();
        }
        return this.\u00d3\u00d2\u00f4O00;
    }

    public P getHerrDerErde() {
        if (this.whileforif == null) {
            this.whileforif = new HerrDerErde();
        }
        return this.whileforif;
    }

    @Override
    public String getID() {
        return "P143";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istVeteranErlaubt() {
        return false;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Geode");
        } else {
            stringBuffer.append("Geodin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getDienerSumus());
        this.addAlleVarianten(this.getHerrDerErde());
        this.addAlleVarianten(this.getBrobim());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getDienerSumus());
        this.addMoeglicheVariante(this.getHerrDerErde());
    }
}

