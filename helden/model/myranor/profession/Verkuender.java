/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.verkuender.VerkuenderVariante;
import java.util.Iterator;

public class Verkuender
extends L {
    private P O0\u00d6O00;

    public Verkuender() {
    }

    public Verkuender(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P153";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getVerkuender() {
        if (this.O0\u00d6O00 == null) {
            this.O0\u00d6O00 = new VerkuenderVariante();
        }
        return this.O0\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Verk\u00fcnder");
        } else {
            stringBuffer.append("Verk\u00fcnder");
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
        this.addAlleVarianten(this.getVerkuender());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVerkuender());
    }
}

