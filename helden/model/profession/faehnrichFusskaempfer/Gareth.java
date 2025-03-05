/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.faehnrichFusskaempfer;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.faehnrichFusskaempfer.BasisFaehnrichFusskaempfer;
import java.util.ArrayList;

public class Gareth
extends BasisFaehnrichFusskaempfer {
    public Gareth() {
        super("Gareth", 20);
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
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f4\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 3: {
                ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
                arrayList.add(E.\u00d8\u00d6\u00d8000);
                arrayList.add(E.ifthisString);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d4\u00d6\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 3);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.\u00d5\u00d4\u00d4000));
        arrayList.remove(new for(while.\u00f5\u00f4\u00d5000));
        arrayList.add(new for(while.\u00f50o000));
        arrayList.add(new for(while.\u00d8\u00f4\u00d5000));
        arrayList.add(new for(while.\u00d6\u00f6\u00f5000));
        return arrayList;
    }

    @Override
    public String toString() {
        return "Gareth";
    }
}

