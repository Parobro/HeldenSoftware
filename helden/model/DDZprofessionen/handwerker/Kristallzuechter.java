/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.handwerker.HandwerklicheSpezialisierung;

public class Kristallzuechter
extends HandwerklicheSpezialisierung {
    public Kristallzuechter() {
        super("Kristallz\u00fcchter");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Kristallz\u00fcchter";
        }
        return "Kristallz\u00fcchterin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.privateclassObject;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }
}

