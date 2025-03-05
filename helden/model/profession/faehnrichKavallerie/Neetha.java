/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.faehnrichKavallerie;

import helden.framework.Geschlecht;
import helden.model.profession.faehnrichKavallerie.BasisKavallerie;
import java.util.ArrayList;

public class Neetha
extends BasisKavallerie {
    public Neetha() {
        super("Neetha", 14);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Geschultes Pferd");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Kavallerie-F\u00e4hnrich aus Neetha";
    }
}

