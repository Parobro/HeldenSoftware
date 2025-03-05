/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.wirt.VarianteWirt;

public class Wirt
extends BasisDDZProfessionMitGeweihter {
    private P \u00d8\u00d2\u00d8O00;

    public Wirt() {
    }

    public Wirt(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P135";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getWirt() {
        if (this.\u00d8\u00d2\u00d8O00 == null) {
            this.\u00d8\u00d2\u00d8O00 = new VarianteWirt();
        }
        return this.\u00d8\u00d2\u00d8O00;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.varianteGewaehlt()) {
            stringBuilder.append(super.toString());
        } else if (this.istMaennlich()) {
            stringBuilder.append("Wirt");
        } else {
            stringBuilder.append("Wirtin");
        }
        return stringBuilder.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getWirt());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getWirt());
    }
}

