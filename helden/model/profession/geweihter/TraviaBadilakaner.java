/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Travia;
import java.util.ArrayList;

public class TraviaBadilakaner
extends Travia {
    public TraviaBadilakaner() {
        super("Travia, Badilakaner", 13);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht == null || geschlecht.istMaennlich()) {
            return "Travia, Badilakaner";
        }
        return "Travia, Badilakanerin";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.\u00d30\u00d8000, "Betteln"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 6);
        k_02.\u00d200000(voidsuper.StringclassObject, -5);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, -1);
        k_02.\u00d200000(G.\u00d3\u00f8\u00f5000, -4);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getGeschlecht());
    }
}

