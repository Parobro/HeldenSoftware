/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.stammeskrieger;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.stammeskrieger.Waldmensch;
import java.util.ArrayList;

public class Kanutepeku
extends Waldmensch {
    public Kanutepeku() {
        super("Kanutepeku", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Kanutepeku";
        }
        return "Kanutepeku";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.remove(oooo_0.o00000(while.\u00d8\u00d80000.toString()));
        arrayList.add(oooo_0.o00000(while.thisforObject.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d60\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d8\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, -2);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, -1);
        k_02.\u00d200000(voidsuper.returnprivateObject, 1);
        k_02.\u00d200000(voidsuper.returnforObject, -2);
        k_02.\u00d200000(voidsuper.thisvoidObject, -3);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, -3);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        return k_02;
    }
}

