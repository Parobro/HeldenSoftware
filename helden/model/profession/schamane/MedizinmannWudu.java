/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.schamane.Medizinmann;
import java.util.ArrayList;

public class MedizinmannWudu
extends Medizinmann {
    public MedizinmannWudu() {
        super("Medizinmann (Wudu)", 11);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Medizinmann (Wudu)";
        }
        return "Medizinfrau (Wudu)";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d2\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d3\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f5\u00f4000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d8000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d6\u00d3\u00f6000));
        arrayList.add(new for(while.\u00d5oO000));
        arrayList.add(new for(while.thisStringnew));
        arrayList.add(new for(while.\u00d50\u00d6000));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

