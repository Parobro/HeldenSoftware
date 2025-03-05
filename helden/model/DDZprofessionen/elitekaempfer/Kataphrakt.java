/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.elitekaempfer;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.elitekaempfer.VarianteEliteKaempfer;
import java.util.ArrayList;

public class Kataphrakt
extends VarianteEliteKaempfer {
    public Kataphrakt() {
        super("Kataphrakt", 24);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Kataphrakt";
        }
        return "Kataphraktin";
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.thispublicsuper, 1);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.remove(oooo_0.o00000(while.\u00f50o000));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000));
        arrayList.add(oooo_0.o00000(while.nullifString));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d3\u00d2000));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f4\u00d5000));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 4);
        k_02.\u00d200000(E.O\u00d6\u00d8000, 7);
        k_02.\u00d200000(E.o\u00d6\u00d8000, 5);
        k_02.\u00d200000(E.\u00d3\u00d5\u00d8000, 5);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 7);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.nullvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d6\u00f4\u00f4000));
        arrayList.add(new for(while.\u00f50o000));
        arrayList.add(new for(while.\u00f8\u00f5\u00d5000));
        arrayList.add(new for(while.\u00d5\u00d3\u00d2000));
        arrayList.remove(new for(while.\u00d6\u00d3\u00d2000));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

