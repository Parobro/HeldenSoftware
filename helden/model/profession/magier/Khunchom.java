/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
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
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public class Khunchom
extends StandardMagierVariante {
    public Khunchom() {
        super("Khunchom", 29);
        this.oO\u00d2O00 = "grau";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.newwhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Ringkunde f\u00fcr Anf\u00e4nger");
        arrayList.add("Reisek\u00f6fferchen");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d3\u00d3O000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
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
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.\u00d3\u00f4\u00d2000, -1);
        return k_02;
    }

    @Override
    public int getPermanenteASP() {
        return -2;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.oO\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f8\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d8\u00d6000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.whileStringObject);
                arrayList.add(voidsuper.\u00d50\u00d8000);
                arrayList.add(voidsuper.\u00f40\u00d8000);
                arrayList.add(voidsuper.\u00d3\u00d8\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.o\u00f6\u00d5000);
                arrayList.add(voidsuper.O\u00f5\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00d8\u00d8\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                arrayList.add(voidsuper.StringfloatObject);
                arrayList.add(voidsuper.newreturnObject);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(this.getZauber(Zauber.\u00f4\u00f5\u00d3000));
                arrayList.add(this.getZauber(Zauber.ififnew));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d5O\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 1);
        k_02.o00000(voidsuper.O0\u00d6000, 3);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 2);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 6);
        k_02.o00000(voidsuper.\u00f4\u00f6\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.thisintObject, 2);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 6);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 5);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(G.whilewhileString, 4);
        k_02.o00000(G.\u00d50\u00f5000, 4);
        k_02.o00000(G.\u00d3\u00f8\u00f5000, 4);
        k_02.o00000(G.\u00f5\u00f6\u00f5000, 6);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 6);
        k_02.o00000(G.\u00d3o\u00f5000, 8);
        k_02.o00000(G.\u00f8\u00f8\u00f4000, 5);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 7);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 5);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d6\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.nullclassnew), 5);
        k_02.o00000(this.getZauber(Zauber.privateintnew), 6);
        k_02.o00000(this.getZauber(Zauber.nullpublicnew), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00f4\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.O\u00f6\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d5\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.o\u00d3\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.newfornew), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00d2\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.O0\u00d5000), 1);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d4\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d5\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d6\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d5000), 2);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 3);
        k_02.o00000(voidsuper.\u00f5\u00d8\u00d6000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f6\u00f8\u00d8000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d6\u00f5000));
        arrayList.add(new for(while.privateifObject));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)helden.framework.C.K.o00000(I.privateclass);
        j2.oO0000(7);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.whilenewsuper, 1500));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.O\u00d5o000, "echsische Wesen", 6));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.whileStringnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullclassnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d2\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d4\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f40\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f6\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d4000, K.\u00f8O0000, ""));
        for (KonkreterZauber konkreterZauber : waehlbareZauber.getZauberListe()) {
            if (!konkreterZauber.hatMerkmal(o00O.\u00d400000) && !konkreterZauber.hatMerkmal(o00O.\u00d2O0000) && !konkreterZauber.hatMerkmal(o00O.\u00d4\u00d30000) && !konkreterZauber.hatDaemonischesMerkmal() || konkreterZauber.hatMerkmal(o00O.\u00d300000)) continue;
            waehlbareZauber.add(konkreterZauber, 1);
        }
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.nullclassnew));
        arrayList.add(this.getZauber(Zauber.privateintnew));
        arrayList.add(this.getZauber(Zauber.nullpublicnew));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00f4\u00d4000));
        arrayList.add(this.getZauber(Zauber.O\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d5\u00d3000));
    }

    @Override
    public String toString() {
        return "Drachenei-Akademie zu Khunchom";
    }
}

