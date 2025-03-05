/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.haendler;

import helden.framework.D.OoOO.U;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.haendler.Haendler;
import java.util.ArrayList;

public class Tauschhaendler
extends Haendler {
    public Tauschhaendler() {
        super("Tauschh\u00e4ndler", 0);
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
        if (geschlecht.istMaennlich()) {
            return "Tauschh\u00e4ndler";
        }
        return "Tauschh\u00e4ndlerin";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.addAll(u2.StringObject());
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
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
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.forObjectObject);
                arrayList.add(voidsuper.\u00d8O\u00d8000);
                arrayList.add(voidsuper.\u00f4o\u00d6000);
                arrayList.add(voidsuper.o\u00f6\u00d5000);
                arrayList.add(voidsuper.\u00f80\u00d6000);
                arrayList.add(voidsuper.oO\u00d6000);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.\u00d50\u00d8000);
                arrayList.add(voidsuper.O\u00f5\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00f40\u00d8000);
                arrayList.add(voidsuper.o\u00f6\u00d6000);
                arrayList.add(voidsuper.\u00f4\u00f6\u00d5000);
                arrayList.add(voidsuper.o\u00d5\u00d6000);
                arrayList.add(voidsuper.ififObject);
                arrayList.add(voidsuper.\u00d8\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00d4O\u00d6000);
                arrayList.add(voidsuper.StringfloatObject);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                arrayList.add(voidsuper.newreturnObject);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                int[] nArray = new int[]{3, 1, 1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 1);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.o00000(voidsuper.O0\u00d6000);
        k_02.o00000(voidsuper.O\u00f6\u00d5000);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5o\u00d8000);
        k_02.\u00d200000(voidsuper.thisclassObject, 1);
        k_02.\u00d200000(voidsuper.returnifObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.o00000(voidsuper.privatedoObject);
        return k_02;
    }
}

