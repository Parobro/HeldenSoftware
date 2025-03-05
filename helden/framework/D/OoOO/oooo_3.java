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
import java.util.ArrayList;

/*
 * Renamed from helden.framework.D.OoOO.oooo
 */
public class oooo_3
extends F {
    private static ArrayList<String> ifString() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Zauberdauer");
        arrayList.add("Zielobjekt");
        arrayList.add("Wirkungsdauer");
        arrayList.add("Struktur");
        arrayList.add("Reichweite");
        return arrayList;
    }

    public oooo_3() {
        super(while.\u00f6\u00d6\u00d2000.toString(), 4, oooo_3.\u00d500000(4), oooo_3.ifString());
        this.\u00f4\u00d40000();
        this.o00000(4);
    }

    @Override
    public int o00000(R r) {
        Integer n = (Integer)r.o00000(0);
        return n * 100;
    }

    protected BedingungsVerknuepfung nullsuper(R r) {
        Integer n = (Integer)r.o00000(0);
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        if (n > 1) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.\u00f6\u00d6\u00d2000, r.o00000(0, new Integer(n - 1))));
        }
        switch (n) {
            case 3: {
                bedingungsVerknuepfung.addBedingung(Bedingung.hatLeiteigenschaft(14));
                break;
            }
            case 4: {
                bedingungsVerknuepfung.addBedingung(Bedingung.hatLeiteigenschaft(15));
            }
        }
        return bedingungsVerknuepfung;
    }
}

