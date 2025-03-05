/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Peraine;
import java.util.ArrayList;

public class PeraineLand
extends Peraine {
    public PeraineLand() {
        this("Peraine Land", 11);
    }

    public PeraineLand(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f8\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4o000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        if (n == 2) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
            arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
            int[] nArray = new int[]{2};
            return new m_0(arrayList, nArray);
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d3\u00d4\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 2);
        k_02.\u00d200000(voidsuper.returnprivateObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d2\u00d6000, 5);
        return k_02;
    }

    @Override
    public String toString() {
        return "Peraine: Noviziat auf dem Land";
    }
}

