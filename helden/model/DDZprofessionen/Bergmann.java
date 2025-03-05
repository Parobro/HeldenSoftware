/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.bergmann.Pilzzuechter;
import helden.model.DDZprofessionen.bergmann.Schachtfeger;
import helden.model.DDZprofessionen.bergmann.VarianteBergmann;

public class Bergmann
extends BasisDDZProfessionMitGeweihter {
    private P \u00d5\u00d3\u00f4O00;
    private P fordoif;
    private P \u00d4\u00d3\u00f4O00;

    public Bergmann() {
    }

    public Bergmann(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P139";
    }

    public P getPilzzuechter() {
        if (this.fordoif == null) {
            this.fordoif = new Pilzzuechter();
        }
        return this.fordoif;
    }

    public P getSchachtfeger() {
        if (this.\u00d4\u00d3\u00f4O00 == null) {
            this.\u00d4\u00d3\u00f4O00 = new Schachtfeger();
        }
        return this.\u00d4\u00d3\u00f4O00;
    }

    public P getVarianteBergmann() {
        if (this.\u00d5\u00d3\u00f4O00 == null) {
            this.\u00d5\u00d3\u00f4O00 = new VarianteBergmann();
        }
        return this.\u00d5\u00d3\u00f4O00;
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Bergmann");
        } else {
            stringBuffer.append("Bergfrau");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteBergmann());
        this.addAlleVarianten(this.getPilzzuechter());
        this.addAlleVarianten(this.getSchachtfeger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteBergmann());
    }
}

