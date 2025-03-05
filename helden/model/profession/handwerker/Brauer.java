/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.handwerker.HandwerklicheSpezialisierung;

public class Brauer
extends HandwerklicheSpezialisierung {
    public Brauer() {
        super("Brauer");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Brauer";
        }
        return "Brauerin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.\u00d8O\u00d8000;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }
}

