/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.domestik.Erzieher;
import helden.model.profession.domestik.Hausdiener;
import helden.model.profession.domestik.Hausknecht;
import helden.model.profession.domestik.Haussklave;
import helden.model.profession.domestik.HaussklaveAlAnfa;
import helden.model.profession.domestik.Kutscher;
import helden.model.profession.domestik.Leibdiener;
import helden.model.profession.varianten.DraconiterProfanerZweig;
import java.util.ArrayList;

public class Domestik
extends L {
    private P O\u00d5\u00d5O00;
    private P ifreturnint;
    private P \u00d8\u00d4\u00d5O00;
    private P returnreturnint;
    private P \u00d5\u00d4\u00d5O00;
    private P \u00f8\u00d4\u00d5O00;
    private P \u00f5\u00d4\u00d5O00;
    private P \u00f4\u00d4\u00d5O00;

    public Domestik() {
    }

    public Domestik(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getDraconiter());
        return arrayList;
    }

    public P getDraconiter() {
        if (this.\u00f4\u00d4\u00d5O00 == null) {
            this.\u00f4\u00d4\u00d5O00 = new DraconiterProfanerZweig();
        }
        return this.\u00f4\u00d4\u00d5O00;
    }

    public P getErzieher() {
        if (this.\u00f5\u00d4\u00d5O00 == null) {
            this.\u00f5\u00d4\u00d5O00 = new Erzieher();
        }
        return this.\u00f5\u00d4\u00d5O00;
    }

    public P getHausdiener() {
        if (this.O\u00d5\u00d5O00 == null) {
            this.O\u00d5\u00d5O00 = new Hausdiener();
        }
        return this.O\u00d5\u00d5O00;
    }

    public P getHausknecht() {
        if (this.returnreturnint == null) {
            this.returnreturnint = new Hausknecht();
        }
        return this.returnreturnint;
    }

    public P getHaussklave() {
        if (this.ifreturnint == null) {
            this.ifreturnint = new Haussklave();
        }
        return this.ifreturnint;
    }

    public P getHaussklaveAlAnfa() {
        if (this.\u00d8\u00d4\u00d5O00 == null) {
            this.\u00d8\u00d4\u00d5O00 = new HaussklaveAlAnfa();
        }
        return this.\u00d8\u00d4\u00d5O00;
    }

    @Override
    public String getID() {
        return "P15";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getKutscher() {
        if (this.\u00f8\u00d4\u00d5O00 == null) {
            this.\u00f8\u00d4\u00d5O00 = new Kutscher();
        }
        return this.\u00f8\u00d4\u00d5O00;
    }

    public P getLeibdiener() {
        if (this.\u00d5\u00d4\u00d5O00 == null) {
            this.\u00d5\u00d4\u00d5O00 = new Leibdiener();
        }
        return this.\u00d5\u00d4\u00d5O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        if (p2 == null || p2.equals(this.getHaussklave()) || p2.equals(this.getHaussklaveAlAnfa())) {
            return super.getZusatzVarianten(p2);
        }
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList2 = new ArrayList<P>();
        arrayList2.add(this.getDraconiter());
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Domestik");
        } else {
            stringBuffer.append("Domestikin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getHausdiener());
        this.addAlleVarianten(this.getHaussklave());
        this.addAlleVarianten(this.getHausknecht());
        this.addAlleVarianten(this.getLeibdiener());
        this.addAlleVarianten(this.getKutscher());
        this.addAlleVarianten(this.getErzieher());
        this.addAlleVarianten(this.getHaussklaveAlAnfa());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getHausdiener());
        this.addMoeglicheVariante(this.getHaussklave());
        this.addMoeglicheVariante(this.getHaussklaveAlAnfa());
        this.addMoeglicheVariante(this.getHausknecht());
        this.addMoeglicheVariante(this.getLeibdiener());
        this.addMoeglicheVariante(this.getKutscher());
    }
}

