/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.tempelwaechterkriegerpriester.TempelwaechterVariante;
import java.util.Iterator;

public class Tempelwaechter
extends L {
    private P \u00d40\u00d6O00;

    public Tempelwaechter() {
    }

    public Tempelwaechter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P183";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getTempelwaechterKriegerpriester() {
        if (this.\u00d40\u00d6O00 == null) {
            this.\u00d40\u00d6O00 = new TempelwaechterVariante();
        }
        return this.\u00d40\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Tempelw\u00e4chter");
        } else {
            stringBuffer.append("Tempelw\u00e4chter");
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
        this.addAlleVarianten(this.getTempelwaechterKriegerpriester());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getTempelwaechterKriegerpriester());
    }
}

