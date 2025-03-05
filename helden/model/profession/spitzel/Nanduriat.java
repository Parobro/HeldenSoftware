/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.spitzel;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.spitzel.Spitzel;
import java.util.ArrayList;

public class Nanduriat
extends Spitzel {
    public Nanduriat() {
        super("Nanduriat", 4);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Nanduriat";
        }
        return "Nanduriatin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 2: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.forpublicObject, 5);
        k_02.\u00d200000(voidsuper.nullObjectObject, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(voidsuper3, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00d8\u00d5000, -1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d4oo000));
        J j2 = (J)K.o00000(I.\u00d50o000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

