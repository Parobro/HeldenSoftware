/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d.oooo;

import helden.framework.D.F;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.held.Object.floatsuper;

/*
 * Renamed from helden.framework.D.OoOO.oOOo
 */
public class oooo_1
extends F {
    public oooo_1() {
        super(while.\u00d5\u00d2\u00d3000.toString(), 4, oooo_1.o00000(3, 7), oooo_1.\u00d500000(0));
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

