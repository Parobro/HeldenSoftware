/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.alchimist;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.alchimist.BasisAlchimist;
import java.util.ArrayList;

public class Festum
extends BasisAlchimist {
    public Festum() {
        super("Festum", 15, true);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 6;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 0;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return super.getMinimalEigenschaftswert(b_02) + 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.\u00f4\u00f5\u00d2000, 1);
        k_02.\u00d200000(b_0.\u00d8\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                return super.getTalentAuswahl(n);
            }
            case 4: {
                arrayList.add(G.\u00f5\u00f6\u00f5000);
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper));
                arrayList.remove(voidsuper.O0\u00d6000);
                arrayList.remove(voidsuper.O\u00f6\u00d5000);
                arrayList.remove(voidsuper.\u00d8\u00d5\u00d6000);
                arrayList.remove(voidsuper.thisinterfaceObject);
                arrayList.remove(voidsuper.\u00d30\u00d8000);
                arrayList.remove(voidsuper.StringclassObject);
                arrayList.remove(voidsuper.nullObjectObject);
                arrayList.remove(voidsuper.\u00d5\u00d4\u00d6000);
                arrayList.remove(voidsuper.\u00d50\u00d8000);
                arrayList.remove(voidsuper.oo\u00d6000);
                arrayList.remove(voidsuper.\u00f40\u00d8000);
                arrayList.remove(voidsuper.\u00f5\u00f5\u00d5000);
                arrayList.remove(voidsuper.\u00f4\u00f6\u00d5000);
                arrayList.remove(voidsuper.o\u00d5\u00d6000);
                arrayList.remove(voidsuper.thisintObject);
                arrayList.remove(voidsuper.\u00f5\u00d2\u00d6000);
                arrayList.remove(voidsuper.\u00f4\u00d2\u00d6000);
                arrayList.remove(voidsuper.\u00f8\u00f4\u00d5000);
                arrayList.remove(voidsuper.O\u00f4\u00d5000);
                arrayList.remove(voidsuper.\u00d3\u00d6\u00d5000);
                arrayList.remove(voidsuper.\u00d4\u00f6\u00d6000);
                arrayList.remove(voidsuper.\u00f5o\u00d6000);
                arrayList.remove(voidsuper.\u00d5\u00d3\u00d6000);
                arrayList.remove(voidsuper.\u00f4\u00d5\u00d6000);
                arrayList.remove(voidsuper.\u00d5\u00d5\u00d6000);
                arrayList.remove(voidsuper.o\u00f6\u00d6000);
                arrayList.remove(voidsuper.\u00d3\u00f4\u00d5000);
                arrayList.remove(voidsuper.\u00d8\u00d8\u00d6000);
                arrayList.add(voidsuper.forpublicObject);
                int[] nArray = new int[]{2, 2};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper2);
        k_02.o00000(voidsuper3);
        k_02.o00000(G.\u00d5\u00d4\u00f5000);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, -1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 1);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        k_02.\u00d200000(voidsuper.nullObjectObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f40\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.thisintObject, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(G.newwhileString, 4);
        k_02.\u00d200000(G.nullsuperclass, 3);
        k_02.\u00d200000(G.\u00d3\u00f8\u00f5000, 5);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 8);
        k_02.\u00d200000(G.\u00d5\u00d4\u00f5000, 5);
        k_02.\u00d200000(G.\u00d3o\u00f5000, 4);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d6000, 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.\u00f8\u00f6\u00d5000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.ifprivate));
        oo0O.\u00d300000(K.o00000(I.whilenewsuper, 1500));
        return oo0O;
    }

    @Override
    public String toString() {
        return "Zinnober-Laboratorien der Halle des Quecksilbers zu Festum";
    }
}

