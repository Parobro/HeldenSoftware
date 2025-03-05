/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.spitzel.Informant;

public class Spitzel
extends BasisDDZProfessionMitGeweihter {
    private P \u00d5\u00d5\u00f4O00;

    public Spitzel() {
    }

    public Spitzel(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P133";
    }

    public P getInformant() {
        if (this.\u00d5\u00d5\u00f4O00 == null) {
            this.\u00d5\u00d5\u00f4O00 = new Informant();
        }
        return this.\u00d5\u00d5\u00f4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Spitzel");
        } else {
            stringBuffer.append("Spitzelin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getInformant());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getInformant());
    }
}

