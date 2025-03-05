/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
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

public class DrakoniaFeuer
extends Drakonia {
    public DrakoniaFeuer() {
        super("Drakonia (Feuer)");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d5\u00f4\u00f4000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(this.getZauber(Zauber.O\u00d6\u00d4000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d3\u00d4000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00d80\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.whileifnew), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d2000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d4000), 1);
        k_02.o00000(this.getZauber(Zauber.O\u00d3\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d2\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f8\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00d3\u00d3000), 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d3O\u00d2000));
        arrayList.add(new for(while.returninterfacenew));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.nullObjectsuper));
        return oo0O;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.O\u00d6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d3\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d80\u00d3000));
        arrayList.add(this.getZauber(Zauber.whileifnew));
    }

    @Override
    public String toString() {
        return "Konzil der Elemente zu Drakonia - Feuerelementarist";
    }
}

