/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.Drakonia;
import java.util.ArrayList;

public class DrakoniaEis
extends Drakonia {
    public DrakoniaEis() {
        super("Drakonia (Eis)");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
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
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.o00000(this.getZauber(Zauber.O\u00d6\u00d4000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d6\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.returnthisnew), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00f5\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00f4\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.Oo\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5o\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f4o\u00d5000), 3);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.o\u00d3O000));
        return oo0O;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.O\u00d6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d6\u00d4000));
        arrayList.add(this.getZauber(Zauber.returnthisnew));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00f5\u00d3000));
    }

    @Override
    public String toString() {
        return "Konzil der Elemente zu Drakonia - Eiselementarist";
    }
}

