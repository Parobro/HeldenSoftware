/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OOoO.if;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import java.util.ArrayList;

public class N
extends F {
    public static ArrayList<if> \u00d4\u00d50000() {
        ArrayList<if> arrayList = new ArrayList<if>();
        arrayList.add(if.o00000);
        arrayList.add(if.\u00d400000);
        arrayList.add(if.\u00d800000);
        arrayList.add(if.\u00f500000);
        arrayList.add(if.\u00d500000);
        return arrayList;
    }

    public N() {
        super(while.\u00d2O\u00d5000.toString(), 4, N.\u00d500000(2), N.\u00d4\u00d50000());
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
        Integer n = (Integer)r.o00000(0);
        if (n == 2) {
            return 100;
        }
        return 150;
    }

    protected BedingungsVerknuepfung \u00d3O0000(R r) {
        Integer n = (Integer)r.o00000(0);
        r.o00000(1);
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        bedingungsVerknuepfung.addBedingung(Bedingung.istMindestens(Bedingung.MagieLevel.\u00d800000));
        switch (n) {
            case 1: {
                bedingungsVerknuepfung.addBedingung(Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)11));
                break;
            }
            case 2: {
                bedingungsVerknuepfung.addBedingung(Bedingung.hat(voidsuper.\u00f5\u00f5\u00d5000, (Integer)15));
                bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.\u00d2O\u00d5000, new Integer(1), r.o00000(1)));
            }
        }
        return bedingungsVerknuepfung;
    }
}

