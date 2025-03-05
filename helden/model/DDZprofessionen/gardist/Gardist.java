/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.gardist;

import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;

public abstract class Gardist
extends N {
    public Gardist(String string, int n) {
        super(string, n);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.thispublicsuper, 2);
        return k_02;
    }
}

