/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.minotaurenanimist;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.profession.minotaurenanimist.MinotaurenAnimistVariante;
import java.util.ArrayList;

public class Hornherr
extends MinotaurenAnimistVariante {
    public Hornherr() {
        super("Hornherr", "Hornherrin", 8, false);
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return super.getMinimalEigenschaftswert(b_02) + 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Blutmagie"));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f60000));
        arrayList.add(oooo_0.o00000(while.o\u00d8\u00d3000));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 3);
        return k_02;
    }
}

