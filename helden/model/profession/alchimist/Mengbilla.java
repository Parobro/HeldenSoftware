/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.alchimist;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.alchimist.BasisAlchimist;
import java.util.ArrayList;

public class Mengbilla
extends BasisAlchimist {
    public Mengbilla(String string, int n, boolean bl) {
        super(string, n, bl);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 6;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        if (this.\u00d8O\u00f5O00) {
            return 4;
        }
        return 1;
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.\u00d8\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        if (n == 0) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
            arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
            return new returnsuper(this.getProfession(), arrayList, 4, -1, 1, 4);
        }
        throw new c_1();
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return super.getTalentAuswahl(n);
            }
            case 5: {
                arrayList.add(voidsuper.\u00d8O\u00d8000);
                arrayList.add(voidsuper.ififObject);
                arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.thisintObject, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 3);
        return k_02;
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
            case 0: {
                return o00o_0.o00000(this.getProfession(), (M)K.o00000(I.\u00d5\u00d50000), 1);
            }
            case 1: {
                ArrayList<public> arrayList = new ArrayList<public>(2);
                J j2 = (J)K.o00000(I.O\u00d80000);
                j2.oO0000(2);
                arrayList.add(j2);
                J j3 = (J)K.o00000(I.\u00f8oO000);
                j3.oO0000(2);
                arrayList.add(j3);
                return new o00o_0(this.getProfession(), arrayList, 1);
            }
            case 2: {
                return super.getVorteilAuswahl(0);
            }
            case 3: {
                return super.getVorteilAuswahl(1);
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
            j2.oO0000(2);
            oo0O.\u00d300000(j2);
        }
        oo0O.\u00d300000(K.o00000(I.ifprivate));
        j2 = (J)K.o00000(I.\u00d5oo000, "Schweigepflicht, Gehorsam");
        j2.oO0000(6);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(I.whilenewsuper, 1500));
        return oo0O;
    }
}

