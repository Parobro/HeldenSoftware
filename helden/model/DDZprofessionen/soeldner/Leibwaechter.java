/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.soeldner;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_6;
import helden.model.DDZprofessionen.soeldner.Soeldner;
import java.util.ArrayList;

public class Leibwaechter
extends Soeldner {
    private boolean O\u00d3\u00f5O00 = true;

    public Leibwaechter() {
        super("Leibw\u00e4chter", 17);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Leibw\u00e4chter";
        }
        return "Leibw\u00e4chterin";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public oooo_6 getNextTalentTyp2Auswahl() {
        this.O\u00d3\u00f5O00 = false;
        ArrayList<interface> arrayList = new ArrayList<interface>();
        arrayList.add(new interface(voidsuper.\u00d5O\u00d6000, 1));
        arrayList.add(new interface(voidsuper.\u00d5o\u00d8000, 3));
        return new oooo_6(this.getProfession(), arrayList, 1);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                return super.getSonderfertigkeitAuswahl(0);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00d20o000.toString()));
                arrayList.add(oooo_0.o00000(while.newint.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d80000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.Stringforsuper.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f50o000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6\u00f5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d8\u00d6\u00d8000);
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.o\u00d5\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                arrayList.add(E.ifthisString);
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 3);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, -2);
        k_02.o00000(voidsuper.\u00d5\u00d6\u00d5000);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
        k_02.o00000(voidsuper.\u00f80\u00d6000);
        k_02.o00000(voidsuper.\u00d40\u00d8000);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, -1);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, -2);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, -1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.o\u00d6\u00d4000));
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentTyp2Auswahl() {
        return this.O\u00d3\u00f5O00;
    }
}

