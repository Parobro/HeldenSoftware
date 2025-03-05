/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.tharun.profession.niedererazaraidesarkanzin.NiedererAzaraidesArkanZinVariante;
import java.util.Iterator;

public class NiedererAzaraidesArkanZin
extends L {
    private P o\u00f4\u00d6O00;

    public NiedererAzaraidesArkanZin() {
    }

    public NiedererAzaraidesArkanZin(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P234";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getNiedererAzaraidesArkanZin() {
        if (this.o\u00f4\u00d6O00 == null) {
            this.o\u00f4\u00d6O00 = new NiedererAzaraidesArkanZinVariante();
        }
        return this.o\u00f4\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Niederer Azarai des Arkan'Zin");
        } else {
            stringBuffer.append("Niederer Azarai des Arkan'Zin");
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
        this.addAlleVarianten(this.getNiedererAzaraidesArkanZin());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getNiedererAzaraidesArkanZin());
    }
}

