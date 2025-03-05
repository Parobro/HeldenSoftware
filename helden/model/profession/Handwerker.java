/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.model.profession.handwerker.Baecker;
import helden.model.profession.handwerker.Beinschnitzer;
import helden.model.profession.handwerker.Bogenbauer;
import helden.model.profession.handwerker.Brauer;
import helden.model.profession.handwerker.Dachdecker;
import helden.model.profession.handwerker.Faerber;
import helden.model.profession.handwerker.Fleischer;
import helden.model.profession.handwerker.Gerber;
import helden.model.profession.handwerker.Glasblaeser;
import helden.model.profession.handwerker.Goldschmied;
import helden.model.profession.handwerker.Grobschmied;
import helden.model.profession.handwerker.Gussmaurer;
import helden.model.profession.handwerker.HandwerklicheSpezialisierung;
import helden.model.profession.handwerker.Instrumentenbauer;
import helden.model.profession.handwerker.Juwelier;
import helden.model.profession.handwerker.Koch;
import helden.model.profession.handwerker.Kristallzuechter;
import helden.model.profession.handwerker.Maurer;
import helden.model.profession.handwerker.Mueller;
import helden.model.profession.handwerker.Plaettner;
import helden.model.profession.handwerker.Porzellanbrenner;
import helden.model.profession.handwerker.Sattler;
import helden.model.profession.handwerker.Schiffszimmermann;
import helden.model.profession.handwerker.Schmuckschmied;
import helden.model.profession.handwerker.Schneider;
import helden.model.profession.handwerker.Schreiner;
import helden.model.profession.handwerker.Segelmacher;
import helden.model.profession.handwerker.Seiler;
import helden.model.profession.handwerker.Spengler;
import helden.model.profession.handwerker.Steinmetz;
import helden.model.profession.handwerker.Stellmacher;
import helden.model.profession.handwerker.Taetowierer;
import helden.model.profession.handwerker.Toepfer;
import helden.model.profession.handwerker.Waffenschmied;
import helden.model.profession.handwerker.Weber;
import helden.model.profession.handwerker.Zimmermann;
import helden.model.profession.varianten.KaempferOttajasko;
import helden.model.profession.varianten.KaempferSippe;
import helden.model.profession.varianten.Runenschnitzer;
import helden.model.profession.varianten.ViertelRunenzauberer;
import java.util.ArrayList;
import java.util.Iterator;

