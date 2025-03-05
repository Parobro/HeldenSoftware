/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.alchimist;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.alchimist.BasisAlchimist;
import java.util.ArrayList;

public class Zwergisch
extends BasisAlchimist {
    public Zwergisch() {
        super("zwergisch", 8, false);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return super.getAnzahlVorteilAuswahlen() + 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        switch (n) {
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                return super.getTalentAuswahl(n);
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
        k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 2);
        k_02.\u00d200000(voidsuper.\u00f40\u00d8000, 3);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, -2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, -2);
        k_02.\u00d200000(G.\u00d80\u00f6000, 8);
        k_02.\u00d200000(G.\u00d3\u00d4\u00f5000, 2);
        k_02.\u00d200000(G.o\u00d5\u00f5000, 6);
        k_02.\u00d200000(G.\u00f4\u00d6\u00f5000, 6);
        k_02.\u00d200000(voidsuper.privateclassObject, 3);
        k_02.\u00d200000(voidsuper.\u00d8\u00d8\u00d6000, 3);
        return k_02;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        if (n < super.getAnzahlVorteilAuswahlen()) {
            return super.getVorteilAuswahl(n);
        }
        if (n == super.getAnzahlVorteilAuswahlen()) {
            ArrayList<public> arrayList = new ArrayList<public>();
            J j2 = (J)K.o00000(I.privateclass);
            j2.oO0000(5);
            arrayList.add(j2);
            J j3 = (J)K.o00000(I.\u00d50o000);
            j3.oO0000(5);
            arrayList.add(j3);
            return new o00o_0(this.getProfession(), arrayList, 1);
        }
        throw new c_1();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.new(I.privateclass);
        return oo0O;
    }

    @Override
    public String toString() {
        return "Zwergischer Alchimist";
    }
}

