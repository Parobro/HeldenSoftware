/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.niedererguerai;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.for;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.tharun.profession.niedererguerai.NiedererGueraiVariante;
import java.util.ArrayList;

public class IlshiVailenVariante
extends NiedererGueraiVariante {
    public IlshiVailenVariante() {
        super("Niederer Guerai aus Ilshi Vailen", "Niederer Guerai aus Ilshi Vailen");
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anderthalbh\u00e4nder"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Belagerungswaffen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bogen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Infanteriewaffen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Speere"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Zweihandschwerter/-s\u00e4bel"), 6);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000(I.\u00d3\u00d5o000));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Formation"));
        arrayList.addAll(for.\u00d200000("Gegenhalten"));
        arrayList.addAll(for.\u00d200000("Meisterparade"));
        arrayList.addAll(for.\u00d200000("R\u00fcstungsgew\u00f6hnung II"));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

