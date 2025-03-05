/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.held.object.oooo_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;
import java.util.Arrays;

public class Y
extends F {
    private static String[] thisthisreturn = new String[]{"Mutige Schwinge", "Hohe Schwinge", "Tiefe Schwinge", "Harte Schwinge", "Harmonische Schwinge"};

    public static ArrayList<String> \u00f4\u00d50000() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(Arrays.asList(thisthisreturn));
        return arrayList;
    }

    public Y() {
        super(while.\u00f6\u00f8O000.toString(), 2, N.floatsuper().super(null, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000), Y.\u00f4\u00d50000());
        this.\u00f4\u00d40000();
        this.o00000(2);
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
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(while.thisforString));
    }

    @Override
    public int o00000(R r) {
        return 200;
    }

    protected BedingungsVerknuepfung Oo0000(R r) {
        try {
            BedingungsVerknuepfung bedingungsVerknuepfung = super.\u00f5o0000();
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(this.oo0000(r), (Integer)18));
            bedingungsVerknuepfung.addBedingung(Bedingung.hatSfAuswahl(while.\u00f60\u00d5000, ((R)r.clone()).\u00d200000()));
            return bedingungsVerknuepfung;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            oooo_0.o00000(cloneNotSupportedException);
            throw new IllegalStateException();
        }
    }

    protected E oo0000(R r) {
        return (E)r.o00000(0);
    }
}

