/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.B;
import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class XavieraKarsidian
extends LehrmeisterBase {
    public XavieraKarsidian() {
        super("Sch\u00fcler der Xaviera Karsidian", "Sch\u00fclerin der Xaviera Karsidian", 25, false);
        this.\u00d4O\u00d2O00 = "grau";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(helden.framework.C.K.o00000("Herausragendes Aussehen"));
        arrayList.add(helden.framework.C.K.o00000("Verbindungen"));
        arrayList.add(helden.framework.C.K.o00000("Artefaktgebunden"));
        arrayList.add(helden.framework.C.K.o00000("Spruchhemmung"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = new k_0<b_0>();
        k_02.\u00d200000(b_0.\u00d3\u00f4\u00d2000, -1);
        return k_02;
    }

    @Override
    public int getPermanenteASP() {
        return -2;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(oooo_0.o00000(while.oO\u00d8000));
        arrayList.add(oooo_0.o00000(while.thisifclass));
        arrayList.add(oooo_0.o00000(while.Stringifsuper));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d8\u00d6000));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f5O000));
        arrayList.add(oooo_0.o00000(while.\u00d2\u00f5\u00d3000));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(oooo_0.o00000(while.\u00d5O\u00d5000));
        arrayList.add(oooo_0.o00000(while.\u00d6o\u00f5000));
        arrayList.add(oooo_0.o00000("Apport"));
        arrayList.add(oooo_0.o00000("Bannschwert"));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d2000));
        arrayList.add(oooo_0.o00000(while.StringwhileString));
        arrayList.add(oooo_0.o00000("Regeneration I"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bet\u00f6ren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schriftlicher Ausdruck"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Bosparano"), 6);
        k_02.\u00d200000(G.\u00f4\u00d3\u00f5000, 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 8);
        k_02.\u00d200000(G.\u00d40\u00f6000, 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Handel"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 5);
        k_02.\u00d200000(this.getZauber("Analys"), 6);
        k_02.\u00d200000(this.getZauber("Applicatus"), 4);
        k_02.\u00d200000(this.getZauber("Arcanovi"), 5);
        k_02.\u00d200000(this.getZauber("Desintegratus"), 3);
        k_02.\u00d200000(this.getZauber("Objekt entzaubern"), 4);
        k_02.\u00d200000(this.getZauber("Reversalis"), 3);
        k_02.\u00d200000(this.getZauber("Unitatio"), 5);
        k_02.\u00d200000(this.getZauber("Attributo"), 4);
        k_02.\u00d200000(this.getZauber("Band und Fessel"), 2);
        k_02.\u00d200000(this.getZauber("Destructibo"), 2);
        k_02.\u00d200000(this.getZauber("Gardianum"), 2);
        k_02.\u00d200000(this.getZauber("Memorans"), 3);
        k_02.\u00d200000(this.getZauber("Xenographus"), 2);
        k_02.\u00d200000(this.getZauber("Zauberklinge"), 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d8\u00d6000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Feste Matrix"));
        arrayList.add(helden.framework.C.K.o00000("Unansehnlich"));
        arrayList.add(helden.framework.C.K.o00000("Widerw\u00e4rtiges Aussehen"));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.addAll(for.\u00d200000("Kraftlinienmagie I"));
        arrayList.add(new for(while.\u00d3\u00d20000));
        arrayList.add(new for(while.newdoObject));
        arrayList.add(new for(while.o\u00d4\u00d8000));
        arrayList.add(new for(while.\u00d6\u00f4\u00f5000));
        arrayList.addAll(for.\u00d200000("Regeneration II"));
        arrayList.addAll(for.\u00d200000("Zauberzeichen"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Schulden", 1000));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verpflichtungen", "Lehrmeisterin"));
        B b = (B)helden.framework.C.K.o00000(I.O\u00d5o000);
        b.o00000("Tulamiden", (Integer)6);
        oo0O.\u00d300000(b);
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, this.getSetting()));
        this.o00000(waehlbareZauber);
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber("Analys"));
        arrayList.add(this.getZauber("Applicatus"));
        arrayList.add(this.getZauber("Arcanovi"));
        arrayList.add(this.getZauber("Desintegratus"));
        arrayList.add(this.getZauber("Objekt entzaubern"));
        arrayList.add(this.getZauber("Reversalis"));
        arrayList.add(this.getZauber("Unitatio"));
    }
}

