/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.C.I;
import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.held.Object.floatsuper;

public class OOoo
extends F {
    public OOoo() {
        super(while.\u00d3Oo000.toString(), 0, OOoo.\u00d500000(20), OOoo.\u00d500000(0));
        this.o00000(0);
        this.o00000("ZfP*", "Eigenschaft");
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        return this.\u00f8O0000(null);
    }

    @Override
    public int o00000(R r) {
        Integer n = (Integer)r.o00000(0);
        return n;
    }

    @Override
    public String o00000(R r, floatsuper floatsuper2, boolean bl) {
        if (r.o00000(1).toString().trim().isEmpty()) {
            return "Die gew\u00fcnschte Eigenschaft fehlt";
        }
        return super.o00000(r, floatsuper2, bl);
    }

    protected BedingungsVerknuepfung \u00f8O0000(R r) {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(I.o\u00f5o000));
        return bedingungsVerknuepfung;
    }
}

