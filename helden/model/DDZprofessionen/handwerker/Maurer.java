/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.handwerker.HandwerklicheSpezialisierung;

public class Maurer
extends HandwerklicheSpezialisierung {
    public Maurer() {
        super("Maurer");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Maurer";
        }
        return "Maurerin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.\u00f4\u00f6\u00d6000;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }
}

