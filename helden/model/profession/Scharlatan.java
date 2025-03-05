/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.N;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.zauber.KonkreterZauber;
import helden.model.profession.scharlatan.Hofscharlatan;
import helden.model.profession.scharlatan.Jahrmarktszauberer;
import helden.model.profession.scharlatan.MagischerQuacksalber;
import helden.model.profession.scharlatan.ScharlatanischerSeher;
import helden.model.profession.scharlatan.Theaterzauberer;
import helden.model.profession.scharlatan.Trickbetrueger;
import java.util.ArrayList;

public class Scharlatan
extends L {
    private P \u00f4\u00d5\u00d4O00;
    private P \u00d8\u00d5\u00d4O00;
    private P O\u00d6\u00d4O00;
    private P ifprivatenull;
    private P \u00f8\u00d5\u00d4O00;
    private P \u00f5\u00d5\u00d4O00;

    public Scharlatan() {
    }

    public Scharlatan(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getHofscharlatan() {
        if (this.\u00d8\u00d5\u00d4O00 == null) {
            this.\u00d8\u00d5\u00d4O00 = new Hofscharlatan();
        }
        return this.\u00d8\u00d5\u00d4O00;
    }

    @Override
    public String getID() {
        return "P53";
    }

    public P getJahrmarktszauberer() {
        if (this.\u00f4\u00d5\u00d4O00 == null) {
            this.\u00f4\u00d5\u00d4O00 = new Jahrmarktszauberer();
        }
        return this.\u00f4\u00d5\u00d4O00;
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getMagischerQuacksalber() {
        if (this.O\u00d6\u00d4O00 == null) {
            this.O\u00d6\u00d4O00 = new MagischerQuacksalber();
        }
        return this.O\u00d6\u00d4O00;
    }

    public P getScharlatanischerSeher() {
        if (this.ifprivatenull == null) {
            this.ifprivatenull = new ScharlatanischerSeher();
        }
        return this.ifprivatenull;
    }

    public P getTheaterzauberer() {
        if (this.\u00f8\u00d5\u00d4O00 == null) {
            this.\u00f8\u00d5\u00d4O00 = new Theaterzauberer();
        }
        return this.\u00f8\u00d5\u00d4O00;
    }

    public P getTrickbetrueger() {
        if (this.\u00f5\u00d5\u00d4O00 == null) {
            this.\u00f5\u00d5\u00d4O00 = new Trickbetrueger();
        }
        return this.\u00f5\u00d5\u00d4O00;
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
        if (this.istMaennlich()) {
            stringBuffer.append("Scharlatan");
        } else {
            stringBuffer.append("Scharlatanin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getJahrmarktszauberer());
        this.addAlleVarianten(this.getHofscharlatan());
        this.addAlleVarianten(this.getMagischerQuacksalber());
        this.addAlleVarianten(this.getScharlatanischerSeher());
        this.addAlleVarianten(this.getTheaterzauberer());
        this.addAlleVarianten(this.getTrickbetrueger());
    }

    @Override
    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getJahrmarktszauberer());
        this.addMoeglicheVariante(this.getHofscharlatan());
        this.addMoeglicheVariante(this.getMagischerQuacksalber());
        this.addMoeglicheVariante(this.getScharlatanischerSeher());
        this.addMoeglicheVariante(this.getTheaterzauberer());
        this.addMoeglicheVariante(this.getTrickbetrueger());
    }
}

