/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.b_0;
import helden.model.dsa41.orden.BasisOrden;
import helden.model.profession.Geweihter;
import helden.model.profession.geweihter.TraviaBadilakaner;

public class Badilakaner
extends BasisOrden {
    public Badilakaner() {
        super("Orden des Heiligen Badilak");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(b_0.\u00f5\u00f5\u00d2000, (Integer)4), Bedingung.hatNicht(b_0.\u00f5\u00f5\u00d2000, (Integer)9), Bedingung.hat(voidsuper.\u00d30\u00d8000, (Integer)7), Bedingung.hat(K.o00000(voidsuper.\u00d30\u00d8000, "Betteln")), Bedingung.hatNichtProfession(Geweihter.class, new TraviaBadilakaner()));
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Badilakaner"}));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        return oo0O;
    }
}

