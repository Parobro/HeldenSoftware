/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.KeineWahl;
import helden.model.profession.gardist.Akademiegardist;
import helden.model.profession.gardist.AranischerSippenkrieger;
import helden.model.profession.gardist.Bogenschuetze;
import helden.model.profession.gardist.Dorfbuettel;
import helden.model.profession.gardist.Enqui;
import helden.model.profession.gardist.Schliesser;
import helden.model.profession.gardist.Stadtgardist;
import helden.model.profession.gardist.Strassenwaechter;
import helden.model.profession.gardist.TempelgardistStadtDesSchweigens;
import helden.model.profession.varianten.DraconiterProfanerZweig;
import helden.model.profession.varianten.RekkerBogskari;
import helden.model.profession.varianten.RekkerFotskari;
import helden.model.profession.varianten.RekkerHerverkmader;
import helden.model.profession.varianten.RekkerMangskari;
import helden.model.profession.varianten.RekkerRiddari;
import helden.model.profession.varianten.RekkerSjahskari;
import java.util.ArrayList;

public class Gardist
extends L {
    private P \u00f5\u00f5oO00;
    private P \u00f8\u00f6oO00;
    private P forfloatvoid;
    private P \u00d3\u00f6oO00;
    private P nullfloatvoid;
    private P \u00f5\u00f6oO00;
    private P Stringfloatvoid;
    private P \u00d8\u00f6oO00;
    private P \u00d4\u00f6oO00;
    private P \u00f4\u00f5oO00;
    private P \u00d5\u00f6oO00;
    private P privatefloatvoid;
    private P o\u00f6oO00;
    private P \u00f4\u00f6oO00;
    private P O\u00f6oO00;
    private P \u00f8\u00f5oO00;

    public Gardist() {
    }

    public Gardist(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAkademiegardist() {
        if (this.nullfloatvoid == null) {
            this.nullfloatvoid = new Akademiegardist();
        }
        return this.nullfloatvoid;
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getDraconiter());
        arrayList.add(this.getRekkerBogskari());
        arrayList.add(this.getRekkerFotskari());
        arrayList.add(this.getRekkerHerverkmader());
        arrayList.add(this.getRekkerMangskari());
        arrayList.add(this.getRekkerRiddari());
        arrayList.add(this.getRekkerSjahskari());
        return arrayList;
    }

    public P getAranischerSippenkrieger() {
        if (this.\u00f5\u00f6oO00 == null) {
            this.\u00f5\u00f6oO00 = new AranischerSippenkrieger();
        }
        return this.\u00f5\u00f6oO00;
    }

    public P getBogenschuetze() {
        if (this.\u00d4\u00f6oO00 == null) {
            this.\u00d4\u00f6oO00 = new Bogenschuetze();
        }
        return this.\u00d4\u00f6oO00;
    }

    public P getDorfbuettel() {
        if (this.\u00f8\u00f6oO00 == null) {
            this.\u00f8\u00f6oO00 = new Dorfbuettel();
        }
        return this.\u00f8\u00f6oO00;
    }

    public P getDraconiter() {
        if (this.\u00f4\u00f5oO00 == null) {
            this.\u00f4\u00f5oO00 = new DraconiterProfanerZweig();
        }
        return this.\u00f4\u00f5oO00;
    }

    public P getEnqui() {
        if (this.\u00d8\u00f6oO00 == null) {
            this.\u00d8\u00f6oO00 = new Enqui();
        }
        return this.\u00d8\u00f6oO00;
    }

    @Override
    public String getID() {
        return "P25";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getRekkerBogskari() {
        if (this.\u00d5\u00f6oO00 == null) {
            this.\u00d5\u00f6oO00 = new RekkerBogskari();
        }
        return this.\u00d5\u00f6oO00;
    }

    public P getRekkerFotskari() {
        if (this.privatefloatvoid == null) {
            this.privatefloatvoid = new RekkerFotskari();
        }
        return this.privatefloatvoid;
    }

    public P getRekkerHerverkmader() {
        if (this.o\u00f6oO00 == null) {
            this.o\u00f6oO00 = new RekkerHerverkmader();
        }
        return this.o\u00f6oO00;
    }

    public P getRekkerMangskari() {
        if (this.\u00f4\u00f6oO00 == null) {
            this.\u00f4\u00f6oO00 = new RekkerMangskari();
        }
        return this.\u00f4\u00f6oO00;
    }

    public P getRekkerRiddari() {
        if (this.O\u00f6oO00 == null) {
            this.O\u00f6oO00 = new RekkerRiddari();
        }
        return this.O\u00f6oO00;
    }

    public P getRekkerSjahskari() {
        if (this.\u00f8\u00f5oO00 == null) {
            this.\u00f8\u00f5oO00 = new RekkerSjahskari();
        }
        return this.\u00f8\u00f5oO00;
    }

    public P getSchliesser() {
        if (this.\u00d3\u00f6oO00 == null) {
            this.\u00d3\u00f6oO00 = new Schliesser();
        }
        return this.\u00d3\u00f6oO00;
    }

    public P getStadtDesSchweigens() {
        if (this.Stringfloatvoid == null) {
            this.Stringfloatvoid = new TempelgardistStadtDesSchweigens();
        }
        return this.Stringfloatvoid;
    }

    public P getStadtgardist() {
        if (this.\u00f5\u00f5oO00 == null) {
            this.\u00f5\u00f5oO00 = new Stadtgardist();
        }
        return this.\u00f5\u00f5oO00;
    }

    public P getStrassenwaechter() {
        if (this.forfloatvoid == null) {
            this.forfloatvoid = new Strassenwaechter();
        }
        return this.forfloatvoid;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<P> arrayList;
        ArrayList<ArrayList<P>> arrayList2 = new ArrayList<ArrayList<P>>();
        if (p2 != null && !p2.equals(this.getEnqui()) && !p2.equals(this.getBogenschuetze())) {
            arrayList = new ArrayList<P>();
            arrayList.add(this.getDraconiter());
            arrayList2.add(arrayList);
        }
        if (p2 != null && p2.equals(this.getEnqui())) {
            arrayList2 = new ArrayList();
            arrayList = new ArrayList();
            arrayList.add(new KeineWahl());
            arrayList.add(this.getRekkerBogskari());
            arrayList.add(this.getRekkerFotskari());
            arrayList.add(this.getRekkerHerverkmader());
            arrayList.add(this.getRekkerMangskari());
            arrayList.add(this.getRekkerRiddari());
            arrayList.add(this.getRekkerSjahskari());
            arrayList2.add(arrayList);
        }
        return arrayList2;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Gardist");
        } else {
            stringBuffer.append("Gardistin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getStadtgardist());
        this.addAlleVarianten(this.getDorfbuettel());
        this.addAlleVarianten(this.getStrassenwaechter());
        this.addAlleVarianten(this.getSchliesser());
        this.addAlleVarianten(this.getAkademiegardist());
        this.addAlleVarianten(this.getAranischerSippenkrieger());
        this.addAlleVarianten(this.getStadtDesSchweigens());
        this.addAlleVarianten(this.getEnqui());
        this.addAlleVarianten(this.getBogenschuetze());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getStadtgardist());
        this.addMoeglicheVariante(this.getDorfbuettel());
        this.addMoeglicheVariante(this.getStrassenwaechter());
        this.addMoeglicheVariante(this.getSchliesser());
        this.addMoeglicheVariante(this.getAkademiegardist());
    }
}

