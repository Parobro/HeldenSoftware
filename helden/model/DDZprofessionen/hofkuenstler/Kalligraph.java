/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.hofkuenstler;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.hofkuenstler.Hofkuenstler;
import java.util.ArrayList;

public class Kalligraph
extends Hofkuenstler {
    public Kalligraph() {
        super("Kalligraph", 6);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Kalligraph";
        }
        return "Kalligraphin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(n);
            }
            case 1: {
                arrayList.add(G.whilewhileString);
                arrayList.add(G.\u00d5\u00f8\u00f5000);
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.forpublicObject, 6);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00f5\u00d5000, 3);
        k_02.\u00d200000(voidsuper2, 2);
        k_02.\u00d200000(G.\u00d5\u00f8\u00f5000, 8);
        k_02.\u00d200000(voidsuper3, 2);
        k_02.\u00d200000(G.\u00f8\u00f8\u00f4000, 8);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 6);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, -1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Zauberzeichen");
        arrayList.add(for.o00000(voidsuper.\u00f5\u00f5\u00d5000, arrayList2, 1));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d4\u00d5o000));
        return oo0O;
    }
}

