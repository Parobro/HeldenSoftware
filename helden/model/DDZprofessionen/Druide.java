/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.druide.Haindruide;
import helden.model.DDZprofessionen.druide.HueterderMacht;
import helden.model.DDZprofessionen.druide.MehrerderMacht;
import helden.model.DDZprofessionen.druide.Sumupriester;

public class Druide
extends BasisDDZProfessionMitGeweihter {
    private P ifnewif;
    private P \u00f80\u00d8O00;
    private P \u00f50\u00d8O00;
    private P OO\u00d8O00;

    public Druide() {
    }

    public Druide(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getHaindruide() {
        if (this.ifnewif == null) {
            this.ifnewif = new Haindruide();
        }
        return this.ifnewif;
    }

    public P getHueterderMacht() {
        if (this.\u00f80\u00d8O00 == null) {
            this.\u00f80\u00d8O00 = new HueterderMacht();
        }
        return this.\u00f80\u00d8O00;
    }

    @Override
    public String getID() {
        return "P116";
    }

    public P getMehrerderMacht() {
        if (this.\u00f50\u00d8O00 == null) {
            this.\u00f50\u00d8O00 = new MehrerderMacht();
        }
        return this.\u00f50\u00d8O00;
    }

    public P getSumupriester() {
        if (this.OO\u00d8O00 == null) {
            this.OO\u00d8O00 = new Sumupriester();
        }
        return this.OO\u00d8O00;
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
            stringBuffer.append("Druide");
        } else {
            stringBuffer.append("Druidin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getHaindruide());
        this.addAlleVarianten(this.getHueterderMacht());
        this.addAlleVarianten(this.getMehrerderMacht());
        this.addAlleVarianten(this.getSumupriester());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHaindruide());
        this.addMoeglicheVariante(this.getHueterderMacht());
        this.addMoeglicheVariante(this.getMehrerderMacht());
        this.addMoeglicheVariante(this.getSumupriester());
    }
}

