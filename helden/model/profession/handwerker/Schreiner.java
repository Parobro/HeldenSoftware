/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.handwerker;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.handwerker.HandwerklicheSpezialisierung;
import java.util.ArrayList;

public class Schreiner
extends HandwerklicheSpezialisierung {
    public Schreiner() {
        super("Schreiner/Tischler");
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Schreiner/Tischler";
        }
        return "Schreinerin/Tischlerin";
    }

    @Override
    public oo0o_0 getHaupttalent() {
        return voidsuper.\u00d3\u00d8\u00d5000;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.\u00d3\u00d8\u00d5000, "M\u00f6belschreinerei/Tischlerei"));
        return arrayList;
    }
}

