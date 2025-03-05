/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.tierbaendiger.Chimaerenbaendiger;
import helden.model.DDZprofessionen.tierbaendiger.Falkner;
import helden.model.DDZprofessionen.tierbaendiger.Hundefuehrer;
import helden.model.DDZprofessionen.tierbaendiger.VarianteTierbaendiger;
import helden.model.DDZprofessionen.tierbaendiger.Zureiter;

public class Tierbaendiger
extends BasisDDZProfessionMitGeweihter {
    private P \u00f4\u00f4\u00d8O00;
    private P \u00d8\u00f4\u00d8O00;
    private P ifnullif;
    private P \u00f8\u00f4\u00d8O00;
    private P \u00f5\u00f4\u00d8O00;

    public Tierbaendiger() {
    }

    public Tierbaendiger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getChimaerenbaendiger() {
        if (this.\u00f5\u00f4\u00d8O00 == null) {
            this.\u00f5\u00f4\u00d8O00 = new Chimaerenbaendiger();
        }
        return this.\u00f5\u00f4\u00d8O00;
    }

    public P getFalkner() {
        if (this.\u00d8\u00f4\u00d8O00 == null) {
            this.\u00d8\u00f4\u00d8O00 = new Falkner();
        }
        return this.\u00d8\u00f4\u00d8O00;
    }

    public P getHundefuehrer() {
        if (this.ifnullif == null) {
            this.ifnullif = new Hundefuehrer();
        }
        return this.ifnullif;
    }

    @Override
    public String getID() {
        return "P147";
    }

    public P getTierbaendigerVariante() {
        if (this.\u00f4\u00f4\u00d8O00 == null) {
            this.\u00f4\u00f4\u00d8O00 = new VarianteTierbaendiger();
        }
        return this.\u00f4\u00f4\u00d8O00;
    }

    public P getZureiter() {
        if (this.\u00f8\u00f4\u00d8O00 == null) {
            this.\u00f8\u00f4\u00d8O00 = new Zureiter();
        }
        return this.\u00f8\u00f4\u00d8O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Tierb\u00e4ndiger");
        } else {
            stringBuffer.append("Tierb\u00e4ndigerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getTierbaendigerVariante());
        this.addAlleVarianten(this.getFalkner());
        this.addAlleVarianten(this.getHundefuehrer());
        this.addAlleVarianten(this.getZureiter());
        this.addAlleVarianten(this.getChimaerenbaendiger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getTierbaendigerVariante());
        this.addMoeglicheVariante(this.getFalkner());
        this.addMoeglicheVariante(this.getHundefuehrer());
        this.addMoeglicheVariante(this.getZureiter());
        this.addMoeglicheVariante(this.getChimaerenbaendiger());
    }
}

