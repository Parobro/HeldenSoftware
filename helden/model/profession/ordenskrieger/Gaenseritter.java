/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.ordenskrieger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.Rommilys;
import java.util.ArrayList;

public class Gaenseritter
extends Rommilys {
    public Gaenseritter() {
        super("G\u00e4nseritter");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht == null || geschlecht.istMaennlich()) {
            return "G\u00e4nseritter";
        }
        return "G\u00e4nseritterin";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.returninterfaceString.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d8O\u00f5000));
        arrayList.add(new for(while.\u00f8o\u00f6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getGeschlecht());
    }
}

