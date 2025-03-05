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
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatBasisVariante;
import java.util.ArrayList;
import java.util.List;

public class OptimatIllacrionVariante
extends OptimatBasisVariante {
    public OptimatIllacrionVariante() {
        super("Haus Illacrion", "Haus Illacrion", 6, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 2);
        return k_02;
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
    public List<o0oo_2> getAuswahlen(floatsuper floatsuper2) {
        List<o0oo_2> list = super.getAuswahlen(floatsuper2);
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Tanzen"));
        arrayList.add(N.floatsuper().\u00d200000("Singen"));
        int[] nArray = new int[]{3};
        list.add(new o0oo_2(floatsuper2, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Schauspielerei"));
        arrayList.add(N.floatsuper().\u00d200000("Schriftlicher Ausdruck"));
        arrayList.add(N.floatsuper().\u00d200000("Glaskunst"));
        arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
        arrayList.add(N.floatsuper().\u00d200000("Malen/Zeichnen"));
        arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
        arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
        arrayList.add(N.floatsuper().\u00d200000("Steinmetz"));
        arrayList.add(N.floatsuper().\u00d200000("T\u00f6pfern"));
        int[] nArray2 = new int[]{3};
        list.add(new o0oo_2(floatsuper2, arrayList, nArray2));
        return list;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000(I.\u00d5o0000, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super.toString()));
        arrayList.add(K.o00000("Meisterhandwerk"));
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Neugier"));
        return arrayList;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Tollpatsch"));
        arrayList.add(K.o00000("Unstet"));
        return arrayList;
    }
}

