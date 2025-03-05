/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.for;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Rahja;
import java.util.ArrayList;

public class RahjaMhanadistan
extends Rahja {
    public RahjaMhanadistan() {
        super("Rahja, Mhanadistanischer Ritus", 21);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.newnewObject);
                arrayList.add(voidsuper.\u00d4\u00d8\u00d6000);
                int[] nArray = new int[]{6, 5};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.\u00d200000(E.newnewString, 1);
        k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, -1);
        k_02.\u00d200000(voidsuper.forclassObject, -2);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, -1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f8\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Tr\u00e4nke");
        arrayList.add(for.o00000(voidsuper.o\u00f6\u00d6000, arrayList2, 1));
        return arrayList;
    }
}

