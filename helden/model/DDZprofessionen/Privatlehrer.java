/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.privatlehrer.PrivatlehrerVariante;

public class Privatlehrer
extends BasisDDZProfessionMitGeweihter {
    private P \u00d3\u00f5\u00d8O00;

    public Privatlehrer() {
    }

    public Privatlehrer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P132";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getPrivatlehrer() {
        if (this.\u00d3\u00f5\u00d8O00 == null) {
            this.\u00d3\u00f5\u00d8O00 = new PrivatlehrerVariante();
        }
        return this.\u00d3\u00f5\u00d8O00;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Privatlehrer";
        }
        return "Privatlehrerin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getPrivatlehrer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getPrivatlehrer());
    }
}

