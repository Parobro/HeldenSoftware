/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.leoniranimist;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.model.myranor.profession.leoniranimist.LeonirAnimistVariante;

public class Xarchash
extends LeonirAnimistVariante {
    public Xarchash() {
        super("Xarchash", "Xarchash", 10, false);
    }

    @Override
    public int getMaximalSozialstatus() {
        return super.getMaximalSozialstatus() + 4;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return super.getMinimalEigenschaftswert(b_02) + 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hat(Geschlecht.\u00d300000));
        return bedingungsVerknuepfung;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(G.O\u00f4\u00f5000, 5);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        return k_02;
    }
}

