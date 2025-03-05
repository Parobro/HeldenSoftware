/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.geweihter.Ingerimm;
import java.util.ArrayList;

public class IngerimmTraditionell
extends Ingerimm {
    public IngerimmTraditionell() {
        super("Ingerimm, Traditioneller Kult", 11);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.whilenewsuper);
        return arrayList;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                ArrayList<voidsuper> arrayList2 = N.floatsuper().\u00d600000();
                for (voidsuper voidsuper2 : arrayList2) {
                    arrayList.addAll(oooo_0.o00000(voidsuper2));
                }
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d6\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f80\u00d6000.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00d3\u00d6000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d2\u00d4000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: 
            case 1: {
                return super.getTalentAuswahl(n);
            }
            case 2: {
                arrayList.add(voidsuper.whileStringObject);
                arrayList.add(voidsuper.\u00d50\u00d8000);
                arrayList.add(voidsuper.\u00f40\u00d8000);
                arrayList.add(voidsuper.\u00f4\u00f6\u00d5000);
                int[] nArray = new int[]{6, 4, 2, 2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.\u00f5o\u00d6000);
                arrayList.add(voidsuper.forObjectObject);
                arrayList.add(voidsuper.forvoidObject);
                arrayList.add(voidsuper.o\u00f6\u00d5000);
                arrayList.add(voidsuper.O\u00f5\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.privateclassObject);
                arrayList.add(voidsuper.\u00f4\u00f6\u00d6000);
                arrayList.add(voidsuper.\u00d8\u00d8\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
                arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                arrayList.add(voidsuper.StringfloatObject);
                arrayList.add(voidsuper.whilewhileObject);
                arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
                arrayList.add(voidsuper.oo\u00d8000);
                int[] nArray = new int[]{7, 4, 2, 2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00d3O0000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d80\u00d2000));
        arrayList.add(new for(while.\u00d8\u00d3o000));
        return arrayList;
    }

    @Override
    public String toString() {
        return "Ingerimm, Traditioneller Kult";
    }
}

