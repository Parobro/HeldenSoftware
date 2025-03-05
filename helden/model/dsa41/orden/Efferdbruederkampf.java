/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.dsa41.orden.BasisOrden;

public class Efferdbruederkampf
extends BasisOrden {
    public Efferdbruederkampf() {
        super("Efferdbr\u00fcder (k\u00e4mpferischer Zweig)");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatTalentgruppenTalente(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000, 1, 7), Bedingung.hatTalentgruppenTalente(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do, 1, 7));
        BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hatTalentgruppenTalente(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000, 2, 7), bedingungsVerknuepfung);
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(voidsuper.returnprivateObject, (Integer)5), Bedingung.hat(voidsuper.\u00d8\u00d8\u00d5000, (Integer)5), bedingungsVerknuepfung2);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        J j2 = (J)K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(20);
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

