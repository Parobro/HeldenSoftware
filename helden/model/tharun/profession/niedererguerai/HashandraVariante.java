/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.niedererguerai;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.tharun.profession.niedererguerai.NiedererGueraiVariante;
import java.util.ArrayList;

public class HashandraVariante
extends NiedererGueraiVariante {
    public HashandraVariante() {
        super("Niederer Guerai aus Hashandra", "Niederer Guerai aus Hashandra");
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Wuchtschlag"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anderthalbh\u00e4nder"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schwerter"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bogen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Akrobatik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tanzen"), 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Ausweichen II"));
        arrayList.addAll(for.\u00d200000("Kampfgesp\u00fcr"));
        arrayList.addAll(for.\u00d200000("Meisterparade"));
        arrayList.addAll(for.\u00d200000("Schwertmeisterlicher Ausfall"));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

