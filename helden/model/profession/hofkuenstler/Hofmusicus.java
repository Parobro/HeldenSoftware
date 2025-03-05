/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.hofkuenstler;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.hofkuenstler.Hofkuenstler;

public class Hofmusicus
extends Hofkuenstler {
    public Hofmusicus() {
        super("Hofmusicus", 0);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Hofmusicus";
        }
        return "Hofmusica";
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        if (n == 0) {
            return new objectsuper_0(this.getProfession(), oooo_0.o00000(voidsuper.privateObjectObject), 1);
        }
        return null;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.newnewObject, 4);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.privateObjectObject, 7);
        return k_02;
    }
}

