/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.geweihter.Nandus;
import java.util.ArrayList;

public class NandusStratege
extends Nandus {
    public NandusStratege() {
        super("Nandus (Stratege)", 17);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 8;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Nandus (Stratege)";
        }
        return "Nandus (Strategin)";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.nullvoidObject, "Strategie"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.remove(voidsuper.\u00d5\u00d4\u00d6000);
                arrayList.remove(voidsuper.oo\u00d6000);
                arrayList.remove(voidsuper.\u00d3\u00d8\u00d6000);
                arrayList.remove(voidsuper.\u00f5\u00f5\u00d5000);
                arrayList.remove(voidsuper.thisintObject);
                arrayList.remove(voidsuper.\u00f5\u00d2\u00d6000);
                arrayList.remove(voidsuper.\u00f4\u00d2\u00d6000);
                arrayList.remove(voidsuper.\u00f8\u00f4\u00d5000);
                arrayList.remove(voidsuper.O\u00f4\u00d5000);
                arrayList.remove(voidsuper.\u00d5\u00f5\u00d5000);
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                arrayList.remove(voidsuper.thisclassObject);
                arrayList.remove(voidsuper.\u00f80\u00d8000);
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
            case 7: {
                arrayList.add(E.thissuperString);
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.nullObjectObject, 3);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 4);
        k_02.\u00d200000(voidsuper.nullvoidObject, 7);
        k_02.\u00d200000(voidsuper.ifnullObject, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.StringthisObject));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

