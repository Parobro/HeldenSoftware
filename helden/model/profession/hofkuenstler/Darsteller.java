/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.hofkuenstler;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.hofkuenstler.Hofkuenstler;
import java.util.ArrayList;

public class Darsteller
extends Hofkuenstler {
    public Darsteller() {
        super("Darsteller", 0);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return super.getAnzahlTalentAuswahlen() + 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Darsteller";
        }
        return "Darstellerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 3: {
                arrayList.add(voidsuper.newnewObject);
                arrayList.add(voidsuper.newnullObject);
                int[] nArray = new int[]{6, 4};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.forclassObject, 4);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        return k_02;
    }
}

