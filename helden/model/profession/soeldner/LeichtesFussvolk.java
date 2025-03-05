/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.soeldner;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.d.oooo_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.soeldner.Soeldner;
import java.util.ArrayList;

public class LeichtesFussvolk
extends Soeldner {
    public LeichtesFussvolk() {
        super("Leichtes Fu\u00dfvolk", 11);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Leichtes Fu\u00dfvolk";
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f4\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d5\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(E.\u00d8\u00d6\u00d8000);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d5\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.removeAll(this.getProfession().getGewaehlteTalente());
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                arrayList.add(E.\u00d5\u00d4\u00d8000);
                arrayList.add(E.\u00d5\u00d6\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(E.\u00d8\u00d5\u00d8000);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d8\u00f4\u00d5000));
        return arrayList;
    }
}

