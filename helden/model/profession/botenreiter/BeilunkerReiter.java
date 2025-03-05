/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.botenreiter;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.botenreiter.VarianteBotenreiter;
import java.util.ArrayList;

public class BeilunkerReiter
extends VarianteBotenreiter {
    public BeilunkerReiter() {
        super("Beilunker Reiter", 5);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Beilunker Reiter";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1 + super.getMinimalEigenschaftswert(b_02);
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f6\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d3\u00d6\u00d8000, 3);
        k_02.\u00d200000(E.thissuperString, 4);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d5oo000, "zuverl\u00e4ssige Nachrichten\u00fcberbringung, treue zum Dienstherr, Unbestechlichkeit");
        j2.oO0000(10);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }
}

