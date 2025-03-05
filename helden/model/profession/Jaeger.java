/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.jaeger.Fallensteller;
import helden.model.profession.jaeger.Robbenjaeger;
import helden.model.profession.jaeger.Stammesjaeger;
import helden.model.profession.jaeger.ThorwallerFallensteller;
import helden.model.profession.jaeger.VarianteJaeger;
import helden.model.profession.jaeger.Wildhueter;
import helden.model.profession.varianten.FerkinaBesessener;
import helden.model.profession.varianten.ThorwalerFallensteller;
import java.util.ArrayList;

public class Jaeger
extends L {
    private P privateObjectint;
    private P \u00d3o\u00d5O00;
    private P \u00f5O\u00d5O00;
    private P Oo\u00d5O00;
    private P \u00f4O\u00d5O00;
    private P \u00f8O\u00d5O00;
    private P newStringint;
    private P oo\u00d5O00;

    public Jaeger() {
    }

    public Jaeger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getBessene());
        arrayList.add(this.getThorwalerFallensteller());
        return arrayList;
    }

    public P getBessene() {
        if (this.\u00f8O\u00d5O00 == null) {
            this.\u00f8O\u00d5O00 = new FerkinaBesessener();
        }
        return this.\u00f8O\u00d5O00;
    }

    public P getFallensteller() {
        if (this.\u00d3o\u00d5O00 == null) {
            this.\u00d3o\u00d5O00 = new Fallensteller();
        }
        return this.\u00d3o\u00d5O00;
    }

    @Override
    public String getID() {
        return "P39";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    public P getRobbenjaeger() {
        if (this.Oo\u00d5O00 == null) {
            this.Oo\u00d5O00 = new Robbenjaeger();
        }
        return this.Oo\u00d5O00;
    }

    public P getStammesjaeger() {
        if (this.newStringint == null) {
            this.newStringint = new Stammesjaeger();
        }
        return this.newStringint;
    }

    public P getThorwalerFallensteller() {
        if (this.oo\u00d5O00 == null) {
            this.oo\u00d5O00 = new ThorwalerFallensteller();
        }
        return this.oo\u00d5O00;
    }

    public P getThorwallerFallensteller() {
        if (this.\u00f4O\u00d5O00 == null) {
            this.\u00f4O\u00d5O00 = new ThorwallerFallensteller();
        }
        return this.\u00f4O\u00d5O00;
    }

    public P getVarianteJaeger() {
        if (this.privateObjectint == null) {
            this.privateObjectint = new VarianteJaeger();
        }
        return this.privateObjectint;
    }

    public P getWildhueter() {
        if (this.\u00f5O\u00d5O00 == null) {
            this.\u00f5O\u00d5O00 = new Wildhueter();
        }
        return this.\u00f5O\u00d5O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        if (p2 == null) {
            return super.getZusatzVarianten(p2);
        }
        if (p2.equals(this.getRobbenjaeger())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList2 = new ArrayList<P>();
            arrayList2.add(this.getThorwalerFallensteller());
            arrayList.add(arrayList2);
            return arrayList;
        }
        if (p2.equals(this.getThorwalerFallensteller())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList3 = new ArrayList<P>();
            arrayList3.add(this.getRobbenjaeger());
            arrayList.add(arrayList3);
            return arrayList;
        }
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList4 = new ArrayList<P>();
        arrayList4.add(this.getBessene());
        arrayList.add(arrayList4);
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            StringBuffer stringBuffer = new StringBuffer("J\u00e4ger");
            if (!this.istVariante(this.getVarianteJaeger()) && this.varianteGewaehlt()) {
                stringBuffer.append(": ");
                stringBuffer.append(this.getVariante().toString());
            }
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer = new StringBuffer("J\u00e4gerin");
        if (!this.istVariante(this.getVarianteJaeger()) && this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteJaeger());
        this.addAlleVarianten(this.getFallensteller());
        this.addAlleVarianten(this.getWildhueter());
        this.addAlleVarianten(this.getRobbenjaeger());
        this.addAlleVarianten(this.getThorwallerFallensteller());
        this.addAlleVarianten(this.getStammesjaeger());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteJaeger());
        this.addMoeglicheVariante(this.getFallensteller());
        this.addMoeglicheVariante(this.getWildhueter());
        this.addMoeglicheVariante(this.getStammesjaeger());
    }
}

