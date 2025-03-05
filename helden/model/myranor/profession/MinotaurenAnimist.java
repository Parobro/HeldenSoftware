/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.minotaurenanimist.Geisterkalb;
import helden.model.myranor.profession.minotaurenanimist.Hornherr;
import java.util.Iterator;

public class MinotaurenAnimist
extends BasisTraditionsaufsaetze {
    private P thisinterfaceint;
    private P \u00d5\u00d8\u00d6O00;

    public MinotaurenAnimist() {
    }

    public MinotaurenAnimist(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getGeisterkalb() {
        if (this.\u00d5\u00d8\u00d6O00 == null) {
            this.\u00d5\u00d8\u00d6O00 = new Geisterkalb();
        }
        return this.\u00d5\u00d8\u00d6O00;
    }

    public P getHornherr() {
        if (this.thisinterfaceint == null) {
            this.thisinterfaceint = new Hornherr();
        }
        return this.thisinterfaceint;
    }

    @Override
    public String getID() {
        return "P218";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Minotauren-Animist");
        } else {
            stringBuffer.append("Minotauren-Animistin");
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
        this.addAlleVarianten(this.getHornherr());
        this.addAlleVarianten(this.getGeisterkalb());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHornherr());
        this.addMoeglicheVariante(this.getGeisterkalb());
    }
}

