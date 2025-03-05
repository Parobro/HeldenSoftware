/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.handwerker;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.handwerker.HandwerklicheSpezialisierung;
import java.util.ArrayList;

public class Segelmacher
extends HandwerklicheSpezialisierung {
    public Segelmacher() {
        super("Segelmacher");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Segelmacher";
        }
        return "Segelmacherin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.returnifObject;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.returnifObject, "Segel"));
        return arrayList;
    }
}

