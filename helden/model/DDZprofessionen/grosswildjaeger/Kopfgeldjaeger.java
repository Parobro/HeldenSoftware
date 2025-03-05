/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.grosswildjaeger;

import helden.framework.C.I;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class Kopfgeldjaeger
extends N {
    public Kopfgeldjaeger() {
        super("Kopfgeldj\u00e4ger", 13);
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
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Pack-Maultier");
        arrayList.add("Ausgebildeter Jagdhund");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Kopfgeldj\u00e4ger";
        }
        return "Kopfgeldj\u00e4gerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.ifreturn);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(K.o00000(E.\u00f5\u00d5\u00d8000, "Wurfnetz"));
                arrayList.add(K.o00000(E.\u00f5\u00d5\u00d8000, "Lasso"));
                arrayList.add(K.o00000(E.\u00f5\u00d5\u00d8000, "Fledermaus"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d4000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                int[] nArray = null;
                nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = null;
                nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00d5o\u00d8000);
                int[] nArray = null;
                nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 3);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.o00000(E.newnewString, 4);
        k_02.o00000(E.o\u00d6\u00d8000, 2);
        k_02.o00000(E.\u00f5\u00d5\u00d8000, 5);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.o00000(voidsuper.\u00d5O\u00d6000, 3);
        k_02.o00000(voidsuper.returnforObject, 3);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.thisvoidObject, 4);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 3);
        k_02.o00000(voidsuper.thisinterfaceObject, 3);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 2);
        k_02.o00000(voidsuper.StringclassObject, 1);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 5);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 4);
        k_02.o00000(voidsuper.StringvoidObject, 3);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.o00000(voidsuper.nullObjectObject, 1);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.o00000(voidsuper.returnifObject, 1);
        k_02.o00000(this.getProfession().getMuttersprachenSchrift(), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.newfor);
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                ArrayList<P> arrayList2 = this.getProfession().getSetting().getGelaendekunden();
                for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
                    arrayList.add(new for(P.new(arrayList2.get(i2).toString())));
                }
                return new void(this.getProfession(), arrayList, 1);
            }
            case 1: {
                return new void(this.getProfession(), this.getSetting().getvSF(while.\u00f6\u00d5\u00d2000.toString()), 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00f80o000));
        return arrayList;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

