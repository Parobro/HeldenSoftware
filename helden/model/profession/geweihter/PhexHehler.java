/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Phex;
import java.util.ArrayList;

public class PhexHehler
extends Phex {
    public PhexHehler() {
        super("Phex, Hehler", 15);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Waren (70 Dukaten)");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Phex, Hehler";
        }
        return "Phex, Hehlerin";
    }

    @Override
    public ArrayList<P> getSegnungen() {
        return oooo_0.\u00d200000();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(K.o00000(voidsuper.\u00d30\u00d8000, "Feilschen"));
        arrayList.add(oooo_0.o00000(while.\u00d30\u00d2000, "Wahl"));
        arrayList.add(oooo_0.o00000(while.returnpublicString.toString()));
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.addAll(this.getSegnungen());
        arrayList.add(oooo_0.o00000(while.thisString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00f50000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2OO000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d4\u00f5000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.\u00d200000(E.\u00d5\u00d6\u00d8000, 2);
        k_02.\u00d200000(voidsuper.thisvoidObject, 1);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.forclassObject, 2);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 3);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.newclass));
        arrayList.add(new for(while.\u00d3\u00d8o000));
        arrayList.add(new for(while.oO\u00f4000));
        arrayList.add(new for(while.StringthisObject));
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

