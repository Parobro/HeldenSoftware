/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.varianten;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class ViertelRunenzauberer
extends N {
    public ViertelRunenzauberer() {
        super("Runenzauberer", 4, true);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00d6\u00d3\u00d5000));
                arrayList.add(oooo_0.o00000(while.\u00d2\u00f4\u00d8000));
                arrayList.add(oooo_0.o00000(while.forfor));
                return new objectsuper_0(this.getProfession(), arrayList, 2);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d60O000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(G.o\u00f4\u00f5000, 7);
        k_02.o00000(G.\u00f8\u00f8\u00f5000, 7);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f6\u00d6000, 0);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d5\u00d3O000));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "Runajasko"));
        return oo0O;
    }

    @Override
    public String toString() {
        return "Runenzauberer (UdW)";
    }
}

