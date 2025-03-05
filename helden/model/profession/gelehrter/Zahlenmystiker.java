/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.gelehrter;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.gelehrter.Gelehrter;
import java.util.ArrayList;

public class Zahlenmystiker
extends Gelehrter {
    public Zahlenmystiker() {
        super("Zahlenmystiker", 0);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Zahlenmystiker";
        }
        return "Zahlenmystikerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.forforclass.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.thisintObject, 5);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d5\u00f5\u00d5000);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        oo0O.new(K.o00000(I.ifprivate));
        oo0O.\u00d300000(K.o00000(I.\u00d4\u00d5o000));
        return oo0O;
    }
}

