/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.edelhandwerker;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.while;
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
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public abstract class Edelhandwerker
extends N {
    protected voidsuper \u00d4o\u00f5O00;
    protected voidsuper \u00d5o\u00f5O00;

    public Edelhandwerker(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Werkzeugkoffer mit Werkzeug");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Edelhandwerker";
        }
        return "Edelhandwerker";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.ifprivate);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.\u00d8\u00f60000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d6\u00d2000.toString()));
        return new objectsuper_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d5\u00d4\u00d8000);
                arrayList.add(E.\u00d5\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray, "Armbrust oder kulturtypische Wurfwaffe");
            }
            case 1: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000));
                arrayList.remove(E.O\u00d6\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.\u00d8\u00d5\u00d8000, 1);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.o00000(E.newnewString, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.O0\u00d6000, 1);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 2);
        k_02.o00000(voidsuper.StringclassObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.o00000(voidsuper.oo\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 1);
        k_02.o00000(voidsuper3, 4);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    public void setTalentauswahl(voidsuper voidsuper2, int n) {
        super.setTalentauswahl(voidsuper2, n);
        if (voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000)) {
            this.\u00d4o\u00f5O00 = voidsuper2;
        }
        if (voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000)) {
            this.\u00d5o\u00f5O00 = voidsuper2;
        }
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

