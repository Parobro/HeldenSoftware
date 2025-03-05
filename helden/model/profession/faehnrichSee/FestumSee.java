/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.faehnrichSee;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.faehnrichSee.BasisFaehnrichSee;

public class FestumSee
extends BasisFaehnrichSee {
    public FestumSee(String string) {
        super(string, 23);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d6\u00d6000, 3);
        return k_02;
    }
}

