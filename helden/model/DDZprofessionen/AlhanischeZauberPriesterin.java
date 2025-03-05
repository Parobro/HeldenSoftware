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
import helden.model.DDZprofessionen.zauberpriesterin.Zauberpriesterin;
import java.util.ArrayList;

public class AlhanischeZauberPriesterin
extends BasisDDZProfessionMitGeweihter {
    private Zauberpriesterin \u00d3\u00f4\u00d8O00;

    public AlhanischeZauberPriesterin() {
    }

    public AlhanischeZauberPriesterin(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P151";
    }

    public P getZauberPriesterin() {
        if (this.\u00d3\u00f4\u00d8O00 == null) {
            this.\u00d3\u00f4\u00d8O00 = new Zauberpriesterin();
        }
        return this.\u00d3\u00f4\u00d8O00;
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
        stringBuffer.append("Alhanische Zauberpriesterin");
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getZauberPriesterin());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getZauberPriesterin());
    }
}

