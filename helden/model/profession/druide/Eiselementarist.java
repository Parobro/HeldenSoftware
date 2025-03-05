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

public class Eiselementarist
extends Konzilsdruide {
    public Eiselementarist() {
        super("Konzilsdruide (Eiselementarist)", 21);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Konzilsdruide (Eiselementarist)";
        }
        return "Konzilsdruidin (Eiselementaristin)";
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return super.getRepraesentation(zauber);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f5\u00d3000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d6\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f6\u00d3000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00f5\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.newreturnnew), 2);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.O\u00d6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d5\u00f6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00f5\u00d3000));
        arrayList.add(this.getZauber(Zauber.newreturnnew));
    }
}

