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
import helden.framework.oooo.k_0;
import helden.model.dsa41.orden.BasisOrden;
import helden.model.profession.Geweihter;
import helden.model.profession.geweihter.HesindeDraconiter;

public class Draconiterarkan
extends BasisOrden {
    public Draconiterarkan() {
        super("Der Orden der Draconiter (arkaner Zweig)");
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.\u00f5\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(voidsuper.oo\u00d6000, (Integer)5), Bedingung.istMindestens(Bedingung.MagieLevel.\u00d800000), Bedingung.hatNichtProfession(Geweihter.class, new HesindeDraconiter()));
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.new(K.o00000(I.\u00d3\u00d30000));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Hesinde"}));
        return oo0O;
    }
}

