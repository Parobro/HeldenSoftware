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
import helden.framework.oooo.k_0;
import helden.model.dsa41.orden.BasisOrden;

public class NoionitenUngeweiht
extends BasisOrden {
    public NoionitenUngeweiht() {
        super("Orden der Heiligen Noiona von Selem (ungeweiht)");
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.\u00f5\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(voidsuper.thisinterfaceObject, (Integer)7), Bedingung.hat(voidsuper.StringObjectObject, (Integer)7));
        BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(voidsuper.\u00f5o\u00d6000, (Integer)7), Bedingung.hat(voidsuper.o\u00f6\u00d6000, (Integer)7));
        BedingungsVerknuepfung bedingungsVerknuepfung3 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(voidsuper.o\u00d5\u00d6000, (Integer)7), bedingungsVerknuepfung2);
        BedingungsVerknuepfung bedingungsVerknuepfung4 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, bedingungsVerknuepfung, bedingungsVerknuepfung3);
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(b_0.whilewhilesuper, (Integer)14), Bedingung.hat(b_0.\u00d5\u00f4\u00d2000, (Integer)14), bedingungsVerknuepfung4);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        J j2 = (J)K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(50);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Noioniten"}));
        return oo0O;
    }
}

