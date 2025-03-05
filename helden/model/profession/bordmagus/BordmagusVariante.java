/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.bordmagus;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.Magier;
import java.util.ArrayList;

public class BordmagusVariante
extends helden.framework.int.N {
    public BordmagusVariante() {
        super("Bordmagus", 5);
    }

    @Override
    public int anzahlAktivierbarerZauber() {
        return 0;
    }

    @Override
    public int anzahlWaehlbareHauszauber() {
        return 0;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.\u00d8\u00f5\u00d2000, 1);
        k_02.\u00d200000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.StringwhileString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d8O000.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00f5\u00f4000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d2000, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.newfornew, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d4000, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d4000, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.O\u00d3\u00d4000, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.Stringpublicnew, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f6\u00d4000, K.\u00f4o0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d4000, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.\u00f8O\u00d3000, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d4000, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f8\u00d4000, K.\u00f8O0000, ""));
                arrayList.add(KonkreterZauber.getZauber(Zauber.\u00d80\u00d4000, K.\u00f8O0000, ""));
                ++n;
                int[] nArray = new int[]{3, 3, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 3);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.\u00d200000(E.\u00d5\u00d4\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.returnprivateObject, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 5);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 6);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 5);
        k_02.\u00d200000(voidsuper.thisclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 3);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00d4O\u00d3000, K.\u00f8O0000, ""), 3);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00f8\u00f5\u00d4000, K.\u00f8O0000, ""), 4);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d3000, K.\u00f8O0000, ""), 4);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00d8\u00d3\u00d3000, K.\u00f8O0000, ""), 4);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00d40\u00d5000, K.\u00f8O0000, ""), 4);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.\u00f8\u00d4\u00d4000, K.\u00f8O0000, ""), 3);
        k_02.\u00d200000(KonkreterZauber.getZauber(Zauber.ifnewnew, K.\u00f8O0000, ""), 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f4o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00f8\u00f6\u00d5000));
        arrayList.add(new for(while.o\u00f8\u00d3000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        return arrayList;
    }

    @Override
    public int getVerrechnungspunkte() {
        return 0;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f5\u00d8o000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d2000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newfornew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d3\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringpublicnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8O\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f8\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d80\u00d4000, K.\u00f8O0000, ""));
        Magier magier = new Magier();
        magier.setSetting(this.getSetting());
        helden.framework.int.P p2 = magier.getOlport();
        p2.setProfession(magier);
        magier.waehleVariante(p2);
        for (KonkreterZauber konkreterZauber : magier.getWaehlbareZauber().getZauberListe()) {
            if (!konkreterZauber.getRep().equals(K.\u00f8O0000) || !konkreterZauber.hatMerkmal(o00O.\u00f400000) && !konkreterZauber.hatMerkmal(o00O.\u00d2\u00d20000)) continue;
            waehlbareZauber.add(konkreterZauber);
        }
        return waehlbareZauber;
    }

    @Override
    public K repraesenationVerrechnungspunkte() {
        return null;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d4O\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f5\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d3\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d40\u00d5000));
    }
}

