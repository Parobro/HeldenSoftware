/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.BasisKrieger;
import java.util.ArrayList;

public class Festum
extends BasisKrieger {
    public Festum() {
        super("Festum", 26);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Reiterkampf"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Schwerter"));
                arrayList.add(N.floatsuper().\u00d200000("S\u00e4bel"));
                arrayList.add(N.floatsuper().\u00d200000("Hiebwaffen"));
                int[] nArray = new int[]{6, 4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anderthalbh\u00e4nder"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lanzenreiten"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Reiten"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Staatskunst"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Tulamidya"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Alaani"), 4);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Kriegsreiterei"));
        return arrayList;
    }

    @Override
    public String toString() {
        return "Hohe Festumer Kavaliersakademie";
    }
}

