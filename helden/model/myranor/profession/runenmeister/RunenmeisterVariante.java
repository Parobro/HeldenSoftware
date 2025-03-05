/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.runenmeister;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.OoOO.A;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class RunenmeisterVariante
extends N {
    public RunenmeisterVariante() {
        super("Runenmeister", "Runenmeisterin", 14, false);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Eisenaffine Aura"));
        arrayList.add(K.o00000("Meisterhandwerk"));
        arrayList.add(K.o00000("Arroganz"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 8;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatSfAuswahl(while.\u00d2o\u00f5000, "Hjaldinger (Myranor)"));
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d2\u00d6000));
        arrayList.add(oooo_0.o00000(while.returnintclass));
        A a2 = (A)oooo_0.o00000(while.\u00d2o\u00d2000);
        a2.new(new R("Runenmeister"));
        arrayList.add(a2);
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("St\u00e4be"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"), 4);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechnen"), 2);
        k_02.\u00d200000(G.\u00d40\u00f6000, 7);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

