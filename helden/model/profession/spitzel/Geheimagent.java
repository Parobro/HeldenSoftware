/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.spitzel;

import helden.framework.C.I;
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

public class Geheimagent
extends Spitzel {
    public Geheimagent() {
        super("Geheimagent", 3);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Geheimagent";
        }
        return "Geheimagentin";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 2: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.nullObjectObject);
                arrayList.add(voidsuper.\u00d5\u00d4\u00d6000);
                arrayList.add(voidsuper.o\u00f4\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 3);
        k_02.\u00d200000(voidsuper.newnullObject, 1);
        k_02.\u00d200000(voidsuper.forclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d6\u00d6000, 2);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d4oo000));
        oo0O.\u00d300000(K.o00000(I.\u00d5oo000, "gegen\u00fcber Auftraggeber und eigenes Land", 5));
        return oo0O;
    }
}

