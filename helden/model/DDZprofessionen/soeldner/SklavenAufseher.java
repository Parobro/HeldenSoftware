/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.soeldner;

import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.soeldner.Soeldner;
import java.util.ArrayList;

public class SklavenAufseher
extends Soeldner {
    public SklavenAufseher() {
        super("Sklaven-Aufseher", 6);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Sklaven-Aufseher";
        }
        return "Sklaven-Aufseherin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00d8\u00d5\u00d8000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.forObjectObject);
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
                arrayList.add(voidsuper.\u00f4\u00f6\u00d6000);
                arrayList.add(voidsuper.newreturnObject);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.whilethisString, 5);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.o00000(voidsuper.O\u00f6\u00d5000);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.StringifObject));
        arrayList.add(new for(while.\u00d20o000));
        return arrayList;
    }
}

