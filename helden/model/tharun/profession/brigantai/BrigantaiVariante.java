/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.brigantai;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.Vector;

public class BrigantaiVariante
extends helden.framework.int.N {
    public BrigantaiVariante() {
        super("Brigantai", "Brigantai", 12, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Besondere Waffe");
        arrayList.add("Reittier");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Breitgef\u00e4cherte Bildung"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Hohe Lebenskraft"));
        arrayList.add(K.o00000("Innerer Kompass"));
        arrayList.add(K.o00000("Richtungssinn"));
        arrayList.add(K.o00000("Schnelle Heilung"));
        arrayList.add(K.o00000("Aberglaube"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 3;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("KK"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("LEP"), 1);
        k_02.o00000(b_0.void("AUP"), 3);
        return k_02;
    }

    @Override
    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        Vector<KostenArt> vector = super.getPunktePools(floatsuper2);
        vector.add(new KostenArt("SF-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                return object instanceof P && KostenEntry.kostenBereich.class.equals((Object)kostenBereich2);
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.class);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 600;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        });
        vector.add(new KostenArt("vSF-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                return object instanceof P && KostenEntry.kostenBereich.\u00d800000.equals((Object)kostenBereich2);
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.\u00d800000);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 800;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        });
        vector.add(new KostenArt("Talent-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                if (!(object instanceof voidsuper) || !KostenEntry.kostenBereich.\u00d600000.equals((Object)kostenBereich2)) {
                    return false;
                }
                voidsuper voidsuper2 = (voidsuper)object;
                return oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Oo0000, voidsuper2) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.OO0000, voidsuper2) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000, voidsuper2) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000, voidsuper2) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super, voidsuper2);
            }

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2, KostenEntry kostenEntry, HEW2 hEW2) {
                return this.darfGenutztWerden(object, kostenBereich2) && kostenEntry.\u00d600000 - hEW2.getTalente().getMinimalwertOhneProf((voidsuper)object) <= 6;
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.\u00d600000);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 100;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return null;
            }
        });
        vector.add(new KostenArt("Kampf-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                if (!(object instanceof voidsuper) || !KostenEntry.kostenBereich.\u00d600000.equals((Object)kostenBereich2)) {
                    return false;
                }
                voidsuper voidsuper2 = (voidsuper)object;
                return oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000, voidsuper2);
            }

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2, KostenEntry kostenEntry, HEW2 hEW2) {
                return this.darfGenutztWerden(object, kostenBereich2) && kostenEntry.\u00d600000 - hEW2.getTalente().getMinimalwertOhneProf((voidsuper)object) <= 6;
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.\u00d600000);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 80;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        });
        return vector;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
                arrayList.add(N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
                arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Ringen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Athletik"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schleichen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verstecken"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Glasknochen"));
        arrayList.add(K.o00000("Lahm"));
        arrayList.add(K.o00000("Schlechte Regeneration"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Eisern"));
        oo0O.\u00d300000(K.o00000("Abschaum"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

