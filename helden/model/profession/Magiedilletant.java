/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;

public abstract class Magiedilletant
extends super {
    public Magiedilletant() {
    }

    public Magiedilletant(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.while);
        arrayList.add(I.\u00f5\u00f4o000);
        arrayList.add(I.\u00d8O0000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00d400000;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        return oo0O;
    }

    @Override
    public boolean istMagiedilletantischeProfession() {
        return true;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "Magiedilletant";
        }
        return "Magiedilletantin";
    }

    @Override
    protected int getBasisGPKosten() {
        return 5;
    }

    @Override
    protected void setzeModifikationen() {
    }
}

