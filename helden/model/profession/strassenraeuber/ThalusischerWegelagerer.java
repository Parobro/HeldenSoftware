/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.strassenraeuber;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_6;
import helden.model.profession.strassenraeuber.Strassenraeuber;
import java.util.ArrayList;

public class ThalusischerWegelagerer
extends Strassenraeuber {
    private boolean Stringsuperfloat = true;

    public ThalusischerWegelagerer() {
        super("ThalusischerWegelagerer", 0);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Thalusischer Wegelagerer";
        }
        return "Thalusische Wegelagerin";
    }

    @Override
    public oooo_6 getNextTalentTyp2Auswahl() {
        this.Stringsuperfloat = false;
        ArrayList<interface> arrayList = new ArrayList<interface>();
        arrayList.add(new interface(voidsuper.\u00d5O\u00d6000, 1));
        arrayList.add(new interface(voidsuper.\u00d5o\u00d8000, 3));
        return new oooo_6(this.getProfession(), arrayList, 1);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                int[] nArray = new int[]{1};
                arrayList.add(E.\u00f4\u00d6\u00d8000);
                arrayList.add(E.newnewString);
                return new m_0(arrayList, nArray);
            }
            case 1: {
                int[] nArray = new int[]{2};
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                arrayList.add(E.\u00d5\u00d5\u00d8000);
                return new m_0(arrayList, nArray);
            }
            case 2: {
                int[] nArray = new int[]{2};
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                return new m_0(arrayList, nArray);
            }
            case 4: {
                int[] nArray = new int[]{2};
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                arrayList.add(voidsuper.newreturnObject);
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 3);
        k_02.\u00d200000(E.\u00f5\u00d5\u00d8000, 3);
        k_02.\u00d200000(voidsuper.returnforObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.thisvoidObject, 1);
        k_02.o00000(voidsuper.O\u00f6\u00d5000);
        k_02.\u00d200000(voidsuper.\u00f80\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.nullObjectObject, -1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 2);
        return k_02;
    }

    @Override
    public boolean hatMehrTalentTyp2Auswahl() {
        return this.Stringsuperfloat;
    }
}

