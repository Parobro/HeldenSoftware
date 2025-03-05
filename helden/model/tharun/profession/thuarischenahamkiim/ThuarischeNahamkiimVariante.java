/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.thuarischenahamkiim;

import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OoOO.newsuper;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.E.A;
import helden.framework.E.C.I;
import helden.framework.E.F;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.Object;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThuarischeNahamkiimVariante
extends helden.framework.int.N
implements helden.framework.oOoO.A.Object {
    private ArrayList<P> \u00f5\u00f8\u00f4O00 = new ArrayList();
    private ArrayList<for> \u00f4\u00f8\u00f4O00 = super.getVerbilligteSonderfertigkeiten();

    public ThuarischeNahamkiimVariante() {
        super("Thuarische Nahamkiim", "Thuarische Nahamkiim", 13, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
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
    public int getMaximalSozialstatus() {
        return 8;
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
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Aura verh\u00fcllen"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Eiserner Wille I"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d3\u00f4\u00d2000));
        arrayList.add(helden.framework.d.oooo_0.o00000("Runenorakel"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Zauber bereithalten"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Zauberkontrolle"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Zauberroutine"));
        arrayList.addAll(this.\u00f5\u00f8\u00f4O00);
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                for (oo0o_0 oo0o_02 : this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000)) {
                    arrayList.add(oo0o_02);
                }
                java.lang.Object object = new int[]{5, 5};
                return new m_0(arrayList, (int[])object);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schriftlicher Ausdruck"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kryptographie"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachenkunde"), 4);
        k_02.\u00d200000(G.\u00d4\u00d2\u00f5000, 2);
        k_02.\u00d200000(G.\u00f8O\u00f5000, 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Alchimie"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        k_02.\u00d200000(voidsuper.ifnewObject, 4);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Arkanophobie"));
        arrayList.add(helden.framework.C.K.o00000("Impulsiv"));
        arrayList.add(helden.framework.C.K.o00000("J\u00e4hzorn"));
        arrayList.add(helden.framework.C.K.o00000("Unstet"));
        arrayList.add(helden.framework.C.K.o00000("Wilde Magie"));
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        Q q;
        o0Oo o0Oo2;
        I i2;
        F f2;
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(){

            @Override
            public boolean \u00d200000(List<b_0> list) {
                return list.size() == 4 && this.\u00d800000(list) <= 10 && this.\u00d600000(list) == 4 && this.\u00d500000(list) == 18;
            }

            @Override
            public String o00000() {
                return "W\u00e4hle 2x Runen inkl. Runenmeditationen und RfW +7 und 2x Runen inkl. RfW +5:";
            }

            @Override
            public String o00000(List<b_0> list) {
                String string = "Wert: " + this.\u00d800000(list) + " von 10; Anzahl: " + list.size() + " von 4";
                return string;
            }

            private int \u00d800000(List<b_0> list) {
                int n = 0;
                for (b_0 b_02 : list) {
                    F f2 = (F)b_02.Object().get(0);
                    I i2 = (I)f2.o00000(A.\u00d400000, 0);
                    n += i2.o\u00d30000().Object();
                }
                return n;
            }

            private int \u00d500000(List<b_0> list) {
                int n = 0;
                for (b_0 b_02 : list) {
                    interface interface_ = (interface)b_02.Object().get(2);
                    n += interface_.\u00d300000().intValue();
                }
                return n;
            }

            private int \u00d600000(List<b_0> list) {
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
        for (F f3 : O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(Object.\u00d200000)) {
            try {
                f2 = f3.\u00f400000();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                throw new IllegalStateException();
            }
            i2 = (I)f2.o00000(A.\u00d400000, 0);
            o0Oo2 = i2.o\u00d30000();
            i2.o00000(I._o.String);
            if (o0Oo2.Object() > 5) continue;
            newsuper2.\u00d3\u00d40000();
            newsuper2.\u00d500000(o0Oo2.\u00d400000());
            q = newsuper2.o\u00d40000().get(0);
            oooo_02.o00000(new b_0("Rune " + o0Oo2.\u00d400000() + " (Wert: " + o0Oo2.Object() + "), Runenmeditation und RfW 7", f2, q, new interface(q.\u00d5O0000(), 4)));
        }
        for (F f3 : O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(Object.\u00d200000)) {
            try {
                f2 = f3.\u00f400000();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                throw new IllegalStateException();
            }
            i2 = (I)f2.o00000(A.\u00d400000, 0);
            o0Oo2 = i2.o\u00d30000();
            i2.o00000(I._o.String);
            if (o0Oo2.Object() > 5) continue;
            newsuper2.\u00d3\u00d40000();
            newsuper2.\u00d500000(o0Oo2.\u00d400000());
            q = newsuper2.o\u00d40000().get(0);
            for for_ = for.o00000(q).get(0);
            oooo_02.o00000(new b_0("Rune " + o0Oo2.\u00d400000() + " (Wert: " + o0Oo2.Object() + ") und RfW 5, Runenmeditation verbilligt", f2, for_, new interface(q.\u00d5O0000(), 5)));
        }
        oooo_02.o00000(-1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000(while.\u00f6\u00f5\u00f6000.toString()));
        arrayList.addAll(for.\u00d200000("Gedankenschutz"));
        arrayList.addAll(for.\u00d200000("Meisterliche Zauberkontrolle I"));
        arrayList.addAll(for.\u00d200000("Meisterliche Zauberkontrolle II"));
        arrayList.addAll(this.\u00f4\u00f8\u00f4O00);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Vollzauberer"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Randgruppe"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verpflichtungen", "Herrscher/Orden"));
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
        this.\u00f5\u00f8\u00f4O00.add(p2);
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, K k2, boolean bl) {
        if (oo0o_02 == null) {
            helden.framework.held.object.oooo_0.\u00f500000("Talent is null");
        }
        k2.\u00f8O0000().\u00d300000((voidsuper)oo0o_02, n);
        this.setTalentauswahl(oo0o_02, n);
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        this.\u00f4\u00f8\u00f4O00.add(for_);
    }
}

