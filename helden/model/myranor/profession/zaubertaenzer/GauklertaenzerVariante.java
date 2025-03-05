/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.zaubertaenzer;

import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.profession.zaubertaenzer.ZaubertaenzerVariante;

public class GauklertaenzerVariante
extends ZaubertaenzerVariante {
    public GauklertaenzerVariante() {
        super("Gauklert\u00e4nzer", "Gauklert\u00e4nzerin", 8, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wurfmesser"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Akrobatik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gaukeleien"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Gassenwissen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        return k_02;
    }
}

