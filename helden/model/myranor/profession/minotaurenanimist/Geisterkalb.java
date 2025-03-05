/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.minotaurenanimist;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.profession.minotaurenanimist.MinotaurenAnimistVariante;
import java.util.ArrayList;

public class Geisterkalb
extends MinotaurenAnimistVariante {
    public Geisterkalb() {
        super("Geisterkalb", "Geisterkalb", 5, false);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Blutmagie"));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00f6\u00f6000));
        arrayList.add(oooo_0.o00000(while.privateifclass));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        return k_02;
    }
}

