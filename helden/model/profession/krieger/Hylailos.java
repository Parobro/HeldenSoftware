/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.krieger;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.krieger.BasisKrieger;
import java.util.ArrayList;

public class Hylailos
extends BasisKrieger {
    public Hylailos() {
        super("Hylailos", 21);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.privatedosuper)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.\u00d3\u00f4\u00d2000, -1);
        return k_02;
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.newStringsuper));
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.\u00f4\u00f4o000));
        return bedingungsVerknuepfung;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.remove(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Kettenhemd, Lang"));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Kettenhemd, Halbarm"));
        arrayList.add(oooo_0.o00000(while.\u00f50o000.toString()));
        arrayList.remove(oooo_0.o00000(while.\u00d5\u00d4\u00d4000.toString()));
        arrayList.remove(oooo_0.o00000(while.\u00f5\u00f4\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.newnewObject);
                arrayList.add(voidsuper.privateObjectObject);
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.\u00f4o\u00d6000);
                arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 3);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.\u00d200000(E.o\u00d6\u00d8000, 3);
        k_02.\u00d200000(E.\u00f8\u00d5\u00d8000, 6);
        k_02.\u00d200000(voidsuper.o\u00d2\u00d8000, 3);
        k_02.\u00d200000(voidsuper.ifforObject, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d5O\u00d6000, -4);
        k_02.\u00d200000(voidsuper.returnprivateObject, 5);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.thisintObject, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.thisclassObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, -2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.newStringsuper);
        arrayList.add(I.\u00f4\u00f4o000);
        return arrayList;
    }

    @Override
    public String toString() {
        return "Kriegerakademie 'Mutter Rondra' auf Hylailos";
    }
}

