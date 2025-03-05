/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.faehnrichFusskaempfer;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.d.oooo_0;
import helden.model.profession.faehnrichFusskaempfer.BasisFaehnrichFusskaempfer;
import java.util.ArrayList;

public class Honingen
extends BasisFaehnrichFusskaempfer {
    public Honingen() {
        super("Honingen", 13);
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
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.\u00d5\u00d4\u00d4000));
        arrayList.remove(new for(while.\u00f5\u00f4\u00d5000));
        arrayList.add(new for(while.\u00d6\u00d3\u00d2000));
        arrayList.add(new for(while.\u00d8\u00f4\u00d5000));
        return arrayList;
    }

    @Override
    public String toString() {
        return "Honingen";
    }
}

