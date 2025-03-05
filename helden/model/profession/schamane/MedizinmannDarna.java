/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.d.oooo_0;
import helden.model.profession.schamane.Medizinmann;
import java.util.ArrayList;

public class MedizinmannDarna
extends Medizinmann {
    public MedizinmannDarna() {
        super("Medizinmann (Darna)", 8);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Medizinmann (Darna)";
        }
        return "Medizinfrau (Darna)";
    }

    @Override
    public ArrayList<I> getEntfernteKutlurVorteile() {
        ArrayList<I> arrayList = super.getEntfernteKutlurVorteile();
        arrayList.add(I.\u00d5\u00d3O000);
        return arrayList;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d2\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d3\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5oO000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d5\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f6o\u00d3000));
        arrayList.add(new for(while.\u00d200000));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

