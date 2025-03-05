/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public class Mherwed
extends StandardMagierVariante {
    public Mherwed() {
        super("Mherwed", 23);
        this.oO\u00d2O00 = "grau";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.newwhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Gro\u00dfe Elementarium");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.thisintsuper);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.\u00f5\u00d50000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
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
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00d3\u00f5\u00d3000.toString()));
                arrayList.add(oooo_0.o00000(while.Stringwhilesuper.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d5\u00f4\u00f4000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f8\u00f6\u00d4000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f6\u00d8O000.toString()));
                arrayList.add(oooo_0.o00000(while.nullreturnnew.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(this.getZauber(Zauber.\u00d5\u00f6\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d3\u00d3\u00d4000));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.O0\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 2);
        k_02.o00000(voidsuper.StringclassObject, 2);
        k_02.o00000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 4);
        k_02.o00000(voidsuper.oo\u00d6000, 5);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 6);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 5);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(G.\u00f5\u00f6\u00f5000, 5);
        k_02.o00000(G.whileStringclass, 8);
        k_02.o00000(G.\u00d3o\u00f5000, 6);
        k_02.o00000(G.\u00f8\u00f8\u00f4000, 4);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(this.getZauber(Zauber.o\u00d3\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.privateintnew), 6);
        k_02.o00000(this.getZauber(Zauber.nullpublicnew), 5);
        k_02.o00000(this.getZauber(Zauber.O\u00d6\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.O0\u00d5000), 6);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d5000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f4\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d4O\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.newfornew), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.O\u00d3\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d8\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00d2\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f5\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d4\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.returnStringsuper);
        arrayList.add(I.O\u00d2o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d8\u00d8\u00d3000));
        arrayList.add(new for(while.oO\u00d8000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        arrayList.add(new for(while.\u00d8\u00d2\u00d8000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5oo000, "99 Gesetze", 8));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d3\u00d30000, "Kalifat & Akademie"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f8\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f4\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d4000, K.\u00f8O0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.o\u00d3\u00d3000));
        arrayList.add(this.getZauber(Zauber.privateintnew));
        arrayList.add(this.getZauber(Zauber.nullpublicnew));
        arrayList.add(this.getZauber(Zauber.O\u00d6\u00d4000));
        arrayList.add(this.getZauber(Zauber.O0\u00d5000));
        arrayList.add(this.getZauber(Zauber.O\u00d2\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f4\u00d3000));
    }

    @Override
    public String toString() {
        return "Zauberschule des Kalifen zu Mherwed";
    }
}

