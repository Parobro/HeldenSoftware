/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.bauer;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.bauer.Bauer;
import java.util.ArrayList;

public class Feldsklave
extends Bauer {
    public Feldsklave() {
        super("Feldsklave", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Feldsklave";
        }
        return "Feldsklavin";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d6o000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.thisvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f4oO000));
        return oo0O;
    }
}

