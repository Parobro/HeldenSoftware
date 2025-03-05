/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.botenreiter;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.botenreiter.VarianteBotenreiter;
import java.util.ArrayList;

public class Stafettenlaeufer
extends VarianteBotenreiter {
    public Stafettenlaeufer() {
        super("Stafettenl\u00e4ufer", 2);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Stafettenl\u00e4ufer";
        }
        return "Stafettenl\u00e4uferin";
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(0);
            }
            case 1: {
                return super.getTalentAuswahl(3);
            }
            case 2: {
                return super.getTalentAuswahl(2);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 1);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 5);
        k_02.o00000(voidsuper.\u00d5O\u00d6000);
        k_02.o00000(voidsuper.returnprivateObject);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.O\u00f6\u00d5000);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, -2);
        k_02.\u00d200000(voidsuper.nullObjectObject, -2);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.nullifString));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d4O000));
        return oo0O;
    }
}

