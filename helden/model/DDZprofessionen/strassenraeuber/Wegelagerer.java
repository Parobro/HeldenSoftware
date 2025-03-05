/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.strassenraeuber;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.strassenraeuber.Strassenraeuber;
import java.util.ArrayList;

public class Wegelagerer
extends Strassenraeuber {
    public Wegelagerer() {
        super("Wegelagerer", 0);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 6;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Wegelagerer";
        }
        return "Wegelagerin";
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                return new objectsuper_0(this.getProfession(), this.getProfession().getSetting().getGelaendekunden(), 1);
            }
        }
        throw new c_1();
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 4: {
                int[] nArray = new int[]{1};
                arrayList.add(E.\u00f4\u00d6\u00d8000);
                arrayList.add(E.newnewString);
                return new m_0(arrayList, nArray);
            }
            case 5: {
                int[] nArray = new int[1];
                arrayList.add(voidsuper.\u00d5O\u00d6000);
                arrayList.add(voidsuper.\u00d5o\u00d8000);
                nArray[0] = 1;
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.returnforObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.thisvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00f80\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.nullObjectObject, -1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        return k_02;
    }
}

