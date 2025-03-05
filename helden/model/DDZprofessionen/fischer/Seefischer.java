/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.fischer;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.fischer.VarianteFischer;
import java.util.ArrayList;

public class Seefischer
extends VarianteFischer {
    public Seefischer() {
        super("Seefischer", 3);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Seefischer";
        }
        return "Seefischerin";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.ifinterfaceObject.toString()));
        arrayList.add(K.o00000(voidsuper.\u00f80\u00d6000, "Seefischerei"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 4);
        return k_02;
    }
}

