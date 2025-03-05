/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.tharun.profession.thuarischenahamkiim.ThuarischeNahamkiimVariante;
import java.util.Iterator;

public class ThuarischeNahamkiim
extends L {
    private P \u00d4\u00f6\u00d6O00;

    public ThuarischeNahamkiim() {
    }

    public ThuarischeNahamkiim(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P227";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getThuarischeNahamkiim() {
        if (this.\u00d4\u00f6\u00d6O00 == null) {
            this.\u00d4\u00f6\u00d6O00 = new ThuarischeNahamkiimVariante();
        }
        return this.\u00d4\u00f6\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Thuarische Nahamkiim");
        } else {
            stringBuffer.append("Thuarische Nahamkiim");
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
        this.addAlleVarianten(this.getThuarischeNahamkiim());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getThuarischeNahamkiim());
    }
}

