/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d.oooo;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.Objectsuper;
import helden.framework.OOoO.R;
import helden.framework.OOoO.if;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import java.util.ArrayList;

/*
 * Renamed from helden.framework.D.OoOO.d
 */
public class d_0
extends F {
    private static ArrayList<Objectsuper> \u00f8\u00d50000() {
        ArrayList<Objectsuper> arrayList = new ArrayList<Objectsuper>();
        arrayList.add(Objectsuper.class);
        arrayList.add(Objectsuper.\u00d300000);
        return arrayList;
    }

    public d_0() {
        super(while.\u00d3\u00d8\u00d5000.toString(), 4, new ArrayList<if>(if.o00000()), d_0.\u00f8\u00d50000());
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
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.istMindestens(Bedingung.MagieLevel.\u00d800000));
    }

    @Override
    public int o00000(R r) {
        return 150;
    }

    protected BedingungsVerknuepfung forsuper(R r) {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.istMindestens(Bedingung.MagieLevel.\u00d800000), Bedingung.hatSfAuswahl(while.\u00f8\u00d3\u00d4000, (Objectsuper)r.o00000(1)));
    }
}

