/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.alchimist;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.alchimist.BasisAlchimist;
import java.util.ArrayList;

public class Norburg
extends BasisAlchimist {
    public Norburg(String string, int n, boolean bl) {
        super(string, n, bl);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 0;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        if (this.\u00d8O\u00f5O00) {
            return super.getAnzahlVorteilAuswahlen() + 1;
        }
        return super.getAnzahlVorteilAuswahlen();
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return super.getMinimalEigenschaftswert(b_02) + 1;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.\u00d200000(b_0.\u00d8\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: 
            case 1: {
                return super.getTalentAuswahl(n);
            }
            case 2: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(G.whilewhileString);
                arrayList.remove(G.\u00d3\u00f8\u00f5000);
                arrayList.remove(G.\u00f8\u00f6\u00f5000);
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(voidsuper2);
        k_02.o00000(voidsuper3);
        k_02.o00000(G.\u00d5\u00d4\u00f5000);
        k_02.\u00d200000(E.nullsuperString, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.o00000(voidsuper.O\u00f6\u00d5000);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, -1);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, -1);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f40\u00d8000);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00f5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, -1);
        k_02.\u00d200000(G.\u00f8\u00f6\u00f5000, 6);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 7);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.StringObjectObject, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.whilereturn);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.\u00f8\u00f6\u00d5000));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        switch (n) {
            case 2: {
                ArrayList<public> arrayList = new ArrayList<public>(2);
                J j2 = (J)K.o00000(I.O\u00d80000);
                j2.oO0000(1);
                arrayList.add(j2);
                J j3 = (J)K.o00000(I.\u00f8oO000);
                j3.oO0000(1);
                arrayList.add(j3);
                return new o00o_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getVorteilAuswahl(n);
    }

    @Override
    public Oo0O getVorteile() {
        J j2;
        Oo0O oo0O = super.getVorteile();
        if (!this.\u00d8O\u00f5O00) {
            j2 = (J)K.o00000(I.O\u00d80000);
            j2.oO0000(1);
            oo0O.\u00d300000(j2);
        }
        oo0O.\u00d300000(K.o00000(I.ifprivate));
        j2 = (J)K.o00000(I.\u00d5oo000, "Kriegsvermeidung, Friedensf\u00f6rderung, Schutz des Lebens, Hilfe f\u00fcr Kranke");
        j2.oO0000(8);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public String toString() {
        if (this.\u00d8O\u00f5O00) {
            return "Spagyrischer Zweig der Halle des Lebens zu Norburg (magiebegabt)";
        }
        return "Spagyrischer Zweig der Halle des Lebens zu Norburg";
    }
}

