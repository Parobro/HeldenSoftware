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

public class YolGhurmakUnmetalls
extends YolGhurmakBase {
    public YolGhurmakUnmetalls() {
        super("J\u00fcnger des Unmetalls", 27);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber("Adamantium*"), 5);
        k_02.\u00d200000(this.getZauber("Eisenrost"), 4);
        k_02.\u00d200000(this.getZauber("Granit und Marmor*"), 5);
        k_02.\u00d200000(this.getZauber("Wand aus Erz*"), 4);
        k_02.\u00d200000(this.getZauber("Armatrutz*"), 3);
        k_02.\u00d200000(this.getZauber("Fortifex*"), 2);
        k_02.\u00d200000(this.getZauber("Plumbumbarum"), 4);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber("Adamantium*"));
        arrayList.add(this.getZauber("Eisenrost"));
        arrayList.add(this.getZauber("Granit und Marmor*"));
        arrayList.add(this.getZauber("Wand aus Erz*"));
    }
}

