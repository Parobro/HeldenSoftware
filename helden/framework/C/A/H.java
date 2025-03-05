/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C.A;

import helden.framework.C.A;
import helden.framework.C.I;
import helden.framework.OOoO.L;
import helden.framework.OOoO.Objectsuper;
import helden.framework.OOoO.R;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import java.util.ArrayList;
import java.util.Arrays;

public class H
extends A {
    public H() {
        super(I.thisinterface, true, 99, new ArrayList<Objectsuper>(Objectsuper.o00000()), new ArrayList<L>(Arrays.asList(L.values())));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        H h2 = new H();
        this.o00000(h2);
        return h2;
    }

    @Override
    public int \u00d200000(R r) {
        return -5;
    }

    @Override
    public AbstraktBedingung \u00d5O0000() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(I.\u00f5\u00d8o000), Bedingung.hat(I.forsupersuper));
    }
}

