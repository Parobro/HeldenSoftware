/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.int.P;
import helden.framework.zauber.KonkreterZauber;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.kophta.ElBurum;
import helden.model.DDZprofessionen.kophta.Rashdul;
import helden.model.DDZprofessionen.kophta.YolFassar;
import java.util.ArrayList;

public class Kophta
extends BasisDDZProfessionMitGeweihter {
    private P oo\u00f4O00;
    private P \u00f8O\u00f4O00;
    private P Oo\u00f4O00;

    public Kophta() {
    }

    public Kophta(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getElburum() {
        if (this.oo\u00f4O00 == null) {
            this.oo\u00f4O00 = new ElBurum();
        }
        return this.oo\u00f4O00;
    }

    @Override
    public String getID() {
        return "P150";
    }

    public P getRashdul() {
        if (this.\u00f8O\u00f4O00 == null) {
            this.\u00f8O\u00f4O00 = new Rashdul();
        }
        return this.\u00f8O\u00f4O00;
    }

    public P getYolFassar() {
        if (this.Oo\u00f4O00 == null) {
            this.Oo\u00f4O00 = new YolFassar();
        }
        return this.Oo\u00f4O00;
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
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Kophta");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getElburum());
        this.addAlleVarianten(this.getRashdul());
        this.addAlleVarianten(this.getYolFassar());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getElburum());
        this.addMoeglicheVariante(this.getRashdul());
        this.addMoeglicheVariante(this.getYolFassar());
    }
}

