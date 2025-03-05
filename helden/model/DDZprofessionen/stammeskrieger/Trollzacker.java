/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.stammeskrieger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class Trollzacker
extends N {
    public Trollzacker() {
        super("Trollzacker", 1);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Trollzacker";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.thisdo);
        arrayList.add(I.newif);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 14;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.ifdoString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d20000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d6O000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 4);
        k_02.o00000(E.o\u00d6\u00d8000, 3);
        k_02.o00000(E.\u00d5\u00d4\u00d8000, 4);
        k_02.o00000(E.\u00f8\u00d5\u00d8000, 2);
        k_02.o00000(voidsuper.ifforObject, 3);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 3);
        k_02.o00000(voidsuper.returnprivateObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 3);
        k_02.o00000(voidsuper.StringvoidObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f8O000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.newfor);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00d4\u00f5o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00f5\u00d3\u00d2000));
        arrayList.add(new for(while.o\u00f4\u00d6000));
        arrayList.add(new for(while.\u00f8\u00d3\u00d2000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00d8O000));
        oo0O.\u00d300000(K.o00000(I.ifreturn));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

