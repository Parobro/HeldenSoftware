/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.ordnungshueter.OrdnungshueterVariante;
import java.util.Iterator;

public class Ordnungshueter
extends L {
    private P \u00f40\u00d6O00;

    public Ordnungshueter() {
    }

    public Ordnungshueter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P169";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getOrdnungshueter() {
        if (this.\u00f40\u00d6O00 == null) {
            this.\u00f40\u00d6O00 = new OrdnungshueterVariante();
        }
        return this.\u00f40\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Ordnungsh\u00fcter");
        } else {
            stringBuffer.append("Ordnungsh\u00fcter");
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
        this.addAlleVarianten(this.getOrdnungshueter());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getOrdnungshueter());
    }
}

