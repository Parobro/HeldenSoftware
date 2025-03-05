/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.OoOO.voidsuper;

public class ooOO
extends public {
    private voidsuper \u00d4\u00d4\u00d2000;

    protected ooOO(I i2, int n, voidsuper voidsuper2) {
        super(i2, n, false, true);
        this.\u00d4\u00d4\u00d2000 = voidsuper2;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ooOO ooOO2 = new ooOO(this.\u00f4O0000(), this.supersuper(), this.oo0000());
        return ooOO2;
    }

    public voidsuper oo0000() {
        return this.\u00d4\u00d4\u00d2000;
    }
}

