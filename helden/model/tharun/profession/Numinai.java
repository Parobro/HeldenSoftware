/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.tharun.profession.BasisProfessionTharun;
import helden.model.tharun.profession.numinai.NuminaiVariante;
import java.util.Iterator;

public class Numinai
extends BasisProfessionTharun {
    private P \u00d5\u00f5\u00d6O00;

    public Numinai() {
    }

    public Numinai(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P224";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getNuminai() {
        if (this.\u00d5\u00f5\u00d6O00 == null) {
            this.\u00d5\u00f5\u00d6O00 = new NuminaiVariante();
        }
        return this.\u00d5\u00f5\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Numinai");
        } else {
            stringBuffer.append("Numinai");
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
        this.addAlleVarianten(this.getNuminai());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getNuminai());
    }
}

