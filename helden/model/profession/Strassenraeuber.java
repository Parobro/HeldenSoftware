/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.strassenraeuber.Bandit;
import helden.model.profession.strassenraeuber.Freischaerler;
import helden.model.profession.strassenraeuber.Kutschenraeuber;
import helden.model.profession.strassenraeuber.ThalusischerWegelagerer;
import helden.model.profession.strassenraeuber.Wegelagerer;
import helden.model.profession.varianten.FerkinaBesessener;
import java.util.ArrayList;

public class Strassenraeuber
extends L {
    private P returnnullint;
    private P \u00f5\u00d8\u00d5O00;
    private P ifnullint;
    private P \u00f4\u00d8\u00d5O00;
    private P \u00d5\u00d8\u00d5O00;
    private P \u00d8\u00d8\u00d5O00;

    public Strassenraeuber() {
    }

    public Strassenraeuber(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getBessene());
        return arrayList;
    }

    public P getBandit() {
        if (this.returnnullint == null) {
            this.returnnullint = new Bandit();
        }
        return this.returnnullint;
    }

    public P getBessene() {
        if (this.\u00d8\u00d8\u00d5O00 == null) {
            this.\u00d8\u00d8\u00d5O00 = new FerkinaBesessener();
        }
        return this.\u00d8\u00d8\u00d5O00;
    }

    public P getFreischaerler() {
        if (this.\u00f4\u00d8\u00d5O00 == null) {
            this.\u00f4\u00d8\u00d5O00 = new Freischaerler();
        }
        return this.\u00f4\u00d8\u00d5O00;
    }

    @Override
    public String getID() {
        return "P65";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getKutschenraeuber() {
        if (this.\u00f5\u00d8\u00d5O00 == null) {
            this.\u00f5\u00d8\u00d5O00 = new Kutschenraeuber();
        }
        return this.\u00f5\u00d8\u00d5O00;
    }

    public P getThalusischerWegelagerer() {
        if (this.\u00d5\u00d8\u00d5O00 == null) {
            this.\u00d5\u00d8\u00d5O00 = new ThalusischerWegelagerer();
        }
        return this.\u00d5\u00d8\u00d5O00;
    }

    public P getWegelagerer() {
        if (this.ifnullint == null) {
            this.ifnullint = new Wegelagerer();
        }
        return this.ifnullint;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList2 = new ArrayList<P>();
        arrayList2.add(this.getBessene());
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Stra\u00dfenr\u00e4uber");
        } else {
            stringBuffer.append("Stra\u00dfenr\u00e4uberin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBandit());
        this.addAlleVarianten(this.getKutschenraeuber());
        this.addAlleVarianten(this.getWegelagerer());
        this.addAlleVarianten(this.getThalusischerWegelagerer());
        this.addAlleVarianten(this.getFreischaerler());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBandit());
        this.addMoeglicheVariante(this.getKutschenraeuber());
        this.addMoeglicheVariante(this.getWegelagerer());
        this.addMoeglicheVariante(this.getThalusischerWegelagerer());
        this.addMoeglicheVariante(this.getFreischaerler());
    }
}

