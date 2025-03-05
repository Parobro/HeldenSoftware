/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.ThorwalFotskari;
import java.util.ArrayList;

public class ThorwalRiddari
extends ThorwalFotskari {
    public ThorwalRiddari() {
        super("ThorwalRiddari", 27);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 0;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.remove(oooo_0.o00000(while.ifinterfaceObject.toString()));
        arrayList.add(oooo_0.o00000(while.nullifString.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.o\u00d6\u00d8000, 6);
        k_02.\u00d200000(E.O\u00d6\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, -2);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 5);
        k_02.\u00d200000(voidsuper.returnprivateObject, -1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.thisclassObject, -2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.\u00d60\u00d5000));
        arrayList.remove(new for(while.\u00f6\u00d20000));
        arrayList.add(new for(while.\u00f8\u00f5\u00d5000));
        return arrayList;
    }

    @Override
    public String toString() {
        return "K\u00e4mpferschule Ugdalfskronir in Thorwal/ Hetja Riddari (UdW)";
    }
}

