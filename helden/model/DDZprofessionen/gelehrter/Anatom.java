/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.gelehrter;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.gelehrter.BasisGelehrter;
import java.util.ArrayList;

public class Anatom
extends BasisGelehrter {
    public Anatom() {
        super("Anatom", "Anatomin", 5, false);
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fleischer"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Gift"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Krankheiten"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Totenangst"));
        return arrayList;
    }
}

