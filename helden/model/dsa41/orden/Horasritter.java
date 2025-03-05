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

public class Horasritter
extends BasisOrden {
    public Horasritter() {
        super("Horaskaiserlicher Hausorden vom Heiligen Blut");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(b_0.\u00d5\u00f4\u00d2000, (Integer)13), Bedingung.hat(b_0.\u00f5\u00f5\u00d2000, (Integer)7), Bedingung.hat(voidsuper.O0\u00d6000, (Integer)7), Bedingung.hat(voidsuper.\u00d30\u00d8000, (Integer)10), Bedingung.hat(voidsuper.StringclassObject, (Integer)8), Bedingung.hat(voidsuper.oo\u00d6000, (Integer)8));
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        return oo0O;
    }
}

