/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.botenreiter.BeilunkerReiter;
import helden.model.profession.botenreiter.BlauePfeile;
import helden.model.profession.botenreiter.Botenlaeufer;
import helden.model.profession.botenreiter.Kaiserlicher;
import helden.model.profession.botenreiter.SilberneFalken;
import helden.model.profession.botenreiter.Stafettenlaeufer;
import helden.model.profession.botenreiter.VarianteBotenreiter;

public class Botenreiter
extends L {
    private P \u00f8\u00f5\u00d4O00;
    private P o\u00f6\u00d4O00;
    private P Stringsuperint;
    private P \u00f4\u00f5\u00d4O00;
    private P \u00f5\u00f5\u00d4O00;
    private P O\u00f6\u00d4O00;
    private P \u00d8\u00f5\u00d4O00;

    public Botenreiter() {
    }

    public Botenreiter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBeilunkerReiter() {
        if (this.o\u00f6\u00d4O00 == null) {
            this.o\u00f6\u00d4O00 = new BeilunkerReiter();
        }
        return this.o\u00f6\u00d4O00;
    }

    public P getBlauePfeile() {
        if (this.Stringsuperint == null) {
            this.Stringsuperint = new BlauePfeile();
        }
        return this.Stringsuperint;
    }

    public P getBotenlaeufer() {
        if (this.O\u00f6\u00d4O00 == null) {
            this.O\u00f6\u00d4O00 = new Botenlaeufer();
        }
        return this.O\u00f6\u00d4O00;
    }

    @Override
    public String getID() {
        return "P11";
    }

    public P getKaiserlicher() {
        if (this.\u00f5\u00f5\u00d4O00 == null) {
            this.\u00f5\u00f5\u00d4O00 = new Kaiserlicher();
        }
        return this.\u00f5\u00f5\u00d4O00;
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getSilberneFalken() {
        if (this.\u00f4\u00f5\u00d4O00 == null) {
            this.\u00f4\u00f5\u00d4O00 = new SilberneFalken();
        }
        return this.\u00f4\u00f5\u00d4O00;
    }

    public P getStafettenlaeufer() {
        if (this.\u00d8\u00f5\u00d4O00 == null) {
            this.\u00d8\u00f5\u00d4O00 = new Stafettenlaeufer();
        }
        return this.\u00d8\u00f5\u00d4O00;
    }

    public P getVarianteBotenreiter() {
        if (this.\u00f8\u00f5\u00d4O00 == null) {
            this.\u00f8\u00f5\u00d4O00 = new VarianteBotenreiter();
        }
        return this.\u00f8\u00f5\u00d4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Botenreiter");
        } else {
            stringBuffer.append("Botenreiterin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteBotenreiter());
        this.addAlleVarianten(this.getBeilunkerReiter());
        this.addAlleVarianten(this.getBlauePfeile());
        this.addAlleVarianten(this.getSilberneFalken());
        this.addAlleVarianten(this.getKaiserlicher());
        this.addAlleVarianten(this.getBotenlaeufer());
        this.addAlleVarianten(this.getStafettenlaeufer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteBotenreiter());
        this.addMoeglicheVariante(this.getBeilunkerReiter());
        this.addMoeglicheVariante(this.getBlauePfeile());
        this.addMoeglicheVariante(this.getSilberneFalken());
        this.addMoeglicheVariante(this.getKaiserlicher());
        this.addMoeglicheVariante(this.getBotenlaeufer());
    }
}

