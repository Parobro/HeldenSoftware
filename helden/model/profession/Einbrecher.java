/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.einbrecher.EinbrecherVariante;
import helden.model.profession.einbrecher.Grabraeuber;
import java.util.Iterator;

public class Einbrecher
extends L {
    private P \u00d5o\u00d5O00;
    private P \u00d4o\u00d5O00;

    public Einbrecher() {
    }

    public Einbrecher(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getEinbrecher() {
        if (this.\u00d5o\u00d5O00 == null) {
            this.\u00d5o\u00d5O00 = new EinbrecherVariante();
        }
        return this.\u00d5o\u00d5O00;
    }

    public P getGrabraeuber() {
        if (this.\u00d4o\u00d5O00 == null) {
            this.\u00d4o\u00d5O00 = new Grabraeuber();
        }
        return this.\u00d4o\u00d5O00;
    }

    @Override
    public String getID() {
        return "P18";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.varianteGewaehlt()) {
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        if (stringBuffer.toString().equals("")) {
            return "Einbrecher";
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getEinbrecher());
        this.addAlleVarianten(this.getGrabraeuber());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getEinbrecher());
        this.addMoeglicheVariante(this.getGrabraeuber());
    }
}

