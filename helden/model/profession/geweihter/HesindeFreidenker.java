/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Hesinde;
import java.util.ArrayList;

public class HesindeFreidenker
extends Hesinde {
    public HesindeFreidenker() {
        super("Hesinde, Freidenker", 14);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Hesinde, Freidenker";
        }
        return "Hesinde, Freidenkerin";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d3\u00d3000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.new(I.\u00d3\u00d30000);
        oo0O.new(I.\u00d50o000);
        J j2 = (J)K.o00000(I.\u00d50o000);
        j2.oO0000(10);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

