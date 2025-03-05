/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.bergmann;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.bergmann.VarianteBergmann;
import java.util.ArrayList;

public class Pilzzuechter
extends VarianteBergmann {
    public Pilzzuechter() {
        super("Pilzz\u00fcchter", 1);
    }

    @Override
    public int getAnzahlModifikationAuswahlen() {
        return 0;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Pilzz\u00fcchter";
        }
        return "Pilzz\u00fcchterin";
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.thispublicsuper);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.\u00d5\u00d2\u00d6000, "zwergische Pilzzucht"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(1);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, -1);
        k_02.\u00d200000(E.\u00f8\u00d5\u00d8000, -1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, -2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, -1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d2\u00d6000, 6);
        k_02.\u00d200000(voidsuper.forObjectObject, -4);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, -1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 3);
        return k_02;
    }
}

