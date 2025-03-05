/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.E.super.thissuper;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.oo0o_0;

public class newsuper
extends F {
    public newsuper() {
        super(while.\u00d5\u00d2o000.toString(), 0, o0Oo.o00000());
        this.\u00f4\u00d40000();
        this.o00000(6);
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
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)3), Bedingung.hatLeiteigenschaft(13));
    }

    @Override
    public int o00000(R r) {
        o0Oo o0Oo2 = (o0Oo)r.o00000(0);
        return 70 + o0Oo2.Object() * 10;
    }

    @Override
    public oo0o_0 \u00d400000(R r) {
        o0Oo o0Oo2 = (o0Oo)r.o00000(0);
        return o0Oo2.\u00d200000();
    }

    protected BedingungsVerknuepfung \u00f5O0000(R r) {
        BedingungsVerknuepfung bedingungsVerknuepfung = this.\u00f5o0000();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatGegenstand(thissuper.o00000((o0Oo)r.o00000(0))));
        return bedingungsVerknuepfung;
    }
}

