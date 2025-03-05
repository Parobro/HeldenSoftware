/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.seefahrer.Matrose;
import helden.model.DDZprofessionen.seefahrer.Navigator;
import helden.model.DDZprofessionen.seefahrer.Pirat;
import helden.model.DDZprofessionen.seefahrer.Robbenjaeger;
import helden.model.DDZprofessionen.seefahrer.Walfaenger;

public class Seefahrer
extends BasisDDZProfessionMitGeweihter {
    private P O\u00f5\u00f4O00;
    private P \u00f4\u00f4\u00f4O00;
    private P Stringinterfaceif;
    private P \u00f8\u00f4\u00f4O00;
    private P \u00f5\u00f4\u00f4O00;

    public Seefahrer() {
    }

    public Seefahrer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P113";
    }

    public P getMatrose() {
        if (this.O\u00f5\u00f4O00 == null) {
            this.O\u00f5\u00f4O00 = new Matrose();
        }
        return this.O\u00f5\u00f4O00;
    }

    public P getNavigator() {
        if (this.\u00f5\u00f4\u00f4O00 == null) {
            this.\u00f5\u00f4\u00f4O00 = new Navigator();
        }
        return this.\u00f5\u00f4\u00f4O00;
    }

    public P getPirat() {
        if (this.\u00f4\u00f4\u00f4O00 == null) {
            this.\u00f4\u00f4\u00f4O00 = new Pirat();
        }
        return this.\u00f4\u00f4\u00f4O00;
    }

    public P getRobbenjaeger() {
        if (this.\u00f8\u00f4\u00f4O00 == null) {
            this.\u00f8\u00f4\u00f4O00 = new Robbenjaeger();
        }
        return this.\u00f8\u00f4\u00f4O00;
    }

    public P getWalfaenger() {
        if (this.Stringinterfaceif == null) {
            this.Stringinterfaceif = new Walfaenger();
        }
        return this.Stringinterfaceif;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Seefahrer");
        } else {
            stringBuffer.append("Seefahrerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(", ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getMatrose());
        this.addAlleVarianten(this.getPirat());
        this.addAlleVarianten(this.getNavigator());
        this.addAlleVarianten(this.getRobbenjaeger());
        this.addAlleVarianten(this.getWalfaenger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMatrose());
        this.addMoeglicheVariante(this.getPirat());
        this.addMoeglicheVariante(this.getNavigator());
        this.addMoeglicheVariante(this.getRobbenjaeger());
        this.addMoeglicheVariante(this.getWalfaenger());
    }
}

