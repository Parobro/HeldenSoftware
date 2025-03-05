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
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatBasisVariante;
import java.util.ArrayList;

public class OptimatAlantinosVariante
extends OptimatBasisVariante {
    public OptimatAlantinosVariante() {
        super("Haus Alantinos", "Haus Alantinos", 6, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verkleiden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schriftlicher Ausdruck"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Staatskunst"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Handel"), 2);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.O\u00f4O000, 5));
        return oo0O;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Gutaussehend"));
        arrayList.add(K.o00000("Gl\u00fcck"));
        arrayList.add(K.o00000("Gl\u00fcck im Spiel"));
        arrayList.add(K.o00000("Goldgier"));
        return arrayList;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Autorit\u00e4tsgl\u00e4ubig"));
        return arrayList;
    }

    @Override
    public boolean wirdMutterspracheZurZeitsprache() {
        return true;
    }

    @Override
    public G getMuttersprache() {
        return G.o\u00d8\u00f5000;
    }
}

