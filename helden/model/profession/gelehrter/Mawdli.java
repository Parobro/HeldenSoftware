/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.gelehrter;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.gelehrter.Gelehrter;
import java.util.ArrayList;

public class Mawdli
extends Gelehrter {
    public Mawdli() {
        super("Mawdli", 3);
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Mawdli";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                return new returnsuper(this.getProfession(), arrayList, 5, 2);
            }
            case 2: {
                arrayList.add(G.whileStringclass);
                arrayList.add(G.\u00d3o\u00f5000);
                arrayList.add(G.\u00f8\u00f8\u00f4000);
                arrayList.add(G.\u00f4\u00d4\u00f5000);
                return new returnsuper(this.getProfession(), arrayList, 12, 4);
            }
        }
        return super.getNextTaPVerteilAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.oo\u00d6000, "Rastullah"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.\u00d4\u00d6\u00d8000);
        k_02.\u00d200000(E.\u00d3\u00d6\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00f4o\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 6);
        k_02.\u00d200000(voidsuper.thisintObject, 4);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 6);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d6\u00d6000, 3);
        k_02.\u00d200000(voidsuper.StringObjectObject, 1);
        return k_02;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d5\u00f60000, "gegen Unglaubige");
        j2.oO0000(8);
        oo0O.\u00d300000(j2);
        return oo0O;
    }
}

