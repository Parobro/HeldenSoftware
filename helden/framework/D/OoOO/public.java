/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.Objectsuper;
import helden.framework.OOoO.R;
import helden.framework.OOoO.if;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import java.util.ArrayList;

public class public
extends F {
    private static ArrayList<Objectsuper> \u00d5\u00d50000() {
        ArrayList<Objectsuper> arrayList = new ArrayList<Objectsuper>();
        arrayList.add(Objectsuper.class);
        arrayList.add(Objectsuper.\u00d300000);
        return arrayList;
    }

    public public() {
        super(while.ifpublicString.toString(), 4, new ArrayList<if>(if.o00000()), public.\u00d5\u00d50000());
        this.\u00f4\u00d40000();
        this.o00000(3);
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
        return 300;
    }

    protected BedingungsVerknuepfung \u00d4O0000(R r) {
        if if_ = (if)((Object)r.o00000(0));
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.istMindestens(Bedingung.MagieLevel.\u00d800000), Bedingung.hatSfAuswahl(while.\u00d3\u00d8\u00d5000, r), Bedingung.hatMyrZauber(null, 12, new Object[]{if_}));
    }
}

