/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.niedererguerai;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.tharun.profession.niedererguerai.NiedererGueraiVariante;
import java.util.ArrayList;

public class LaniaVariante
extends NiedererGueraiVariante {
    public LaniaVariante() {
        super("Niederer Guerai aus Lania", "Niederer Guerai aus Lania");
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Ausweichen II"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Schwerter"));
                arrayList.add(N.floatsuper().\u00d200000("Fechtwaffen"));
                int[] nArray = new int[]{6, 4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bogen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Akrobatik"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tanzen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Ausweichen III"));
        arrayList.addAll(for.\u00d200000("Gezielter Stich"));
        arrayList.addAll(for.\u00d200000("Meisterparade"));
        arrayList.addAll(for.\u00d200000(while.\u00d5\u00f40000.toString()));
        return arrayList;
    }
}

