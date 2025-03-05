/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.handwerker.HandwerklicheSpezialisierung;

public class Juwelier
extends HandwerklicheSpezialisierung {
    public Juwelier() {
        super("Edelsteinschleifer/Steinschneider/Juwelier");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Edelsteinschleifer/Steinschneider/Juwelier";
        }
        return "Edelsteinschleiferin/Steinschneiderin/Juwelierin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.StringfloatObject;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }
}

