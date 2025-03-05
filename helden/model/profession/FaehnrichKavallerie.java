/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.faehnrichKavallerie.BasisKavallerie;
import helden.model.profession.faehnrichKavallerie.Ragath;

public class FaehnrichKavallerie
extends L {
    private P o\u00d4\u00d5O00;
    private P newreturnint;

    public FaehnrichKavallerie() {
    }

    public FaehnrichKavallerie(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBasis() {
        if (this.o\u00d4\u00d5O00 == null) {
            this.o\u00d4\u00d5O00 = new BasisKavallerie();
        }
        return this.o\u00d4\u00d5O00;
    }

    @Override
    public String getID() {
        return "P89";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getRagath() {
        if (this.newreturnint == null) {
            this.newreturnint = new Ragath();
        }
        return this.newreturnint;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("F\u00e4hnrich der Kavallerie");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBasis());
        this.addAlleVarianten(this.getRagath());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBasis());
        this.addMoeglicheVariante(this.getRagath());
    }
}

