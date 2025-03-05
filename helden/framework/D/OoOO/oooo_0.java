/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d.oooo;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_3;
import helden.framework.held.Object.floatsuper;

/*
 * Renamed from helden.framework.D.OoOO.OoOO
 */
public class oooo_0
extends F
implements oooo_3 {
    public oooo_0() {
        super(while.\u00d2\u00f80000.toString(), 12, oooo_0.\u00d500000(0));
        this.o00000(4);
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        return this.\u00d800000((R)null);
    }

    @Override
    public int O\u00d50000() {
        return 2;
    }

    @Override
    public int o00000(R r) {
        return 100;
    }

    @Override
    public String o00000(R r, floatsuper floatsuper2, boolean bl) {
        if (r.o00000(0).toString().trim().isEmpty()) {
            return "Eine Beschreibung fehlt.";
        }
        return super.o00000(r, floatsuper2, bl);
    }

    protected BedingungsVerknuepfung \u00d800000(R r) {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000);
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(while.\u00d2\u00d4\u00d2000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(while.\u00f6\u00d30000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(while.thiswhilesuper));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(while.\u00f8\u00f5\u00d2000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(while.\u00d6\u00d2\u00f5000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(while.\u00d80\u00d3000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(while.\u00d60o000));
        return bedingungsVerknuepfung;
    }
}

