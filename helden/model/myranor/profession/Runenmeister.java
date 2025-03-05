/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.runenmeister.RunenmeisterVariante;
import java.util.Iterator;

public class Runenmeister
extends BasisTraditionsaufsaetze {
    private P \u00f5\u00d4\u00d6O00;

    public Runenmeister() {
    }

    public Runenmeister(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P197";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getRunenmeister() {
        if (this.\u00f5\u00d4\u00d6O00 == null) {
            this.\u00f5\u00d4\u00d6O00 = new RunenmeisterVariante();
        }
        return this.\u00f5\u00d4\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Runenmeister");
        } else {
            stringBuffer.append("Runenmeisterin");
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
        this.addAlleVarianten(this.getRunenmeister());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getRunenmeister());
    }
}

