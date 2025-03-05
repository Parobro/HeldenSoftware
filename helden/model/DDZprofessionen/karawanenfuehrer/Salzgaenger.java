/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.karawanenfuehrer;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.karawanenfuehrer.VarianteKarawanenfuehrer;
import java.util.ArrayList;

public class Salzgaenger
extends VarianteKarawanenfuehrer {
    public Salzgaenger() {
        super("Salzg\u00e4nger", 0);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Salzg\u00e4nger";
        }
        return "Salzg\u00e4ngerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.newStringsuper);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(0);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.ifforObject, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, -2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, -3);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 3);
        k_02.o00000(voidsuper.nullObjectObject);
        k_02.o00000(voidsuper.\u00d5o\u00d8000);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        M m = (M)K.o00000(I.ifif, "Festigkeit des Untergrundes; Vibrationen");
        m.\u00d2o0000();
        m.o00000("Tastsinn");
        oo0O.\u00d300000(m);
        return oo0O;
    }
}

