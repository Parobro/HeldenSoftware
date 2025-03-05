/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.haendler;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.haendler.Haendler;
import java.util.ArrayList;

public class Hehler
extends Haendler {
    public Hehler() {
        super("Hehler", 0);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Hehler";
        }
        return "Hehlerin";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d30\u00d2000, "zweite Kleinstadt/Stadtteil"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 3: {
                arrayList.add(G.StringdoString);
                arrayList.add(G.o\u00f8\u00f5000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper.\u00d5O\u00d6000);
        k_02.\u00d200000(voidsuper.thisvoidObject, 1);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.forclassObject, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.o00000(voidsuper.\u00d5o\u00d8000);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(20);
        j2.Object("max. f\u00fcr 3 Personen");
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

