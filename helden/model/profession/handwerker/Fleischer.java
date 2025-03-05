/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.handwerker.HandwerklicheSpezialisierung;

public class Fleischer
extends HandwerklicheSpezialisierung {
    public Fleischer() {
        super("Fleischer/Metzger/Schlachter");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Fleischer/Metzger/Schlachter";
        }
        return "Fleischerin/Metzgerin/Schlachterin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.oO\u00d6000;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }
}

