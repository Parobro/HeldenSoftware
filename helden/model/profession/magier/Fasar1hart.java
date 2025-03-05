/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.Fasar1;
import java.util.ArrayList;

public class Fasar1hart
extends Fasar1 {
    public Fasar1hart() {
        super("Fasar: Hart", 31);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.o\u00d2\u00d5000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f80\u00d5000), 7);
        k_02.o00000(this.getZauber(Zauber.o\u00d5\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.returnreturnnew), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.newfornew), 2);
        k_02.o00000(this.getZauber(Zauber.o0\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00f8\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d40\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d2\u00d3000), 2);
        k_02.o00000(KonkreterZauber.getZauber(Zauber.\u00f5\u00d8\u00d3000, K.\u00f800000, ""), 2);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d5000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d5\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f4\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.O\u00d3\u00d5000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00d2\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f4O\u00d5000), 2);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.O\u00d2\u00d4000));
        arrayList.add(this.getZauber(Zauber.o\u00d2\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00f80\u00d5000));
        arrayList.add(this.getZauber(Zauber.o\u00d5\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f8o\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        arrayList.add(this.getZauber(Zauber.returnreturnnew));
    }

    @Override
    public String toString() {
        return "Akademie der geistigen Kraft zu Fasar: Harter Zweig";
    }
}

