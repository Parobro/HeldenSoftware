/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.stammeskrieger;

import helden.framework.Geschlecht;
import helden.framework.oooo.b_0;
import helden.model.profession.stammeskrieger.Novadi;

public class AchmadSunni
extends Novadi {
    public AchmadSunni() {
        super("Achmad'sunni", 13);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public String toString() {
        return "Achmad'sunni";
    }
}

