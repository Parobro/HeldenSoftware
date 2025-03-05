/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.hirte;

import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.hirte.VarianteHirte;
import java.util.ArrayList;

public class Kleintierzuechter
extends VarianteHirte {
    public Kleintierzuechter() {
        super("Kleintierz\u00fcchter", 0);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 0;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Kleintierz\u00fcchter";
        }
        return "Kleintierz\u00fcchterin";
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = oooo_0.o00000(voidsuper.\u00f5\u00d5\u00d6000);
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper.\u00d5O\u00d6000);
        k_02.\u00d200000(voidsuper.thisvoidObject, -1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, -2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, -2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, -2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d5\u00d6000, 3);
        return k_02;
    }
}

