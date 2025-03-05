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
import helden.model.profession.zaubertaenzer.AranischerMajuna;
import helden.model.profession.zaubertaenzer.AranischerMajunaMagisch;
import helden.model.profession.zaubertaenzer.Gaukler;
import helden.model.profession.zaubertaenzer.NovadischeSharisad;
import helden.model.profession.zaubertaenzer.NovadischeSharisadMagisch;
import helden.model.profession.zaubertaenzer.TulamidischeSharisad;
import helden.model.profession.zaubertaenzer.TulamidischeSharisadMagisch;
import helden.model.profession.zaubertaenzer.ZahorischerHazaqi;
import helden.model.profession.zaubertaenzer.ZahorischerHazaqiMagisch;
import java.util.ArrayList;

public class Zaubertaenzer
extends L {
    private P \u00f5\u00f8\u00d3O00;
    private P privatefloatnull;
    private P O0\u00d4O00;
    private P \u00f4\u00f8\u00d3O00;
    private P \u00d30\u00d4O00;
    private P \u00f8\u00f8\u00d3O00;
    private P newfornull;
    private P \u00d8\u00f8\u00d3O00;
    private P o0\u00d4O00;

    public Zaubertaenzer() {
    }

    public Zaubertaenzer(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getGaukler() {
        if (this.\u00d30\u00d4O00 == null) {
            this.\u00d30\u00d4O00 = new Gaukler();
        }
        return this.\u00d30\u00d4O00;
    }

    @Override
    public String getID() {
        return "P75";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getMajuna() {
        if (this.\u00f5\u00f8\u00d3O00 == null) {
            this.\u00f5\u00f8\u00d3O00 = new AranischerMajuna();
        }
        return this.\u00f5\u00f8\u00d3O00;
    }

    public P getMajunaMagisch() {
        if (this.\u00f8\u00f8\u00d3O00 == null) {
            this.\u00f8\u00f8\u00d3O00 = new AranischerMajunaMagisch();
        }
        return this.\u00f8\u00f8\u00d3O00;
    }

    public P getNovadischeSharisad() {
        if (this.privatefloatnull == null) {
            this.privatefloatnull = new NovadischeSharisad();
        }
        return this.privatefloatnull;
    }

    public P getNovadischeSharisadMagisch() {
        if (this.newfornull == null) {
            this.newfornull = new NovadischeSharisadMagisch();
        }
        return this.newfornull;
    }

    public P getTulamidischeSharisad() {
        if (this.O0\u00d4O00 == null) {
            this.O0\u00d4O00 = new TulamidischeSharisad();
        }
        return this.O0\u00d4O00;
    }

    public P getTulamidischeSharisadMagisch() {
        if (this.\u00d8\u00f8\u00d3O00 == null) {
            this.\u00d8\u00f8\u00d3O00 = new TulamidischeSharisadMagisch();
        }
        return this.\u00d8\u00f8\u00d3O00;
    }

    public P getZahorischerHazaqi() {
        if (this.\u00f4\u00f8\u00d3O00 == null) {
            this.\u00f4\u00f8\u00d3O00 = new ZahorischerHazaqi();
        }
        return this.\u00f4\u00f8\u00d3O00;
    }

    public P getZahorischerHazaqiMagisch() {
        if (this.o0\u00d4O00 == null) {
            this.o0\u00d4O00 = new ZahorischerHazaqiMagisch();
        }
        return this.o0\u00d4O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("T\u00e4nzer");
        } else {
            stringBuffer.append("T\u00e4nzerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getMajuna());
        this.addAlleVarianten(this.getNovadischeSharisad());
        this.addAlleVarianten(this.getTulamidischeSharisad());
        this.addAlleVarianten(this.getZahorischerHazaqi());
        this.addAlleVarianten(this.getGaukler());
        this.addAlleVarianten(this.getMajunaMagisch());
        this.addAlleVarianten(this.getNovadischeSharisadMagisch());
        this.addAlleVarianten(this.getTulamidischeSharisadMagisch());
        this.addAlleVarianten(this.getZahorischerHazaqiMagisch());
    }

    @Override
    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMajuna());
        this.addMoeglicheVariante(this.getNovadischeSharisad());
        this.addMoeglicheVariante(this.getTulamidischeSharisad());
        this.addMoeglicheVariante(this.getZahorischerHazaqi());
        this.addMoeglicheVariante(this.getGaukler());
        this.addMoeglicheVariante(this.getMajunaMagisch());
        this.addMoeglicheVariante(this.getNovadischeSharisadMagisch());
        this.addMoeglicheVariante(this.getTulamidischeSharisadMagisch());
        this.addMoeglicheVariante(this.getZahorischerHazaqiMagisch());
    }
}

