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
import helden.model.DDZprofessionen.mudramul.ChaluqKandha;
import helden.model.DDZprofessionen.mudramul.YashHualay;
import helden.model.DDZprofessionen.mudramul.Yasra;
import java.util.ArrayList;

public class Mudramul
extends BasisDDZProfessionMitGeweihter {
    private P \u00f8\u00d4\u00f4O00;
    private P o\u00d5\u00f4O00;
    private P O\u00d5\u00f4O00;

    public Mudramul() {
    }

    public Mudramul(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getChaluqKandha() {
        if (this.\u00f8\u00d4\u00f4O00 == null) {
            this.\u00f8\u00d4\u00f4O00 = new ChaluqKandha();
        }
        return this.\u00f8\u00d4\u00f4O00;
    }

    @Override
    public String getID() {
        return "P142";
    }

    public P getYashHualay() {
        if (this.O\u00d5\u00f4O00 == null) {
            this.O\u00d5\u00f4O00 = new YashHualay();
        }
        return this.O\u00d5\u00f4O00;
    }

    public P getYasra() {
        if (this.o\u00d5\u00f4O00 == null) {
            this.o\u00d5\u00f4O00 = new Yasra();
        }
        return this.o\u00d5\u00f4O00;
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
        stringBuffer.append("Mudramul");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getChaluqKandha());
        this.addAlleVarianten(this.getYasra());
        this.addAlleVarianten(this.getYashHualay());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getChaluqKandha());
        this.addMoeglicheVariante(this.getYasra());
        this.addMoeglicheVariante(this.getYashHualay());
    }
}

