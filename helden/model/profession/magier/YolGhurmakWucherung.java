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

public class YolGhurmakWucherung
extends YolGhurmakBase {
    public YolGhurmakWucherung() {
        super("J\u00fcnger der Wucherung", 32);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber("Chimaeroform"), 6);
        k_02.\u00d200000(this.getZauber("Humofaxius*"), 4);
        k_02.\u00d200000(this.getZauber("Klarum Purum"), 5);
        k_02.\u00d200000(this.getZauber("Wand aus Dornen*"), 6);
        k_02.\u00d200000(this.getZauber("Balsam"), 4);
        k_02.\u00d200000(this.getZauber("Herr \u00fcber das Tierreich"), 4);
        k_02.\u00d200000(this.getZauber("Verwandlung beenden"), 3);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber("Chimaeroform"));
        arrayList.add(this.getZauber("Humofaxius*"));
        arrayList.add(this.getZauber("Klarum Purum"));
        arrayList.add(this.getZauber("Wand aus Dornen*"));
    }
}

