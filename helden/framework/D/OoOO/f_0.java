/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d.oooo;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.H;
import helden.framework.OOoO.R;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;

/*
 * Renamed from helden.framework.D.OoOO.f
 */
public class f_0
extends F {
    public f_0() {
        super(while.\u00d3\u00d3\u00f4000.toString(), 2, H.o00000());
        this.o00000(1);
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        return Bedingung.AND(Bedingung.hat(while.nullifString), Bedingung.hat(voidsuper.\u00d5O\u00d6000, (Integer)10));
    }

    @Override
    public int o00000(R r) {
        return 100;
    }

    protected BedingungsVerknuepfung \u00d8o0000(R r) {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(this.\u00f5o0000());
        bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.nullifString, r.o00000(0)));
        return bedingungsVerknuepfung;
    }
}

