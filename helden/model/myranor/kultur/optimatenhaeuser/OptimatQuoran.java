/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.kultur.optimatenhaeuser;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.for;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatBasisVariante;
import java.util.ArrayList;

public class OptimatQuoran
extends OptimatBasisVariante {
    public OptimatQuoran() {
        super("Haus Quoran", "Haus Quoran", 5, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Mechanik"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 3);
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
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Meisterhandwerk"));
        return arrayList;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Meister der Improvisation"));
        return arrayList;
    }
}

