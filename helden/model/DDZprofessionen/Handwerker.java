/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.P;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.handwerker.Baecker;
import helden.model.DDZprofessionen.handwerker.Beinschnitzer;
import helden.model.DDZprofessionen.handwerker.Bogenbauer;
import helden.model.DDZprofessionen.handwerker.Brauer;
import helden.model.DDZprofessionen.handwerker.Dachdecker;
import helden.model.DDZprofessionen.handwerker.Faerber;
import helden.model.DDZprofessionen.handwerker.Fleischer;
import helden.model.DDZprofessionen.handwerker.Gerber;
import helden.model.DDZprofessionen.handwerker.Glasblaeser;
import helden.model.DDZprofessionen.handwerker.Goldschmied;
import helden.model.DDZprofessionen.handwerker.Grobschmied;
import helden.model.DDZprofessionen.handwerker.Gussmaurer;
import helden.model.DDZprofessionen.handwerker.HandwerklicheSpezialisierung;
import helden.model.DDZprofessionen.handwerker.Instrumentenbauer;
import helden.model.DDZprofessionen.handwerker.Juwelier;
import helden.model.DDZprofessionen.handwerker.Koch;
import helden.model.DDZprofessionen.handwerker.Kristallzuechter;
import helden.model.DDZprofessionen.handwerker.Maurer;
import helden.model.DDZprofessionen.handwerker.Mueller;
import helden.model.DDZprofessionen.handwerker.Plaettner;
import helden.model.DDZprofessionen.handwerker.Porzellanbrenner;
import helden.model.DDZprofessionen.handwerker.Sattler;
import helden.model.DDZprofessionen.handwerker.Schiffszimmermann;
import helden.model.DDZprofessionen.handwerker.Schmuckschmied;
import helden.model.DDZprofessionen.handwerker.Schneider;
import helden.model.DDZprofessionen.handwerker.Schreiner;
import helden.model.DDZprofessionen.handwerker.Segelmacher;
import helden.model.DDZprofessionen.handwerker.Seiler;
import helden.model.DDZprofessionen.handwerker.Spengler;
import helden.model.DDZprofessionen.handwerker.Steinmetz;
import helden.model.DDZprofessionen.handwerker.Stellmacher;
import helden.model.DDZprofessionen.handwerker.Taetowierer;
import helden.model.DDZprofessionen.handwerker.Toepfer;
import helden.model.DDZprofessionen.handwerker.Waffenschmied;
import helden.model.DDZprofessionen.handwerker.Weber;
import helden.model.DDZprofessionen.handwerker.Zimmermann;
import helden.model.profession.varianten.KaempferOttajasko;
import helden.model.profession.varianten.KaempferSippe;
import helden.model.profession.varianten.Runenschnitzer;
import helden.model.profession.varianten.ViertelRunenzauberer;
import java.util.ArrayList;
import java.util.Iterator;

