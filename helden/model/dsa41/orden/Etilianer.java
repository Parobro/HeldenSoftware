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
import helden.framework.oooo.b_0;
import helden.model.dsa41.orden.BasisOrden;
import helden.model.profession.Geweihter;
import helden.model.profession.geweihter.BoronEtilianer;

public class Etilianer
extends BasisOrden {
    public Etilianer() {
        super("Orden zu Ehren der Heiligen Etilia (Etilianer)");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(b_0.\u00f8\u00f4\u00d2000, (Integer)12), Bedingung.hat(b_0.\u00d5\u00f4\u00d2000, (Integer)14), Bedingung.hat(voidsuper.thisinterfaceObject, (Integer)7), Bedingung.hat(voidsuper.StringObjectObject, (Integer)7), Bedingung.hat(voidsuper.\u00d4\u00f5\u00d5000, (Integer)0), Bedingung.istMindestens(Bedingung.MagieLevel.o00000), Bedingung.hatNichtProfession(Geweihter.class, new BoronEtilianer()));
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

