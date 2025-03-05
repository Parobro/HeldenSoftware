/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.kaempferudw;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.kaempferudw.BasisKaempfer;
import java.util.ArrayList;

public class Ottajasko
extends BasisKaempfer {
    public Ottajasko() {
        super("Ottajasko", 4);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "K\u00e4mpfer aus einer Ottajasko (UdW)";
        }
        return "K\u00e4mpferin aus einer Ottajasko (UdW)";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f80\u00d6000, 1);
        k_02.\u00d200000(G.whilewhileString, 2);
        k_02.\u00d200000(voidsuper.thisclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d60\u00d5000));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

