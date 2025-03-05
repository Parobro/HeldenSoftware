/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.schamane.Achaz;
import helden.model.profession.schamane.BrenchiDun;
import helden.model.profession.schamane.FestumerGoblinSchamane;
import helden.model.profession.schamane.GraveshPriester;
import helden.model.profession.schamane.GraveshPriesterGeweiht;
import helden.model.profession.schamane.Kjaskjua;
import helden.model.profession.schamane.MedizinmannDarna;
import helden.model.profession.schamane.MedizinmannDschungelstaemme;
import helden.model.profession.schamane.MedizinmannMiniwatu;
import helden.model.profession.schamane.MedizinmannTocamuyac;
import helden.model.profession.schamane.MedizinmannUtulus;
import helden.model.profession.schamane.MedizinmannVerloreneStaemme;
import helden.model.profession.schamane.MedizinmannWudu;
import helden.model.profession.schamane.Nuranshar;
import helden.model.profession.schamane.NuransharMherech;
import helden.model.profession.schamane.NuransharShaiAian;
import helden.model.profession.schamane.NuransharThalusien;
import helden.model.profession.schamane.RakaiPriester;
import helden.model.profession.schamane.Shochzul;
import helden.model.profession.schamane.Skuldrun;
import helden.model.profession.schamane.SkuldrunHeiler;
import helden.model.profession.schamane.SkuldrunMammutSeher;
import helden.model.profession.schamane.SkuldrunZauberschmied;
import helden.model.profession.schamane.StammesGoblinSchamane;
import helden.model.profession.schamane.TairachPriester;

