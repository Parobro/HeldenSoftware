/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.Objectsuper;
import helden.framework.OOoO.R;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import java.util.ArrayList;

public class W
extends F {
    public W() {
        super(while.o\u00d3\u00f6000.toString(), 4, new ArrayList<Objectsuper>(Objectsuper.o00000()), W.\u00d500000(7));
        this.\u00f4\u00d40000();
        this.o00000(7);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    @Override
    public int o00000(R r) {
        return 100;
    }

    protected BedingungsVerknuepfung Stringsuper(R r) {
        Integer n = (Integer)r.o00000(1);
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        if (n > 1) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.o\u00d3\u00f6000, r.o00000(1, new Integer(n - 1))));
        }
        switch (n) {
            case 1: 
            case 2: {
                bedingungsVerknuepfung.addBedingung(Bedingung.hatLeiteigenschaft(13));
                bedingungsVerknuepfung.addBedingung(Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)7));
                break;
            }
            case 3: 
            case 4: 
            case 5: {
                bedingungsVerknuepfung.addBedingung(Bedingung.hatLeiteigenschaft(15));
                bedingungsVerknuepfung.addBedingung(Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)10));
                bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(voidsuper.\u00f5\u00d2\u00d6000, (Integer)7), Bedingung.hat(voidsuper.\u00d3\u00f4\u00d5000, (Integer)7)));
                break;
            }
            case 6: 
            case 7: {
                bedingungsVerknuepfung.addBedingung(Bedingung.hatLeiteigenschaft(17));
                bedingungsVerknuepfung.addBedingung(Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)15));
                bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(voidsuper.\u00f5\u00d2\u00d6000, (Integer)10), Bedingung.hat(voidsuper.\u00d3\u00f4\u00d5000, (Integer)10)));
            }
        }
        return bedingungsVerknuepfung;
    }
}

