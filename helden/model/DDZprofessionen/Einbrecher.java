/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.einbrecher.EinbrecherVariante;
import helden.model.DDZprofessionen.einbrecher.Grabraeuber;
import java.util.Iterator;

public class Einbrecher
extends BasisDDZProfessionMitGeweihter {
    private P newwhileif;
    private P o\u00d4\u00f4O00;

    public Einbrecher() {
    }

    public Einbrecher(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getEinbrecher() {
        if (this.newwhileif == null) {
            this.newwhileif = new EinbrecherVariante();
        }
        return this.newwhileif;
    }

    public P getGrabraeuber() {
        if (this.o\u00d4\u00f4O00 == null) {
            this.o\u00d4\u00f4O00 = new Grabraeuber();
        }
        return this.o\u00d4\u00f4O00;
    }

    @Override
    public String getID() {
        return "P124";
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

