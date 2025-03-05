/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.tierkrieger.Baer;
import helden.model.profession.tierkrieger.Feuermolch;
import helden.model.profession.tierkrieger.Fischotter;
import helden.model.profession.tierkrieger.Gebirksbock;
import helden.model.profession.tierkrieger.Rabe;
import helden.model.profession.tierkrieger.Schneeeule;
import helden.model.profession.tierkrieger.Vielfrass;
import helden.model.profession.tierkrieger.Wildschwein;
import helden.model.profession.tierkrieger.Wolf;
import helden.model.profession.tierkrieger.Wollnashorn;
import java.util.ArrayList;

public class Tierkrieger
extends L {
    private P o\u00f5\u00d4O00;
    private P O\u00f5\u00d4O00;
    private P \u00f8\u00f4\u00d4O00;
    private P ifthisint;
    private P \u00d5\u00f5\u00d4O00;
    private P whilethisint;
    private P \u00d4\u00f5\u00d4O00;
    private P thissuperint;
    private P \u00f5\u00f4\u00d4O00;
    private P \u00d3\u00f5\u00d4O00;

    public Tierkrieger() {
    }

    public Tierkrieger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getBaer() {
        if (this.o\u00f5\u00d4O00 == null) {
            this.o\u00f5\u00d4O00 = new Baer();
        }
        return this.o\u00f5\u00d4O00;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.ifnullsuper);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.forpublic);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ooO000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.newif);
        return arrayList;
    }

    public P getFeuermolch() {
        if (this.\u00f8\u00f4\u00d4O00 == null) {
            this.\u00f8\u00f4\u00d4O00 = new Feuermolch();
        }
        return this.\u00f8\u00f4\u00d4O00;
    }

    public P getFischotter() {
        if (this.O\u00f5\u00d4O00 == null) {
            this.O\u00f5\u00d4O00 = new Fischotter();
        }
        return this.O\u00f5\u00d4O00;
    }

    public P getGebirksbock() {
        if (this.ifthisint == null) {
            this.ifthisint = new Gebirksbock();
        }
        return this.ifthisint;
    }

    @Override
    public String getID() {
        return "P71";
    }

    @Override
    public super._o getKategorie() {
        return super._o.super;
    }

    public P getRabe() {
        if (this.\u00d5\u00f5\u00d4O00 == null) {
            this.\u00d5\u00f5\u00d4O00 = new Rabe();
        }
        return this.\u00d5\u00f5\u00d4O00;
    }

    public P getSchneeule() {
        if (this.whilethisint == null) {
            this.whilethisint = new Schneeeule();
        }
        return this.whilethisint;
    }

    public P getVielfrass() {
        if (this.\u00d4\u00f5\u00d4O00 == null) {
            this.\u00d4\u00f5\u00d4O00 = new Vielfrass();
        }
        return this.\u00d4\u00f5\u00d4O00;
    }

    public P getWildschwein() {
        if (this.thissuperint == null) {
            this.thissuperint = new Wildschwein();
        }
        return this.thissuperint;
    }

    public P getWolf() {
        if (this.\u00f5\u00f4\u00d4O00 == null) {
            this.\u00f5\u00f4\u00d4O00 = new Wolf();
        }
        return this.\u00f5\u00f4\u00d4O00;
    }

    public P getWollnashorn() {
        if (this.\u00d3\u00f5\u00d4O00 == null) {
            this.\u00d3\u00f5\u00d4O00 = new Wollnashorn();
        }
        return this.\u00d3\u00f5\u00d4O00;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Gjalskerl\u00e4nder Tierkrieger");
        } else {
            stringBuffer.append("Gjalskerl\u00e4nder Tierkriegerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getBaer());
        this.addAlleVarianten(this.getFeuermolch());
        this.addAlleVarianten(this.getFischotter());
        this.addAlleVarianten(this.getGebirksbock());
        this.addAlleVarianten(this.getRabe());
        this.addAlleVarianten(this.getSchneeule());
        this.addAlleVarianten(this.getVielfrass());
        this.addAlleVarianten(this.getWildschwein());
        this.addAlleVarianten(this.getWolf());
        this.addAlleVarianten(this.getWollnashorn());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getBaer());
        this.addMoeglicheVariante(this.getFeuermolch());
        this.addMoeglicheVariante(this.getFischotter());
        this.addMoeglicheVariante(this.getGebirksbock());
        this.addMoeglicheVariante(this.getRabe());
        this.addMoeglicheVariante(this.getSchneeule());
        this.addMoeglicheVariante(this.getVielfrass());
        this.addMoeglicheVariante(this.getWildschwein());
        this.addMoeglicheVariante(this.getWolf());
        this.addMoeglicheVariante(this.getWollnashorn());
    }
}

