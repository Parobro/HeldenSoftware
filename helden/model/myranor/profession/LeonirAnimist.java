/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.leoniranimist.Xarchash;
import helden.model.myranor.profession.leoniranimist.Xarfarash;
import java.util.Iterator;

public class LeonirAnimist
extends BasisTraditionsaufsaetze {
    private Xarchash whileprivateint;
    private P o\u00d8\u00d6O00;

    public LeonirAnimist() {
    }

    public LeonirAnimist(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P216";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getXarchash() {
        if (this.whileprivateint == null) {
            this.whileprivateint = new Xarchash();
        }
        return this.whileprivateint;
    }

    public P getXarfarash() {
        if (this.o\u00d8\u00d6O00 == null) {
            this.o\u00d8\u00d6O00 = new Xarfarash();
        }
        return this.o\u00d8\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Leonir-Animist");
        } else {
            stringBuffer.append("Leonir-Animistin");
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
        this.addAlleVarianten(this.getXarchash());
        this.addAlleVarianten(this.getXarfarash());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getXarchash());
        this.addMoeglicheVariante(this.getXarfarash());
    }
}

