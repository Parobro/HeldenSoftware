/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.kaempferudw;

import helden.framework.Geschlecht;
import helden.model.profession.kaempferudw.BasisKaempfer;

public class Sippe
extends BasisKaempfer {
    public Sippe() {
        super("Sippe", 2);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "K\u00e4mpfer aus einer Sippe (UdW)";
        }
        return "K\u00e4mpferin aus einer Sippe (UdW)";
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

