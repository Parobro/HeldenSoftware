/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.b_0;
import helden.model.dsa41.orden.BasisOrden;

public class BeniFessiri
extends BasisOrden {
    public BeniFessiri() {
        super("Beni Fessiri");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(b_0.whilewhilesuper, (Integer)13), Bedingung.hatTalente(2, 8, voidsuper.whilenewObject, voidsuper.\u00f8\u00f4\u00d6000, voidsuper.O\u00d8\u00d5000, voidsuper.forclassObject, voidsuper.\u00d30\u00d8000));
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber der Gilde"));
        return oo0O;
    }
}

