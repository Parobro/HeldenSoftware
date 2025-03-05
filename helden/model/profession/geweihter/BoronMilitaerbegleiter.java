/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;

public class BoronMilitaerbegleiter
extends N {
    public BoronMilitaerbegleiter() {
        super("Milit\u00e4rbegleiter", 2, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper.ifforObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.O0\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.o\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.nullvoidObject, 1);
        return k_02;
    }
}

