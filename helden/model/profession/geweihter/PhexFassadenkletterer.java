/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

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
import helden.model.profession.geweihter.Phex;
import java.util.ArrayList;

public class PhexFassadenkletterer
extends Phex {
    public PhexFassadenkletterer() {
        super("Phex, Fassadenkletterer", 18);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Dietriche");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Phex, Fassadenkletterer";
        }
        return "Phex, Fassadenkletterin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 14;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSegnungen() {
        return oooo_0.\u00d200000();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.returnpublicString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d30\u00d2000, "Wahl"));
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.addAll(this.getSegnungen());
        arrayList.add(oooo_0.o00000(while.\u00d5o\u00f5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f8\u00f6000.toString()));
        arrayList.add(oooo_0.o00000(while.newclass.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00d2\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d5\u00d6\u00d8000, 2);
        k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 4);
        k_02.\u00d200000(voidsuper.returnforObject, 2);
        k_02.\u00d200000(voidsuper.thisvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.O\u00d8\u00d5000, 4);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00f5\u00d6\u00d6000));
        arrayList.add(new for(while.whilevoidObject));
        arrayList.add(new for(while.thisthissuper));
        return arrayList;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

