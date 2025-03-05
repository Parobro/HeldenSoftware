/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.legendensaenger;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.legendensaenger.Legendensaenger;
import java.util.ArrayList;

public class Unterhaendler
extends Legendensaenger {
    public Unterhaendler() {
        super("Unterh\u00e4ndler", 6);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Unterh\u00e4ndler";
        }
        return "Unterh\u00e4ndlerin";
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.OO\u00d6000);
                arrayList.add(voidsuper.returnwhileObject);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(G.\u00d5\u00f8\u00f4000);
                arrayList.remove(G.\u00f50\u00f5000);
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.nullObjectObject);
                arrayList.add(voidsuper.o\u00f4\u00d6000);
                arrayList.add(voidsuper.\u00f4\u00d2\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(G.\u00d8\u00d8\u00f5000);
                arrayList.add(G.\u00f8\u00f8\u00f5000);
                arrayList.add(G.\u00f4\u00d6\u00f5000);
                arrayList.add(G.whileStringclass);
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, -1);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000);
        return k_02;
    }
}

