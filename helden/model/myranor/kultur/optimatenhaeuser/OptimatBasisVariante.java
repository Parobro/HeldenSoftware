/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.kultur.optimatenhaeuser;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oOoO.floatsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;
import java.util.List;

public class OptimatBasisVariante
extends N {
    public OptimatBasisVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Magiekunde"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechnen"), 2);
        k_02.\u00d200000(G.\u00f4\u00d3\u00f5000, 5);
        k_02.\u00d200000(G.\u00d8O\u00f5000, 5);
        k_02.\u00d200000(G.\u00d40\u00f6000, 5);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Optimat"));
        oo0O.\u00d300000(K.o00000("Verpflichtungen", "Mentor, Cammer"));
        oo0O.\u00d300000(K.o00000(I.\u00d5\u00d3O000));
        return oo0O;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Arroganz"));
        arrayList.add(K.o00000("Verbindungen"));
        return arrayList;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(P.returnintclass));
        arrayList.add(oooo_0.o00000(P.\u00d5\u00d2\u00d6000));
        return arrayList;
    }

    public G getMuttersprache() {
        return null;
    }

    public boolean wirdMutterspracheZurZeitsprache() {
        return false;
    }

    public List<o0oo_2> getAuswahlen(floatsuper floatsuper2) {
        return new ArrayList<o0oo_2>();
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession() == null ? Geschlecht.\u00d400000 : this.getProfession().getGeschlecht());
    }
}

