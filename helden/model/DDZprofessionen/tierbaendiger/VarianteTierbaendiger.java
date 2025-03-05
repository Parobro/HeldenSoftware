/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.tierbaendiger;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class VarianteTierbaendiger
extends N {
    public VarianteTierbaendiger() {
        super("Tierb\u00e4ndiger", 1);
    }

    public VarianteTierbaendiger(String string, int n) {
        super(string, 1 + n, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("ausgebildetes Tier");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Tierb\u00e4ndiger";
        }
        return "Tierb\u00e4ndigerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.privatesuper);
        arrayList.add(I.ooO000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = new k_0<b_0>();
        k_02.o00000(b_0.thispublicsuper, 1);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        if (n == 0) {
            return new objectsuper_0(this.getProfession(), oooo_0.o00000(voidsuper.\u00d8\u00d5\u00d5000), 1);
        }
        return null;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00f8\u00f4\u00d6000);
                arrayList.add(voidsuper.returnprivateObject);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 1);
        k_02.o00000(E.whilethisString, 2);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.o00000(E.newnewString, 3);
        k_02.o00000(E.\u00f5\u00d5\u00d8000, 3);
        k_02.o00000(E.o\u00d6\u00d8000, 1);
        k_02.o00000(voidsuper.ifforObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.o00000(voidsuper.thisvoidObject, 1);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.o00000(voidsuper.returnwhileObject, 2);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d5\u00d6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f80\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d5000, 7);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f5\u00d5\u00d6000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.o\u00f5O000);
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

