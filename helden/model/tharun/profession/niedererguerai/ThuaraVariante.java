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

public class ThuaraVariante
extends NiedererGueraiVariante {
    public ThuaraVariante() {
        super("Niederer Guerai aus Thuara", "Niederer Guerai aus Thuara");
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Linkhand"));
        arrayList.add(oooo_0.o00000("Schildkampf I"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Belagerungswaffen"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bogen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Infanteriewaffen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("S\u00e4bel"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Zweihandschwerter/-s\u00e4bel"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Formation"));
        arrayList.addAll(for.\u00d200000("R\u00fcstungsgew\u00f6hnung II"));
        arrayList.addAll(for.\u00d200000("Schildkampf II"));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

