/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.niedererazaraidesshinxirit;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.public;
import helden.framework.D.while;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.Vector;

public class NiedererAzaraidesShinXiritVariante
extends helden.framework.int.N {
    public NiedererAzaraidesShinXiritVariante() {
        super("Niederer Azarai des Shin-Xirit", "Niederer Azarai des Shin-Xirit", 27, false);
    }

    public NiedererAzaraidesShinXiritVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Besondere Waffe");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Beidh\u00e4ndig"));
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Hohe Lebenskraft"));
        arrayList.add(K.o00000("Schnelle Heilung"));
        arrayList.add(K.o00000("Z\u00e4her Hund"));
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
        if (b_02.equals(b_0.void("GE"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KK"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("LeP"), 2);
        k_02.o00000(b_0.void("AuP"), 3);
        return k_02;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return BedingungsVerknuepfung.AND(Bedingung.hat(I.\u00d3\u00d5o000));
    }

    @Override
    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        Vector<KostenArt> vector = super.getPunktePools(floatsuper2);
        vector.add(new KostenArt("Liturgie-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                if (!(object instanceof public) || !KostenEntry.kostenBereich.class.equals((Object)kostenBereich2)) {
                    return false;
                }
                public public_ = (public)object;
                return public_.whilenew() <= 4;
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.class);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 1000;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        });
        return vector;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Ausfall"));
        arrayList.add(oooo_0.o00000("Finte"));
        arrayList.add(oooo_0.o00000("Karmalqueste"));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d4\u00d8000));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Anderthalbh\u00e4nder"));
                arrayList.add(N.floatsuper().\u00d200000("S\u00e4bel"));
                arrayList.add(N.floatsuper().\u00d200000("Schwerter"));
                arrayList.add(N.floatsuper().\u00d200000("Zweihandschwerter/-s\u00e4bel"));
                int[] nArray = new int[]{7, 4, 4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Athletik"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Akrobatik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tanzen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("H\u00fcttenkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(G.\u00f8O\u00f5000, 4);
        k_02.\u00d200000(G.\u00d8\u00f8\u00f5000, 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Grobschmied"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("T\u00e4towieren"), 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d6000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Fettleibig"));
        arrayList.add(K.o00000("Gesucht"));
        arrayList.add(K.o00000("Glasknochen"));
        arrayList.add(K.o00000("Lichtscheu"));
        arrayList.add(K.o00000("Randgruppe"));
        arrayList.add(K.o00000("Raumangst"));
        arrayList.add(K.o00000("Weltfremd"));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Aufmerksamkeit"));
        arrayList.addAll(for.\u00d200000("Kampfreflexe"));
        arrayList.addAll(for.\u00d200000("Schwingentanz"));
        arrayList.addAll(for.\u00d200000("Schwertmeisterlicher Ausfall"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Azarai"));
        oo0O.\u00d300000(K.o00000("Gueraiausbildung"));
        oo0O.\u00d300000(K.o00000("Arroganz", 5));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000, new Object[]{"Shin-Xirit"}));
        oo0O.\u00d300000(K.o00000("Verpflichtungen", "gegen\u00fcber Kult"));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }
}

