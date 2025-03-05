/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schriftsteller;

import helden.framework.C.I;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.super;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_6;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.schriftsteller.VarianteSchriftsteller;
import java.util.ArrayList;

public class Pamphletist
extends VarianteSchriftsteller {
    private boolean returnnewfloat = true;

    public Pamphletist() {
        super("Pamphletist", 0);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 6;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Druckerpresse inkl. Material");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Pamphletist";
        }
        return "Pamphletistin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.O\u00f60000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d3\u00d4O000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d200000;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public oooo_6 getNextTalentTyp2Auswahl() {
        this.returnnewfloat = false;
        ArrayList<interface> arrayList = new ArrayList<interface>();
        arrayList.add(new interface(voidsuper.\u00d5O\u00d6000, 1));
        arrayList.add(new interface(voidsuper.\u00d5o\u00d8000, 3));
        return new oooo_6(this.getProfession(), arrayList, 1);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.OO\u00d6000);
                arrayList.add(voidsuper.returnwhileObject);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                return super.getTalentAuswahl(n);
            }
            case 3: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                return super.getTalentAuswahl(5);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d4\u00d6\u00d8000, 2);
        k_02.\u00d200000(voidsuper.returnforObject, -1);
        k_02.\u00d200000(voidsuper.thisvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, -2);
        k_02.o00000(voidsuper.\u00d5O\u00d6000);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d5000);
        k_02.\u00d200000(voidsuper.forpublicObject, -2);
        k_02.\u00d200000(voidsuper.forclassObject, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 1);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.nullObjectObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, -1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, -1);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, -3);
        k_02.o00000(voidsuper.\u00d5\u00f5\u00d5000);
        k_02.\u00d200000(voidsuper.\u00d4\u00d3\u00d6000, 5);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                arrayList.add(new for(while.\u00f8\u00f6\u00d5000));
                arrayList.add(new for(while.\u00d2\u00d6\u00d2000));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.\u00f8\u00f6\u00d5000));
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentTyp2Auswahl() {
        return this.returnnewfloat;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

