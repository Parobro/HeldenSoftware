/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.zharzhuri.ZharzhuriVariante;
import java.util.Iterator;

public class Zharzhuri
extends BasisTraditionsaufsaetze {
    private P \u00f4\u00d4\u00d6O00;

    public Zharzhuri() {
    }

    public Zharzhuri(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P208";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getZharzhuri() {
        if (this.\u00f4\u00d4\u00d6O00 == null) {
            this.\u00f4\u00d4\u00d6O00 = new ZharzhuriVariante();
        }
        return this.\u00f4\u00d4\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Zharzhuri");
        } else {
            stringBuffer.append("Zharzhuri");
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
        this.addAlleVarianten(this.getZharzhuri());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getZharzhuri());
    }
}

