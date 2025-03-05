/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.while;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.b_0;
import helden.model.dsa41.orden.BasisOrden;

public class NoionitenGeweiht
extends BasisOrden {
    public NoionitenGeweiht() {
        super("Orden der Heiligen Noiona von Selem (geweiht)");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(voidsuper.thisinterfaceObject, (Integer)7), Bedingung.hat(voidsuper.StringObjectObject, (Integer)7));
        BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(voidsuper.\u00f5o\u00d6000, (Integer)7), Bedingung.hat(voidsuper.o\u00f6\u00d6000, (Integer)7));
        BedingungsVerknuepfung bedingungsVerknuepfung3 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(voidsuper.o\u00d5\u00d6000, (Integer)7), bedingungsVerknuepfung2);
        BedingungsVerknuepfung bedingungsVerknuepfung4 = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, bedingungsVerknuepfung, bedingungsVerknuepfung3);
        BedingungsVerknuepfung bedingungsVerknuepfung5 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(b_0.whilewhilesuper, (Integer)14), Bedingung.hat(b_0.\u00d5\u00f4\u00d2000, (Integer)14), bedingungsVerknuepfung4);
        BedingungsVerknuepfung bedingungsVerknuepfung6 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.istMindestens(Bedingung.MagieLevel.o00000), Bedingung.hat(while.\u00d3\u00d5\u00d5000), Bedingung.hat(b_0.whilewhilesuper, (Integer)14), Bedingung.hat(b_0.\u00d5\u00f4\u00d2000, (Integer)14), bedingungsVerknuepfung4);
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, bedingungsVerknuepfung5, bedingungsVerknuepfung6);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        oo0O.new(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{""}));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Noioniten"}));
        return oo0O;
    }
}

