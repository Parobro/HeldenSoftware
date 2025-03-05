/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.feilscher.FeilscherVariante;
import java.util.Iterator;

public class Feilscher
extends BasisDDZProfessionMitGeweihter {
    private P thispublicif;

    public Feilscher() {
    }

    public Feilscher(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getFeilscher() {
        if (this.thispublicif == null) {
            this.thispublicif = new FeilscherVariante();
        }
        return this.thispublicif;
    }

    @Override
    public String getID() {
        return "P118";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istVeteranErlaubt() {
        return true;
    }

    @Override
    public boolean istZeitaufwendig() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Feilscher");
        } else {
            stringBuffer.append("Feilscher");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer = new StringBuffer();
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next().toString());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getFeilscher());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getFeilscher());
    }
}

