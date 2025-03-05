/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Efferd;
import java.util.ArrayList;

public class EfferdKueste
extends Efferd {
    public EfferdKueste() {
        super("Efferd K\u00fcste", 10);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.ifinterfaceObject.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00f5O000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d4\u00f4000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 7);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.whiledoString));
        return arrayList;
    }

    @Override
    public String toString() {
        return "Efferd, Noviziat an der K\u00fcste";
    }
}

