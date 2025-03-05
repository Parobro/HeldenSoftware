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
import helden.model.profession.geweihter.BoronMarbide;

public class Marbiden
extends BasisOrden {
    public Marbiden() {
        super("Der Orden zur Sanften Ruhe (Marbiden)");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(voidsuper.\u00f5\u00f5\u00d6000, (Integer)7), Bedingung.hat(voidsuper.\u00f4\u00d5\u00d6000, (Integer)5));
        BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(I.O\u00d30000), Bedingung.hat(voidsuper.\u00f4\u00d6\u00d5000, (Integer)0));
        BedingungsVerknuepfung bedingungsVerknuepfung3 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, bedingungsVerknuepfung, bedingungsVerknuepfung2);
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(b_0.whilewhilesuper, (Integer)15), Bedingung.hat(b_0.\u00f8\u00f4\u00d2000, (Integer)13), Bedingung.hat(voidsuper.\u00d4\u00f5\u00d5000, (Integer)0), Bedingung.istMindestens(Bedingung.MagieLevel.o00000), bedingungsVerknuepfung3, Bedingung.hatNichtProfession(Geweihter.class, new BoronMarbide()));
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        oo0O.new(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Boron"}));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Marbiden"}));
        J j2 = (J)K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(20);
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

