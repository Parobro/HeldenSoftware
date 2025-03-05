/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.rattenfaenger.Krokodillero;
import helden.model.profession.rattenfaenger.VarianteRattenfaenger;

public class Rattenfaenger
extends L {
    private P \u00d5\u00d6\u00d4O00;
    private P thisinterfacenull;

    public Rattenfaenger() {
    }

    public Rattenfaenger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P67";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getKrokodillero() {
        if (this.thisinterfacenull == null) {
            this.thisinterfacenull = new Krokodillero();
        }
        return this.thisinterfacenull;
    }

    public P getVariantenRattenfaenger() {
        if (this.\u00d5\u00d6\u00d4O00 == null) {
            this.\u00d5\u00d6\u00d4O00 = new VarianteRattenfaenger();
        }
        return this.\u00d5\u00d6\u00d4O00;
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

