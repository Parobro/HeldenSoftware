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

public class Visionaer
extends StandartSchelm {
    public Visionaer() {
        super("Visionaer", 17);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.equals((Object)Geschlecht.\u00d400000)) {
            return "Vision\u00e4r";
        }
        return "Vision\u00e4rin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        k_02.\u00d200000(voidsuper.StringObjectObject, 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d30\u00d5000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00d2\u00d5000), 3);
        return k_02;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00d8o0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d2\u00d4000, K.\u00d8o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringclassnew, K.\u00d8o0000, ""));
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

