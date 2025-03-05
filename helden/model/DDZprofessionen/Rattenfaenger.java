/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.rattenfaenger.Krokodillero;
import helden.model.DDZprofessionen.rattenfaenger.VarianteRattenfaenger;

public class Rattenfaenger
extends BasisDDZProfessionMitGeweihter {
    private P \u00f5\u00d8\u00f4O00;
    private P ifprivateif;

    public Rattenfaenger() {
    }

    public Rattenfaenger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P98";
    }

    public P getKrokodillero() {
        if (this.ifprivateif == null) {
            this.ifprivateif = new Krokodillero();
        }
        return this.ifprivateif;
    }

    public P getVariantenRattenfaenger() {
        if (this.\u00f5\u00d8\u00f4O00 == null) {
            this.\u00f5\u00d8\u00f4O00 = new VarianteRattenfaenger();
        }
        return this.\u00f5\u00d8\u00f4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Rattenf\u00e4nger");
        } else {
            stringBuffer.append("Rattenf\u00e4ngerin");
        }
        if (this.varianteGewaehlt() && this.getVariante() == this.getKrokodillero()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVariantenRattenfaenger());
        this.addAlleVarianten(this.getKrokodillero());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVariantenRattenfaenger());
    }
}

