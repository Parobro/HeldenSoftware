/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.AlAnfa;
import java.util.ArrayList;

public class AlAnfaLeibmagier
extends AlAnfa {
    public AlAnfaLeibmagier() {
        super("Al'Anfa (Leibmagier)", 25);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("pers\u00f6nlicher Stab");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d4\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d2\u00d8000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(this.getZauber(Zauber.\u00d80\u00d5000));
                arrayList.add(this.getZauber(Zauber.fordonew));
                arrayList.add(this.getZauber(Zauber.\u00d5\u00d8\u00d4000));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.o\u00d2\u00d5000));
                arrayList.add(this.getZauber(Zauber.\u00f50\u00d5000));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(this.getZauber(Zauber.\u00d8\u00d8\u00d3000));
                arrayList.add(this.getZauber(Zauber.\u00d5\u00d5\u00d3000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.\u00d200000(E.\u00d3\u00d4\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 4);
        k_02.\u00d200000(voidsuper.forpublicObject, 2);
        k_02.\u00d200000(voidsuper.forclassObject, 3);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 1);
        k_02.\u00d200000(voidsuper.nullObjectObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 5);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.\u00d200000(G.\u00d3\u00f8\u00f5000, 5);
        k_02.\u00d200000(G.\u00d5o\u00f5000, 5);
        k_02.\u00d200000(G.newwhileString, 5);
        k_02.\u00d200000(G.\u00f5\u00f6\u00f5000, 3);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 8);
        k_02.\u00d200000(G.\u00d3o\u00f5000, 4);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d6\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00f6\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d40\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d2\u00d3000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d2\u00d5000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.newfornew), 4);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f5\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00f8\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d3\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00f5\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00d2\u00d5000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.Stringpublicnew), 4);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f6\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d6\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4o\u00d5000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 5);
        k_02.\u00d200000(voidsuper.\u00f5\u00d8\u00d6000, 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.returninterfacenew));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        arrayList.add(new for(while.oo\u00d3000));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d8\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8o\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d40\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d5\u00d2\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00d3\u00d4000));
        arrayList.add(this.getZauber(Zauber.O\u00d2\u00d5000));
    }

    @Override
    public String toString() {
        return "Universit\u00e4t von Al'Anfa - Leibmagier-Zweig";
    }
}

