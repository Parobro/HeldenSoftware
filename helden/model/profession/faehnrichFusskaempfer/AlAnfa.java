/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.faehnrichFusskaempfer;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.faehnrichFusskaempfer.BasisFaehnrichFusskaempfer;
import java.util.ArrayList;

public class AlAnfa
extends BasisFaehnrichFusskaempfer {
    public AlAnfa() {
        super("AlAnfa", 18);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d20000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.\u00f4\u00d5\u00d8000, 3);
        k_02.\u00d200000(E.newnewString, -1);
        k_02.\u00d200000(E.ifthisString, 3);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, -1);
        k_02.\u00d200000(voidsuper.returnprivateObject, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d6\u00d3\u00d2000));
        arrayList.add(new for(while.\u00d60\u00d5000));
        return arrayList;
    }

    @Override
    public String toString() {
        return "AlAnfa";
    }
}

