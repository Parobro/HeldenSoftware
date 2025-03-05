/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.tharun.profession.BasisProfessionTharun;
import helden.model.tharun.profession.maturai.MaturaiVariante;
import java.util.Iterator;

public class Maturai
extends BasisProfessionTharun {
    private P forinterfaceint;

    public Maturai() {
    }

    public Maturai(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P228";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getMaturai() {
        if (this.forinterfaceint == null) {
            this.forinterfaceint = new MaturaiVariante();
        }
        return this.forinterfaceint;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Maturai");
        } else {
            stringBuffer.append("Maturai");
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
        this.addAlleVarianten(this.getMaturai());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMaturai());
    }
}

