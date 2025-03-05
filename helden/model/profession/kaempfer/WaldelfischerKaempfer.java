/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.kaempfer;

import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.kaempfer.Kaempfer;

public class WaldelfischerKaempfer
extends Kaempfer {
    public WaldelfischerKaempfer() {
        super("Waldelfischer K\u00e4mpfer", 8);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Waldelfischer K\u00e4mpfer";
        }
        return "Waldelfische K\u00e4mpferin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.thisvoidObject, 2);
        return k_02;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.thisObjectnew, K.\u00f4o0000, ""));
        return waehlbareZauber;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

