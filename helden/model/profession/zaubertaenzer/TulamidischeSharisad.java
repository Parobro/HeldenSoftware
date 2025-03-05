/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.zaubertaenzer;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.zaubertaenzer.VarianteZaubertaenzer;
import java.util.ArrayList;

public class TulamidischeSharisad
extends VarianteZaubertaenzer {
    public TulamidischeSharisad() {
        super("Tulamidische Sharisad", 7);
    }

    public TulamidischeSharisad(String string, int n) {
        super(string, n + 7);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
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
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(G.newwhileString);
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d4\u00d8000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 3);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(G.\u00d3o\u00f5000, 5);
        return k_02;
    }

    @Override
    public String toString() {
        return "Tulamidische Sharisad";
    }
}

