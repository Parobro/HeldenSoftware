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
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.schwertgeselle.Schwertgeselle;
import java.util.ArrayList;

public class Ishannah
extends Schwertgeselle {
    public Ishannah() {
        super("Ishannah", 22);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Balayan nach Ishannah al\u00b4Kira";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
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
        arrayList.add(oooo_0.o00000(while.\u00d8\u00f5\u00d6000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d3\u00f6000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f50o000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.returninterfaceString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00d3\u00d8000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.\u00d200000(E.\u00f4\u00d4\u00d8000, 7);
        k_02.\u00d200000(E.\u00d5\u00d6\u00d8000, 3);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.\u00d200000(voidsuper.newnewObject, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.privateObjectObject, 4);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.iffloatObject));
        arrayList.add(new for(while.\u00d2\u00d6\u00d6000));
        arrayList.add(new for(while.\u00d8O\u00f5000));
        arrayList.add(new for(while.\u00d2\u00d8\u00f6000));
        arrayList.add(new for(while.\u00f6\u00d3\u00d8000));
        arrayList.add(new for(while.\u00d8\u00d8\u00d8000));
        arrayList.add(new for(while.newint));
        arrayList.add(new for(while.\u00f6\u00d20000));
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Reiters\u00e4bel");
        arrayList.add(for.o00000(E.\u00f4\u00d4\u00d8000, arrayList2, 1));
        return arrayList;
    }
}

