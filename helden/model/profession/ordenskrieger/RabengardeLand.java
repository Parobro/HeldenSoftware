/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.ordenskrieger;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.ordenskrieger.Rabengarde;
import java.util.ArrayList;

public class RabengardeLand
extends Rabengarde {
    public RabengardeLand() {
        super("Rabengarde (Land)", 16);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.nullifString.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.O\u00d6\u00d8000, 4);
        k_02.o00000(E.ifthisString, 2);
        k_02.o00000(voidsuper.\u00d5O\u00d6000, 5);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        return k_02;
    }

    @Override
    public String toString() {
        return "Orden des schwarzen Raben (Rabengarde) zu Land";
    }
}

