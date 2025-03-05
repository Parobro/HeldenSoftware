/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.schreiber.SchreiberVariante;
import java.util.Iterator;

public class Schreiber
extends L {
    private P \u00d8\u00f8\u00d5O00;

    public Schreiber() {
    }

    public Schreiber(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P156";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getSchreiber() {
        if (this.\u00d8\u00f8\u00d5O00 == null) {
            this.\u00d8\u00f8\u00d5O00 = new SchreiberVariante();
        }
        return this.\u00d8\u00f8\u00d5O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schreiber");
        } else {
            stringBuffer.append("Schreiber");
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
        this.addAlleVarianten(this.getSchreiber());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getSchreiber());
    }
}

