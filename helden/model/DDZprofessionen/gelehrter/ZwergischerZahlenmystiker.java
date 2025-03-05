/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.gelehrter;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.gelehrter.BasisGelehrter;

public class ZwergischerZahlenmystiker
extends BasisGelehrter {
    public ZwergischerZahlenmystiker() {
        super("Zwergischer Zahlenmystiker", "Zwergischer Zahlenmystiker", 4, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(N.floatsuper().\u00d200000("Tanzen"));
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kryptographie"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Mechanik"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), -2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Gutes Ged\u00e4chtnis"));
        oo0O.\u00d300000(K.o00000("Prophezeien"));
        oo0O.\u00d300000(K.o00000("Aberglaube", 5));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

