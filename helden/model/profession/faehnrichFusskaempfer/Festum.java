/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.faehnrichFusskaempfer;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.faehnrichFusskaempfer.BasisFaehnrichFusskaempfer;
import java.util.ArrayList;

public class Festum
extends BasisFaehnrichFusskaempfer {
    public Festum() {
        super("Festum", 12);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper.returnprivateObject, 1);
        k_02.o00000(G.\u00f8\u00f6\u00f5000, 4);
        k_02.o00000(G.nullsuperclass, 4);
        k_02.o00000(voidsuper.\u00d5o\u00d8000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d6\u00d3\u00d2000));
        arrayList.add(new for(while.\u00f6\u00d20000));
        return arrayList;
    }

    @Override
    public String toString() {
        return "Festum";
    }
}

