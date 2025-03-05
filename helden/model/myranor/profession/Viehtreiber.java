/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.viehtreiber.ViehtreiberVariante;
import java.util.Iterator;

public class Viehtreiber
extends L {
    private P \u00f80\u00d6O00;

    public Viehtreiber() {
    }

    public Viehtreiber(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P178";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getViehtreiber() {
        if (this.\u00f80\u00d6O00 == null) {
            this.\u00f80\u00d6O00 = new ViehtreiberVariante();
        }
        return this.\u00f80\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Viehtreiber");
        } else {
            stringBuffer.append("Viehtreiber");
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
        this.addAlleVarianten(this.getViehtreiber());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getViehtreiber());
    }
}

