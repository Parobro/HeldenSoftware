/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.zusatzvarianten;

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
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;

public class MeditationsherrVariante
extends helden.framework.int.N
implements helden.framework.oOoO.A.Object {
    private ArrayList<P> \u00d5\u00f8\u00f4O00 = new ArrayList();

    public MeditationsherrVariante() {
        super("Meditationsherr", "Meditationsherr", 3, true);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<helden.framework.C.I> getEmpfohleneVorteile() {
        ArrayList<helden.framework.C.I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Gutes Ged\u00e4chtnis"));
        arrayList.add(helden.framework.C.K.o00000("Zus\u00e4tzliche Runensteine"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("IN"))) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.addAll(this.\u00d5\u00f8\u00f4O00);
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                for (oo0o_0 oo0o_02 : this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.OO0000, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super)) {
                    arrayList.add(oo0o_02);
                }
                java.lang.Object object = new int[]{2};
                return new m_0(arrayList, (int[])object);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 3);
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
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0();
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
            if (o0Oo2.Object() > 3) continue;
            newsuper2.\u00d3\u00d40000();
            newsuper2.\u00d500000(o0Oo2.\u00d400000());
            Q q = newsuper2.o\u00d40000().get(0);
            oooo_02.o00000(new b_0(f3, q, new interface(q.\u00d5O0000(), 8 - o0Oo2.Object() - 3)));
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        arrayList.add(oooo_02);
        return arrayList;
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
        this.\u00d5\u00f8\u00f4O00.add(p2);
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, K k2, boolean bl) {
        k2.\u00f8O0000().\u00d300000((voidsuper)oo0o_02, n);
        this.setTalentauswahl(oo0o_02, n);
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        throw new RuntimeException("Nicht implementiert");
    }
}

