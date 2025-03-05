/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.monddeuter.MonddeuterVariante;
import java.util.Iterator;

public class Monddeuter
extends BasisTraditionsaufsaetze {
    private P o\u00d6\u00d6O00;

    public Monddeuter() {
    }

    public Monddeuter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P196";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getMonddeuter() {
        if (this.o\u00d6\u00d6O00 == null) {
            this.o\u00d6\u00d6O00 = new MonddeuterVariante();
        }
        return this.o\u00d6\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Monddeuter");
        } else {
            stringBuffer.append("Monddeuterin");
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
        this.addAlleVarianten(this.getMonddeuter());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMonddeuter());
    }
}

