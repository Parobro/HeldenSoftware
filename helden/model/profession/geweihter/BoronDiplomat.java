/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;

public class BoronDiplomat
extends N {
    public BoronDiplomat() {
        super("Diplomat", 3, false);
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(b_0.\u00f5\u00f5\u00d2000, (Integer)7));
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper.O0\u00d6000, 2);
        k_02.o00000(voidsuper.forpublicObject, 3);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 1);
        k_02.o00000(voidsuper.StringclassObject, 1);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f5\u00d6\u00d6000, 4);
        return k_02;
    }
}