public class Handwerker
extends L {
    private P thissupernull;
    private P o\u00f4\u00d2O00;
    private P O\u00f6\u00d2O00;
    private P \u00f8\u00f6\u00d2O00;
    private P \u00d4\u00f4\u00d2O00;
    private P \u00f5\u00f5\u00d2O00;
    private P \u00f5\u00f8\u00d2O00;
    private P O\u00f5\u00d2O00;
    private P o\u00f8\u00d2O00;
    private P \u00d5\u00f4\u00d2O00;
    private P \u00d4\u00f5\u00d2O00;
    private P whilethisnull;
    private P \u00d3\u00f8\u00d2O00;
    private P o\u00f6\u00d2O00;
    private P whilenewnull;
    private P \u00f4\u00f4\u00d2O00;
    private P \u00f5\u00f6\u00d2O00;
    private P \u00f8\u00f8\u00d2O00;
    private P forsupernull;
    private P ifnewnull;
    private P O\u00f8\u00d2O00;
    private P \u00d5\u00f6\u00d2O00;
    private P \u00d5\u00f8\u00d2O00;
    private P Stringsupernull;
    private P \u00d3\u00f6\u00d2O00;
    private P privatesupernull;
    private P \u00f4\u00f5\u00d2O00;
    private P \u00d3\u00f4\u00d2O00;
    private P \u00d8\u00f8\u00d2O00;
    private P nullsupernull;
    private P \u00d8\u00f4\u00d2O00;
    private P StringObjectnull;
    private P \u00f4\u00f8\u00d2O00;
    private P \u00d4\u00f6\u00d2O00;
    private P \u00d8\u00f5\u00d2O00;
    private P \u00f5\u00f4\u00d2O00;
    private P \u00d4\u00f8\u00d2O00;
    private P returnnewnull;
    private P \u00f4\u00f6\u00d2O00;
    private P \u00f8\u00f4\u00d2O00;
    private P \u00f8\u00f5\u00d2O00;
    private P newnewnull;
    private P \u00d8\u00f6\u00d2O00;
    private P thisObjectnull;
    private P \u00d5\u00f5\u00d2O00;
    private P \u00d3\u00f5\u00d2O00;
    private P o\u00f5\u00d2O00;

    public Handwerker() {
    }

    public Handwerker(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getViertelRunenZauberer());
        arrayList.add(this.getRunenschnitzer());
        arrayList.add(this.getBaecker());
        arrayList.add(this.getBeinschnitzer());
        arrayList.add(this.getBogenbauer());
        arrayList.add(this.getBrauer());
        arrayList.add(this.getFaerber());
        arrayList.add(this.getFleischer());
        arrayList.add(this.getGerber());
        arrayList.add(this.getGlasblaeser());
        arrayList.add(this.getGoldschmied());
        arrayList.add(this.getGrobschmied());
        arrayList.add(this.getGussmaurer());
        arrayList.add(this.getInstrumentenbauer());
        arrayList.add(this.getJuwelier());
        arrayList.add(this.getKoch());
        arrayList.add(this.getKristallzuechter());
        arrayList.add(this.getMaurer());
        arrayList.add(this.getPlaettner());
        arrayList.add(this.getPorzellanbrenner());
        arrayList.add(this.getSattler());
        arrayList.add(this.getSchneider());
        arrayList.add(this.getSchreiner());
        arrayList.add(this.getSegelmacher());
        arrayList.add(this.getSeiler());
        arrayList.add(this.getSpengler());
        arrayList.add(this.getSteinmetz());
        arrayList.add(this.getStellmacher());
        arrayList.add(this.getTaetowierer());
        arrayList.add(this.getToepfer());
        arrayList.add(this.getWaffenschmied());
        arrayList.add(this.getWeber());
        arrayList.add(this.getZimmermann());
        return arrayList;
    }

    public P getArchaischeFerkina() {
        if (this.\u00d5\u00f5\u00d2O00 == null) {
            this.\u00d5\u00f5\u00d2O00 = new helden.model.profession.handwerker.Handwerker("Archaische Handwerker der Ferkina", 0, 2);
        }
        return this.\u00d5\u00f5\u00d2O00;
    }

    public P getArchaischeNordens() {
        if (this.o\u00f5\u00d2O00 == null) {
            this.o\u00f5\u00d2O00 = new helden.model.profession.handwerker.Handwerker("Archaische Handwerker des Nordens", 0, 4);
        }
        return this.o\u00f5\u00d2O00;
    }

    public P getArchaischeOrk() {
        if (this.\u00d3\u00f5\u00d2O00 == null) {
            this.\u00d3\u00f5\u00d2O00 = new helden.model.profession.handwerker.Handwerker("Archaische Handwerker der Orks", 0, 3);
        }
        return this.\u00d3\u00f5\u00d2O00;
    }

    public P getArchaischeSuedAventuriens() {
        if (this.thisObjectnull == null) {
            this.thisObjectnull = new helden.model.profession.handwerker.Handwerker("Archaische Handwerker S\u00fcdaventuriens und der Achaz", 0, 1);
        }
        return this.thisObjectnull;
    }

    public P getBaecker() {
        if (this.\u00f8\u00f6\u00d2O00 == null) {
            this.\u00f8\u00f6\u00d2O00 = new Baecker();
        }
        return this.\u00f8\u00f6\u00d2O00;
    }

    public P getBastlerDorf() {
        if (this.\u00d8\u00f6\u00d2O00 == null) {
            this.\u00d8\u00f6\u00d2O00 = new helden.model.profession.handwerker.Handwerker("zwergischer, d\u00f6rflicher Bastler", 0, false, true);
        }
        return this.\u00d8\u00f6\u00d2O00;
    }

    public P getBastlerStaedisch() {
        if (this.newnewnull == null) {
            this.newnewnull = new helden.model.profession.handwerker.Handwerker("zwergischer Bastler", 0, true, true);
        }
        return this.newnewnull;
    }

    public P getBeinschnitzer() {
        if (this.thissupernull == null) {
            this.thissupernull = new Beinschnitzer();
        }
        return this.thissupernull;
    }

    public P getBogenbauer() {
        if (this.o\u00f4\u00d2O00 == null) {
            this.o\u00f4\u00d2O00 = new Bogenbauer();
        }
        return this.o\u00f4\u00d2O00;
    }

    public P getBrauer() {
        if (this.O\u00f6\u00d2O00 == null) {
            this.O\u00f6\u00d2O00 = new Brauer();
        }
        return this.O\u00f6\u00d2O00;
    }

    public P getDachdecker() {
        if (this.\u00d4\u00f4\u00d2O00 == null) {
            this.\u00d4\u00f4\u00d2O00 = new Dachdecker();
        }
        return this.\u00d4\u00f4\u00d2O00;
    }

    public P getDorf() {
        if (this.\u00f8\u00f5\u00d2O00 == null) {
            this.\u00f8\u00f5\u00d2O00 = new helden.model.profession.handwerker.Handwerker("d\u00f6rflicher Handwerker", 1, false, false);
        }
        return this.\u00f8\u00f5\u00d2O00;
    }

    public P getFaerber() {
        if (this.\u00f5\u00f8\u00d2O00 == null) {
            this.\u00f5\u00f8\u00d2O00 = new Faerber();
        }
        return this.\u00f5\u00f8\u00d2O00;
    }

    public P getFleischer() {
        if (this.O\u00f5\u00d2O00 == null) {
            this.O\u00f5\u00d2O00 = new Fleischer();
        }
        return this.O\u00f5\u00d2O00;
    }

    public P getGerber() {
        if (this.o\u00f8\u00d2O00 == null) {
            this.o\u00f8\u00d2O00 = new Gerber();
        }
        return this.o\u00f8\u00d2O00;
    }

    public P getGlasblaeser() {
        if (this.\u00d5\u00f4\u00d2O00 == null) {
            this.\u00d5\u00f4\u00d2O00 = new Glasblaeser();
        }
        return this.\u00d5\u00f4\u00d2O00;
    }

    public P getGoldschmied() {
        if (this.\u00d4\u00f5\u00d2O00 == null) {
            this.\u00d4\u00f5\u00d2O00 = new Goldschmied();
        }
        return this.\u00d4\u00f5\u00d2O00;
    }

    public P getGrobschmied() {
        if (this.whilethisnull == null) {
            this.whilethisnull = new Grobschmied();
        }
        return this.whilethisnull;
    }

    public P getGussmaurer() {
        if (this.\u00d3\u00f8\u00d2O00 == null) {
            this.\u00d3\u00f8\u00d2O00 = new Gussmaurer();
        }
        return this.\u00d3\u00f8\u00d2O00;
    }

    @Override
    public String getID() {
        return "P33";
    }

    public P getInstrumentenbauer() {
        if (this.\u00f4\u00f4\u00d2O00 == null) {
            this.\u00f4\u00f4\u00d2O00 = new Instrumentenbauer();
        }
        return this.\u00f4\u00f4\u00d2O00;
    }

    public P getJuwelier() {
        if (this.\u00f5\u00f5\u00d2O00 == null) {
            this.\u00f5\u00f5\u00d2O00 = new Juwelier();
        }
        return this.\u00f5\u00f5\u00d2O00;
    }

    public P getKaempferOttajasko() {
        if (this.returnnewnull == null) {
            this.returnnewnull = new KaempferOttajasko();
        }
        return this.returnnewnull;
    }

    public P getKaempferSippe() {
        if (this.\u00f4\u00f6\u00d2O00 == null) {
            this.\u00f4\u00f6\u00d2O00 = new KaempferSippe();
        }
        return this.\u00f4\u00f6\u00d2O00;
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d600000;
    }

    public P getKoch() {
        if (this.\u00f5\u00f6\u00d2O00 == null) {
            this.\u00f5\u00f6\u00d2O00 = new Koch();
        }
        return this.\u00f5\u00f6\u00d2O00;
    }

    public P getKristallzuechter() {
        if (this.\u00f8\u00f8\u00d2O00 == null) {
            this.\u00f8\u00f8\u00d2O00 = new Kristallzuechter();
        }
        return this.\u00f8\u00f8\u00d2O00;
    }

    public P getMaurer() {
        if (this.forsupernull == null) {
            this.forsupernull = new Maurer();
        }
        return this.forsupernull;
    }

    public P getMueller() {
        if (this.ifnewnull == null) {
            this.ifnewnull = new Mueller();
        }
        return this.ifnewnull;
    }

    public P getPlaettner() {
        if (this.o\u00f6\u00d2O00 == null) {
            this.o\u00f6\u00d2O00 = new Plaettner();
        }
        return this.o\u00f6\u00d2O00;
    }

    public P getPorzellanbrenner() {
        if (this.whilenewnull == null) {
            this.whilenewnull = new Porzellanbrenner();
        }
        return this.whilenewnull;
    }

    public P getRunenschnitzer() {
        if (this.O\u00f8\u00d2O00 == null) {
            this.O\u00f8\u00d2O00 = new Runenschnitzer();
        }
        return this.O\u00f8\u00d2O00;
    }

    public P getSattler() {
        if (this.\u00d5\u00f6\u00d2O00 == null) {
            this.\u00d5\u00f6\u00d2O00 = new Sattler();
        }
        return this.\u00d5\u00f6\u00d2O00;
    }

    public P getSchiffszimmermann() {
        if (this.\u00d5\u00f8\u00d2O00 == null) {
            this.\u00d5\u00f8\u00d2O00 = new Schiffszimmermann();
        }
        return this.\u00d5\u00f8\u00d2O00;
    }

    public P getSchmuckschmied() {
        if (this.Stringsupernull == null) {
            this.Stringsupernull = new Schmuckschmied();
        }
        return this.Stringsupernull;
    }

    public P getSchneider() {
        if (this.\u00d3\u00f6\u00d2O00 == null) {
            this.\u00d3\u00f6\u00d2O00 = new Schneider();
        }
        return this.\u00d3\u00f6\u00d2O00;
    }

    public P getSchreiner() {
        if (this.privatesupernull == null) {
            this.privatesupernull = new Schreiner();
        }
        return this.privatesupernull;
    }

    public P getSegelmacher() {
        if (this.\u00f4\u00f5\u00d2O00 == null) {
            this.\u00f4\u00f5\u00d2O00 = new Segelmacher();
        }
        return this.\u00f4\u00f5\u00d2O00;
    }

    public P getSeiler() {
        if (this.\u00d3\u00f4\u00d2O00 == null) {
            this.\u00d3\u00f4\u00d2O00 = new Seiler();
        }
        return this.\u00d3\u00f4\u00d2O00;
    }

    public P getSpengler() {
        if (this.\u00d8\u00f8\u00d2O00 == null) {
            this.\u00d8\u00f8\u00d2O00 = new Spengler();
        }
        return this.\u00d8\u00f8\u00d2O00;
    }

    public P getStaedisch() {
        if (this.\u00f8\u00f4\u00d2O00 == null) {
            this.\u00f8\u00f4\u00d2O00 = new helden.model.profession.handwerker.Handwerker("Handwerker", 1, true, false);
        }
        return this.\u00f8\u00f4\u00d2O00;
    }

    public P getSteinmetz() {
        if (this.nullsupernull == null) {
            this.nullsupernull = new Steinmetz();
        }
        return this.nullsupernull;
    }

    public P getStellmacher() {
        if (this.\u00d8\u00f4\u00d2O00 == null) {
            this.\u00d8\u00f4\u00d2O00 = new Stellmacher();
        }
        return this.\u00d8\u00f4\u00d2O00;
    }

    public P getTaetowierer() {
        if (this.StringObjectnull == null) {
            this.StringObjectnull = new Taetowierer();
        }
        return this.StringObjectnull;
    }

    public P getToepfer() {
        if (this.\u00f4\u00f8\u00d2O00 == null) {
            this.\u00f4\u00f8\u00d2O00 = new Toepfer();
        }
        return this.\u00f4\u00f8\u00d2O00;
    }

    public P getViertelRunenZauberer() {
        if (this.\u00d4\u00f8\u00d2O00 == null) {
            this.\u00d4\u00f8\u00d2O00 = new ViertelRunenzauberer();
        }
        return this.\u00d4\u00f8\u00d2O00;
    }

    public P getWaffenschmied() {
        if (this.\u00d4\u00f6\u00d2O00 == null) {
            this.\u00d4\u00f6\u00d2O00 = new Waffenschmied();
        }
        return this.\u00d4\u00f6\u00d2O00;
    }

    public P getWeber() {
        if (this.\u00d8\u00f5\u00d2O00 == null) {
            this.\u00d8\u00f5\u00d2O00 = new Weber();
        }
        return this.\u00d8\u00f5\u00d2O00;
    }

    public P getZimmermann() {
        if (this.\u00f5\u00f4\u00d2O00 == null) {
            this.\u00f5\u00f4\u00d2O00 = new Zimmermann();
        }
        return this.\u00f5\u00f4\u00d2O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2, ArrayList<String> arrayList) {
        if (p2 != null) {
            ArrayList<P> arrayList2;
            ArrayList<ArrayList<P>> arrayList3 = new ArrayList<ArrayList<P>>();
            if (arrayList.contains(this.getBeinschnitzer().toString()) || arrayList.contains(this.getTaetowierer().toString()) || arrayList.contains(this.getSteinmetz().toString())) {
                arrayList2 = new ArrayList<P>();
                arrayList2.add(this.getViertelRunenZauberer());
                arrayList2.add(this.getRunenschnitzer());
                arrayList3.add(arrayList2);
            }
            if (p2.equals(this.getStaedisch()) || p2.equals(this.getDorf())) {
                arrayList2 = new ArrayList();
                for (P p3 : this.getAlleZusatzVarianten()) {
                    if (!(p3 instanceof HandwerklicheSpezialisierung)) continue;
                    arrayList2.add(p3);
                }
                arrayList3.add(arrayList2);
            }
            return arrayList3;
        }
        return super.getZusatzVarianten(p2);
    }

    @Override
    public boolean istErstProfession() {
        return true;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.istMaennlich()) {
            stringBuffer.append("Handwerker");
        } else {
            stringBuffer.append("Handwerkerin");
        }
        if (this.varianteGewaehlt()) {
            stringBuffer = new StringBuffer();
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
        this.addAlleVarianten(this.getStaedisch());
        this.addAlleVarianten(this.getDorf());
        this.addAlleVarianten(this.getBastlerStaedisch());
        this.addAlleVarianten(this.getBastlerDorf());
        this.addAlleVarianten(this.getArchaischeFerkina());
        this.addAlleVarianten(this.getArchaischeNordens());
        this.addAlleVarianten(this.getArchaischeOrk());
        this.addAlleVarianten(this.getArchaischeSuedAventuriens());
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(this.getStaedisch());
        this.addMoeglicheVariante(this.getDorf());
        this.addMoeglicheVariante(this.getBastlerStaedisch());
        this.addMoeglicheVariante(this.getBastlerDorf());
        this.addMoeglicheVariante(this.getArchaischeFerkina());
        this.addMoeglicheVariante(this.getArchaischeNordens());
        this.addMoeglicheVariante(this.getArchaischeOrk());
        this.addMoeglicheVariante(this.getArchaischeSuedAventuriens());
    }
}

