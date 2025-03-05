/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
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
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public class YolGhurmakBase
extends StandardMagierVariante {
    protected YolGhurmakBase(String string, int n) {
        super("Heptagonakademie zu Yol-Ghurmak: " + string, n);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d50\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Schale der Alchimie (k\u00fcnstlichem Mindorium)");
        arrayList.add("Wahre Namen von D\u00e4monen");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.thisintsuper);
        arrayList.add(helden.framework.C.K.o00000("Besonderer Besitz"));
        arrayList.add(helden.framework.C.K.o00000("Eisenaffine Aura"));
        arrayList.add(helden.framework.C.K.o00000("Gefahreninstinkt"));
        arrayList.add(helden.framework.C.K.o00000("Hitzeresistenz"));
        arrayList.add(helden.framework.C.K.o00000("Resistenz gegen Gift"));
        arrayList.add(helden.framework.C.K.o00000("Agrimothwahn"));
        arrayList.add(helden.framework.C.K.o00000("Einbildungen"));
        arrayList.add(helden.framework.C.K.o00000("Gr\u00f6\u00dfenwahn"));
        arrayList.add(helden.framework.C.K.o00000("Konstruktionswahn"));
        arrayList.add(helden.framework.C.K.o00000("Rachsucht"));
        arrayList.add(helden.framework.C.K.o00000("Ruhelosigkeit"));
        arrayList.add(helden.framework.C.K.o00000("Schlechter Ruf"));
        arrayList.add(helden.framework.C.K.o00000("Schlafst\u00f6rungen"));
        arrayList.add(helden.framework.C.K.o00000("Sch\u00f6pferwahn"));
        arrayList.add(helden.framework.C.K.o00000("Stigma"));
        arrayList.add(helden.framework.C.K.o00000("Streitsucht"));
        arrayList.add(helden.framework.C.K.o00000("Stubenhocker"));
        arrayList.add(helden.framework.C.K.o00000("Unansehnlich"));
        arrayList.add(helden.framework.C.K.o00000("Verw\u00f6hnt"));
        arrayList.add(helden.framework.C.K.o00000("Wahnvorstellungen"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.newinterfacesuper));
        arrayList.add(oooo_0.o00000(while.StringwhileString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.StringthisString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d5000.toString()));
        arrayList.add(oooo_0.o00000("Blutmagie"));
        arrayList.add(oooo_0.o00000("Invocatio Integra"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00d50\u00d8000);
                arrayList.add(voidsuper.\u00f40\u00d8000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.oo\u00d6000);
                arrayList.add(voidsuper.thisintObject);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geografie"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Mechanik"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Bosparano"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Zelemja"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Zhayad"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 5);
        k_02.\u00d200000(this.getZauber("Invocatio Maior"), 7);
        k_02.\u00d200000(this.getZauber("Invocatio Minor"), 6);
        k_02.\u00d200000(this.getZauber("Pentagramma"), 4);
        k_02.\u00d200000(this.getZauber("Analys"), 3);
        k_02.\u00d200000(this.getZauber("Arcanovi"), 3);
        k_02.\u00d200000(this.getZauber("Beschw\u00f6rung vereiteln"), 2);
        k_02.\u00d200000(this.getZauber("Gardianum"), 4);
        k_02.\u00d200000(this.getZauber("Odem"), 3);
        k_02.\u00d200000(this.getZauber("Pandaemonium"), 4);
        k_02.\u00d200000(this.getZauber("Protectionis"), 2);
        k_02.\u00d200000(this.getZauber("Stein Wandle"), 3);
        k_02.\u00d200000(this.getZauber("Unber\u00fchrt von Satinav"), 2);
        k_02.\u00d200000(this.getZauber("Unitatio"), 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Hitzeempfindlichkeit"));
        arrayList.add(helden.framework.C.K.o00000("H\u00f6henangst"));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00f5\u00d3000));
        arrayList.addAll(for.\u00d200000("D\u00e4monenbindung I"));
        arrayList.addAll(for.\u00d200000("D\u00e4monenbindung II"));
        arrayList.addAll(for.\u00d200000("Form der Formlosigkeit"));
        arrayList.addAll(for.\u00d200000("Merkmalskenntnis: D\u00e4monisch (Agrimoth)"));
        arrayList.addAll(for.\u00d200000("Regeneration I"));
        arrayList.addAll(for.\u00d200000("Regeneration II"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Arroganz", 6));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Gesucht", 2));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Randgruppe", "D\u00e4monenverehrer"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00f4\u00d40000, this.getSetting()));
        for (KonkreterZauber konkreterZauber : ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, o00O.\u00f4\u00d40000, this.getSetting())) {
            waehlbareZauber.add(konkreterZauber);
        }
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00d600000, this.getSetting()));
        for (KonkreterZauber konkreterZauber : ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, o00O.\u00d600000, this.getSetting())) {
            waehlbareZauber.add(konkreterZauber);
        }
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(2, K.\u00f8O0000, o00O.\u00d2O0000, this.getSetting()));
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitungDaemonisch(2, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullclassnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringsupernew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringinterfacesuper, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ififnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ifthisnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f5\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00d5\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.oO\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O0\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00f8\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3O\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d4\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullintnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d8\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.privatepublicnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.forsupernew, K.\u00f8O0000, ""));
        return waehlbareZauber;
    }

    public KonkreterZauber getZauber(String string) {
        if (string.endsWith("*")) {
            return this.getZauberAgrimoth(string.substring(0, string.length() - 1));
        }
        for (Zauber zauber : ZauberFabrik.getInstance().getAlleZauber()) {
            if (!zauber.toString().toLowerCase().startsWith(string.toLowerCase())) continue;
            string = zauber.toString();
            break;
        }
        return KonkreterZauber.getZauber(string, K.\u00f8O0000, "");
    }

    public KonkreterZauber getZauberAgrimoth(String string) {
        String string2 = "";
        for (Zauber zauber : ZauberFabrik.getInstance().getAlleZauber()) {
            String string3 = zauber.toString().toLowerCase();
            if (!string3.startsWith(string.toLowerCase()) || !string3.endsWith(" (agm)")) continue;
            string2 = zauber.toString();
            break;
        }
        if (string2.isEmpty()) {
            helden.framework.held.object.oooo_0.\u00f500000("Zauber " + string + " (AGM) nicht gefunden");
        }
        return KonkreterZauber.getZauber(string2, K.\u00f8O0000, "");
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber("Invocatio Maior"));
        arrayList.add(this.getZauber("Invocatio Minor"));
        arrayList.add(this.getZauber("Pentagramma"));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

