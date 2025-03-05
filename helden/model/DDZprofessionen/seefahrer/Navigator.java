/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.seefahrer;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.public;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.seefahrer.Seefahrer;
import java.util.ArrayList;

public class Navigator
extends Seefahrer {
    public Navigator() {
        super("Navigator", 6);
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.equals((Object)Geschlecht.\u00d400000)) {
            return "Navigator";
        }
        return "Navigatorin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.\u00d8\u00d8\u00d5000, "Steuermann"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                return super.getTalentAuswahl(n);
            }
            case 1: {
                return super.getTalentAuswahl(n);
            }
            case 2: {
                arrayList.add(voidsuper.o\u00f6\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.oo\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, -1);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 1);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 3);
        k_02.\u00d200000(voidsuper.StringclassObject, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 2);
        k_02.\u00d200000(voidsuper.\u00d40\u00d8000, 1);
        k_02.\u00d200000(voidsuper.nullObjectObject, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 4);
        k_02.\u00d200000(this.getProfession().getMuttersprachenSchrift(), 6);
        k_02.\u00d200000(voidsuper.thisclassObject, -2);
        k_02.\u00d200000(voidsuper.ifnullObject, 4);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d5000, 3);
        return k_02;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        ArrayList<public> arrayList = new ArrayList<public>(4);
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        arrayList.add(j2);
        J j3 = (J)helden.framework.C.K.o00000(I.privateclass);
        j3.oO0000(5);
        arrayList.add(j3);
        J j4 = (J)helden.framework.C.K.o00000(I.thisdo);
        j4.oO0000(5);
        arrayList.add(j4);
        J j5 = (J)helden.framework.C.K.o00000(I.\u00d50o000);
        j5.oO0000(5);
        arrayList.add(j5);
        return new o00o_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

