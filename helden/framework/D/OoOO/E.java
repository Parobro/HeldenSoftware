/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.OOoO.o00O;
import helden.framework.OOoO.while;

public class E
extends while<o00O, o00O> {
    public E(o00O o00O2, o00O o00O3) {
        super(o00O2, o00O3);
    }

    @Override
    public String toString() {
        o00O o00O2 = (o00O)this.getWert1();
        o00O o00O3 = (o00O)this.getWert2();
        return o00O2.toString().substring(11, o00O2.toString().length() - 1) + "/" + o00O3.toString().substring(11, o00O3.toString().length() - 1);
    }
}

