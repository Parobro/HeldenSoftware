/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.handwerker.HandwerklicheSpezialisierung;

public class Toepfer
extends HandwerklicheSpezialisierung {
    public Toepfer() {
        super("T\u00f6pfer");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "T\u00f6pfer";
        }
        return "T\u00f6pferin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.\u00f8\u00d3\u00d6000;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }
}

