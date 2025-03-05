/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.Geschlecht;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.zauber.Zauber;

public class Heilari
extends L {
    private helden.model.profession.heilari.Heilari \u00d4\u00d8\u00d5O00;

    public Heilari() {
    }

    public Heilari(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        if (this.\u00d4\u00d8\u00d5O00.getMhGewaehlt() == null) {
            if (public_.\u00f4O0000().toString().equals(this.\u00d4\u00d8\u00d5O00.getUb().toString())) {
                M m = K.o00000(this.\u00d4\u00d8\u00d5O00.getZauber());
                m.o00000(this.getZauber(Zauber.\u00f8o\u00d4000));
                m.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d4000));
                m.o00000(this.getZauber(Zauber.returnwhilenew));
                super.addAutomatischerVorteil(m);
                this.\u00d4\u00d8\u00d5O00.setMhGewaehlt(false);
            } else {
                M<U> m = K.o00000();
                m.\u00d2o0000();
                m.o00000(voidsuper.\u00d5\u00d5\u00d6000);
                m.o00000(voidsuper.\u00f5\u00f5\u00d6000);
                m.o00000(voidsuper.o\u00d5\u00d6000);
                super.addAutomatischerVorteil(m);
                this.\u00d4\u00d8\u00d5O00.setMhGewaehlt(true);
            }
        } else {
            super.addAutomatischerVorteil(public_);
        }
    }

    public P getHeilari() {
        if (this.\u00d4\u00d8\u00d5O00 == null) {
            this.\u00d4\u00d8\u00d5O00 = new helden.model.profession.heilari.Heilari();
        }
        return this.\u00d4\u00d8\u00d5O00;
    }

    @Override
    public String getID() {
        return "P79";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.\u00f8O0000;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        return "Heilari (UdW)";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getHeilari());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHeilari());
    }
}

