/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.tierbaendiger;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.tierbaendiger.VarianteTierbaendiger;
import java.util.ArrayList;

public class Zureiter
extends VarianteTierbaendiger {
    public Zureiter() {
        super("Zureiter", 7);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Zureiter";
        }
        return "Zureiterin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 7);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.nullifString));
        arrayList.add(new for(while.\u00f8\u00f5\u00d5000));
        return arrayList;
    }
}

