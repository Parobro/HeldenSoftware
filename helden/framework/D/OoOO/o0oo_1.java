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
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.D.OoOO.o0oO
 */
public class o0oo_1
extends F
implements oooo_3 {
    public o0oo_1() {
        super(while.StringreturnString.toString(), 12, o0oo_1.\u00d500000(0));
        this.o00000(4);
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        return this.return((R)null);
    }

    @Override
    public int O\u00d50000() {
        return 3;
    }

    @Override
    public int o00000(R r) {
        return 150;
    }

    @Override
    public String o00000(R r, floatsuper floatsuper2, boolean bl) {
        if (r.o00000(0).toString().trim().isEmpty()) {
            return "Eine Beschreibung fehlt.";
        }
        return super.o00000(r, floatsuper2, bl);
    }

    protected BedingungsVerknuepfung return(R r) {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(Bedingung.istMindestens(Bedingung.MagieLevel.\u00d600000));
        return bedingungsVerknuepfung;
    }
}

