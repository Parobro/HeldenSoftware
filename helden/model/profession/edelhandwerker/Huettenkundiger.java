/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.edelhandwerker;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.edelhandwerker.Edelhandwerker;
import java.util.ArrayList;

public class Huettenkundiger
extends Edelhandwerker {
    public Huettenkundiger() {
        super("H\u00fcttenkundiger/Bronzegie\u00dfer/Eisengie\u00dfer", 5);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        int n = 5;
        return n;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "H\u00fcttenkundiger/Bronzegie\u00dfer/Eisengie\u00dfer";
        }
        return "H\u00fcttenkundige/Bronzegie\u00dferin/Eisengie\u00dferin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.add(voidsuper.O\u00f5\u00d6000);
                arrayList.add(voidsuper.\u00f4\u00f6\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                arrayList.add(voidsuper.oo\u00d8000);
                arrayList.add(voidsuper.\u00f80\u00d8000);
                arrayList.add(voidsuper.\u00d8\u00f5\u00d6000);
                arrayList.add(voidsuper.StringfloatObject);
                arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                return new returnsuper(this.getProfession(), arrayList, 7, 2);
            }
        }
        return super.getNextTaPVerteilAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d6o000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 3: {
                arrayList.add(voidsuper.\u00d50\u00d8000);
                arrayList.add(voidsuper.\u00f5o\u00d6000);
                int[] nArray = new int[]{3, 2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.\u00f40\u00d8000);
                arrayList.add(voidsuper.\u00d8\u00d8\u00d6000);
                int[] nArray = new int[]{7, 5};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.forObjectObject, 1);
        k_02.\u00d200000(voidsuper.\u00f5\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        return k_02;
    }
}

