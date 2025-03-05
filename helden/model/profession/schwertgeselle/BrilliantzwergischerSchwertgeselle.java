/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schwertgeselle;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.schwertgeselle.Schwertgeselle;
import java.util.ArrayList;

public class BrilliantzwergischerSchwertgeselle
extends Schwertgeselle {
    public BrilliantzwergischerSchwertgeselle() {
        super("Brilliantzwergischer Schwertgeselle", 18);
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
            return "Brilliantzwergischer Schwertgeselle";
        }
        return "Brilliantzwergischer Schwertgesellin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.whilereturn);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.addAll(this.getSetting().getSF(while.\u00d8\u00d3\u00d2000));
        return new objectsuper_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.iffloatObject.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d4\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.returninterfaceString.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.add(voidsuper.whileStringObject);
                arrayList.add(voidsuper.\u00f4o\u00d6000);
                arrayList.add(voidsuper.\u00d50\u00d8000);
                arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
                arrayList.add(voidsuper.O\u00f4\u00d5000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.forObjectObject);
                arrayList.add(voidsuper.\u00f80\u00d8000);
                arrayList.add(voidsuper.O\u00f5\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.privateclassObject);
                arrayList.add(voidsuper.\u00f4\u00f6\u00d5000);
                arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
                arrayList.add(voidsuper.StringfloatObject);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00d4\u00d6\u00d8000, 4);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 4);
        k_02.\u00d200000(E.newnewString, 3);
        k_02.\u00d200000(E.thissuperString, 6);
        k_02.\u00d200000(voidsuper.ifforObject, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.privateObjectObject, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d2\u00d6\u00d6000));
        arrayList.add(new for(while.\u00f5\u00d3\u00d2000));
        arrayList.add(new for(while.\u00d8O\u00f5000));
        arrayList.add(new for(while.\u00f6\u00f4\u00f6000));
        arrayList.add(new for(while.\u00d2\u00d3\u00f6000));
        arrayList.add(new for(while.o0\u00d3000));
        arrayList.add(new for(while.\u00f50o000));
        arrayList.add(new for(while.o\u00f4\u00d6000));
        arrayList.add(new for(while.\u00f5\u00f4\u00d5000));
        arrayList.add(new for(while.\u00d8\u00f4\u00d5000));
        arrayList.add(new for(while.\u00f6\u00d20000));
        arrayList.add(new for(while.newint));
        return arrayList;
    }
}

