/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Hesinde;
import java.util.ArrayList;

public class HesindeSatori
extends Hesinde {
    public HesindeSatori() {
        super("Hesinde, Satori", 13);
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 0;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d5\u00f4000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        return k_02;
    }

    @Override
    public String toString() {
        return "Hesinde, Satori";
    }
}

