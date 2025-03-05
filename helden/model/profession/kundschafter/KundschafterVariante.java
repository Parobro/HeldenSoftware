/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.kundschafter;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class KundschafterVariante
extends N {
    private P \u00d5O\u00f5O00;

    public KundschafterVariante() {
        super("Kundschafter", 7);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 7;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Erfahrenes Pferd");
        arrayList.add("Ausgebildeter Sp\u00fcrhund");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f50O000);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(K.o00000(I.ifif, "Sicht", "Geh\u00f6r"));
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.ooO000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = new k_0<b_0>();
        k_02.\u00d200000(b_0.thispublicsuper, 2);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                return new objectsuper_0(this.getProfession(), this.getProfession().getSetting().getGelaendekunden(), 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        if (this.\u00d5O\u00f5O00 != null) {
            arrayList.add(this.\u00d5O\u00f5O00);
        }
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d4\u00d4\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.ifforObject);
                arrayList.add(voidsuper.\u00d5O\u00d6000);
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00d8\u00d3\u00d8000);
                int[] nArray = new int[]{4, 3, 2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.o\u00f4\u00d6000);
                arrayList.add(voidsuper.o\u00d5\u00d6000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(voidsuper.nullvoidObject);
                arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 2);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.returnforObject, 4);
        k_02.\u00d200000(voidsuper.returnprivateObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.thisvoidObject, 4);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 6);
        k_02.\u00d200000(voidsuper.\u00f8\u00d8\u00d5000, 5);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f80\u00d6000, 2);
        k_02.\u00d200000(voidsuper.StringvoidObject, 5);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 4);
        k_02.\u00d200000(voidsuper.nullObjectObject, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.returnifObject, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.nullclass);
        arrayList.add(I.O\u00d40000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.newfor);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00d3Oo000);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for<String>("Wahl", while.\u00d30\u00d2000, false));
        return arrayList;
    }
}

