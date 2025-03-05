/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.reiter.ReiterVariante;
import java.util.Iterator;

public class Reiter
extends L {
    private P Stringfloatint;

    public Reiter() {
    }

    public Reiter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P170";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getReiter() {
        if (this.Stringfloatint == null) {
            this.Stringfloatint = new ReiterVariante();
        }
        return this.Stringfloatint;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Reiter");
        } else {
            stringBuffer.append("Reiter");
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
        this.addAlleVarianten(this.getReiter());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getReiter());
    }
}

