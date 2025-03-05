/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.D.for;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.BasisKrieger;
import java.util.ArrayList;

public class Birkholter
extends BasisKrieger {
    public Birkholter() {
        super("Birkholter", 25);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("AuP"), 2);
        return k_02;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Schwerter"));
                arrayList.add(N.floatsuper().\u00d200000("Hiebwaffen"));
                int[] nArray = new int[]{7, 5};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Anderthalbh\u00e4nder"));
                arrayList.add(N.floatsuper().\u00d200000("S\u00e4bel"));
                arrayList.add(E.ifthisString);
                int[] nArray = new int[]{2, 1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(N.floatsuper().\u00d200000("Hauswirtschaft"));
                arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
                int[] nArray = new int[]{2, 1};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
                arrayList.add(N.floatsuper().\u00d200000("Wettervorhersage"));
                arrayList.add(N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Wunden"));
                int[] nArray = new int[]{3, 2, 1, 1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lanzenreiten"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Klettern"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Reiten"), -2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), -1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("F\u00e4hrtensuchen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Bosparano"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schneidern"), 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Schildkampf II"));
        return arrayList;
    }

    @Override
    public String toString() {
        return "Drachenstreiter-Akademie zu Birkholt";
    }
}

