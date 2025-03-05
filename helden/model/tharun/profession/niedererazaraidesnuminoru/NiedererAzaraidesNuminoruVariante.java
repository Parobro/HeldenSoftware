/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.niedererazaraidesnuminoru;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
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

public class NiedererAzaraidesNuminoruVariante
extends helden.framework.int.N {
    private boolean \u00d3o\u00f5O00;

    public NiedererAzaraidesNuminoruVariante(String string, String string2, boolean bl, int n) {
        super(string, string2, n, false);
        this.\u00d3o\u00f5O00 = bl;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        if (this.\u00d3o\u00f5O00) {
            return 1;
        }
        return 0;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Balance"));
        arrayList.add(K.o00000("Entfernungssinn"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Prophezeien"));
        arrayList.add(K.o00000("Richtungssinn"));
        arrayList.add(K.o00000("Zeitgef\u00fchl"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("IN"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 12;
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
        arrayList.add(oooo_0.o00000("Karmalqueste"));
        arrayList.add(oooo_0.o00000(while.\u00f80\u00f5000));
        arrayList.add(oooo_0.o00000("Meereskundig"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
                arrayList.add(voidsuper.\u00d4\u00d2\u00d8000);
                arrayList.add(voidsuper.returnprivateObject);
                int[] nArray = new int[]{3, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Klettern"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Singen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wettervorhersage"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geografie"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 3);
        k_02.\u00d200000(G.\u00f8O\u00f5000, 5);
        k_02.\u00d200000(G.\u00d8\u00f8\u00f5000, 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Boote fahren"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Holzbearbeitung"), 1);
        k_02.\u00d200000(voidsuper.ifnullObject, 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 3);
        if (this.\u00d3o\u00f5O00) {
            k_02.\u00d200000(voidsuper.StringvoidObject, 1);
            k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
            k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 5);
        }
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Gesucht"));
        arrayList.add(K.o00000("Lichtscheu"));
        arrayList.add(K.o00000("Randgruppe"));
        arrayList.add(K.o00000("Fettleibig"));
        arrayList.add(K.o00000("Glasknochen"));
        arrayList.add(K.o00000("Platzangst"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Azarai"));
        oo0O.\u00d300000(K.o00000("Moralkodex", new Object[]{"Numinoru"}));
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

