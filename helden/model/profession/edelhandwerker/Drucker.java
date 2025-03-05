/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.edelhandwerker;

import helden.framework.Geschlecht;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.profession.edelhandwerker.Edelhandwerker;
import java.util.ArrayList;

public class Drucker
extends Edelhandwerker {
    public Drucker() {
        super("Drucker", 4);
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 3;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Drucker";
        }
        return "Druckerin";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 1: {
                arrayList.add(voidsuper.StringclassObject);
                arrayList.add(voidsuper.ifnullObject);
                arrayList.add(voidsuper.O\u00f6\u00d5000);
                arrayList.add(voidsuper.\u00d5\u00d4\u00d6000);
                arrayList.add(voidsuper.\u00f8\u00f4\u00d5000);
                arrayList.add(voidsuper.\u00d3\u00d8\u00d6000);
                return new returnsuper(this.getProfession(), arrayList, 7, 2);
            }
            case 2: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                arrayList.remove(this.\u00d50\u00f5O00);
                return new returnsuper(this.getProfession(), arrayList, 10, 5);
            }
        }
        return super.getNextTaPVerteilAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.forpublicObject, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00f6\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d5\u00f5\u00d5000, 1);
        k_02.\u00d200000(voidsuper3, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d3\u00d6000, 7);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 1);
        return k_02;
    }
}

