/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.schmuggler.VarianteSchmuggler;
import helden.model.DDZprofessionen.schmuggler.Zoellner;

public class Schmuggler
extends BasisDDZProfessionMitGeweihter {
    private P \u00d3\u00d5\u00f4O00;
    private P \u00d4\u00d5\u00f4O00;

    public Schmuggler() {
    }

    public Schmuggler(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P112";
    }

    public P getSchmuggler() {
        if (this.\u00d3\u00d5\u00f4O00 == null) {
            this.\u00d3\u00d5\u00f4O00 = new VarianteSchmuggler();
        }
        return this.\u00d3\u00d5\u00f4O00;
    }

    public P getZoellner() {
        if (this.\u00d4\u00d5\u00f4O00 == null) {
            this.\u00d4\u00d5\u00f4O00 = new Zoellner();
        }
        return this.\u00d4\u00d5\u00f4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schmuggler");
        } else {
            stringBuffer.append("Schmugglerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getSchmuggler());
        this.addAlleVarianten(this.getZoellner());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getSchmuggler());
        this.addMoeglicheVariante(this.getZoellner());
    }
}

