/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.schreiber.Amtsschreiber;
import helden.model.profession.schreiber.Kontorist;
import helden.model.profession.schreiber.Kopist;
import helden.model.profession.schreiber.Seshshemet;
import helden.model.profession.schreiber.VarianteSchreiber;
import helden.model.profession.varianten.DraconiterProfanerZweig;
import java.util.ArrayList;

public class Schreiber
extends L {
    private P \u00f5\u00f5\u00d5O00;
    private P privateintint;
    private P \u00f8\u00f5\u00d5O00;
    private P \u00f4\u00f5\u00d5O00;
    private P \u00d8\u00f5\u00d5O00;
    private P O\u00f6\u00d5O00;

    public Schreiber() {
    }

    public Schreiber(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getDraconiter());
        return arrayList;
    }

    public P getAmtsschreiber() {
        if (this.privateintint == null) {
            this.privateintint = new Amtsschreiber();
        }
        return this.privateintint;
    }

    public P getDraconiter() {
        if (this.O\u00f6\u00d5O00 == null) {
            this.O\u00f6\u00d5O00 = new DraconiterProfanerZweig();
        }
        return this.O\u00f6\u00d5O00;
    }

    @Override
    public String getID() {
        return "P57";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getKontorist() {
        if (this.\u00f4\u00f5\u00d5O00 == null) {
            this.\u00f4\u00f5\u00d5O00 = new Kontorist();
        }
        return this.\u00f4\u00f5\u00d5O00;
    }

    public P getKopist() {
        if (this.\u00f8\u00f5\u00d5O00 == null) {
            this.\u00f8\u00f5\u00d5O00 = new Kopist();
        }
        return this.\u00f8\u00f5\u00d5O00;
    }

    public P getSeshshemet() {
        if (this.\u00d8\u00f5\u00d5O00 == null) {
            this.\u00d8\u00f5\u00d5O00 = new Seshshemet();
        }
        return this.\u00d8\u00f5\u00d5O00;
    }

    public P getVarianteSchreiber() {
        if (this.\u00f5\u00f5\u00d5O00 == null) {
            this.\u00f5\u00f5\u00d5O00 = new VarianteSchreiber();
        }
        return this.\u00f5\u00f5\u00d5O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
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
            stringBuffer.append("Schreiber");
        } else {
            stringBuffer.append("Schreiberin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getVarianteSchreiber());
        this.addAlleVarianten(this.getAmtsschreiber());
        this.addAlleVarianten(this.getKopist());
        this.addAlleVarianten(this.getKontorist());
        this.addAlleVarianten(this.getSeshshemet());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getVarianteSchreiber());
        this.addMoeglicheVariante(this.getAmtsschreiber());
        this.addMoeglicheVariante(this.getKopist());
        this.addMoeglicheVariante(this.getKontorist());
    }
}

