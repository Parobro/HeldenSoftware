/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.shindramatha.ShindramathaVariante;
import java.util.Iterator;

public class Shindramatha
extends BasisTraditionsaufsaetze {
    private P returnprivateint;

    public Shindramatha() {
    }

    public Shindramatha(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P203";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getShindramatha() {
        if (this.returnprivateint == null) {
            this.returnprivateint = new ShindramathaVariante();
        }
        return this.returnprivateint;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Shindramatha");
        } else {
            stringBuffer.append("Shindramatha");
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
        this.addAlleVarianten(this.getShindramatha());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getShindramatha());
    }
}

