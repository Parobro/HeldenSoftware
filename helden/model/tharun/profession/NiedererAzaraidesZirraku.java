/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.tharun.profession.niedererazaraideszirraku.NiedererAzaraidesZirrakuVariante;
import helden.model.tharun.profession.niedererazaraideszirraku.ZirrakuIlshiVailen;
import java.util.Iterator;

public class NiedererAzaraidesZirraku
extends L {
    private P ifthisif;
    private ZirrakuIlshiVailen \u00f8\u00f5\u00d6O00;

    public NiedererAzaraidesZirraku() {
    }

    public NiedererAzaraidesZirraku(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P231";
    }

    @Override
    public super._o getKategorie() {
        return super._o.class;
    }

    public P getNiedererAzaraidesZirraku() {
        if (this.ifthisif == null) {
            this.ifthisif = new NiedererAzaraidesZirrakuVariante();
        }
        return this.ifthisif;
    }

    public P getZirrakuIlshiVailen() {
        if (this.\u00f8\u00f5\u00d6O00 == null) {
            this.\u00f8\u00f5\u00d6O00 = new ZirrakuIlshiVailen();
        }
        return this.\u00f8\u00f5\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Niederer Azarai des Zirraku");
        } else {
            stringBuffer.append("Niederer Azarai des Zirraku");
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
        this.addAlleVarianten(this.getNiedererAzaraidesZirraku());
        this.addAlleVarianten(this.getZirrakuIlshiVailen());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getNiedererAzaraidesZirraku());
        this.addMoeglicheVariante(this.getZirrakuIlshiVailen());
    }
}

