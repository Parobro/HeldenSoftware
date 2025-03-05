/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.BasisKrieger;
import java.util.ArrayList;

public class Neetha
extends BasisKrieger {
    public Neetha() {
        super("Neetha", 24);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 9;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.\u00d3\u00f4\u00d2000, 1);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Tuchr\u00fcstung"));
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Kettenweste)"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Reiterkampf"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("S\u00e4bel"));
                arrayList.add(N.floatsuper().\u00d200000("Hiebwaffen"));
                int[] nArray = new int[]{6, 3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Lanzenreiten"));
                arrayList.add(N.floatsuper().\u00d200000("Zweihandschwerter/-s\u00e4bel"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(N.floatsuper().\u00d200000("Sprachen kennen Mohisch"));
                arrayList.add(N.floatsuper().\u00d200000("Sprachen kennen Tulamidya"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Reiten"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schwimmen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), -1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tanzen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), -1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tierkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Abrichten"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), -1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        M m = (M)K.o00000(I.\u00f4O0000, new Object[]{"eigenes Pferd"});
        m.\u00d200000("eigenes Pferd", 7);
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public String toString() {
        return "Hohe Schule der Reiterei zu Neetha";
    }
}

