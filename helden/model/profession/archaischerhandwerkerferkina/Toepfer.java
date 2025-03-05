/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.archaischerhandwerkerferkina;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.archaischerhandwerkerferkina.ArchaischerHandwerkerDerFerkinas;
import java.util.ArrayList;

public class Toepfer
extends ArchaischerHandwerkerDerFerkinas {
    public Toepfer() {
        super("T\u00f6pfer", 1);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        int n = 4;
        return n;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "T\u00f6pfer";
        }
        return "T\u00f6pferin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 3: {
                arrayList.add(voidsuper.\u00d5\u00d4\u00d6000);
                arrayList.add(voidsuper.oo\u00d6000);
                arrayList.add(voidsuper.o\u00f4\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00f4\u00d5000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00d3\u00d6000, 7);
        return k_02;
    }
}

