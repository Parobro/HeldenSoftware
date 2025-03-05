/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.falschgesicht;

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
import helden.model.myranor.rasse.Wolfalben;
import java.util.ArrayList;

public class FalschgesichtVariante
extends N {
    public FalschgesichtVariante() {
        super("Falschgesicht", "Falschgesicht", 14, false);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Feste Matrix"));
        arrayList.add(K.o00000("Zauberhaar"));
        arrayList.add(K.o00000("Festgef\u00fcgtes Denken"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 14;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("Aup"), 2);
        return k_02;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatSfAuswahl(while.\u00d2o\u00f5000, "Wolfalben"), Bedingung.hatRassenID(new Wolfalben().getID()));
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000));
        arrayList.add(oooo_0.o00000(while.returnintclass));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d2\u00d6000));
        A a2 = (A)oooo_0.o00000(while.\u00d2o\u00d2000);
        a2.new(new R("Aldangara"));
        arrayList.add(a2);
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Hiebwaffen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Athletik"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Wildnisleben"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sternkunde"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(G.\u00d4\u00d6\u00f5000, 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Holzbearbeitung"), 1);
        return k_02;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

