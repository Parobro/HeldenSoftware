/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.soeldner;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.soeldner.Soeldner;
import java.util.ArrayList;

public class BerittenerSchuetze
extends Soeldner {
    public BerittenerSchuetze() {
        super("Berittener Sch\u00fctze", 13);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Berittener Sch\u00fctze";
        }
        return "Berittene Sch\u00fctzin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.nullifString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f4\u00f4000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                arrayList.add(new for<String>(E.\u00d3\u00d6\u00d8000.toString(), while.\u00f6O\u00f5000, false));
                arrayList.add(new for<String>(E.\u00d4\u00d6\u00d8000.toString(), while.\u00f6O\u00f5000, false));
                return new void(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<for> arrayList = new ArrayList<for>();
                arrayList.add(new for<String>(E.\u00d3\u00d6\u00d8000.toString(), while.\u00f6\u00d5\u00d2000, false));
                arrayList.add(new for<String>(E.\u00d4\u00d6\u00d8000.toString(), while.\u00f6\u00d5\u00d2000, false));
                return new void(this.getProfession(), arrayList, 1);
            }
            case 2: {
                ArrayList<for> arrayList = new ArrayList<for>();
                arrayList.add(new for<String>(E.\u00d3\u00d6\u00d8000.toString(), while.newpublicnew, false));
                arrayList.add(new for<String>(E.\u00d4\u00d6\u00d8000.toString(), while.newpublicnew, false));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        return arrayList;
    }
}

