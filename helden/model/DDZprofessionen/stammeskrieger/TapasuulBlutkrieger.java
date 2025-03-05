/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.stammeskrieger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.stammeskrieger.Blutkrieger;
import java.util.ArrayList;

public class TapasuulBlutkrieger
extends Blutkrieger {
    public TapasuulBlutkrieger() {
        super("TapasuulBlutkrieger", 4);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Tapasuul-Blutkrieger";
        }
        return "Tapasuul-Blutkriegerin";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d30\u00f5000));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00f8\u00d5000));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d4\u00f4000));
        arrayList.remove(oooo_0.o00000(while.iffloatObject));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.o00000(E.\u00d4\u00d4\u00d8000);
        k_02.o00000(E.\u00d3\u00d6\u00d8000);
        k_02.o00000(E.\u00d3\u00d5\u00d8000);
        k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, -2);
        k_02.\u00d200000(voidsuper.ifforObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d8000, 3);
        k_02.o00000(voidsuper.o\u00d5\u00d6000);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, -1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, -3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.iffloatObject));
        arrayList.add(new for(while.\u00f6\u00f6\u00d4000));
        arrayList.add(new for(while.\u00f5\u00f5\u00d5000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d5\u00d3O000));
        oo0O.\u00d300000(K.o00000(I.ifreturn));
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00f50000, 6));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

