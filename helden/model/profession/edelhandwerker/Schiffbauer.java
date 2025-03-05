/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.edelhandwerker;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.edelhandwerker.Edelhandwerker;
import java.util.ArrayList;

public class Schiffbauer
extends Edelhandwerker {
    public Schiffbauer() {
        super("Schiffbauer", 5);
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Schiffbauer";
        }
        return "Schiffbauerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 8;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
                arrayList.add(voidsuper.newreturnObject);
                arrayList.add(voidsuper.nullvoidObject);
                arrayList.add(voidsuper.\u00d3\u00d6\u00d5000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
                return new returnsuper(this.getProfession(), arrayList, 7, 2);
            }
        }
        return super.getNextTaPVerteilAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.oo\u00d8000, "Schiffbau"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.returnprivateObject, 1);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d8000, 7);
        return k_02;
    }
}

