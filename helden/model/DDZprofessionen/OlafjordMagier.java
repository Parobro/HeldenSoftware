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
import helden.model.DDZprofessionen.magier.Olafjord;
import java.util.ArrayList;

public class OlafjordMagier
extends BasisDDZProfessionMitGeweihter {
    private P nullpublicif;

    public OlafjordMagier() {
    }

    public OlafjordMagier(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P115";
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
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.varianteGewaehlt()) {
            if (this.istMaennlich()) {
                stringBuilder.append("Magier aus Olafjord");
            } else {
                stringBuilder.append("Magierin aus Olafjord");
            }
        } else {
            stringBuilder.append(super.toString());
        }
        return stringBuilder.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.\u00f6\u00d2O000());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.\u00f6\u00d2O000());
    }

    private P \u00f6\u00d2O000() {
        if (this.nullpublicif == null) {
            this.nullpublicif = new Olafjord();
        }
        return this.nullpublicif;
    }
}

