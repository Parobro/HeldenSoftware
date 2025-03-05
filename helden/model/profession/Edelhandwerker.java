/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.edelhandwerker.Apothekarius;
import helden.model.profession.edelhandwerker.Baumeister;
import helden.model.profession.edelhandwerker.Drucker;
import helden.model.profession.edelhandwerker.Huettenkundiger;
import helden.model.profession.edelhandwerker.Mechanikus;
import helden.model.profession.edelhandwerker.Schiffbauer;
import helden.model.profession.edelhandwerker.TradSchiffbauer;
import helden.model.profession.edelhandwerker.Tresorbauer;
import helden.model.profession.edelhandwerker.Uhrmacher;
import helden.model.profession.varianten.DraconiterProfanerZweig;
import helden.model.profession.varianten.ViertelRunenzauberer;
import java.util.ArrayList;
import java.util.Iterator;

public class Edelhandwerker
extends L {
    private P \u00d5\u00f8oO00;
    private P returnforvoid;
    private P \u00d8\u00f8oO00;
    private P o0\u00d2O00;
    private P \u00f5\u00f8oO00;
    private P \u00f8\u00f8oO00;
    private P \u00f4\u00f8oO00;
    private P ifforvoid;
    private P whileforvoid;
    private P \u00d4\u00f8oO00;
    private P O0\u00d2O00;

    public Edelhandwerker() {
    }

    public Edelhandwerker(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getDraconiter());
        arrayList.add(this.getViertelRunenZauberer());
        return arrayList;
    }

    public P getApothekarius() {
        if (this.\u00d5\u00f8oO00 == null) {
            this.\u00d5\u00f8oO00 = new Apothekarius();
        }
        return this.\u00d5\u00f8oO00;
    }

    public P getBaumeister() {
        if (this.returnforvoid == null) {
            this.returnforvoid = new Baumeister();
        }
        return this.returnforvoid;
    }

    public P getDraconiter() {
        if (this.\u00d4\u00f8oO00 == null) {
            this.\u00d4\u00f8oO00 = new DraconiterProfanerZweig();
        }
        return this.\u00d4\u00f8oO00;
    }

    public P getDrucker() {
        if (this.\u00d8\u00f8oO00 == null) {
            this.\u00d8\u00f8oO00 = new Drucker();
        }
        return this.\u00d8\u00f8oO00;
    }

    public P getHuettenkundiger() {
        if (this.o0\u00d2O00 == null) {
            this.o0\u00d2O00 = new Huettenkundiger();
        }
        return this.o0\u00d2O00;
    }

    @Override
    public String getID() {
        return "P17";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getMechanikus() {
        if (this.\u00f5\u00f8oO00 == null) {
            this.\u00f5\u00f8oO00 = new Mechanikus();
        }
        return this.\u00f5\u00f8oO00;
    }

    public P getSchiffbauer() {
        if (this.\u00f8\u00f8oO00 == null) {
            this.\u00f8\u00f8oO00 = new Schiffbauer();
        }
        return this.\u00f8\u00f8oO00;
    }

    public P getTradSchiffbauer() {
        if (this.whileforvoid == null) {
            this.whileforvoid = new TradSchiffbauer();
        }
        return this.whileforvoid;
    }

    public P getTresorbauer() {
        if (this.\u00f4\u00f8oO00 == null) {
            this.\u00f4\u00f8oO00 = new Tresorbauer();
        }
        return this.\u00f4\u00f8oO00;
    }

    public P getUhrmacher() {
        if (this.ifforvoid == null) {
            this.ifforvoid = new Uhrmacher();
        }
        return this.ifforvoid;
    }

    public P getViertelRunenZauberer() {
        if (this.O0\u00d2O00 == null) {
            this.O0\u00d2O00 = new ViertelRunenzauberer();
        }
        return this.O0\u00d2O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        if (p2 == null) {
            return super.getZusatzVarianten(p2);
        }
        if (p2.equals(this.getApothekarius()) || p2.equals(this.getBaumeister())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList2 = new ArrayList<P>();
            arrayList2.add(this.getDraconiter());
            arrayList.add(arrayList2);
            return arrayList;
        }
        if (p2.equals(this.getSchiffbauer()) || p2.equals(this.getTradSchiffbauer())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList3 = new ArrayList<P>();
            arrayList3.add(this.getViertelRunenZauberer());
            arrayList.add(arrayList3);
            return arrayList;
        }
        return super.getZusatzVarianten(p2);
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Edelhandwerker");
        } else {
            stringBuffer.append("Edelhandwerkerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
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
        this.addAlleVarianten(this.getApothekarius());
        this.addAlleVarianten(this.getBaumeister());
        this.addAlleVarianten(this.getDrucker());
        this.addAlleVarianten(this.getHuettenkundiger());
        this.addAlleVarianten(this.getMechanikus());
        this.addAlleVarianten(this.getSchiffbauer());
        this.addAlleVarianten(this.getUhrmacher());
        this.addAlleVarianten(this.getTresorbauer());
        this.addAlleVarianten(this.getTradSchiffbauer());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getApothekarius());
        this.addMoeglicheVariante(this.getBaumeister());
        this.addMoeglicheVariante(this.getDrucker());
        this.addMoeglicheVariante(this.getHuettenkundiger());
        this.addMoeglicheVariante(this.getMechanikus());
        this.addMoeglicheVariante(this.getSchiffbauer());
        this.addMoeglicheVariante(this.getUhrmacher());
    }
}

