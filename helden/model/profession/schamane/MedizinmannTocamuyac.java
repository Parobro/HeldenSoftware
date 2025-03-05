/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schamane;

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
import helden.model.profession.schamane.Medizinmann;
import java.util.ArrayList;

public class MedizinmannTocamuyac
extends Medizinmann {
    public MedizinmannTocamuyac() {
        super("Medizinmann (Tocamuyac)", 11);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Medizinmann (Tocamuyac)";
        }
        return "Medizinfrau (Tocamuyac)";
    }

    @Override
    public ArrayList<I> getEntfernteKutlurVorteile() {
        ArrayList<I> arrayList = super.getEntfernteKutlurVorteile();
        arrayList.add(I.\u00f8\u00d4O000);
        return arrayList;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d6O000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d8\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d50O000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, -2);
        k_02.\u00d200000(E.thissuperString, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f6\u00d4O000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.o\u00d8o000));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

