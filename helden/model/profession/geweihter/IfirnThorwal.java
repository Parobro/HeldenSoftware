/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.private_0;
import helden.model.profession.geweihter.Ifirn;
import java.util.ArrayList;

public class IfirnThorwal
extends Ifirn
implements private_0 {
    public IfirnThorwal() {
        super("IfirnThorwal", 19);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.\u00d4\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.nullsuperString);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{4, 3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
                arrayList.add(voidsuper.returnprivateObject);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.forvoidObject);
                arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.o\u00f6\u00d6000);
                arrayList.add(voidsuper.returnifObject);
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00f80\u00d8000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.StringObjectObject);
                arrayList.add(voidsuper.\u00d5o\u00d8000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                int[] nArray = new int[]{2, 2, 1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, -2);
        k_02.\u00d200000(voidsuper.privatedoObject, 2);
        return k_02;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return "Ifirn aus Thorwal (UdW)";
    }
}

