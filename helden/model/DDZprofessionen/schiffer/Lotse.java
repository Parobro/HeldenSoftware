/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.schiffer;

import helden.framework.C.I;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.schiffer.Schiffer;
import java.util.ArrayList;

public class Lotse
extends Schiffer {
    public Lotse() {
        super("Lotse", 2);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Lotse";
        }
        return "Lotsin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d4\u00d5o000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.StringvoidObject, "Gew\u00e4sser"));
        arrayList.add(K.o00000(voidsuper.\u00d8\u00d8\u00d5000, "Steuermann"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 1);
        k_02.\u00d200000(voidsuper2, 4);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, -2);
        k_02.\u00d200000(voidsuper.ifnullObject, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 4);
        k_02.o00000(voidsuper.oo\u00d8000);
        return k_02;
    }
}

