/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.shanwada.ShanwadaVariante;
import java.util.Iterator;

public class Shanwada
extends BasisTraditionsaufsaetze {
    private P O\u00d8\u00d6O00;

    public Shanwada() {
    }

    public Shanwada(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P201";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getShanwada() {
        if (this.O\u00d8\u00d6O00 == null) {
            this.O\u00d8\u00d6O00 = new ShanwadaVariante();
        }
        return this.O\u00d8\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Shanwada");
        } else {
            stringBuffer.append("Shanwada");
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
        this.addAlleVarianten(this.getShanwada());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getShanwada());
    }
}

