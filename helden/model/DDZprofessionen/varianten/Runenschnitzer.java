/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.varianten;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class Runenschnitzer
extends N {
    public Runenschnitzer() {
        super("Runenschnitzer", 4, true);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Handkarren");
        arrayList.add("Hochwertiges Arbeitsger\u00e4t");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht == null || geschlecht.istMaennlich()) {
            return "Runenschnitzer (UdW)";
        }
        return "Runenschnitzerin (UdW)";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.o00000(G.o\u00f4\u00f5000, 6);
        k_02.o00000(G.\u00f8\u00f8\u00f5000, 6);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        return k_02;
    }

    @Override
    public String toString() {
        if (this.getProfession() == null) {
            return this.getBezeichner(null);
        }
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

