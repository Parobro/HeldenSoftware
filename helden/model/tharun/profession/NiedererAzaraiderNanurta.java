/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.tharun.profession.niedererazaraidernanurta.NiedererAzaraiderNanurtaVariante;
import java.util.Iterator;

public class NiedererAzaraiderNanurta
extends L {
    private NiedererAzaraiderNanurtaVariante \u00f4\u00f5\u00d6O00;
    private NiedererAzaraiderNanurtaVariante \u00f5\u00f5\u00d6O00;

    public NiedererAzaraiderNanurta() {
    }

    public NiedererAzaraiderNanurta(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P238";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getNiedererAzaraiderNanurtaM() {
        if (this.\u00f4\u00f5\u00d6O00 == null) {
            this.\u00f4\u00f5\u00d6O00 = new NiedererAzaraiderNanurtaVariante(Geschlecht.\u00d400000);
        }
        return this.\u00f4\u00f5\u00d6O00;
    }

    public P getNiedererAzaraiderNanurtaW() {
        if (this.\u00f5\u00f5\u00d6O00 == null) {
            this.\u00f5\u00f5\u00d6O00 = new NiedererAzaraiderNanurtaVariante(Geschlecht.\u00d300000);
        }
        return this.\u00f5\u00f5\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Niederer Azarai der Nanurta");
        } else {
            stringBuffer.append("Niedere Azarai der Nanurta");
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
        this.addAlleVarianten(this.getNiedererAzaraiderNanurtaM());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getNiedererAzaraiderNanurtaM());
    }
}

