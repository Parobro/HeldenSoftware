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
import helden.framework.oooo.b_0;

public class O0oO
extends F {
    public O0oO() {
        super(while.\u00d2oo000.toString(), 4, o0Oo.o00000());
        this.\u00f4\u00d40000();
        this.o00000(3);
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
        return BedingungsVerknuepfung.AND(Bedingung.istMindestens(Bedingung.MagieLevel.\u00d800000), Bedingung.hat(b_0.whilewhilesuper, (Integer)13), Bedingung.hat(while.\u00f8\u00d8o000), Bedingung.hat(voidsuper.\u00d4\u00f8\u00d5000, (Integer)10), Bedingung.hat(voidsuper.\u00d5\u00d3\u00d8000, (Integer)7), Bedingung.hat(while.\u00d5\u00d2o000));
    }

    @Override
    public int o00000(R r) {
        return 100;
    }

    protected BedingungsVerknuepfung OO0000(R r) {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.\u00f5o0000();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.\u00d5\u00d2o000, r.o00000(0)));
        return bedingungsVerknuepfung;
    }
}

