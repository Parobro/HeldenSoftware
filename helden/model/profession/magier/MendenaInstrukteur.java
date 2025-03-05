/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.model.profession.magier.Mendena;
import java.util.ArrayList;

public class MendenaInstrukteur
extends Mendena {
    public MendenaInstrukteur() {
        super("Instrukteur", 25);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber("Gedankenbilder"), 4);
        k_02.\u00d200000(this.getZauber("Unitatio"), 5);
        k_02.\u00d200000(this.getZauber("Vocolimbo"), 4);
        k_02.\u00d200000(this.getZauber("Armatrutz"), 4);
        k_02.\u00d200000(this.getZauber("Balsam"), 3);
        k_02.\u00d200000(this.getZauber("Karnifilio"), 4);
        k_02.\u00d200000(this.getZauber("Silentium"), 4);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber("Gedankenbilder"));
        arrayList.add(this.getZauber("Unitatio"));
        arrayList.add(this.getZauber("Vocolimbo"));
        arrayList.add(this.getZauber("Armatrutz"));
    }
}

