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
import helden.model.DDZprofessionen.tochtersatu.CharismatischeVerfuehrerin;
import helden.model.DDZprofessionen.tochtersatu.HilfreichePriesterin;
import java.util.ArrayList;

public class TochterSatu
extends BasisDDZProfessionMitGeweihter {
    private P O\u00f8\u00d6O00;
    private P \u00f8\u00f6\u00d6O00;

    public TochterSatu() {
    }

    public TochterSatu(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P148";
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
        stringBuffer.append("Tochter der Satu");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.\u00f5\u00d2O000());
        this.addAlleVarianten(this.\u00f4\u00d2O000());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.\u00f5\u00d2O000());
        this.addMoeglicheVariante(this.\u00f4\u00d2O000());
    }

    private P \u00f4\u00d2O000() {
        if (this.\u00f8\u00f6\u00d6O00 == null) {
            this.\u00f8\u00f6\u00d6O00 = new CharismatischeVerfuehrerin();
        }
        return this.\u00f8\u00f6\u00d6O00;
    }

    private P \u00f5\u00d2O000() {
        if (this.O\u00f8\u00d6O00 == null) {
            this.O\u00f8\u00d6O00 = new HilfreichePriesterin();
        }
        return this.O\u00f8\u00d6O00;
    }
}

