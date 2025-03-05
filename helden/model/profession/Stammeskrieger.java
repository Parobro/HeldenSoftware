/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.stammeskrieger.Achaz;
import helden.model.profession.stammeskrieger.AchazTempelwache;
import helden.model.profession.stammeskrieger.AchmadSunni;
import helden.model.profession.stammeskrieger.AlDrakorhim;
import helden.model.profession.stammeskrieger.Assada;
import helden.model.profession.stammeskrieger.BeniDervez;
import helden.model.profession.stammeskrieger.BeniUchakani;
import helden.model.profession.stammeskrieger.Brobim;
import helden.model.profession.stammeskrieger.Fayar;
import helden.model.profession.stammeskrieger.Ferkina;
import helden.model.profession.stammeskrieger.Fjarninger;
import helden.model.profession.stammeskrieger.Gjalskerland;
import helden.model.profession.stammeskrieger.Goblin;
import helden.model.profession.stammeskrieger.Kanutepeku;
import helden.model.profession.stammeskrieger.Novadi;
import helden.model.profession.stammeskrieger.Ork;
import helden.model.profession.stammeskrieger.Tarisharim;
import helden.model.profession.stammeskrieger.Trollzacker;
import helden.model.profession.stammeskrieger.Waldmensch;
import helden.model.profession.varianten.FerkinaBesessener;
import java.util.ArrayList;
import java.util.Iterator;

