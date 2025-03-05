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

public class MemonhabVariante
extends NiedererGueraiVariante {
    public MemonhabVariante() {
        super("Niederer Guerai aus Memonhab", "Niederer Guerai aus Memonhab");
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Linkhand"));
        arrayList.add(oooo_0.o00000("Parierwaffen I"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Bogen"));
                arrayList.add(N.floatsuper().\u00d200000("Wurfbeile"));
                arrayList.add(N.floatsuper().\u00d200000("Diskus"));
                int[] nArray = new int[]{4, 2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("S\u00e4bel"), 7);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Binden"));
        arrayList.addAll(for.\u00d200000("Entwaffnen"));
        arrayList.addAll(for.\u00d200000("Meisterparade"));
        arrayList.addAll(for.\u00d200000("Umrei\u00dfen"));
        arrayList.addAll(for.\u00d200000(while.\u00d6\u00f4\u00d6000.toString()));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

