/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.model.profession.magier.YolGhurmakBase;
import java.util.ArrayList;

public class YolGhurmakFlammensaeule
extends YolGhurmakBase {
    public YolGhurmakFlammensaeule() {
        super("J\u00fcnger der Flammens\u00e4ule", 30);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber("Brenne toter Stoff!*"), 6);
        k_02.\u00d200000(this.getZauber("Custodosigil"), 4);
        k_02.\u00d200000(this.getZauber("Ignifaxius*"), 5);
        k_02.\u00d200000(this.getZauber("Leib des Feuers*"), 5);
        k_02.\u00d200000(this.getZauber("Caldofrigo*"), 4);
        k_02.\u00d200000(this.getZauber("Ignisphaero*"), 3);
        k_02.\u00d200000(this.getZauber("Karnifilio"), 3);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber("Brenne toter Stoff*"));
        arrayList.add(this.getZauber("Custodosigil"));
        arrayList.add(this.getZauber("Ignifaxius*"));
        arrayList.add(this.getZauber("Leib des Feuers*"));
    }
}