public class Schamane
extends L {
    private P nulldonull;
    private P newwhilenull;
    private P \u00d8o\u00d4O00;
    private P \u00f4\u00d2\u00d4O00;
    private P \u00f5\u00d2\u00d4O00;
    private P \u00d4\u00d2\u00d4O00;
    private P \u00d5\u00d2\u00d4O00;
    private P fordonull;
    private P oo\u00d4O00;
    private P \u00f5o\u00d4O00;
    private P \u00d3\u00d2\u00d4O00;
    private P \u00d3o\u00d4O00;
    private P \u00f8O\u00d4O00;
    private P \u00f8o\u00d4O00;
    private P ifwhilenull;
    private P \u00d5o\u00d4O00;
    private P o\u00d2\u00d4O00;
    private P \u00d4o\u00d4O00;
    private P returnwhilenull;
    private P privatedonull;
    private P \u00d8\u00d2\u00d4O00;
    private P Stringdonull;
    private P Oo\u00d4O00;
    private P \u00f4o\u00d4O00;
    private P O\u00d2\u00d4O00;

    public Schamane() {
    }

    public Schamane(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAchaz() {
        if (this.O\u00d2\u00d4O00 == null) {
            this.O\u00d2\u00d4O00 = new Achaz();
        }
        return this.O\u00d2\u00d4O00;
    }

    public P getBrenchiDun() {
        if (this.returnwhilenull == null) {
            this.returnwhilenull = new BrenchiDun();
        }
        return this.returnwhilenull;
    }

    public P getFestumerGoblinSchamane() {
        if (this.\u00f8O\u00d4O00 == null) {
            this.\u00f8O\u00d4O00 = new FestumerGoblinSchamane();
        }
        return this.\u00f8O\u00d4O00;
    }

    public P getGraveshPriester() {
        if (this.oo\u00d4O00 == null) {
            this.oo\u00d4O00 = new GraveshPriester();
        }
        return this.oo\u00d4O00;
    }

    public P getGraveshPriesterGeweiht() {
        if (this.\u00f5o\u00d4O00 == null) {
            this.\u00f5o\u00d4O00 = new GraveshPriesterGeweiht();
        }
        return this.\u00f5o\u00d4O00;
    }

    @Override
    public String getID() {
        return "P52";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getKjaskjua() {
        if (this.\u00d3o\u00d4O00 == null) {
            this.\u00d3o\u00d4O00 = new Kjaskjua();
        }
        return this.\u00d3o\u00d4O00;
    }

    public P getMedizinmannDarna() {
        if (this.\u00d5\u00d2\u00d4O00 == null) {
            this.\u00d5\u00d2\u00d4O00 = new MedizinmannDarna();
        }
        return this.\u00d5\u00d2\u00d4O00;
    }

    public P getMedizinmannDschungelstaemme() {
        if (this.newwhilenull == null) {
            this.newwhilenull = new MedizinmannDschungelstaemme();
        }
        return this.newwhilenull;
    }

    public P getMedizinmannMiniwatu() {
        if (this.\u00f5\u00d2\u00d4O00 == null) {
            this.\u00f5\u00d2\u00d4O00 = new MedizinmannMiniwatu();
        }
        return this.\u00f5\u00d2\u00d4O00;
    }

    public P getMedizinmannTocamuyac() {
        if (this.\u00d4\u00d2\u00d4O00 == null) {
            this.\u00d4\u00d2\u00d4O00 = new MedizinmannTocamuyac();
        }
        return this.\u00d4\u00d2\u00d4O00;
    }

    public P getMedizinmannUtulus() {
        if (this.\u00f4\u00d2\u00d4O00 == null) {
            this.\u00f4\u00d2\u00d4O00 = new MedizinmannUtulus();
        }
        return this.\u00f4\u00d2\u00d4O00;
    }

    public P getMedizinmannVerloreneStaemme() {
        if (this.\u00d8o\u00d4O00 == null) {
            this.\u00d8o\u00d4O00 = new MedizinmannVerloreneStaemme();
        }
        return this.\u00d8o\u00d4O00;
    }

    public P getMedizinmannWudu() {
        if (this.nulldonull == null) {
            this.nulldonull = new MedizinmannWudu();
        }
        return this.nulldonull;
    }

    public P getNuranshar() {
        if (this.ifwhilenull == null) {
            this.ifwhilenull = new Nuranshar();
        }
        return this.ifwhilenull;
    }

    public P getNuransharMherech() {
        if (this.\u00d5o\u00d4O00 == null) {
            this.\u00d5o\u00d4O00 = new NuransharMherech();
        }
        return this.\u00d5o\u00d4O00;
    }

    public P getNuransharShaiAian() {
        if (this.o\u00d2\u00d4O00 == null) {
            this.o\u00d2\u00d4O00 = new NuransharShaiAian();
        }
        return this.o\u00d2\u00d4O00;
    }

    public P getNuransharThalusien() {
        if (this.\u00d4o\u00d4O00 == null) {
            this.\u00d4o\u00d4O00 = new NuransharThalusien();
        }
        return this.\u00d4o\u00d4O00;
    }

    public P getRakaiPriester() {
        if (this.\u00d3\u00d2\u00d4O00 == null) {
            this.\u00d3\u00d2\u00d4O00 = new RakaiPriester();
        }
        return this.\u00d3\u00d2\u00d4O00;
    }

    public P getShochzul() {
        if (this.\u00f4o\u00d4O00 == null) {
            this.\u00f4o\u00d4O00 = new Shochzul();
        }
        return this.\u00f4o\u00d4O00;
    }

    public P getSkuldrun() {
        if (this.privatedonull == null) {
            this.privatedonull = new Skuldrun();
        }
        return this.privatedonull;
    }

    public P getSkuldrunHeiler() {
        if (this.\u00d8\u00d2\u00d4O00 == null) {
            this.\u00d8\u00d2\u00d4O00 = new SkuldrunHeiler();
        }
        return this.\u00d8\u00d2\u00d4O00;
    }

    public P getSkuldrunMammutSeher() {
        if (this.Stringdonull == null) {
            this.Stringdonull = new SkuldrunMammutSeher();
        }
        return this.Stringdonull;
    }

    public P getSkuldrunZauberschmied() {
        if (this.Oo\u00d4O00 == null) {
            this.Oo\u00d4O00 = new SkuldrunZauberschmied();
        }
        return this.Oo\u00d4O00;
    }

    public P getStammesGoblinSchamane() {
        if (this.\u00f8o\u00d4O00 == null) {
            this.\u00f8o\u00d4O00 = new StammesGoblinSchamane();
        }
        return this.\u00f8o\u00d4O00;
    }

    public P getTairachPriester() {
        if (this.fordonull == null) {
            this.fordonull = new TairachPriester();
        }
        return this.fordonull;
    }

    @Override
    public String toString() {
        if (this.varianteGewaehlt()) {
            return this.getVariante().toString();
        }
        if (this.istMaennlich()) {
            return "Schamane/Priester";
        }
        return "Schamanin/Priesterin";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getMedizinmannDschungelstaemme());
        this.addAlleVarianten(this.getMedizinmannVerloreneStaemme());
        this.addAlleVarianten(this.getMedizinmannUtulus());
        this.addAlleVarianten(this.getMedizinmannMiniwatu());
        this.addAlleVarianten(this.getMedizinmannTocamuyac());
        this.addAlleVarianten(this.getMedizinmannDarna());
        this.addAlleVarianten(this.getTairachPriester());
        this.addAlleVarianten(this.getGraveshPriester());
        this.addAlleVarianten(this.getGraveshPriesterGeweiht());
        this.addAlleVarianten(this.getRakaiPriester());
        this.addAlleVarianten(this.getKjaskjua());
        this.addAlleVarianten(this.getStammesGoblinSchamane());
        this.addAlleVarianten(this.getFestumerGoblinSchamane());
        this.addAlleVarianten(this.getNuranshar());
        this.addAlleVarianten(this.getNuransharMherech());
        this.addAlleVarianten(this.getNuransharShaiAian());
        this.addAlleVarianten(this.getNuransharThalusien());
        this.addAlleVarianten(this.getBrenchiDun());
        this.addAlleVarianten(this.getSkuldrun());
        this.addAlleVarianten(this.getSkuldrunHeiler());
        this.addAlleVarianten(this.getSkuldrunMammutSeher());
        this.addAlleVarianten(this.getSkuldrunZauberschmied());
        this.addAlleVarianten(this.getShochzul());
        this.addAlleVarianten(this.getAchaz());
        this.addAlleVarianten(this.getMedizinmannWudu());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getMedizinmannDschungelstaemme());
        this.addMoeglicheVariante(this.getMedizinmannVerloreneStaemme());
        this.addMoeglicheVariante(this.getMedizinmannUtulus());
        this.addMoeglicheVariante(this.getMedizinmannMiniwatu());
        this.addMoeglicheVariante(this.getMedizinmannTocamuyac());
        this.addMoeglicheVariante(this.getMedizinmannDarna());
        this.addMoeglicheVariante(this.getTairachPriester());
        this.addMoeglicheVariante(this.getMedizinmannWudu());
    }
}

