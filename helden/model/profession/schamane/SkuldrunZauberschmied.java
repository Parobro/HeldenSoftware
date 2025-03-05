/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.schamane.Skuldrun;
import java.util.ArrayList;

public class SkuldrunZauberschmied
extends Skuldrun {
    public SkuldrunZauberschmied() {
        super("Skuldrun: Zauberschmied", 10);
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Skuldrun: Zauberschmied";
        }
        return "Skuldrun: Zauberschmiedin";
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00f40\u00d8000, 5);
        k_02.\u00d200000(voidsuper.\u00f5\u00d8\u00d5000, 5);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d30\u00f5000));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        if (n == 1) {
            ArrayList<U> arrayList = new ArrayList<U>();
            arrayList.add(voidsuper.\u00f80\u00d8000);
            arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
            return o00o_0.o00000(this.getProfession(), K.\u00d200000(arrayList), 1);
        }
        return super.getVorteilAuswahl(n);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d5\u00d3O000));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d80000));
        M<U> m = K.o00000();
        m.\u00d2o0000();
        m.o00000(voidsuper.\u00f5\u00d8\u00d5000);
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

