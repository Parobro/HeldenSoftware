/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.seefahrer;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.seefahrer.Seefahrer;
import java.util.ArrayList;

public class Pirat
extends Seefahrer {
    public Pirat() {
        super("Pirat", 2);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.equals((Object)Geschlecht.\u00d400000)) {
            return "Pirat";
        }
        return "Piratin";
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(n);
            }
            case 1: {
                return super.getTalentAuswahl(n);
            }
            case 2: {
                return super.getTalentAuswahl(n);
            }
            case 3: {
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                arrayList.add(E.\u00d5\u00d6\u00d8000);
                arrayList.add(E.\u00d5\u00d4\u00d8000);
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.\u00d200000(E.\u00f4\u00d4\u00d8000, 2);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.returnprivateObject, 1);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f80\u00d6000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, -1);
        k_02.\u00d200000(voidsuper.nullvoidObject, 2);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 1);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

