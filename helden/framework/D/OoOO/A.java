/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;

public class A
extends F {
    public A() {
        super(while.\u00d2o\u00d2000.toString(), 4, A.\u00d500000(0));
        this.o00000(null, 0);
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(while.returnintclass));
    }

    @Override
    public int o00000(R r) {
        return 200;
    }

    protected BedingungsVerknuepfung \u00d500000(R r) {
        return this.\u00f5o0000();
    }
}

