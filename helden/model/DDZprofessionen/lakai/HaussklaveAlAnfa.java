/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.lakai;

import helden.framework.Geschlecht;
import helden.model.DDZprofessionen.lakai.Haussklave;

public class HaussklaveAlAnfa
extends Haussklave {
    public HaussklaveAlAnfa() {
        super("Haussklave aus Al'Anfa", 0);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Haussklave aus Al'Anfa";
        }
        return "Haussklavin aus Al'Anfa";
    }
}

