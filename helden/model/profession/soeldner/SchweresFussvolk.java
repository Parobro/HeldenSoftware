/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.soeldner;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.soeldner.Soeldner;
import java.util.ArrayList;

public class SchweresFussvolk
extends Soeldner {
    public SchweresFussvolk() {
        super("Schweres Fu\u00dfvolk", 8);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Schweres Fu\u00dfvolk";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00f4O000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(E.\u00d8\u00d5\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.ifthisString);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00f4\u00d6000));
        arrayList.add(new for(while.\u00f8\u00d3\u00d2000));
        arrayList.add(new for(while.ifdoString));
        arrayList.add(new for(while.\u00f6\u00d20000));
        arrayList.remove(new for(while.o\u00d6\u00d4000));
        return arrayList;
    }
}

