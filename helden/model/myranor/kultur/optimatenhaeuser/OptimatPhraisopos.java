/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.kultur.optimatenhaeuser;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.floatsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatBasisVariante;
import java.util.ArrayList;
import java.util.List;

public class OptimatPhraisopos
extends OptimatBasisVariante {
    public OptimatPhraisopos() {
        super("Haus Phraisopos", "Haus Phraisopos", 6, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 3);
        return k_02;
    }

    @Override
    public List<o0oo_2> getAuswahlen(floatsuper floatsuper2) {
        List<o0oo_2> list = super.getAuswahlen(floatsuper2);
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
        arrayList.add(voidsuper.\u00f5\u00f5\u00d6000);
        arrayList.add(voidsuper.StringObjectObject);
        arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
        int[] nArray = new int[]{3};
        list.add(new o0oo_2(floatsuper2, arrayList, nArray));
        return list;
    }

    @Override
    public boolean wirdMutterspracheZurZeitsprache() {
        return true;
    }

    @Override
    public G getMuttersprache() {
        return G.o\u00d8\u00f5000;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000(I.\u00f4Oo000));
        arrayList.add(K.o00000(I.\u00f5OO000));
        arrayList.add(K.o00000(I.\u00d5\u00d50000));
        arrayList.add(K.o00000(I.o\u00f4o000));
        return arrayList;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Totenangst"));
        arrayList.add(K.o00000("Krankheitsanf\u00e4llig"));
        return arrayList;
    }
}

