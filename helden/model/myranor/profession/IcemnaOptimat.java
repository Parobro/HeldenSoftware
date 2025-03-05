/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.BasisTraditionsaufsaetze;
import helden.model.myranor.profession.icemnaoptimat.MaennlicherIcemnaVariante;
import helden.model.myranor.profession.icemnaoptimat.WeiblicheIcemnaVariante;
import java.util.Iterator;

public class IcemnaOptimat
extends BasisTraditionsaufsaetze {
    private WeiblicheIcemnaVariante \u00d3\u00d6\u00d6O00;
    private MaennlicherIcemnaVariante newprivateint;

    public IcemnaOptimat() {
    }

    public IcemnaOptimat(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P217";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getMaennlicherIcemna() {
        if (this.newprivateint == null) {
            this.newprivateint = new MaennlicherIcemnaVariante();
        }
        return this.newprivateint;
    }

    public P getWeiblicheIcemna() {
        if (this.\u00d3\u00d6\u00d6O00 == null) {
            this.\u00d3\u00d6\u00d6O00 = new WeiblicheIcemnaVariante();
        }
        return this.\u00d3\u00d6\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Icemna-Optimat");
        } else {
            stringBuffer.append("Icemna-Optimatin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
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
        this.addAlleVarianten(this.getMaennlicherIcemna());
        this.addAlleVarianten(this.getWeiblicheIcemna());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMaennlicherIcemna());
        this.addMoeglicheVariante(this.getWeiblicheIcemna());
    }
}

