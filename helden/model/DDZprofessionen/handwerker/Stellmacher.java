/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.handwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.handwerker.HandwerklicheSpezialisierung;

public class Stellmacher
extends HandwerklicheSpezialisierung {
    public Stellmacher() {
        super("Stellmacher/Wagner/K\u00fcfer");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Stellmacher/Wagner/K\u00fcfer";
        }
        return "Stellmacherin/Wagnerin/K\u00fcferin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.whilewhileObject;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }
}

