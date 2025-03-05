/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.weihertaenzer.WeihertaenzerVariante;
import java.util.Iterator;

public class Weihertaenzer
extends BasisTraditionsaufsaetze {
    private P \u00f4\u00d5\u00d6O00;

    public Weihertaenzer() {
    }

    public Weihertaenzer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P213";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getWeihertaenzer() {
        if (this.\u00f4\u00d5\u00d6O00 == null) {
            this.\u00f4\u00d5\u00d6O00 = new WeihertaenzerVariante();
        }
        return this.\u00f4\u00d5\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Weihert\u00e4nzer");
        } else {
            stringBuffer.append("Weihert\u00e4nzerin");
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
        this.addAlleVarianten(this.getWeihertaenzer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getWeihertaenzer());
    }
}

