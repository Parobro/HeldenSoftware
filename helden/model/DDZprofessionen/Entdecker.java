/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;
import java.util.List;

public class Entdecker
extends super {
    private int o\u00f6\u00f4O00 = 0;

    public Entdecker() {
    }

    public Entdecker(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00d4\u00d6\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d5O\u00d6000, 3);
        this.setTalentwert(voidsuper.returnprivateObject, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 4);
        this.setTalentwert(voidsuper.O0\u00d6000, 3);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.StringvoidObject, 3);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.thisclassObject, 1);
        this.setTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d5000, 4);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 5);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.returnifObject, 1);
        this.setTalentwert(this.getMuttersprachenSchrift(), 3);
        this.addVerteilTalent(voidsuper.\u00d5\u00d3\u00d8000, 0);
        this.addVerteilTalent(voidsuper.\u00f5o\u00d6000, 0);
        this.addVerteilTalent(voidsuper.forObjectObject, 0);
        this.addVerteilTalent(voidsuper.o\u00f6\u00d5000, 0);
        this.addVerteilTalent(voidsuper.nullObjectObject, 2);
        this.addVerteilTalent(voidsuper.\u00d5\u00d4\u00d6000, 4);
        this.addVerteilTalent(voidsuper.\u00d50\u00d8000, 0);
        this.addVerteilTalent(voidsuper.oo\u00d6000, 3);
        this.addVerteilTalent(voidsuper.o\u00f4\u00d6000, 1);
        this.addVerteilTalent(voidsuper.ifnullObject, 5);
        this.addVerteilTalent(voidsuper.\u00f5\u00f5\u00d5000, 3);
        this.addVerteilTalent(voidsuper.\u00f4\u00f6\u00d5000, 1);
        this.addVerteilTalent(voidsuper.o\u00d5\u00d6000, 0);
        this.addVerteilTalent(voidsuper.\u00f4\u00d2\u00d6000, 1);
        this.addVerteilTalent(voidsuper.\u00d5\u00f5\u00d5000, 3);
        this.addVerteilTalent(voidsuper.\u00d3\u00d6\u00d5000, 2);
        this.addVerteilTalent(voidsuper.\u00d4\u00f6\u00d6000, 0);
    }

    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Maultier");
        arrayList.add("Kleines Boot");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.o00000);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "P97";
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00d800000;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.o\u00f6\u00f4O00) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{4};
                ++this.o\u00f6\u00f4O00;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                this.addVerteilTalente(arrayList);
                int[] nArray = new int[]{5, 4, 2};
                ++this.o\u00f6\u00f4O00;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                int[] nArray = this.getUmverteilen();
                ++this.o\u00f6\u00f4O00;
                if (nArray.length > 0) {
                    arrayList = this.getUmverteilenTalente();
                    return new o0oo_2(this, arrayList, nArray);
                }
            }
            case 3: {
                arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getMuttersprache());
                ++this.o\u00f6\u00f4O00;
                int[] nArray = new int[]{4};
                return new o0oo_2(this, arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.o\u00f6\u00d5000);
                arrayList.add(voidsuper.O\u00d8\u00d5000);
                int[] nArray = new int[]{1};
                ++this.o\u00f6\u00f4O00;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.nullclass);
        arrayList.add(I.OOO000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        List<for> list = super.getVerbilligteSonderfertigkeiten();
        list.add(new for(while.\u00d2\u00d6\u00d2000));
        list.addAll(this.getGewaehlteVerbilligteSonderfertigkeiten());
        return (ArrayList)list;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d50o000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.o\u00f6\u00f4O00 < 5;
    }

    public boolean istZeitaufwendigeProfession() {
        return true;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Entdecker";
        }
        return "Entdeckerin";
    }

    @Override
    protected int getBasisGPKosten() {
        return 6;
    }
}

