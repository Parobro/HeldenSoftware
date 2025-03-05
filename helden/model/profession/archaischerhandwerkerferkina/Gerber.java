/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.archaischerhandwerkerferkina;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.model.profession.archaischerhandwerkerferkina.ArchaischerHandwerkerDerFerkinas;
import java.util.ArrayList;

public class Gerber
extends ArchaischerHandwerkerDerFerkinas {
    public Gerber() {
        super("Gerber/K\u00fcrschner", 3);
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Gerber/K\u00fcrschner";
        }
        return "Gerberin/K\u00fcrschnerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d5\u00d50000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 3);
        k_02.\u00d200000(voidsuper.Oo\u00d6000, 7);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 4);
        return k_02;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        ArrayList<public> arrayList = new ArrayList<public>();
        M m = (M)K.o00000(I.\u00d5\u00d50000);
        ArrayList<public> arrayList2 = m.\u00f4\u00d20000();
        D d2 = (D)arrayList2.get(0);
        d2.o00000("pflanzliche Gifte");
        D d3 = (D)arrayList2.get(1);
        d3.o00000("tierische Gifte");
        D d4 = (D)arrayList2.get(2);
        d4.o00000("mineralische Gifte");
        arrayList.add(d2);
        arrayList.add(d3);
        arrayList.add(d4);
        return new o00o_0(this.getProfession(), arrayList, 1);
    }
}

