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

public class MendenaInspirator
extends Mendena {
    public MendenaInspirator() {
        super("Inspirator", 29);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber("Cryptographo"), 3);
        k_02.\u00d200000(this.getZauber("Psychostabilis"), 5);
        k_02.\u00d200000(this.getZauber("Respondami"), 5);
        k_02.\u00d200000(this.getZauber("Xenographus"), 4);
        k_02.\u00d200000(this.getZauber("Adlerschwinge"), 2);
        k_02.\u00d200000(this.getZauber("Custodosigil"), 2);
        k_02.\u00d200000(this.getZauber("Memorabia"), 3);
        k_02.\u00d200000(this.getZauber("Unitatio"), 3);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber("Cryptographo"));
        arrayList.add(this.getZauber("Psychostabilis"));
        arrayList.add(this.getZauber("Respondami"));
        arrayList.add(this.getZauber("Xenographus"));
    }
}

