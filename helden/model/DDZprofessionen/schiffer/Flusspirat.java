/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.schiffer;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.schiffer.Schiffer;
import java.util.ArrayList;

public class Flusspirat
extends Schiffer {
    public Flusspirat() {
        super("Flusspirat", 4);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Flusspirat";
        }
        return "Flusspiratin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(E.\u00f5\u00d5\u00d8000, 3);
        k_02.\u00d200000(E.o\u00d6\u00d8000, 1);
        k_02.\u00d200000(voidsuper.thisvoidObject, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.thisclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00f6\u00d5000, 2);
        return k_02;
    }
}

