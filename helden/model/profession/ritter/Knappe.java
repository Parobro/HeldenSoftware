/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.ritter;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.ritter.BasisRitter;
import java.util.ArrayList;

public class Knappe
extends BasisRitter {
    public Knappe() {
        super("Knappe", -10);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Knappe";
        }
        return "Knappin";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.remove(oooo_0.o00000(while.\u00f5\u00f4\u00d5000.toString()));
        arrayList.remove(oooo_0.o00000(while.Stringif.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d8\u00d6\u00d8000);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.thissuperString);
                arrayList.add(E.ifthisString);
                int[] nArray = new int[]{6, 3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.O\u00d6\u00d8000, -2);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, -2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, -1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, -2);
        k_02.\u00d200000(voidsuper.nullvoidObject, -2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f5\u00f4\u00d5000));
        arrayList.remove(new for(while.\u00f8\u00f5\u00d5000));
        arrayList.remove(new for(while.\u00d6\u00d3\u00d2000));
        return arrayList;
    }

    @Override
    public boolean istZeitaufwendig() {
        return false;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

