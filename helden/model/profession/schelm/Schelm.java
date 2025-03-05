/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schelm;

import helden.framework.Geschlecht;
import helden.model.profession.schelm.StandartSchelm;

public class Schelm
extends StandartSchelm {
    public Schelm() {
        super("Schelm", 13);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.equals((Object)Geschlecht.\u00d400000)) {
            return "Schelm";
        }
        return "Schelmin";
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

