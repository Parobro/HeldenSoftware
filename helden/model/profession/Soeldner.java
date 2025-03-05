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
import helden.model.profession.soeldner.Artillerist;
import helden.model.profession.soeldner.BerittenerSchuetze;
import helden.model.profession.soeldner.Leibwaechter;
import helden.model.profession.soeldner.LeichteReiterei;
import helden.model.profession.soeldner.LeichtesFussvolk;
import helden.model.profession.soeldner.LeichtesFussvolk2;
import helden.model.profession.soeldner.PremerSeesoeldner;
import helden.model.profession.soeldner.Sappeur;
import helden.model.profession.soeldner.Schlachtreiter;
import helden.model.profession.soeldner.Schuetze;
import helden.model.profession.soeldner.SchweresFussvolk;
import helden.model.profession.soeldner.Seesoeldner;
import helden.model.profession.soeldner.SklavenAufseher;
import helden.model.profession.varianten.RekkerBogskari;
import helden.model.profession.varianten.RekkerFotskari;
import helden.model.profession.varianten.RekkerHerverkmader;
import helden.model.profession.varianten.RekkerMangskari;
import helden.model.profession.varianten.RekkerRiddari;
import helden.model.profession.varianten.RekkerSjahskari;
import java.util.ArrayList;

public class Soeldner
extends L {
    private P \u00d3\u00d8\u00d4O00;
    private P o\u00d8\u00d4O00;
    private P \u00f8\u00d6\u00d4O00;
    private P \u00d8\u00d6\u00d4O00;
    private P \u00d5\u00d8\u00d4O00;
    private P nullinterfacenull;
    private P O\u00f4\u00d4O00;
    private P \u00f5\u00d8\u00d4O00;
    private P \u00f4\u00d8\u00d4O00;
    private P \u00f8\u00d8\u00d4O00;
    private P \u00d4\u00d8\u00d4O00;
    private P Stringinterfacenull;
    private P privateinterfacenull;
    private P forinterfacenull;
    private P O\u00d8\u00d4O00;
    private P o\u00f4\u00d4O00;
    private P \u00d8\u00d8\u00d4O00;
    private P \u00f5\u00d6\u00d4O00;
    private P \u00f4\u00d6\u00d4O00;

    public Soeldner() {
    }

    public Soeldner(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getRekkerBogskari());
        arrayList.add(this.getRekkerFotskari());
        arrayList.add(this.getRekkerHerverkmader());
        arrayList.add(this.getRekkerMangskari());
        arrayList.add(this.getRekkerRiddari());
        arrayList.add(this.getRekkerSjahskari());
        return arrayList;
    }

    public P getArtillerist() {
        if (this.nullinterfacenull == null) {
            this.nullinterfacenull = new Artillerist();
        }
        return this.nullinterfacenull;
    }

    public P getBerittenerSchuetze() {
        if (this.\u00d5\u00d8\u00d4O00 == null) {
            this.\u00d5\u00d8\u00d4O00 = new BerittenerSchuetze();
        }
        return this.\u00d5\u00d8\u00d4O00;
    }

    @Override
    public String getID() {
        return "P88";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getLeibwaechter() {
        if (this.\u00f4\u00d8\u00d4O00 == null) {
            this.\u00f4\u00d8\u00d4O00 = new Leibwaechter();
        }
        return this.\u00f4\u00d8\u00d4O00;
    }

    public P getLeichteReiterei() {
        if (this.\u00f8\u00d6\u00d4O00 == null) {
            this.\u00f8\u00d6\u00d4O00 = new LeichteReiterei();
        }
        return this.\u00f8\u00d6\u00d4O00;
    }

    public P getLeichtesFussvolk() {
        if (this.o\u00d8\u00d4O00 == null) {
            this.o\u00d8\u00d4O00 = new LeichtesFussvolk();
        }
        return this.o\u00d8\u00d4O00;
    }

    public P getLeichtesFussvolk2() {
        if (this.privateinterfacenull == null) {
            this.privateinterfacenull = new LeichtesFussvolk2();
        }
        return this.privateinterfacenull;
    }

    public P getPremerSeesoeldner() {
        if (this.\u00d4\u00d8\u00d4O00 == null) {
            this.\u00d4\u00d8\u00d4O00 = new PremerSeesoeldner();
        }
        return this.\u00d4\u00d8\u00d4O00;
    }

    public P getRekkerBogskari() {
        if (this.forinterfacenull == null) {
            this.forinterfacenull = new RekkerBogskari();
        }
        return this.forinterfacenull;
    }

    public P getRekkerFotskari() {
        if (this.O\u00d8\u00d4O00 == null) {
            this.O\u00d8\u00d4O00 = new RekkerFotskari();
        }
        return this.O\u00d8\u00d4O00;
    }

    public P getRekkerHerverkmader() {
        if (this.o\u00f4\u00d4O00 == null) {
            this.o\u00f4\u00d4O00 = new RekkerHerverkmader();
        }
        return this.o\u00f4\u00d4O00;
    }

    public P getRekkerMangskari() {
        if (this.\u00d8\u00d8\u00d4O00 == null) {
            this.\u00d8\u00d8\u00d4O00 = new RekkerMangskari();
        }
        return this.\u00d8\u00d8\u00d4O00;
    }

    public P getRekkerRiddari() {
        if (this.\u00f5\u00d6\u00d4O00 == null) {
            this.\u00f5\u00d6\u00d4O00 = new RekkerRiddari();
        }
        return this.\u00f5\u00d6\u00d4O00;
    }

    public P getRekkerSjahskari() {
        if (this.\u00f4\u00d6\u00d4O00 == null) {
            this.\u00f4\u00d6\u00d4O00 = new RekkerSjahskari();
        }
        return this.\u00f4\u00d6\u00d4O00;
    }

    public P getSappeur() {
        if (this.O\u00f4\u00d4O00 == null) {
            this.O\u00f4\u00d4O00 = new Sappeur();
        }
        return this.O\u00f4\u00d4O00;
    }

    public P getSchlachtreiter() {
        if (this.Stringinterfacenull == null) {
            this.Stringinterfacenull = new Schlachtreiter();
        }
        return this.Stringinterfacenull;
    }

    public P getSchuetze() {
        if (this.\u00d8\u00d6\u00d4O00 == null) {
            this.\u00d8\u00d6\u00d4O00 = new Schuetze();
        }
        return this.\u00d8\u00d6\u00d4O00;
    }

    public P getSchweresFussvolk() {
        if (this.\u00d3\u00d8\u00d4O00 == null) {
            this.\u00d3\u00d8\u00d4O00 = new SchweresFussvolk();
        }
        return this.\u00d3\u00d8\u00d4O00;
    }

    public P getSeesoeldner() {
        if (this.\u00f5\u00d8\u00d4O00 == null) {
            this.\u00f5\u00d8\u00d4O00 = new Seesoeldner();
        }
        return this.\u00f5\u00d8\u00d4O00;
    }

    public P getSklavenAufseher() {
        if (this.\u00f8\u00d8\u00d4O00 == null) {
            this.\u00f8\u00d8\u00d4O00 = new SklavenAufseher();
        }
        return this.\u00f8\u00d8\u00d4O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        if (p2 == null) {
            return super.getZusatzVarianten(p2);
        }
        if (p2.equals(this.getPremerSeesoeldner())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList2 = new ArrayList<P>();
            arrayList2.add(new KeineWahl());
            arrayList2.add(this.getRekkerBogskari());
            arrayList2.add(this.getRekkerFotskari());
            arrayList2.add(this.getRekkerHerverkmader());
            arrayList2.add(this.getRekkerMangskari());
            arrayList2.add(this.getRekkerRiddari());
            arrayList2.add(this.getRekkerSjahskari());
            arrayList.add(arrayList2);
            return arrayList;
        }
        return super.getZusatzVarianten(p2);
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("S\u00f6ldner");
        } else {
            stringBuffer.append("S\u00f6ldnerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append("/");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getSchweresFussvolk());
        this.addAlleVarianten(this.getLeichtesFussvolk());
        this.addAlleVarianten(this.getLeichteReiterei());
        this.addAlleVarianten(this.getSchuetze());
        this.addAlleVarianten(this.getBerittenerSchuetze());
        this.addAlleVarianten(this.getSappeur());
        this.addAlleVarianten(this.getArtillerist());
        this.addAlleVarianten(this.getSeesoeldner());
        this.addAlleVarianten(this.getLeibwaechter());
        this.addAlleVarianten(this.getSklavenAufseher());
        this.addAlleVarianten(this.getPremerSeesoeldner());
        this.addAlleVarianten(this.getSchlachtreiter());
        this.addAlleVarianten(this.getLeichtesFussvolk2());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getSchweresFussvolk());
        this.addMoeglicheVariante(this.getLeichtesFussvolk());
        this.addMoeglicheVariante(this.getLeichteReiterei());
        this.addMoeglicheVariante(this.getSchuetze());
        this.addMoeglicheVariante(this.getBerittenerSchuetze());
        this.addMoeglicheVariante(this.getSappeur());
        this.addMoeglicheVariante(this.getArtillerist());
        this.addMoeglicheVariante(this.getSeesoeldner());
        this.addMoeglicheVariante(this.getLeibwaechter());
        this.addMoeglicheVariante(this.getSchlachtreiter());
        this.addMoeglicheVariante(this.getLeichtesFussvolk2());
    }
}

