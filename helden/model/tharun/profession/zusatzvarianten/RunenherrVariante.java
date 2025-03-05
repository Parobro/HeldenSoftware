/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.zusatzvarianten;

import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OoOO.newsuper;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.E.A;
import helden.framework.E.C.I;
import helden.framework.E.F;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.Object;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo.h_0;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class RunenherrVariante
extends helden.framework.int.N
implements helden.framework.oOoO.A.Object {
    private ArrayList<for> thissuperfloat = new ArrayList();

    public RunenherrVariante() {
        super("Runenherr", "Runenherr", 10, true);
    }

    @Override
    public ArrayList<helden.framework.C.I> getEmpfohleneVorteile() {
        ArrayList<helden.framework.C.I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Astralmacht"));
        arrayList.add(helden.framework.C.K.o00000("Gebildet"));
        arrayList.add(helden.framework.C.K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(helden.framework.C.K.o00000("Zus\u00e4tzliche Runensteine"));
        arrayList.add(helden.framework.C.K.o00000("Verh\u00fcllte Aura"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("IN"))) {
            return 14;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KL"))) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        Vector<KostenArt> vector = super.getPunktePools(floatsuper2);
        vector.add(new KostenArt("Talent-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(java.lang.Object object, KostenEntry.kostenBereich kostenBereich2) {
                if (!(object instanceof voidsuper) || !KostenEntry.kostenBereich.\u00d600000.equals((java.lang.Object)kostenBereich2)) {
                    return false;
                }
                voidsuper voidsuper2 = (voidsuper)object;
                return oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper, voidsuper2) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000, voidsuper2) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000, voidsuper2) || voidsuper2.equals(voidsuper.\u00f5o\u00d6000);
            }

            @Override
            public boolean darfGenutztWerden(java.lang.Object object, KostenEntry.kostenBereich kostenBereich2, KostenEntry kostenEntry, HEW2 hEW2) {
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
                return 50;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return null;
            }
        });
        vector.add(new KostenArt("RfW-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(java.lang.Object object, KostenEntry.kostenBereich kostenBereich2) {
                if (!(object instanceof voidsuper) || !KostenEntry.kostenBereich.\u00d600000.equals((java.lang.Object)kostenBereich2)) {
                    return false;
                }
                voidsuper voidsuper2 = (voidsuper)object;
                return oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d800000, voidsuper2);
            }

            @Override
            public boolean darfGenutztWerden(java.lang.Object object, KostenEntry.kostenBereich kostenBereich2, KostenEntry kostenEntry, HEW2 hEW2) {
                return this.darfGenutztWerden(object, kostenBereich2) && kostenEntry.\u00d600000 <= 7;
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.\u00d600000);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 60;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return null;
            }
        });
        return vector;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d3\u00f4\u00d2000));
        arrayList.add(helden.framework.d.oooo_0.o00000("Runenorakel"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 6);
        k_02.\u00d200000(voidsuper.ifnewObject, 4);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Arkanophobie"));
        arrayList.add(helden.framework.C.K.o00000("Impulsiv"));
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        int n;
        java.lang.Object object;
        java.lang.Object object2;
        Comparable<o0Oo> comparable;
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(){

            @Override
            public boolean \u00d200000(List<b_0> list) {
                return list.size() == 3 && this.String(list) <= 6 && this.\u00d300000(list) == 3;
            }

            @Override
            public String o00000() {
                return "W\u00e4hle 3 Runen und 3 verbilligte Runenmeditation";
            }

            @Override
            public String o00000(List<b_0> list) {
                String string = "Wert: " + this.String(list) + " von 6; Anzahl: " + list.size() + " von 3";
                return string;
            }

            private int String(List<b_0> list) {
                int n = 0;
                for (b_0 b_02 : list) {
                    F f2 = (F)b_02.Object().get(0);
                    I i2 = (I)f2.o00000(A.\u00d400000, 0);
                    n += i2.o\u00d30000().Object();
                }
                return n;
            }

            private int \u00d300000(List<b_0> list) {
                HashSet<o0Oo> hashSet = new HashSet<o0Oo>();
                for (b_0 b_02 : list) {
                    F f2 = (F)b_02.Object().get(0);
                    I i2 = (I)f2.o00000(A.\u00d400000, 0);
                    hashSet.add(i2.o\u00d30000());
                }
                return hashSet.size();
            }
        };
        newsuper newsuper2 = new newsuper();
        for (F o0OoArray2 : O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(Object.\u00d200000)) {
            F f2;
            try {
                f2 = o0OoArray2.\u00f400000();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                throw new IllegalStateException();
            }
            I i4 = (I)f2.o00000(A.\u00d400000, 0);
            comparable = i4.o\u00d30000();
            i4.o00000(I._o.String);
            if (comparable.Object() > 5) continue;
            newsuper2.\u00d3\u00d40000();
            newsuper2.\u00d500000(comparable.\u00d400000());
            object2 = newsuper2.o\u00d40000().get(0);
            object = for.o00000(object2).get(0);
            oooo_02.o00000(new b_0("Rune " + comparable.\u00d400000() + " (Wert: " + comparable.Object() + "), Runenmeditation", f2, object));
        }
        oooo_02.o00000(-1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        h_0 h_02 = new h_0();
        oooo_02 = new oooo_0();
        o0Oo[] o0OoArray = new o0Oo[]{o0Oo.oO0000, o0Oo.while, o0Oo.new, o0Oo.o00000, o0Oo.\u00d500000, o0Oo.\u00d4O0000, o0Oo.\u00f500000, o0Oo.\u00f400000};
        int n2 = o0OoArray.length;
        for (n = 0; n < n2; ++n) {
            comparable = o0OoArray[n];
            h_02.\u00d3\u00d40000();
            h_02.\u00d500000(comparable.\u00d400000());
            object2 = h_02.o\u00d40000().get(0);
            object = for.o00000(object2).get(0);
            oooo_02.o00000(new b_0(object));
        }
        o0Oo[] o0OoArray2 = new o0Oo[]{o0Oo.\u00d300000, o0Oo.if, o0Oo.OO0000, o0Oo.\u00d8O0000};
        for (n2 = 0; n2 < o0OoArray2.length - 1; ++n2) {
            for (n = n2 + n2; n < o0OoArray2.length; ++n) {
                if (n2 == n) continue;
                h_02.\u00d3\u00d40000();
                h_02.\u00d500000(o0OoArray2[n2].\u00d400000());
                comparable = h_02.o\u00d40000().get(0);
                object2 = for.o00000((P)comparable).get(0);
                h_02.\u00d3\u00d40000();
                h_02.\u00d500000(o0OoArray2[n].\u00d400000());
                object = h_02.o\u00d40000().get(0);
                for for_ = for.o00000((P)object).get(0);
                oooo_02.o00000(new b_0(object2, for_));
            }
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Aura verh\u00fcllen"));
        arrayList.addAll(this.thissuperfloat);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Halbzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Randgruppe"));
        return oo0O;
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlterVorteil(public public_) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehltesLeittalent(oo0o_0 oo0o_02) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlteSonderfertigkeit(P p2) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, K k2, boolean bl) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        this.thissuperfloat.add(for_);
    }
}

