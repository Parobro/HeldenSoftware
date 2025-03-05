/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;

public class I
extends F {
    public I() {
        super(while.\u00d8\u00f8\u00f5000.toString(), 4, o0Oo.o00000());
        this.\u00f4\u00d40000();
        this.o00000(2);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        return BedingungsVerknuepfung.AND(Bedingung.istMindestens(Bedingung.MagieLevel.\u00d800000), Bedingung.hat(while.\u00d2oo000), Bedingung.hat(while.\u00d3\u00f5\u00f6000), Bedingung.hat(voidsuper.\u00d4\u00f8\u00d5000, (Integer)12), Bedingung.hat(voidsuper.\u00d5\u00d3\u00d8000, (Integer)12));
    }

    @Override
    public int o00000(R r) {
        return 200;
    }

    protected BedingungsVerknuepfung \u00f800000(R r) {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.\u00f5o0000();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.\u00d2oo000, r.o00000(0)));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.\u00d3\u00f5\u00f6000, r.o00000(0)));
        return bedingungsVerknuepfung;
    }
}

