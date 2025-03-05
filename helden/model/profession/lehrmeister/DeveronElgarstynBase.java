/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

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
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;

public class DeveronElgarstynBase
extends LehrmeisterBase {
    public DeveronElgarstynBase(String string, String string2, int n, boolean bl) {
        super("Sch\u00fcler des Deveron Elgarstyn: " + string, "Sch\u00fclerin des Deveron Elgarstyn: " + string2, 24, false);
        this.\u00d4O\u00d2O00 = "schwarz";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Ausdauernd"));
        arrayList.add(helden.framework.C.K.o00000("Balance"));
        arrayList.add(helden.framework.C.K.o00000("Beidh\u00e4ndig"));
        arrayList.add(helden.framework.C.K.o00000("D\u00e4mmerungssicht"));
        arrayList.add(helden.framework.C.K.o00000("Flink"));
        arrayList.add(helden.framework.C.K.o00000("Verbindungen"));
        arrayList.add(helden.framework.C.K.o00000("Wesen der Nacht"));
        arrayList.add(helden.framework.C.K.o00000("Feind"));
        arrayList.add(helden.framework.C.K.o00000("Fluch der Finsternis"));
        arrayList.add(helden.framework.C.K.o00000("Gerechtigkeitswahn"));
        arrayList.add(helden.framework.C.K.o00000("Lichtscheu"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
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
            return 11;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(oooo_0.o00000(while.o\u00f60000));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(oooo_0.o00000(while.StringwhileString));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d2000));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Sprachen kennen Garethi"));
                arrayList.add(N.floatsuper().\u00d200000("Sprachen kennen Tulamidya"));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wurfmesser"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Athletik"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Akrobatik"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Klettern"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schleichen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verstecken"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gassenwissen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("F\u00e4hrtensuchen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Staatskunst"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen F\u00fcchsisch"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Tulamidya"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schl\u00f6sser knacken"), 1);
        k_02.\u00d200000(this.getZauber("Dunkelheit"), 6);
        k_02.\u00d200000(this.getZauber("Ecliptifactus"), 7);
        k_02.\u00d200000(this.getZauber("Ignorantia"), 4);
        k_02.\u00d200000(this.getZauber("Schwarzer Schrecken"), 5);
        k_02.\u00d200000(this.getZauber("Umbraporta"), 7);
        k_02.\u00d200000(this.getZauber("Balsam"), 2);
        k_02.\u00d200000(this.getZauber("Blitz dich find"), 4);
        k_02.\u00d200000(this.getZauber("Exposami"), 1);
        k_02.\u00d200000(this.getZauber("Flim Flam"), 3);
        k_02.\u00d200000(this.getZauber("Foramen"), 2);
        k_02.\u00d200000(this.getZauber("Penetrizzel"), 2);
        k_02.\u00d200000(this.getZauber("Silentium"), 3);
        k_02.\u00d200000(this.getZauber("Somnigravis"), 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Beh\u00e4big"));
        arrayList.add(helden.framework.C.K.o00000("Dunkelangst"));
        arrayList.add(helden.framework.C.K.o00000("H\u00f6henangst"));
        arrayList.add(helden.framework.C.K.o00000("Kurzatmig"));
        arrayList.add(helden.framework.C.K.o00000("Nachtblind"));
        arrayList.add(helden.framework.C.K.o00000("Raumangst"));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d8\u00d20000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Neugier", 5));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Rachsucht", 5));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verpflichtungen", "Deveron Elgarstyn, Bund der Schatten"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d2\u00d5000, K.\u00f8O0000, ""));
        this.o00000(waehlbareZauber);
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber("Dunkelheit"));
        arrayList.add(this.getZauber("Ecliptifactus"));
        arrayList.add(this.getZauber("Ignorantia"));
        arrayList.add(this.getZauber("Schwarzer Schrecken"));
        arrayList.add(this.getZauber("Umbraporta"));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