public class Handwerker
extends BasisDDZProfessionMitGeweihter {
    private P \u00f5\u00d4\u00d8O00;
    private P \u00d4\u00d4\u00d8O00;
    private P \u00d3\u00d6\u00d8O00;
    private P nullvoidif;
    private P \u00d8\u00d4\u00d8O00;
    private P O\u00d6\u00d8O00;
    private P O\u00f4\u00d8O00;
    private P \u00d3\u00d5\u00d8O00;
    private P \u00d4\u00d8\u00d8O00;
    private P \u00f4\u00d4\u00d8O00;
    private P \u00d8\u00d5\u00d8O00;
    private P \u00d5\u00d4\u00d8O00;
    private P forvoidif;
    private P \u00d4\u00d6\u00d8O00;
    private P \u00d5\u00d8\u00d8O00;
    private P \u00f8\u00d4\u00d8O00;
    private P O\u00d8\u00d8O00;
    private P newnullif;
    private P \u00f5\u00d5\u00d8O00;
    private P o\u00d8\u00d8O00;
    private P \u00d3\u00d8\u00d8O00;
    private P \u00f4\u00d6\u00d8O00;
    private P \u00f4\u00d8\u00d8O00;
    private P o\u00d5\u00d8O00;
    private P thisvoidif;
    private P o\u00d6\u00d8O00;
    private P \u00f8\u00d5\u00d8O00;
    private P forclassif;
    private P privatevoidif;
    private P \u00d5\u00d5\u00d8O00;
    private P privateclassif;
    private P o\u00f4\u00d8O00;
    private P \u00f8\u00d8\u00d8O00;
    private P \u00d8\u00d6\u00d8O00;
    private P ifreturnif;
    private P O\u00d5\u00d8O00;
    private P \u00d8\u00d8\u00d8O00;
    private P \u00f5\u00d6\u00d8O00;
    private P \u00f8\u00d6\u00d8O00;
    private P newreturnif;
    private P whilereturnif;
    private P \u00d5\u00d6\u00d8O00;
    private P Stringvoidif;
    private P \u00f5\u00d8\u00d8O00;
    private P \u00f4\u00d5\u00d8O00;
    private P returnreturnif;
    private P \u00d4\u00d5\u00d8O00;

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
        arrayList.add(this.getBogenbauer());
        arrayList.add(this.getBrauer());
        arrayList.add(this.getFaerber());
        arrayList.add(this.getJuwelier());
        arrayList.add(this.getFleischer());
        arrayList.add(this.getGerber());
        arrayList.add(this.getGlasblaeser());
        arrayList.add(this.getGoldschmied());
        arrayList.add(this.getGrobschmied());
        arrayList.add(this.getPorzellanbrenner());
        arrayList.add(this.getPlaettner());
        arrayList.add(this.getInstrumentenbauer());
        arrayList.add(this.getKoch());
        arrayList.add(this.getMaurer());
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
        arrayList.add(this.getZimmermann());
        arrayList.add(this.getBeinschnitzer());
        return arrayList;
    }

    public P getArchaischeFerkina() {
        if (this.\u00f4\u00d5\u00d8O00 == null) {
            this.\u00f4\u00d5\u00d8O00 = new helden.model.DDZprofessionen.handwerker.Handwerker("Archaische Handwerker der Ferkina", 0, 2);
        }
        return this.\u00f4\u00d5\u00d8O00;
    }

    public P getArchaischeNordens() {
        if (this.\u00d4\u00d5\u00d8O00 == null) {
            this.\u00d4\u00d5\u00d8O00 = new helden.model.DDZprofessionen.handwerker.Handwerker("Archaische Handwerker des Nordens", 0, 4);
        }
        return this.\u00d4\u00d5\u00d8O00;
    }

    public P getArchaischeOrk() {
        if (this.returnreturnif == null) {
            this.returnreturnif = new helden.model.DDZprofessionen.handwerker.Handwerker("Archaische Handwerker der Orks", 0, 3);
        }
        return this.returnreturnif;
    }

    public P getArchaischeSuedAventuriens() {
        if (this.\u00f5\u00d8\u00d8O00 == null) {
            this.\u00f5\u00d8\u00d8O00 = new helden.model.DDZprofessionen.handwerker.Handwerker("Archaische Handwerker S\u00fcdaventuriens und der Achaz", 0, 1);
        }
        return this.\u00f5\u00d8\u00d8O00;
    }

    public P getBaecker() {
        if (this.nullvoidif == null) {
            this.nullvoidif = new Baecker();
        }
        return this.nullvoidif;
    }

    public P getBastlerDorf() {
        if (this.Stringvoidif == null) {
            this.Stringvoidif = new helden.model.DDZprofessionen.handwerker.Handwerker("zwergischer, d\u00f6rflicher Bastler", 0, false, true);
        }
        return this.Stringvoidif;
    }

    public P getBastlerStaedisch() {
        if (this.\u00d5\u00d6\u00d8O00 == null) {
            this.\u00d5\u00d6\u00d8O00 = new helden.model.DDZprofessionen.handwerker.Handwerker("zwergischer Bastler", 0, true, true);
        }
        return this.\u00d5\u00d6\u00d8O00;
    }

    public P getBeinschnitzer() {
        if (this.\u00f5\u00d4\u00d8O00 == null) {
            this.\u00f5\u00d4\u00d8O00 = new Beinschnitzer();
        }
        return this.\u00f5\u00d4\u00d8O00;
    }

    public P getBogenbauer() {
        if (this.\u00d4\u00d4\u00d8O00 == null) {
            this.\u00d4\u00d4\u00d8O00 = new Bogenbauer();
        }
        return this.\u00d4\u00d4\u00d8O00;
    }

    public P getBrauer() {
        if (this.\u00d3\u00d6\u00d8O00 == null) {
            this.\u00d3\u00d6\u00d8O00 = new Brauer();
        }
        return this.\u00d3\u00d6\u00d8O00;
    }

    public P getDachdecker() {
        if (this.\u00d8\u00d4\u00d8O00 == null) {
            this.\u00d8\u00d4\u00d8O00 = new Dachdecker();
        }
        return this.\u00d8\u00d4\u00d8O00;
    }

    public P getDorf() {
        if (this.whilereturnif == null) {
            this.whilereturnif = new helden.model.DDZprofessionen.handwerker.Handwerker("d\u00f6rflicher Handwerker", 1, false, false);
        }
        return this.whilereturnif;
    }

    public P getFaerber() {
        if (this.O\u00f4\u00d8O00 == null) {
            this.O\u00f4\u00d8O00 = new Faerber();
        }
        return this.O\u00f4\u00d8O00;
    }

    public P getFleischer() {
        if (this.\u00d3\u00d5\u00d8O00 == null) {
            this.\u00d3\u00d5\u00d8O00 = new Fleischer();
        }
        return this.\u00d3\u00d5\u00d8O00;
    }

    public P getGerber() {
        if (this.\u00d4\u00d8\u00d8O00 == null) {
            this.\u00d4\u00d8\u00d8O00 = new Gerber();
        }
        return this.\u00d4\u00d8\u00d8O00;
    }

    public P getGlasblaeser() {
        if (this.\u00f4\u00d4\u00d8O00 == null) {
            this.\u00f4\u00d4\u00d8O00 = new Glasblaeser();
        }
        return this.\u00f4\u00d4\u00d8O00;
    }

    public P getGoldschmied() {
        if (this.\u00d8\u00d5\u00d8O00 == null) {
            this.\u00d8\u00d5\u00d8O00 = new Goldschmied();
        }
        return this.\u00d8\u00d5\u00d8O00;
    }

    public P getGrobschmied() {
        if (this.\u00d5\u00d4\u00d8O00 == null) {
            this.\u00d5\u00d4\u00d8O00 = new Grobschmied();
        }
        return this.\u00d5\u00d4\u00d8O00;
    }

    public P getGussmaurer() {
        if (this.forvoidif == null) {
            this.forvoidif = new Gussmaurer();
        }
        return this.forvoidif;
    }

    @Override
    public String getID() {
        return "P81";
    }

    public P getInstrumentenbauer() {
        if (this.\u00f8\u00d4\u00d8O00 == null) {
            this.\u00f8\u00d4\u00d8O00 = new Instrumentenbauer();
        }
        return this.\u00f8\u00d4\u00d8O00;
    }

    public P getJuwelier() {
        if (this.O\u00d6\u00d8O00 == null) {
            this.O\u00d6\u00d8O00 = new Juwelier();
        }
        return this.O\u00d6\u00d8O00;
    }

    public P getKaempferOttajasko() {
        if (this.\u00f5\u00d6\u00d8O00 == null) {
            this.\u00f5\u00d6\u00d8O00 = new KaempferOttajasko();
        }
        return this.\u00f5\u00d6\u00d8O00;
    }

    public P getKaempferSippe() {
        if (this.\u00f8\u00d6\u00d8O00 == null) {
            this.\u00f8\u00d6\u00d8O00 = new KaempferSippe();
        }
        return this.\u00f8\u00d6\u00d8O00;
    }

    public P getKoch() {
        if (this.O\u00d8\u00d8O00 == null) {
            this.O\u00d8\u00d8O00 = new Koch();
        }
        return this.O\u00d8\u00d8O00;
    }

    public P getKristallzuechter() {
        if (this.newnullif == null) {
            this.newnullif = new Kristallzuechter();
        }
        return this.newnullif;
    }

    public P getMaurer() {
        if (this.\u00f5\u00d5\u00d8O00 == null) {
            this.\u00f5\u00d5\u00d8O00 = new Maurer();
        }
        return this.\u00f5\u00d5\u00d8O00;
    }

    public P getMueller() {
        if (this.o\u00d8\u00d8O00 == null) {
            this.o\u00d8\u00d8O00 = new Mueller();
        }
        return this.o\u00d8\u00d8O00;
    }

    public P getPlaettner() {
        if (this.\u00d4\u00d6\u00d8O00 == null) {
            this.\u00d4\u00d6\u00d8O00 = new Plaettner();
        }
        return this.\u00d4\u00d6\u00d8O00;
    }

    public P getPorzellanbrenner() {
        if (this.\u00d5\u00d8\u00d8O00 == null) {
            this.\u00d5\u00d8\u00d8O00 = new Porzellanbrenner();
        }
        return this.\u00d5\u00d8\u00d8O00;
    }

    public P getRunenschnitzer() {
        if (this.\u00d3\u00d8\u00d8O00 == null) {
            this.\u00d3\u00d8\u00d8O00 = new Runenschnitzer();
        }
        return this.\u00d3\u00d8\u00d8O00;
    }

    public P getSattler() {
        if (this.\u00f4\u00d6\u00d8O00 == null) {
            this.\u00f4\u00d6\u00d8O00 = new Sattler();
        }
        return this.\u00f4\u00d6\u00d8O00;
    }

    public P getSchiffszimmermann() {
        if (this.\u00f4\u00d8\u00d8O00 == null) {
            this.\u00f4\u00d8\u00d8O00 = new Schiffszimmermann();
        }
        return this.\u00f4\u00d8\u00d8O00;
    }

    public P getSchmuckschmied() {
        if (this.o\u00d5\u00d8O00 == null) {
            this.o\u00d5\u00d8O00 = new Schmuckschmied();
        }
        return this.o\u00d5\u00d8O00;
    }

    public P getSchneider() {
        if (this.thisvoidif == null) {
            this.thisvoidif = new Schneider();
        }
        return this.thisvoidif;
    }

    public P getSchreiner() {
        if (this.o\u00d6\u00d8O00 == null) {
            this.o\u00d6\u00d8O00 = new Schreiner();
        }
        return this.o\u00d6\u00d8O00;
    }

    public P getSegelmacher() {
        if (this.\u00f8\u00d5\u00d8O00 == null) {
            this.\u00f8\u00d5\u00d8O00 = new Segelmacher();
        }
        return this.\u00f8\u00d5\u00d8O00;
    }

    public P getSeiler() {
        if (this.forclassif == null) {
            this.forclassif = new Seiler();
        }
        return this.forclassif;
    }

    public P getSpengler() {
        if (this.privatevoidif == null) {
            this.privatevoidif = new Spengler();
        }
        return this.privatevoidif;
    }

    public P getStaedisch() {
        if (this.newreturnif == null) {
            this.newreturnif = new helden.model.DDZprofessionen.handwerker.Handwerker("Handwerker", 1, true, false);
        }
        return this.newreturnif;
    }

    public P getSteinmetz() {
        if (this.\u00d5\u00d5\u00d8O00 == null) {
            this.\u00d5\u00d5\u00d8O00 = new Steinmetz();
        }
        return this.\u00d5\u00d5\u00d8O00;
    }

    public P getStellmacher() {
        if (this.privateclassif == null) {
            this.privateclassif = new Stellmacher();
        }
        return this.privateclassif;
    }

    public P getTaetowierer() {
        if (this.o\u00f4\u00d8O00 == null) {
            this.o\u00f4\u00d8O00 = new Taetowierer();
        }
        return this.o\u00f4\u00d8O00;
    }

    public P getToepfer() {
        if (this.\u00f8\u00d8\u00d8O00 == null) {
            this.\u00f8\u00d8\u00d8O00 = new Toepfer();
        }
        return this.\u00f8\u00d8\u00d8O00;
    }

    public P getViertelRunenZauberer() {
        if (this.\u00d8\u00d8\u00d8O00 == null) {
            this.\u00d8\u00d8\u00d8O00 = new ViertelRunenzauberer();
        }
        return this.\u00d8\u00d8\u00d8O00;
    }

    public P getWaffenschmied() {
        if (this.\u00d8\u00d6\u00d8O00 == null) {
            this.\u00d8\u00d6\u00d8O00 = new Waffenschmied();
        }
        return this.\u00d8\u00d6\u00d8O00;
    }

    public P getWeber() {
        if (this.ifreturnif == null) {
            this.ifreturnif = new Weber();
        }
        return this.ifreturnif;
    }

    public P getZimmermann() {
        if (this.O\u00d5\u00d8O00 == null) {
            this.O\u00d5\u00d8O00 = new Zimmermann();
        }
        return this.O\u00d5\u00d8O00;
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

