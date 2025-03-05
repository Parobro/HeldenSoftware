/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.handwerker;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.handwerker.Handwerker;
import java.util.ArrayList;

public class Gussmaurer
extends Handwerker {
    public Gussmaurer() {
        super("Gussmaurer", 3);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        int n = 2;
        return n;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Gussmaurer";
        }
        return "Gussmaurerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.\u00f4\u00f6\u00d6000, "Gussmaurer"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(0);
            }
            case 1: {
                return super.getTalentAuswahl(2);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper3, 1);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.whileStringObject, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d6000, 6);
        return k_02;
    }
}

