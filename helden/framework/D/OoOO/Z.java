/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.held.Object.floatsuper;
import java.util.ArrayList;

public class Z
extends F {
    private static ArrayList<String> \u00f5\u00d50000() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Chim\u00e4ren");
        arrayList.add("Konstrukte");
        arrayList.add("D\u00e4monoide");
        arrayList.add("Untote");
        return arrayList;
    }

    public Z() {
        super(while.whiledosuper.toString(), 4, Z.\u00f5\u00d50000(), Z.\u00d500000(0));
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
        Integer n = 7;
        if (r.o00000(0).equals("Untote")) {
            n = 5;
        }
        return n * 15;
    }

    @Override
    public String o00000(R r, floatsuper floatsuper2, boolean bl) {
        if (r.o00000(1).toString().trim().isEmpty()) {
            return "Eine Beschreibung fehlt.";
        }
        return super.o00000(r, floatsuper2, bl);
    }
}

