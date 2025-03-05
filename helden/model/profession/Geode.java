/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.geode.Brobim;
import helden.model.profession.geode.DienerSumus;
import helden.model.profession.geode.HerrDerErde;

public class Geode
extends L {
    private P \u00d5\u00d6oO00;
    private P \u00d4\u00d6oO00;
    private P thisintvoid;

    public Geode() {
    }

    public Geode(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBrobim() {
        if (this.thisintvoid == null) {
            this.thisintvoid = new Brobim();
        }
        return this.thisintvoid;
    }

    public P getDienerSumus() {
        if (this.\u00d5\u00d6oO00 == null) {
            this.\u00d5\u00d6oO00 = new DienerSumus();
        }
        return this.\u00d5\u00d6oO00;
    }

    public P getHerrDerErde() {
        if (this.\u00d4\u00d6oO00 == null) {
            this.\u00d4\u00d6oO00 = new HerrDerErde();
        }
        return this.\u00d4\u00d6oO00;
    }

    @Override
    public String getID() {
        return "P28";
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

