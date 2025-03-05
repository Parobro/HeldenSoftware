/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
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
import helden.model.profession.geweihter.FirunWaldlaeufer;
import java.util.ArrayList;

public class FirunThorwal
extends FirunWaldlaeufer {
    public FirunThorwal() {
        super("Firun aus Thorwal ", 23);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hundeschlitten mit Tieren");
        arrayList.add("Packtier mit Taschen");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Firun aus Thorwal (UdW)";
        }
        return "Firun aus Thorwal (UdW)";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 1: {
                return new objectsuper_0(this.getProfession(), this.getProfession().getSetting().getGelaendekunden(), 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d5\u00d2000, E.\u00d3\u00d6\u00d8000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.Oo\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.forvoidObject);
                arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
                int[] nArray = new int[]{5, 4};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.o\u00f6\u00d6000);
                arrayList.add(voidsuper.returnifObject);
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 4);
        k_02.\u00d200000(E.\u00d3\u00d5\u00d8000, 4);
        k_02.\u00d200000(E.o\u00d6\u00d8000, 5);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 4);
        k_02.\u00d200000(voidsuper.returnforObject, -2);
        k_02.\u00d200000(voidsuper.thisvoidObject, -2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d3\u00d8000, 3);
        k_02.\u00d200000(G.o\u00f4\u00f5000, 2);
        k_02.\u00d200000(G.\u00f8\u00f8\u00f5000, 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 4);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for<String>(E.\u00d3\u00d6\u00d8000.toString(), while.\u00f6\u00d5\u00d2000, false));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

