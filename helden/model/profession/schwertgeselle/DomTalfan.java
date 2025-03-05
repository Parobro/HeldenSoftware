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
import helden.model.profession.schwertgeselle.Schwertgeselle;
import java.util.ArrayList;

public class DomTalfan
extends Schwertgeselle {
    public DomTalfan() {
        super("DomTalfan", 19);
    }

    @Override
    public boolean adeligVoraussetzung() {
        return true;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Almadanischer Caballero aus Dom Talfans Schule";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 9;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.thispublicsuper, 1);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d3\u00f6000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f50o000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.returninterfaceString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00f4\u00d5000.toString()));
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
                arrayList.add(voidsuper.o\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d6\u00d6000);
                arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.nullsuperString, 3);
        k_02.\u00d200000(E.\u00d4\u00d5\u00d8000, 2);
        k_02.\u00d200000(E.thissuperString, 7);
        k_02.\u00d200000(voidsuper.ifforObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 1);
        return k_02;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Rapier");
        arrayList.add(for.o00000(E.thissuperString, arrayList2, 1));
        arrayList2 = new ArrayList();
        arrayList2.add("Amazonens\u00e4bel");
        arrayList.add(for.o00000(E.thissuperString, arrayList2, 1));
        return new void(this.getProfession(), arrayList, 1);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.\u00d8\u00f5\u00d6000));
        arrayList.add(new for(while.iffloatObject));
        arrayList.add(new for(while.\u00d2\u00d6\u00d6000));
        arrayList.add(new for(while.\u00d8O\u00f5000));
        arrayList.add(new for(while.\u00f8o\u00f6000));
        arrayList.add(new for(while.o0\u00d3000));
        arrayList.add(new for(while.nullifString));
        arrayList.add(new for(while.\u00d8\u00f4\u00d5000));
        arrayList.add(new for(while.\u00d6\u00f6\u00f5000));
        arrayList.add(new for(while.\u00d20o000));
        return arrayList;
    }
}

