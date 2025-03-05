/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.tharun.profession.niedererazaraidesshinxirit.NiedererAzaraidesShinXiritVariante;
import helden.model.tharun.profession.niedererazaraidesshinxirit.ShinXiritIlshiVailen;
import java.util.Iterator;

public class NiedererAzaraidesShinXirit
extends L {
    private P thissuperif;
    private ShinXiritIlshiVailen \u00d8\u00f6\u00d6O00;

    public NiedererAzaraidesShinXirit() {
    }

    public NiedererAzaraidesShinXirit(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P230";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getNiedererAzaraidesShinXirit() {
        if (this.thissuperif == null) {
            this.thissuperif = new NiedererAzaraidesShinXiritVariante();
        }
        return this.thissuperif;
    }

    public P getShinXiritIlshiVailen() {
        if (this.\u00d8\u00f6\u00d6O00 == null) {
            this.\u00d8\u00f6\u00d6O00 = new ShinXiritIlshiVailen();
        }
        return this.\u00d8\u00f6\u00d6O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Niederer Azarai des Shin-Xirit");
        } else {
            stringBuffer.append("Niederer Azarai des Shin-Xirit");
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
        this.addAlleVarianten(this.getNiedererAzaraidesShinXirit());
        this.addAlleVarianten(this.getShinXiritIlshiVailen());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getNiedererAzaraidesShinXirit());
        this.addMoeglicheVariante(this.getShinXiritIlshiVailen());
    }
}

