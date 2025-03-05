/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.wanderhaendler.WanderhaendlerVariante;
import java.util.Iterator;

public class Wanderhaendler
extends L {
    private P OO\u00d6O00;

    public Wanderhaendler() {
    }

    public Wanderhaendler(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P179";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getWanderhaendler() {
        if (this.OO\u00d6O00 == null) {
            this.OO\u00d6O00 = new WanderhaendlerVariante();
        }
        return this.OO\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Wanderh\u00e4ndler");
        } else {
            stringBuffer.append("Wanderh\u00e4ndler");
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
        this.addAlleVarianten(this.getWanderhaendler());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getWanderhaendler());
    }
}

