/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.niedererazaraidernanurta;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.public;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
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

public class NiedererAzaraiderNanurtaVariante
extends helden.framework.int.N {
    private Geschlecht whilenewfloat;

    public NiedererAzaraiderNanurtaVariante(Geschlecht geschlecht) {
        super("Niederer Azarai der Nanurta", "Niedere Azarai der Nanurta", 6, false);
        this.whilenewfloat = geschlecht;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Herausragendes Aussehen"));
        arrayList.add(K.o00000("Nanjafreund"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
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
        arrayList.add(oooo_0.o00000("Karmalqueste"));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d8\u00d5000));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Ackerbau"));
                arrayList.add(voidsuper.\u00f5o\u00d6000);
                arrayList.add(N.floatsuper().\u00d200000("Brauer"));
                arrayList.add(N.floatsuper().\u00d200000("Hauswirtschaft"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Wunden"));
                arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
                arrayList.add(N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
                arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
                arrayList.add(N.floatsuper().\u00d200000("Stoffe f\u00e4rben"));
                arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
                arrayList.add(N.floatsuper().\u00d200000("T\u00f6pfern"));
                arrayList.add(N.floatsuper().\u00d200000("Viehzucht"));
                arrayList.add(N.floatsuper().\u00d200000("Webkunst"));
                arrayList.add(N.floatsuper().\u00d200000("Winzer"));
                int[] nArray = new int[]{4, 3, 2};
                if (this.whilenewfloat.equals((Object)Geschlecht.\u00d400000)) {
                    nArray = new int[]{4, 3, 3, 2, 2};
                }
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Singen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tanzen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bet\u00f6ren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wettervorhersage"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00d6\u00d6000, 4);
        if (this.whilenewfloat.equals((Object)Geschlecht.\u00d400000)) {
            k_02.\u00d200000(E.nullsuperString, 3);
            k_02.\u00d200000(voidsuper.StringvoidObject, 1);
            k_02.\u00d200000(voidsuper.nullObjectObject, 2);
            k_02.\u00d200000(G.\u00f8O\u00f5000, 4);
            k_02.\u00d200000(G.\u00d8\u00f8\u00f5000, 4);
        } else {
            k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, 3);
            k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
            k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 3);
            k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 3);
            k_02.\u00d200000(voidsuper.StringObjectObject, 2);
        }
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Gesucht"));
        arrayList.add(K.o00000("Lichtscheu"));
        arrayList.add(K.o00000("Randgruppe"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d8\u00d3o000));
        oo0O.\u00d300000(K.o00000("Azarai"));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000, new Object[]{"Nanurta"}));
        oo0O.\u00d300000(K.o00000("Verpflichtungen", "gegen\u00fcber Kult"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

