/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.held.Object.floatsuper;
import helden.framework.zauber.MyranischerZauber;
import java.util.ArrayList;

public class P
extends F {
    private static ArrayList<MyranischerZauber> returnString() {
        MyranischerZauber.init();
        ArrayList<MyranischerZauber> arrayList = new ArrayList<MyranischerZauber>();
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getWZauber()) {
            arrayList.add(myranischerZauber);
        }
        return arrayList;
    }

    public P() {
        super(while.thisnullString.toString(), 4, P.returnString(), P.\u00d500000(7), P.\u00d500000(0));
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
        Integer n = (Integer)r.o00000(1);
        return n * 15;
    }

    @Override
    public String o00000(R r, floatsuper floatsuper2, boolean bl) {
        if (r.o00000(2).toString().trim().isEmpty()) {
            return "Eine Beschreibung fehlt.";
        }
        return super.o00000(r, floatsuper2, bl);
    }

    protected BedingungsVerknuepfung \u00d5O0000(R r) {
        MyranischerZauber myranischerZauber = (MyranischerZauber)r.o00000(0);
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(myranischerZauber, (Integer)7), Bedingung.istMindestens(Bedingung.MagieLevel.\u00d300000));
    }
}

