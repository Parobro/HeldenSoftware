/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.tharun.profession.niedererazaraidesnuminoru.NiedererAzaraidesNuminoruVariante;
import java.util.Iterator;

public class NiedererAzaraidesNuminoru
extends L {
    private P whilethisif;
    private NiedererAzaraidesNuminoruVariante \u00d3\u00f6\u00d6O00;

    public NiedererAzaraidesNuminoru() {
    }

    public NiedererAzaraidesNuminoru(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P235";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getNiedererAzaraidesNuminoru() {
        if (this.whilethisif == null) {
            this.whilethisif = new NiedererAzaraidesNuminoruVariante("Niederer Azarai des Numinoru", "Niederer Azarai des Numinoru", false, 6);
        }
        return this.whilethisif;
    }

    public P getNiedererAzaraidesNuminoruSeefahrer() {
        if (this.\u00d3\u00f6\u00d6O00 == null) {
            this.\u00d3\u00f6\u00d6O00 = new NiedererAzaraidesNuminoruVariante("Niederer Azarai des Numinoru / Seefahrer", "Niederer Azarai des Numinoru / Seefahrer", false, 10);
        }
        return this.\u00d3\u00f6\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Niederer Azarai des Numinoru");
        } else {
            stringBuffer.append("Niederer Azarai des Numinoru");
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
        this.addAlleVarianten(this.getNiedererAzaraidesNuminoru());
        this.addAlleVarianten(this.getNiedererAzaraidesNuminoruSeefahrer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getNiedererAzaraidesNuminoru());
        this.addMoeglicheVariante(this.getNiedererAzaraidesNuminoruSeefahrer());
    }
}

