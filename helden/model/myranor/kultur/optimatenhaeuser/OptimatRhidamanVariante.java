/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.kultur.optimatenhaeuser;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
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

public class OptimatRhidamanVariante
extends OptimatBasisVariante {
    public OptimatRhidamanVariante() {
        super("Haus Rhidaman", "Haus Rhidaman", 4, false);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.o\u00d8\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Handel"), 4);
        return k_02;
    }

    @Override
    public List<o0oo_2> getAuswahlen(floatsuper floatsuper2) {
        List<o0oo_2> list = super.getAuswahlen(floatsuper2);
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Sch\u00e4tzen"));
        arrayList.add(N.floatsuper().\u00d200000("Rechnen"));
        int[] nArray = new int[]{2};
        list.add(new o0oo_2(floatsuper2, arrayList, nArray));
        return list;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Goldgier", 5));
        return oo0O;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000(I.\u00f4O0000));
        arrayList.add(K.o00000(I.\u00d4\u00d5o000));
        arrayList.add(K.o00000(I.OO\u00d2000));
        arrayList.add(K.o00000(I.\u00d4oo000));
        arrayList.add(K.o00000(I.\u00d8\u00f60000));
        arrayList.add(K.o00000(I.thisdo));
        arrayList.add(K.o00000(I.privateObjectsuper));
        return arrayList;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000(I.privatesupersuper));
        arrayList.add(K.o00000(I.o\u00d5O000));
        return arrayList;
    }
}

