/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.gardist;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.gardist.Akademiegardist;

public class TempelgardistStadtDesSchweigens
extends Akademiegardist {
    public TempelgardistStadtDesSchweigens() {
        super("Tempelgardist der Stadt des Schweigens", 0);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Tempelgardist der Stadt des Schweigens";
        }
        return "Tempelgardistin der Stadt des Schweigens";
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.thispublicsuper, 1);
        k_02.\u00d200000(b_0.\u00f5\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(1);
            }
            case 1: {
                return super.getTalentAuswahl(3);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d4\u00d6\u00d8000, 3);
        k_02.\u00d200000(E.\u00d8\u00d5\u00d8000, 6);
        k_02.\u00d200000(voidsuper.newnewObject, 1);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, -1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.new(K.o00000(I.\u00d5oo000));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000));
        return oo0O;
    }
}

