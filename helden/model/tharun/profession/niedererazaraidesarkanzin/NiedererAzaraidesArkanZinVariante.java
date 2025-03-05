/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.niedererazaraidesarkanzin;

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

public class NiedererAzaraidesArkanZinVariante
extends helden.framework.int.N {
    public NiedererAzaraidesArkanZinVariante() {
        super("Niederer Azarai des Arkan'Zin", "Niederer Azarai des Arkan'Zin", 12, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000(I.thisintsuper, "D\u00e4monen"));
        arrayList.add(K.o00000("D\u00e4mmerungssicht"));
        arrayList.add(K.o00000("Empathie"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Prophezeien"));
        arrayList.add(I.nullsuper);
        arrayList.add(K.o00000("Rachsucht"));
        return arrayList;
    }

    @Override
    public ArrayList<I> getEntfernteKutlurVorteile() {
        ArrayList<I> arrayList = super.getEntfernteKutlurVorteile();
        arrayList.add(I.nullclass);
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
        if (b_02.equals(b_0.void("CH"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
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
        arrayList.add(oooo_0.o00000("Aufmerksamkeit"));
        arrayList.add(oooo_0.o00000("Karmalqueste"));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f80000));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Hiebwaffen"));
                arrayList.add(N.floatsuper().\u00d200000("Zweihandhiebwaffen"));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 7);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Staatskunst"), 4);
        k_02.\u00d200000(G.\u00f8O\u00f5000, 5);
        k_02.\u00d200000(G.\u00d8\u00f8\u00f5000, 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Seele"), 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d6\u00d6000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Dunkelangst"));
        arrayList.add(K.o00000("Gesucht"));
        arrayList.add(K.o00000("Randgruppe"));
        arrayList.add(K.o00000("Totenangst"));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Blindkampf"));
        arrayList.addAll(for.\u00d200000("Kampfgesp\u00fcr"));
        arrayList.addAll(for.\u00d200000("Kampfreflexe"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Azarai"));
        oo0O.\u00d300000(K.o00000("Arroganz", 5));
        oo0O.\u00d300000(K.o00000("Moralkodex", new Object[]{"Arkan'Zin"}));
        oo0O.\u00d300000(K.o00000("Verpflichtungen", "gegen\u00fcber Kult"));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

