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

public class MedizinmannDschungelstaemme
extends Medizinmann {
    public MedizinmannDschungelstaemme() {
        super("Medizinmann (Dschungelst\u00e4mme)", 11);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Medizinmann (Dschungelst\u00e4mme)";
        }
        return "Medizinfrau (Dschungelst\u00e4mme)";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d2\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d5\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6o\u00d3000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.nullObjectObject, 1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d5oO000));
        arrayList.add(new for(while.\u00d200000));
        arrayList.add(new for(while.whileclassObject));
        arrayList.add(new for(while.\u00f6\u00d4O000));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

