/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.BasisKrieger;
import java.util.ArrayList;

public class Eslamsgrund
extends BasisKrieger {
    public Eslamsgrund() {
        super("Eslamsgrund", 24);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d3\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d8\u00d6\u00d8000, 6);
        k_02.\u00d200000(E.\u00d4\u00d6\u00d8000, 4);
        k_02.\u00d200000(E.O\u00d6\u00d8000, 4);
        k_02.\u00d200000(E.thissuperString, 4);
        k_02.\u00d200000(E.ifthisString, 4);
        k_02.\u00d200000(voidsuper.ifforObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, -1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.nullvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        return k_02;
    }

    @Override
    public String toString() {
        return "Haus der Hohen Kriegskunst derer vom Berg in Eslamsgrund";
    }
}

