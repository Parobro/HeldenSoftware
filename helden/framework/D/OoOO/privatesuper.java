/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.C.I;
import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.HeldenMath;
import helden.framework.OOoO.K;
import helden.framework.OOoO.O;
import helden.framework.OOoO.R;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.settings.Settings;
import helden.framework.zauber.MyranischerZauber;
import java.util.ArrayList;

public class privatesuper
extends F {
    private static ArrayList<K> \u00d4\u00d60000() {
        Settings settings = Settings.getSettingByName("Myranor");
        ArrayList<K> arrayList = new ArrayList<K>();
        for (K k2 : K.\u00d400000()) {
            if (!settings.contains(k2)) continue;
            arrayList.add(k2);
        }
        return arrayList;
    }

    public privatesuper() {
        super(while.\u00d3\u00d5o000.toString(), 4, O.O\u00f40000(), privatesuper.\u00d4\u00d60000(), privatesuper.\u00d500000(7));
        this.o00000(null, 4);
        MyranischerZauber.init();
        this.o00000("Formel", "Repr\u00e4sentation", "Qualit\u00e4t");
    }

    @Override
    public BedingungsVerknuepfung \u00f5o0000() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.istMindestens(Bedingung.MagieLevel.\u00d300000));
    }

    @Override
    public int o00000(R r) {
        O o = (O)r.o00000(0);
        Integer n = (Integer)r.o00000(2);
        Float f2 = Float.valueOf(Math.max((float)o.\u00f5\u00d80000() / 2.0f, 1.0f));
        return HeldenMath.runde(f2.floatValue() * (float)n.intValue());
    }

    protected BedingungsVerknuepfung \u00f4o0000(R r) {
        O o = (O)r.o00000(0);
        K k2 = (K)r.o00000(1);
        Bedingung bedingung = K.\u00d5\u00d30000.equals(k2) ? Bedingung.hat(I.thisvoid) : Bedingung.hatNicht(I.thisvoid);
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.istMindestens(Bedingung.MagieLevel.\u00d300000), Bedingung.hatSfAuswahl(while.\u00d3\u00f4\u00d6000, o.\u00d5\u00d80000()), bedingung);
    }
}

