/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.medizinmann.MedizinmannVariante;
import java.util.Iterator;

public class Medizinmann
extends BasisTraditionsaufsaetze {
    private P \u00d3\u00d5\u00d6O00;

    public Medizinmann() {
    }

    public Medizinmann(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P195";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getMedizinmann() {
        if (this.\u00d3\u00d5\u00d6O00 == null) {
            this.\u00d3\u00d5\u00d6O00 = new MedizinmannVariante();
        }
        return this.\u00d3\u00d5\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Medizinmann");
        } else {
            stringBuffer.append("Medizinfrau");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer = new StringBuffer();
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getMedizinmann());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMedizinmann());
    }
}

