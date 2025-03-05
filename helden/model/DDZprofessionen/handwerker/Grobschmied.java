/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.handwerker.HandwerklicheSpezialisierung;

public class Grobschmied
extends HandwerklicheSpezialisierung {
    public Grobschmied() {
        super("Grobschmied");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Grobschmied";
        }
        return "Grobschmiedin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.\u00f5\u00d8\u00d5000;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.privatedosuper)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }
}

