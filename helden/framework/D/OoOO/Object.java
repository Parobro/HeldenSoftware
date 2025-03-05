/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;
import java.util.Arrays;

public class Object
extends F {
    private static String[] \u00f8\u00d4\u00f8000 = new String[]{"Mutige Schwinge", "Hohe Schwinge", "Tiefe Schwinge", "Harte Schwinge", "Harmonische Schwinge"};

    public static ArrayList<String> newString() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(Arrays.asList(\u00f8\u00d4\u00f8000));
        return arrayList;
    }

    public static ArrayList<voidsuper> o\u00d50000() {
        return N.floatsuper().super(null, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000);
    }

    public Object() {
        super(while.\u00f60\u00d5000.toString(), 2, Object.o\u00d50000(), Object.newString());
        this.\u00f4\u00d40000();
        this.o00000(5);
    }

    @Override
    public boolean equals(java.lang.Object object) {
        if (object == null) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(while.\u00d3\u00d8\u00f6000));
    }

    @Override
    public int o00000(R r) {
        return 75;
    }

    @Override
    protected BedingungsVerknuepfung \u00f500000(R r) {
        BedingungsVerknuepfung bedingungsVerknuepfung = this.\u00f5o0000();
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(this.\u00f400000(r), (Integer)10));
        return bedingungsVerknuepfung;
    }

    protected E \u00f400000(R r) {
        return (E)r.o00000(0);
    }
}

