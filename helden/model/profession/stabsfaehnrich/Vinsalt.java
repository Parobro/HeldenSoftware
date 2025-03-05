/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.stabsfaehnrich;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.model.profession.stabsfaehnrich.BasisStabfaehnricht;
import java.util.ArrayList;

public class Vinsalt
extends BasisStabfaehnricht {
    public Vinsalt() {
        super("Stabsf\u00e4hnrich aus Vinsalt", 15);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f6\u00f4\u00f6000));
        arrayList.add(new for(while.o\u00f4O000));
        arrayList.add(new for(while.\u00f80\u00d5000));
        arrayList.add(new for(while.returninterfaceString));
        arrayList.add(new for(while.\u00f8\u00d3\u00d8000));
        return arrayList;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return "Stabsf\u00e4hnrich aus Vinsalt";
    }
}

