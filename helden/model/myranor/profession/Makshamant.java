/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.makshamant.MakshamantVariante;
import java.util.Iterator;

public class Makshamant
extends BasisTraditionsaufsaetze {
    private P \u00f8\u00d5\u00d6O00;

    public Makshamant() {
    }

    public Makshamant(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P194";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getMakshamant() {
        if (this.\u00f8\u00d5\u00d6O00 == null) {
            this.\u00f8\u00d5\u00d6O00 = new MakshamantVariante();
        }
        return this.\u00f8\u00d5\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Makshamant");
        } else {
            stringBuffer.append("Makshamant");
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
        this.addAlleVarianten(this.getMakshamant());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMakshamant());
    }
}

