/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schelm;

import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.schelm.StandartSchelm;

public class Klabauterlehrling
extends StandartSchelm {
    public Klabauterlehrling() {
        super("Klabauterlehrling", 21);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.equals((Object)Geschlecht.\u00d400000)) {
            return "Klabauterlehrling";
        }
        return "Klabauterlehrling";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.returnprivateObject, 4);
        k_02.\u00d200000(voidsuper.thisvoidObject, 3);
        k_02.\u00d200000(voidsuper.newnewObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.thisclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4\u00d6\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d8\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.nullsupernew), 5);
        return k_02;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00d8o0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newfornew, K.\u00d8o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d2\u00d5000, K.\u00d8o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.thisintnew, K.\u00d8o0000, ""));
        return waehlbareZauber;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

