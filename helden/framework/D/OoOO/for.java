/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;

public class for
extends F {
    public for() {
        super(while.nullnewString.toString(), 4, helden.framework.D.OoOO.for.\u00d500000(3));
        this.\u00f4\u00d40000();
        this.o00000(4);
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
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(Bedingung.istMindestens(Bedingung.MagieLevel.\u00d300000));
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)11));
        return bedingungsVerknuepfung;
    }

    @Override
    public int o00000(R r) {
        Integer n = (Integer)r.o00000(0);
        switch (n) {
            case 1: {
                return 150;
            }
            case 2: {
                return 150;
            }
            case 3: {
                return 100;
            }
        }
        return 666;
    }

    protected BedingungsVerknuepfung oO0000(R r) {
        Integer n = (Integer)r.o00000(0);
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(Bedingung.istMindestens(Bedingung.MagieLevel.\u00d300000));
        switch (n) {
            case 1: {
                bedingungsVerknuepfung.addBedingung(Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)11));
                break;
            }
            case 2: {
                bedingungsVerknuepfung.addBedingung(Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)13));
                bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.nullnewString, new Integer(1)));
                break;
            }
            case 3: {
                bedingungsVerknuepfung.addBedingung(Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)15));
                bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.nullnewString, new Integer(2)));
            }
        }
        return bedingungsVerknuepfung;
    }
}