public class Stammeskrieger
extends L {
    private P \u00f4\u00d3\u00d4O00;
    private P \u00d3\u00d3\u00d4O00;
    private P thispublicnull;
    private P \u00d8\u00d3\u00d4O00;
    private P \u00d4\u00d3\u00d4O00;
    private P \u00f8\u00d2\u00d4O00;
    private P nullpublicnull;
    private P forpublicnull;
    private P o\u00d3\u00d4O00;
    private P \u00f8\u00d3\u00d4O00;
    private P o\u00d4\u00d4O00;
    private P O\u00d4\u00d4O00;
    private P \u00d5\u00d4\u00d4O00;
    private P Stringpublicnull;
    private P \u00d3\u00d4\u00d4O00;
    private P whilewhilenull;
    private P \u00d5\u00d3\u00d4O00;
    private P O\u00d3\u00d4O00;
    private P \u00d4\u00d4\u00d4O00;
    private P \u00f5\u00d3\u00d4O00;

    public Stammeskrieger() {
    }

    public Stammeskrieger(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    public P getAchaz() {
        if (this.Stringpublicnull == null) {
            this.Stringpublicnull = new Achaz();
        }
        return this.Stringpublicnull;
    }

    public P getAchazTempelwache() {
        if (this.\u00d3\u00d4\u00d4O00 == null) {
            this.\u00d3\u00d4\u00d4O00 = new AchazTempelwache();
        }
        return this.\u00d3\u00d4\u00d4O00;
    }

    public P getAchmadSunni() {
        if (this.o\u00d4\u00d4O00 == null) {
            this.o\u00d4\u00d4O00 = new AchmadSunni();
        }
        return this.o\u00d4\u00d4O00;
    }

    public P getAlDrakorhim() {
        if (this.o\u00d3\u00d4O00 == null) {
            this.o\u00d3\u00d4O00 = new AlDrakorhim();
        }
        return this.o\u00d3\u00d4O00;
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getBessene());
        return arrayList;
    }

    public P getAssada() {
        if (this.\u00f5\u00d3\u00d4O00 == null) {
            this.\u00f5\u00d3\u00d4O00 = new Assada();
        }
        return this.\u00f5\u00d3\u00d4O00;
    }

    public P getBeniDervez() {
        if (this.nullpublicnull == null) {
            this.nullpublicnull = new BeniDervez();
        }
        return this.nullpublicnull;
    }

    public P getBeniUchakani() {
        if (this.\u00f8\u00d3\u00d4O00 == null) {
            this.\u00f8\u00d3\u00d4O00 = new BeniUchakani();
        }
        return this.\u00f8\u00d3\u00d4O00;
    }

    public P getBessene() {
        if (this.O\u00d3\u00d4O00 == null) {
            this.O\u00d3\u00d4O00 = new FerkinaBesessener();
        }
        return this.O\u00d3\u00d4O00;
    }

    public P getBrobim() {
        if (this.\u00d5\u00d3\u00d4O00 == null) {
            this.\u00d5\u00d3\u00d4O00 = new Brobim();
        }
        return this.\u00d5\u00d3\u00d4O00;
    }

    public P getFayar() {
        if (this.\u00d4\u00d4\u00d4O00 == null) {
            this.\u00d4\u00d4\u00d4O00 = new Fayar();
        }
        return this.\u00d4\u00d4\u00d4O00;
    }

    public P getFerkina() {
        if (this.\u00d8\u00d3\u00d4O00 == null) {
            this.\u00d8\u00d3\u00d4O00 = new Ferkina();
        }
        return this.\u00d8\u00d3\u00d4O00;
    }

    public P getFjarninger() {
        if (this.\u00d3\u00d3\u00d4O00 == null) {
            this.\u00d3\u00d3\u00d4O00 = new Fjarninger();
        }
        return this.\u00d3\u00d3\u00d4O00;
    }

    public P getGjalskerland() {
        if (this.thispublicnull == null) {
            this.thispublicnull = new Gjalskerland();
        }
        return this.thispublicnull;
    }

    public P getGoblin() {
        if (this.O\u00d4\u00d4O00 == null) {
            this.O\u00d4\u00d4O00 = new Goblin();
        }
        return this.O\u00d4\u00d4O00;
    }

    @Override
    public String getID() {
        return "P64";
    }

    public P getKanutepeku() {
        if (this.whilewhilenull == null) {
            this.whilewhilenull = new Kanutepeku();
        }
        return this.whilewhilenull;
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d300000;
    }

    public P getNovadi() {
        if (this.\u00f8\u00d2\u00d4O00 == null) {
            this.\u00f8\u00d2\u00d4O00 = new Novadi();
        }
        return this.\u00f8\u00d2\u00d4O00;
    }

    public P getOrk() {
        if (this.\u00d5\u00d4\u00d4O00 == null) {
            this.\u00d5\u00d4\u00d4O00 = new Ork();
        }
        return this.\u00d5\u00d4\u00d4O00;
    }

    public P getTarisharim() {
        if (this.forpublicnull == null) {
            this.forpublicnull = new Tarisharim();
        }
        return this.forpublicnull;
    }

    public P getTrollzacker() {
        if (this.\u00d4\u00d3\u00d4O00 == null) {
            this.\u00d4\u00d3\u00d4O00 = new Trollzacker();
        }
        return this.\u00d4\u00d3\u00d4O00;
    }

    public P getWaldmensch() {
        if (this.\u00f4\u00d3\u00d4O00 == null) {
            this.\u00f4\u00d3\u00d4O00 = new Waldmensch();
        }
        return this.\u00f4\u00d3\u00d4O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        if (p2 == null) {
            return super.getZusatzVarianten(p2);
        }
        if (p2.equals(this.getFerkina())) {
            ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
            ArrayList<P> arrayList2 = new ArrayList<P>();
            arrayList2.add(this.getBessene());
            arrayList.add(arrayList2);
            return arrayList;
        }
        return super.getZusatzVarianten(p2);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Stammeskrieger: ");
        } else {
            stringBuffer.append("Stammeskriegerin: ");
        }
        Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
        while (iterator.hasNext()) {
            stringBuffer.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(this.getWaldmensch());
        this.addAlleVarianten(this.getFjarninger());
        this.addAlleVarianten(this.getGjalskerland());
        this.addAlleVarianten(this.getFerkina());
        this.addAlleVarianten(this.getTrollzacker());
        this.addAlleVarianten(this.getNovadi());
        this.addAlleVarianten(this.getBeniDervez());
        this.addAlleVarianten(this.getTarisharim());
        this.addAlleVarianten(this.getAlDrakorhim());
        this.addAlleVarianten(this.getBeniUchakani());
        this.addAlleVarianten(this.getAchmadSunni());
        this.addAlleVarianten(this.getGoblin());
        this.addAlleVarianten(this.getOrk());
        this.addAlleVarianten(this.getAchaz());
        this.addAlleVarianten(this.getAchazTempelwache());
        this.addAlleVarianten(this.getKanutepeku());
        this.addAlleVarianten(this.getBrobim());
        this.addAlleVarianten(this.getFayar());
        this.addAlleVarianten(this.getAssada());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getWaldmensch());
        this.addMoeglicheVariante(this.getFjarninger());
        this.addMoeglicheVariante(this.getGjalskerland());
        this.addMoeglicheVariante(this.getFerkina());
        this.addMoeglicheVariante(this.getTrollzacker());
        this.addMoeglicheVariante(this.getNovadi());
        this.addMoeglicheVariante(this.getBeniDervez());
        this.addMoeglicheVariante(this.getTarisharim());
        this.addMoeglicheVariante(this.getAlDrakorhim());
        this.addMoeglicheVariante(this.getBeniUchakani());
        this.addMoeglicheVariante(this.getAchmadSunni());
        this.addMoeglicheVariante(this.getGoblin());
        this.addMoeglicheVariante(this.getOrk());
        this.addMoeglicheVariante(this.getAchaz());
        this.addMoeglicheVariante(this.getAchazTempelwache());
        this.addMoeglicheVariante(this.getKanutepeku());
        this.addMoeglicheVariante(this.getAssada());
        this.addMoeglicheVariante(this.getFayar());
    }
}

