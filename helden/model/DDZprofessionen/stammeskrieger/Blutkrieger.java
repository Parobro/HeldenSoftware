/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.stammeskrieger;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.stammeskrieger.Waldmensch;
import java.util.ArrayList;

public class Blutkrieger
extends Waldmensch {
    public Blutkrieger() {
        super("Blutkrieger", 2);
    }

    public Blutkrieger(String string, int n) {
        super(string, n + 2);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Blutkrieger";
        }
        return "Blutkriegerin";
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 2: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.oO\u00d6000, 3);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 13);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

