/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.faehnrichFusskaempfer;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.faehnrichFusskaempfer.BasisFaehnrichFusskaempfer;
import java.util.ArrayList;

public class Albenhus
extends BasisFaehnrichFusskaempfer {
    public Albenhus() {
        super("Albenhus", 23);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f4\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d3\u00d8000, 4);
        k_02.\u00d200000(E.\u00f8\u00d5\u00d8000, 3);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, -1);
        k_02.\u00d200000(voidsuper.StringclassObject, -2);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.\u00d200000(G.\u00f4\u00d6\u00f5000, 4);
        k_02.\u00d200000(G.\u00d3\u00d4\u00f5000, 4);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.\u00d5\u00d4\u00d4000));
        arrayList.remove(new for(while.\u00f5\u00f4\u00d5000));
        arrayList.add(new for(while.iffloatObject));
        arrayList.add(new for(while.\u00f80\u00d5000));
        arrayList.add(new for(while.o\u00f4\u00d6000));
        arrayList.add(new for(while.\u00d8\u00f4\u00d5000));
        arrayList.add(new for(while.ifdoString));
        arrayList.add(new for(while.\u00f6\u00d20000));
        return arrayList;
    }

    @Override
    public String toString() {
        return "Albenhus";
    }
}

