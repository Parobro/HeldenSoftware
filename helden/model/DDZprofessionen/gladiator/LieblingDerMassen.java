/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.gladiator;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.DDZprofessionen.gladiator.BasisGladiator;
import java.util.ArrayList;

public class LieblingDerMassen
extends BasisGladiator {
    public LieblingDerMassen() {
        super("Liebling der Massen", 14);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.remove(I.newif);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
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
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00f6\u00f5o000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d2o\u00d8000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f5\u00d6O000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d80000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d20o000.toString()));
                arrayList.add(oooo_0.o00000(while.newint.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                return new objectsuper_0(this.getProfession(), this.getSetting().getSF(while.\u00d8\u00d3\u00d2000.toString()), 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.nullsuperString);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.o\u00d5\u00d8000);
                arrayList.add(E.\u00f4\u00d5\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00d5\u00d5\u00d8000);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                arrayList.add(E.ifthisString);
                int[] nArray = new int[]{5, 5};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                arrayList.add(E.\u00d5\u00d4\u00d8000);
                arrayList.add(E.\u00d5\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.o\u00d2\u00d8000);
                arrayList.add(voidsuper.\u00d5O\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.newnewString, 1);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.nullvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.iffloatObject));
        arrayList.add(new for(while.\u00d2\u00d3\u00f6000));
        arrayList.add(new for(while.\u00f50o000));
        arrayList.add(new for(while.\u00f5\u00f4\u00d5000));
        arrayList.add(new for(while.\u00f6\u00d20000));
        return arrayList;
    }
}

