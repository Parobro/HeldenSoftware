/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.ritter;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.ritter.KnappeTraditionellenRitters;
import java.util.ArrayList;

public class KnappeNostergast
extends KnappeTraditionellenRitters {
    public KnappeNostergast() {
        super("Knappe aus Andergast/Nostria", -6);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Knappe aus Andergast/Nostria (UdW)";
        }
        return "Knappin aus Andergast/Nostria (UdW)";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.remove(oooo_0.o00000(while.\u00f5\u00f4\u00d5000.toString()));
        arrayList.remove(oooo_0.o00000(while.Stringif.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.thissuperString);
                arrayList.add(E.ifthisString);
                int[] nArray = new int[]{6, 3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.\u00d4\u00d8\u00d6000);
                arrayList.add(voidsuper.\u00d40\u00d6000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.o\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
                arrayList.add(voidsuper.privateObjectObject);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.O\u00d6\u00d8000, -2);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, -2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, -2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, -2);
        k_02.\u00d200000(voidsuper.nullvoidObject, -2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00f5\u00f4\u00d5000));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

