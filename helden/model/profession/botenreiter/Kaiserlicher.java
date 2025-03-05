/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.botenreiter;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.botenreiter.VarianteBotenreiter;

public class Kaiserlicher
extends VarianteBotenreiter {
    public Kaiserlicher() {
        super("Kaiserlicher Boten- und Kurierdienst", 0);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Kaiserlicher Boten- und Kurierdienst";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1 + super.getMinimalEigenschaftswert(b_02);
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        return k_02;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, -1);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(12);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.\u00d5oo000, "Reichstreue, Befehlsempf\u00e4nger, milit\u00e4rischer Geheimnistr\u00e4ger");
        j3.oO0000(8);
        oo0O.\u00d300000(j3);
        return oo0O;
    }
}

