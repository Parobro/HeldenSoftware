/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.zaubertaenzer;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.zaubertaenzer.VarianteZaubertaenzer;

public class NovadischeSharisad
extends VarianteZaubertaenzer {
    public NovadischeSharisad() {
        super("Novadische Sharisad", 6);
    }

    public NovadischeSharisad(String string, int n) {
        super(string, n + 6);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d4\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 4);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d5oo000, "Rastullah-Glaube", 6));
        return oo0O;
    }

    @Override
    public String toString() {
        return "Novadische Sharisad";
    }
}

