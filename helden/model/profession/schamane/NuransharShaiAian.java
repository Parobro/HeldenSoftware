/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.interface;
import helden.framework.oooo.oooo_6;
import helden.model.profession.schamane.Nuranshar;
import java.util.ArrayList;

public class NuransharShaiAian
extends Nuranshar {
    private boolean forsuperfloat = true;

    public NuransharShaiAian() {
        super("Nuransh\u00e2r (Shai'aian)", 4);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public oooo_6 getNextTalentTyp2Auswahl() {
        this.forsuperfloat = false;
        ArrayList<interface> arrayList = new ArrayList<interface>();
        arrayList.add(new interface(G.whilewhileString, 5));
        arrayList.add(new interface(G.\u00d8\u00d2\u00f5000, 3));
        return new oooo_6(this.getProfession(), arrayList, 1);
    }

    @Override
    public boolean hatMehrTalentTyp2Auswahl() {
        return this.forsuperfloat;
    }

    @Override
    public String toString() {
        return "Nuransh\u00e2r (Shai'aian)";
    }
}

