/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Travia;
import java.util.ArrayList;
import java.util.Vector;

public class TraviaThorwal
extends Travia {
    public TraviaThorwal() {
        super("Travia", 12);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public Vector<voidsuper> getMirakelminustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.whilenewObject);
        vector.add(voidsuper.O\u00d3\u00d6000);
        return vector;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.nullsuperString);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.ifforObject);
                arrayList.add(voidsuper.returnprivateObject);
                arrayList.add(voidsuper.\u00d8\u00d3\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, -2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, -4);
        k_02.o00000(G.\u00d3\u00f8\u00f5000);
        k_02.\u00d200000(G.o\u00f4\u00f5000, 2);
        k_02.\u00d200000(G.\u00f8\u00f8\u00f5000, 4);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, -3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.remove(new for(while.\u00d5\u00d8\u00f6000));
        arrayList.add(new for(while.\u00f8o\u00d5000));
        return arrayList;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelminustalente());
    }

    @Override
    public String toString() {
        return "Travia aus Thorwal (UdW)";
    }
}

