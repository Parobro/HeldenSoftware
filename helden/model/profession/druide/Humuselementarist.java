/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.druide;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.druide.Konzilsdruide;
import java.util.ArrayList;

public class Humuselementarist
extends Konzilsdruide {
    public Humuselementarist() {
        super("Konzilsdruide (Humuselementarist)", 21);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Konzilsdruide (Humuselementarist)";
        }
        return "Konzilsdruidin (Humuselementaristin)";
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return super.getRepraesentation(zauber);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f6\u00d4000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00f8\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.whilenewnew), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00d3\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d8\u00d4000), 4);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.\u00f5\u00f8\u00d4000));
        arrayList.add(this.getZauber(Zauber.whilenewnew));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00d3\u00d4000));
    }
}

