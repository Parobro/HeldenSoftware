/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.edelhandwerker;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.edelhandwerker.Edelhandwerker;
import java.util.ArrayList;

public class Apothekarius
extends Edelhandwerker {
    public Apothekarius() {
        super("Apothekarius", 5);
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Apothekarius";
        }
        return "Apothekaria";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
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
                int n2 = 0;
                arrayList.add(voidsuper.\u00d8O\u00d8000);
                arrayList.add(voidsuper.ififObject);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                for (voidsuper voidsuper2 : N.floatsuper().\u00d600000()) {
                    if (arrayList.contains(voidsuper2)) continue;
                    arrayList.add(voidsuper2);
                }
                n2 = 7;
                return new returnsuper(this.getProfession(), arrayList, n2, 2);
            }
        }
        return super.getNextTaPVerteilAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.o\u00f6\u00d6000, "Tr\u00e4nke brauen"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 5);
        return k_02;
    }
}

