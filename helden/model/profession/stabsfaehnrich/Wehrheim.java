/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.stabsfaehnrich;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.model.profession.stabsfaehnrich.BasisStabfaehnricht;
import java.util.ArrayList;

public class Wehrheim
extends BasisStabfaehnricht {
    public Wehrheim() {
        super("Stabsf\u00e4hnrich aus Wehrheim", 15);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d6\u00d3\u00d2000));
        arrayList.add(new for(while.nullifString));
        arrayList.add(new for(while.\u00f5\u00f4\u00d5000));
        return arrayList;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return "Stabsf\u00e4hnrich aus Wehrheim";
    }
}

