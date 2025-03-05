/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schwertgeselle;

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
import helden.model.profession.schwertgeselle.Khunchomer;
import java.util.ArrayList;

public class Rashdul
extends Khunchomer {
    public Rashdul() {
        super("Rasdul", 7);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Pers\u00f6nliche Waffe");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Rashduler S\u00e4belfechter";
    }

    @Override
    public int getMaximalSozialstatus() {
        return super.getMaximalSozialstatus() + 1;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return super.getMinimalEigenschaftswert(b_02) + 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.Stringfor.toString()));
        arrayList.remove(oooo_0.o00000(while.\u00f5\u00f4\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(n);
            }
            case 1: {
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{4, 2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.thisintObject);
                arrayList.add(voidsuper.\u00f4o\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.O\u00d6\u00d8000, 5);
        k_02.\u00d200000(E.\u00f4\u00d4\u00d8000, -2);
        k_02.\u00d200000(E.newnewString, 1);
        k_02.o00000(E.\u00d3\u00d5\u00d8000);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.returnforObject, 2);
        k_02.\u00d200000(voidsuper.thisvoidObject, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.o00000(voidsuper.\u00f4o\u00d6000);
        k_02.\u00d200000(voidsuper.returnifObject, 1);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        for (String string : E.nullsuperString.getSpezialisierungen()) {
            ArrayList<String> arrayList2 = new ArrayList<String>();
            arrayList2.add(string);
            for<String> for_ = for.o00000(E.nullsuperString, arrayList2, 1);
            arrayList.add(for_);
        }
        return new void(this.getProfession(), arrayList, 1);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f50o000));
        arrayList.remove(new for(while.\u00d6\u00d3\u00d2000));
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Khunchomer");
        arrayList.remove(for.o00000(E.\u00f4\u00d4\u00d8000, arrayList2, 1));
        arrayList.remove(new for(while.\u00d8\u00f4\u00d5000));
        return arrayList;
    }
}

