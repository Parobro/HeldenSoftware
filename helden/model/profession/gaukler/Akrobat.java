/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.gaukler;

import helden.framework.C.I;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.gaukler.VarianteGaukler;
import java.util.ArrayList;

public class Akrobat
extends VarianteGaukler {
    public Akrobat() {
        super("Akrobat/T\u00e4nzer", 4);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Akrobat/T\u00e4nzer";
        }
        return "Akrobatin/T\u00e4nzerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 14;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.ifStringsuper);
        arrayList.add(I.Ooo000);
        arrayList.add(I.\u00d8\u00d6O000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.\u00d3Oo000);
        arrayList.add(I.Stringintsuper);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d2\u00d6\u00d6000));
        arrayList.add(new for(while.o\u00d6\u00d4000));
        return arrayList;
    }
}

