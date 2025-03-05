/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.kymanai;

import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OoOO.newsuper;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.E.A;
import helden.framework.E.C.I;
import helden.framework.E.F;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.Object;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.N;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KymanaiVariante
extends helden.framework.int.N
implements helden.framework.oOoO.A.Object {
    List<P> \u00d8\u00f8\u00f4O00 = new ArrayList<P>();

    public KymanaiVariante() {
        super("Kymanai", "Kymanai", 12, false);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Reittier");
        arrayList.add("Begleittier");
        return arrayList;
    }

    @Override
    public ArrayList<helden.framework.C.I> getEmpfohleneVorteile() {
        ArrayList<helden.framework.C.I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Ausdauernd"));
        arrayList.add(helden.framework.C.K.o00000("Eisern"));
        arrayList.add(helden.framework.C.K.o00000("Gefahreninstinkt"));
        arrayList.add(helden.framework.C.K.o00000(helden.framework.C.I.privatesuper));
        arrayList.add(helden.framework.C.K.o00000(helden.framework.C.I.\u00d8O\u00d2000));
        arrayList.add(helden.framework.C.K.o00000("Tierfreund"));
        arrayList.add(helden.framework.C.K.o00000("Zus\u00e4tzliche Runensteine"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 9;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("IN"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Empathisches Band"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Grundfixierung"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Reittier: Jagd"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Reittier: R\u00fcckkehr"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Reittier: Sp\u00fcrsinn"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Ritualkenntnis: Kymanai"));
        arrayList.add(helden.framework.d.oooo_0.o00000("St\u00e4rkung des Bandes"));
        arrayList.addAll(this.\u00d8\u00f8\u00f4O00);
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Peitsche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schleuder"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Klettern"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Reiten"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 3);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fallen stellen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Abrichten"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Gift"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Holzbearbeitung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lederarbeiten"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Viehzucht"), 4);
        k_02.\u00d200000(voidsuper.forfloatObject, 4);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Gesucht"));
        arrayList.add(helden.framework.C.K.o00000("Lichtscheu"));
        arrayList.add(helden.framework.C.K.o00000("Randgruppe"));
        arrayList.add(helden.framework.C.K.o00000("Fettleibig"));
        arrayList.add(helden.framework.C.K.o00000("Glasknochen"));
        arrayList.add(helden.framework.C.K.o00000("Raumangst"));
        arrayList.add(helden.framework.C.K.o00000("Weltfremd"));
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0();
        List<String> list = Arrays.asList("Sehen", "F\u00fchlen", "H\u00f6ren", "Schmecken", "Erde", "Feuer", "Luft", "Wasser", "Geist");
        newsuper newsuper2 = new newsuper();
        for (F f2 : O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(Object.\u00d200000)) {
            F f3;
            try {
                f3 = f2.\u00f400000();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                throw new IllegalStateException();
            }
            I i2 = (I)f3.o00000(A.\u00d400000, 0);
            o0Oo o0Oo2 = i2.o\u00d30000();
            i2.o00000(I._o.o00000);
            if (!list.contains(o0Oo2.\u00d400000())) continue;
            newsuper2.\u00d3\u00d40000();
            newsuper2.\u00d500000(o0Oo2.\u00d400000());
            Q q = newsuper2.o\u00d40000().get(0);
            oooo_02.o00000(new b_0("Rune " + o0Oo2.\u00d400000() + ", Runenmeditation und RfW 6", f3, q, new interface(q.\u00d5O0000(), 3)));
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Viertelzauberer"));
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
        this.\u00d8\u00f8\u00f4O00.add(p2);
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
        throw new RuntimeException("Nicht implementiert");
    }
}

