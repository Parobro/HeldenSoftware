/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.tageloehner;

import helden.framework.C.I;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.tageloehner.VarianteTageloehner;
import java.util.ArrayList;

public class Schauerleute
extends VarianteTageloehner {
    public Schauerleute() {
        super("Schauerleute", 2);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Schauermann";
        }
        return "Schauerfrau";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.returnprivateObject, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00f80\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisclassObject, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00f5\u00f6o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d8\u00d8\u00d2000));
        return arrayList;
    }
}

