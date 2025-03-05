/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.wundarzt;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_6;
import helden.model.profession.wundarzt.VarianteWundarzt;
import java.util.ArrayList;

public class Feldscher
extends VarianteWundarzt {
    private boolean \u00f40\u00f5O00 = true;

    public Feldscher() {
        super("Feldscher", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Feldscher";
        }
        return "Feldscherin";
    }

    @Override
    public oooo_6 getNextTalentTyp2Auswahl() {
        this.\u00f40\u00f5O00 = false;
        ArrayList<interface> arrayList = new ArrayList<interface>();
        arrayList.add(new interface(voidsuper.\u00d5O\u00d6000, 1));
        arrayList.add(new interface(voidsuper.\u00d5o\u00d8000, 3));
        return new oooo_6(this.getProfession(), arrayList, 1);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 1);
        return k_02;
    }

    @Override
    public boolean hatMehrTalentTyp2Auswahl() {
        return this.\u00f40\u00f5O00;
    }
}

