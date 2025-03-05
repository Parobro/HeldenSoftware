/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.int.N;
import helden.framework.oooo.b_0;

public class BoronEtilianer
extends N {
    public BoronEtilianer() {
        super("Etilianer", 2);
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 14;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d8\u00f60000, "andere Ordensmitglieder");
        j2.oO0000(20);
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

