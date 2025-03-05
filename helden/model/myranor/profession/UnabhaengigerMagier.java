/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.unabhaengigermagier.UnabhaengigerMagierVariante;
import java.util.Iterator;

public class UnabhaengigerMagier
extends BasisTraditionsaufsaetze {
    private P nullpublicint;

    public UnabhaengigerMagier() {
    }

    public UnabhaengigerMagier(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P205";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getUnabhaengigerMagier() {
        if (this.nullpublicint == null) {
            this.nullpublicint = new UnabhaengigerMagierVariante();
        }
        return this.nullpublicint;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Unabh\u00e4ngiger Magier");
        } else {
            stringBuffer.append("Unabh\u00e4ngige Magierin");
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
        this.addAlleVarianten(this.getUnabhaengigerMagier());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getUnabhaengigerMagier());
    }
}

