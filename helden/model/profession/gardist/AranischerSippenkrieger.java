/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.gardist;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.gardist.Gardist;
import java.util.ArrayList;

public class AranischerSippenkrieger
extends Gardist {
    public AranischerSippenkrieger() {
        super("Aranischer Sippenkrieger", 8);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 8;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("erprobtes Reitpferd");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Aranischer Sippenkrieger";
        }
        return "Aranische Sippenkriegerin";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Gambeson"));
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Kettenhemd, Halbarm"));
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Kettenhemd, Lang"));
                arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Ringelpanzer"));
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
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.O\u00d6\u00d8000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                arrayList.add(E.ifthisString);
                int[] nArray = new int[]{4, 2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.newnewObject);
                arrayList.add(voidsuper.\u00d4\u00d8\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.\u00d5\u00d5\u00d5000);
                arrayList.add(voidsuper.O\u00f6\u00d5000);
                arrayList.add(voidsuper.\u00d8\u00d5\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.\u00f4o\u00d6000);
                arrayList.add(voidsuper.nullObjectObject);
                arrayList.add(voidsuper.\u00d5\u00d4\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(voidsuper.thisintObject);
                arrayList.add(voidsuper.\u00f4\u00d2\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d6\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
                arrayList.add(voidsuper.privateObjectObject);
                int[] nArray = new int[]{2, 2};
                return new m_0(arrayList, nArray);
            }
            case 7: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.\u00f4\u00d8\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 3);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.newnewString, 3);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 3);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 3);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 3);
        k_02.\u00d200000(voidsuper.o\u00f4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.nullvoidObject, 3);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper3, 4);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5o\u00d8000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.iffloatObject));
        arrayList.add(new for(while.\u00d5\u00d4\u00d4000));
        arrayList.add(new for(while.returninterfaceString));
        arrayList.add(new for(while.nullifString));
        arrayList.add(new for(while.\u00f5\u00f4\u00d5000));
        arrayList.add(new for(while.\u00f6\u00d20000));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<public> arrayList = new ArrayList<public>();
                arrayList.add(K.o00000(I.\u00d3\u00d30000, "Sippe"));
                arrayList.add(K.o00000(I.whilenewsuper, 1200));
                return new o00o_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

