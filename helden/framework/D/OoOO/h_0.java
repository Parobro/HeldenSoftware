/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d.oooo;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;

/*
 * Renamed from helden.framework.D.OoOO.h
 */
public class h_0
extends F {
    public h_0() {
        super(while.\u00d3\u00f5\u00f6000.toString(), 0, o0Oo.o00000());
        this.\u00f4\u00d40000();
        this.o00000(5);
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
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)7), Bedingung.hatLeiteigenschaft(15));
    }

    @Override
    public int o00000(R r) {
        return 140 + this.privatesuper(r).Object() * 10;
    }

    protected BedingungsVerknuepfung \u00f5o0000(R r) {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.\u00f5o0000();
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(this.privatesuper(r).\u00d200000(), (Integer)12));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.\u00d5\u00d2o000, new R(this.privatesuper(r))));
        return this.\u00f5o0000();
    }

    protected o0Oo privatesuper(R r) {
        return (o0Oo)r.o00000(0);
    }
}

