/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.goetterdiener;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.model.DDZprofessionen.goetterdiener.BasisGoetterdiener;

public class Goetterdiener1
extends BasisGoetterdiener {
    public Goetterdiener1() {
        super("G\u00f6tterdiener (Moralkodex 6)", 3);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"DDZ, passend zur Gottheit"}));
        return oo0O;
    }

    @Override
    public String toString(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "G\u00f6tterdiener (Moralkodex 6)";
        }
        return "G\u00f6tterdienerin (Moralkodex 6)";
    }
}

