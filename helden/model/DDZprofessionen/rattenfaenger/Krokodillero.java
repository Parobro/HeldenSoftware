/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.rattenfaenger;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.rattenfaenger.VarianteRattenfaenger;
import java.util.ArrayList;

public class Krokodillero
extends VarianteRattenfaenger {
    public Krokodillero() {
        super("Krokodillero", 0);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Krokodillero";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{3, 1};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, -2);
        k_02.\u00d200000(E.newnewString, -2);
        k_02.\u00d200000(voidsuper.returnforObject, -2);
        k_02.\u00d200000(voidsuper.returnprivateObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00d6\u00d5000);
        k_02.\u00d200000(voidsuper.thisclassObject, 3);
        return k_02;
    }
}

