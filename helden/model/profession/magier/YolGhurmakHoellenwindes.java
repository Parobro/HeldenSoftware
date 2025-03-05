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

public class YolGhurmakHoellenwindes
extends YolGhurmakBase {
    public YolGhurmakHoellenwindes() {
        super("J\u00fcnger des H\u00f6llenwindes", 30);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber("Aeolitus*"), 6);
        k_02.\u00d200000(this.getZauber("Aerofugo*"), 6);
        k_02.\u00d200000(this.getZauber("Nihilogravo"), 5);
        k_02.\u00d200000(this.getZauber("Nuntiovolo"), 4);
        k_02.\u00d200000(this.getZauber("Aerogelo*"), 2);
        k_02.\u00d200000(this.getZauber("Motoricus"), 3);
        k_02.\u00d200000(this.getZauber("Orcanofaxius*"), 3);
        k_02.\u00d200000(this.getZauber("Visibili"), 4);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber("Aeolitus*"));
        arrayList.add(this.getZauber("Aerofugo*"));
        arrayList.add(this.getZauber("Nihilogravo"));
        arrayList.add(this.getZauber("Nuntiovolo"));
    }
}

