/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.monddeuter;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.myranor.rasse.Baramune;
import java.util.ArrayList;

public class MonddeuterVariante
extends N {
    public MonddeuterVariante() {
        super("Monddeuter", "Monddeuterin", 13, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000(I.\u00f80O000));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatSfAuswahl(while.\u00d2o\u00f5000, "Baramunen"), Bedingung.hatRassenID(new Baramune().getID()));
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d3000));
        arrayList.add(oooo_0.o00000(while.newpublicObject));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                int[] nArray = new int[]{2, 2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Lehren"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), 4);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechnen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sternkunde"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Tierkunde"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Prophezeien"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

