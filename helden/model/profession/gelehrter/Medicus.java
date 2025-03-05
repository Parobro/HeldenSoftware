/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.gelehrter;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.gelehrter.Gelehrter;
import java.util.ArrayList;

public class Medicus
extends Gelehrter {
    public Medicus() {
        super("Medicus", 4);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Medicus";
        }
        return "Medica";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                return new returnsuper(this.getProfession(), arrayList, 4, 2);
            }
        }
        return super.getNextTaPVerteilAuswahl(n);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 4: {
                arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00f5\u00d6000);
                arrayList.add(voidsuper.StringObjectObject);
                arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
                int[] nArray = new int[]{7, 5, 3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.newnewString, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.o00000(voidsuper.thisinterfaceObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d3\u00d8000, 5);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.whilereturn);
        return arrayList;
    }
}

