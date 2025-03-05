/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.zaubertaenzer;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public abstract class VarianteZaubertaenzer
extends N {
    public VarianteZaubertaenzer(String string, int n) {
        super(string, n);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Kleiner Wohnwagen mit Zugtier");
        arrayList.add("Kollektion aufw\u00e4ndiger Tanzgew\u00e4nder");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.Stringdo);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.\u00f5\u00f4o000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.thisdo);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00d3\u00d30000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.thispublicsuper, 3);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.o\u00d6\u00d4000.toString()));
        arrayList.add(oooo_0.o00000(while.iffloatObject.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d8\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(voidsuper.o\u00d2\u00d8000, 3);
        k_02.o00000(voidsuper.ifforObject, 3);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 4);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 7);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d5000, 4);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.forclassObject, 3);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.privateObjectObject, 4);
        k_02.o00000(voidsuper.returnifObject, 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d3Oo000);
        arrayList.add(I.newStringsuper);
        arrayList.add(I.\u00f4\u00f4o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d2\u00d6\u00d6000));
        arrayList.add(new for(while.returnfloatObject));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.O\u00f4O000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

