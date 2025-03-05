/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.geweihter.Nandus;
import java.util.ArrayList;

public class NandusRechtshelfer
extends Nandus {
    public NandusRechtshelfer() {
        super("Nandus (Rechtshelfer)", 11);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Nandus (Rechtshelfer)";
        }
        return "Nandus (Rechtshelferin)";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d5\u00f4000.toString()));
        arrayList.remove(oooo_0.o00000(while.privatewhilenew.toString()));
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
                int[] nArray = new int[]{4, 3};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                arrayList.remove(voidsuper.thisclassObject);
                arrayList.remove(voidsuper.\u00f80\u00d8000);
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f8O\u00d6000, 1);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

