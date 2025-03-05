/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OoOO.U;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.kultur.AuelfenSippe;
import helden.model.kultur.WaldelfenSippe;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public abstract class Donnerbach
extends StandardMagierVariante {
    public Donnerbach(String string, int n) {
        super(string, n);
        this.oO\u00d2O00 = "keine";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
                u2.\u00d500000(new AuelfenSippe().getKulturkundeBezeichnung());
                arrayList.add(u2);
                u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
                u2.\u00d500000(new WaldelfenSippe().getKulturkundeBezeichnung());
                arrayList.add(u2);
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d2000));
                arrayList.add(this.getZauber(Zauber.\u00d4\u00f8\u00d3000));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.\u00d3\u00f8\u00d3000));
                arrayList.add(this.getZauber(Zauber.O\u00d3\u00d4000));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(E.\u00d3\u00d4\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 3);
        k_02.\u00d200000(voidsuper.StringvoidObject, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 5);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 6);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 5);
        k_02.\u00d200000(G.\u00d5\u00f8\u00f4000, 8);
        k_02.\u00d200000(G.\u00d3\u00f8\u00f5000, 5);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 8);
        k_02.\u00d200000(G.\u00d3\u00f4\u00f5000, 4);
        k_02.\u00d200000(G.\u00d5\u00d4\u00f5000, 2);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.StringObjectObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.\u00d200000(voidsuper.privateObjectObject, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00d8oo000);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.thisfloat);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        arrayList.add(new for(while.fornullsuper));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        ArrayList<public> arrayList = new ArrayList<public>(2);
        arrayList.add(helden.framework.C.K.o00000(I.\u00f5\u00f40000));
        arrayList.add(helden.framework.C.K.o00000(I.o\u00d60000));
        return new o00o_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5oo000, "V\u00f6lkerverst\u00e4ndigung zwischen Menschen und Elfen", 4));
        M m = (M)helden.framework.C.K.o00000(I.O\u00d4O000);
        m.\u00d2o0000();
        m.o00000(o00O.\u00f8\u00d20000);
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = new WaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00f8\u00d6\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00f8\u00f5\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00d80\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00f5\u00d3\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.forpublicnew, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00d5\u00d5\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00d3\u00d3\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00d5\u00d5\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.returnifnew, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.privatefloatnew, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.newwhilenew, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.fordonew, K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00d5\u00d8\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f5\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5o\u00d5000, K.\u00f4o0000, ""));
        return waehlbareZauber;
    }
}

