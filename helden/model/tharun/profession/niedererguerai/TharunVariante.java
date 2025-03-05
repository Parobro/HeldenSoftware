/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.niedererguerai;

import helden.framework.D.P;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.model.tharun.profession.niedererguerai.NiedererGueraiVariante;
import java.util.ArrayList;
import java.util.Vector;

public class TharunVariante
extends NiedererGueraiVariante {
    public TharunVariante() {
        super("Niederer Guerai aus Tharun", "Niederer Guerai aus Tharun");
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        Vector<KostenArt> vector = super.getPunktePools(floatsuper2);
        vector.add(new KostenArt("SF-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                return object instanceof P && KostenEntry.kostenBereich.class.equals((Object)kostenBereich2) && ((P)object).\u00f400000();
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.class);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 300;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        });
        vector.add(new KostenArt("vSF-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                return object instanceof P && KostenEntry.kostenBereich.\u00d800000.equals((Object)kostenBereich2) && ((P)object).\u00f400000();
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.\u00d800000);
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
        return vector;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Anderthalbh\u00e4nder"));
                arrayList.add(N.floatsuper().\u00d200000("Fechtwaffen"));
                arrayList.add(N.floatsuper().\u00d200000("S\u00e4bel"));
                arrayList.add(N.floatsuper().\u00d200000("Schwerter"));
                arrayList.add(N.floatsuper().\u00d200000("Zweihandschwerter/-s\u00e4bel"));
                int[] nArray = new int[]{6, 4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Belagerungswaffen"));
                arrayList.add(N.floatsuper().\u00d200000("Bogen"));
                arrayList.add(N.floatsuper().\u00d200000("Diskus"));
                arrayList.add(N.floatsuper().\u00d200000("Feuerwaffen"));
                arrayList.add(N.floatsuper().\u00d200000("Wurfbeile"));
                arrayList.add(N.floatsuper().\u00d200000("Wurfspeere"));
                int[] nArray = new int[]{4, 2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(N.floatsuper().\u00d200000("Dolche"));
                arrayList.add(N.floatsuper().\u00d200000("Raufen"));
                arrayList.add(N.floatsuper().\u00d200000("Ringen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(N.floatsuper().\u00d200000("Akrobatik"));
                arrayList.add(N.floatsuper().\u00d200000("Athletik"));
                arrayList.add(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"));
                arrayList.add(N.floatsuper().\u00d200000("Reiten"));
                arrayList.add(N.floatsuper().\u00d200000("Tanzen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

