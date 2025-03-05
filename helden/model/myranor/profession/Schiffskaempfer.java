/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.myranor.profession.schiffskaempfer.SchiffskaempferVariante;
import java.util.Iterator;

public class Schiffskaempfer
extends L {
    private P \u00d4\u00f8\u00d5O00;

    public Schiffskaempfer() {
    }

    public Schiffskaempfer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public String getID() {
        return "P173";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    public P getSchiffskaempfer() {
        if (this.\u00d4\u00f8\u00d5O00 == null) {
            this.\u00d4\u00f8\u00d5O00 = new SchiffskaempferVariante();
        }
        return this.\u00d4\u00f8\u00d5O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Schiffsk\u00e4mpfer");
        } else {
            stringBuffer.append("Schiffsk\u00e4mpfer");
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
        this.addAlleVarianten(this.getSchiffskaempfer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getSchiffskaempfer());
    }
}

