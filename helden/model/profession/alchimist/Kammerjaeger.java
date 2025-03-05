/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.alchimist;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.alchimist.BasisAlchimist;

public class Kammerjaeger
extends BasisAlchimist {
    public Kammerjaeger(String string, int n, boolean bl) {
        super(string, n, bl);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return super.getAnzahlTalentAuswahlen() - 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        String string = "";
        if (this.\u00d8O\u00f5O00) {
            string = " (magiebegabt)";
        }
        if (geschlecht.istMaennlich()) {
            return "Kammerjaeger" + string;
        }
        return "Kammerjaegerin" + string;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                return super.getTalentAuswahl(n + 1);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d5000, 5);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
        k_02.o00000(voidsuper.\u00f40\u00d8000);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 1);
        k_02.o00000(voidsuper.thisintObject);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, -2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.o00000(G.\u00d5\u00d4\u00f5000);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.new(K.o00000(I.privateclass));
        J j2 = (J)K.o00000(I.o\u00f8O000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

