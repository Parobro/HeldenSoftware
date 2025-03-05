/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.alchimist;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.alchimist.BasisAlchimist;
import java.util.ArrayList;

public class Unau
extends BasisAlchimist {
    public Unau(String string, int n, boolean bl) {
        super(string, n, bl);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return super.getAnzahlTalentAuswahlen() + 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        if (n < super.getAnzahlTalentAuswahlen()) {
            return super.getTalentAuswahl(n);
        }
        if (n == super.getAnzahlTalentAuswahlen()) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            arrayList.add(voidsuper.O\u00f5\u00d6000);
            arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
            int[] nArray = new int[]{3};
            return new m_0(arrayList, nArray);
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.\u00d200000(G.whileStringclass, 5);
        k_02.\u00d200000(G.\u00f8\u00f8\u00f4000, 5);
        k_02.o00000(G.\u00d5\u00d4\u00f5000);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        return k_02;
    }

    @Override
    public String toString() {
        if (this.\u00d8O\u00f5O00) {
            return "Alchimist aus Unau (magiebegabt)";
        }
        return "Alchimist aus Unau";
    }
}

