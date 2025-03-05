/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.handwerker.HandwerklicheSpezialisierung;

public class Taetowierer
extends HandwerklicheSpezialisierung {
    public Taetowierer() {
        super("T\u00e4towierer");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "T\u00e4towierer";
        }
        return "T\u00e4towiererin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.\u00d3\u00f8\u00d6000;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }
}

