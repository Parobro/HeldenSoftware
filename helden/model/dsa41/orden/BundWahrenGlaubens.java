/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.while;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.model.dsa41.orden.BasisOrden;

public class BundWahrenGlaubens
extends BasisOrden {
    public BundWahrenGlaubens() {
        super("Bund des Wahren Glaubens");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(I.\u00f8\u00d50000), Bedingung.hat(I.\u00d3\u00f5O000), Bedingung.hat(while.o\u00d4\u00d4000), Bedingung.hat(while.\u00d6\u00d8\u00d8000));
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Bund"));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Bund des Wahren Glaubens"}));
        return oo0O;
    }
}

