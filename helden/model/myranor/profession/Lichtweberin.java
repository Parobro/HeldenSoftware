/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.lichtweberin.LichtweberinVariante;
import java.util.Iterator;

public class Lichtweberin
extends BasisTraditionsaufsaetze {
    private P O\u00d5\u00d6O00;

    public Lichtweberin() {
    }

    public Lichtweberin(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P186";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getLichtweberin() {
        if (this.O\u00d5\u00d6O00 == null) {
            this.O\u00d5\u00d6O00 = new LichtweberinVariante();
        }
        return this.O\u00d5\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Lichtweberin");
        } else {
            stringBuffer.append("Lichtweberin");
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
        this.addAlleVarianten(this.getLichtweberin());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getLichtweberin());
    }
}

