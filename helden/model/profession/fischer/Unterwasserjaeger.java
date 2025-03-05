/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.fischer;

import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.fischer.VarianteFischer;
import java.util.ArrayList;

public class Unterwasserjaeger
extends VarianteFischer {
    public Unterwasserjaeger() {
        super("Unterwasserj\u00e4ger", 4);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Unterwasserj\u00e4ger";
        }
        return "Unterwasserj\u00e4gerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.thispublicsuper, 3);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.returnprivateObject, "Tauchen"));
        arrayList.add(oooo_0.o00000(while.thisforObject.toString()));
        arrayList.remove(oooo_0.o00000(while.\u00d8\u00d8\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.o\u00d6\u00d8000, 2);
        k_02.\u00d200000(voidsuper.returnprivateObject, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        return oo0O;
    }
}

