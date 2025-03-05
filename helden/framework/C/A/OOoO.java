/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C.A;

import helden.framework.C.A;
import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o00O;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;

public class OOoO
extends A {
    private boolean \u00d8\u00d5\u00d2000;

    public static I \u00d400000(boolean bl) {
        if (bl) {
            return I.\u00d8\u00f4O000;
        }
        return I.forObjectsuper;
    }

    public OOoO(boolean bl) {
        super(OOoO.\u00d400000(bl), false, 1, o00O.\u00d2O0000());
        this.\u00d8\u00d5\u00d2000 = bl;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        OOoO oOoO2 = new OOoO(this.\u00d8\u00d5\u00d2000);
        this.o00000(oOoO2);
        return oOoO2;
    }

    @Override
    public int \u00d200000(R r) {
        if (this.\u00d8\u00d5\u00d2000) {
            return 5;
        }
        return 3;
    }

    @Override
    public ArrayList<I> Object(R r) {
        ArrayList<I> arrayList = new ArrayList<I>();
        if (this.\u00d8\u00d5\u00d2000) {
            arrayList.add(I.\u00d5\u00d3O000);
        }
        arrayList.add(I.whileStringsuper);
        M m = (M)K.o00000(I.\u00f5\u00f6O000);
        m.\u00d2o0000();
        m.o00000((o00O)r.o00000(0));
        arrayList.add(m);
        return arrayList;
    }

    public ArrayList<Zauber> o00000(ArrayList<Zauber> arrayList) {
        ArrayList<Zauber> arrayList2 = new ArrayList<Zauber>();
        arrayList2.add(Zauber.\u00d5\u00d5\u00d4000);
        for (R r : this.intsuper()) {
            o00O o00O2 = (o00O)r.o00000(0);
            o00O o00O3 = o00O2.\u00d500000();
            for (Zauber zauber : arrayList) {
                if (zauber.hatMerkmal(o00O3, helden.framework.OOoO.K.\u00d400000)) continue;
                arrayList2.add(zauber);
            }
            if (o00O.\u00f6O0000.equals(o00O2)) {
                arrayList2.add(Zauber.\u00d5\u00d2\u00d5000);
                arrayList2.add(Zauber.newthisObject);
                arrayList2.add(Zauber.\u00f5\u00d3\u00d4000);
                arrayList2.add(Zauber.thisinterfacesuper);
                arrayList2.add(Zauber.\u00d4\u00f8\u00d4000);
                arrayList2.add(Zauber.\u00f8\u00d3\u00d3000);
                arrayList2.add(Zauber.whileifnew);
                continue;
            }
            if (o00O.\u00d4O0000.equals(o00O2)) {
                arrayList2.add(Zauber.\u00d3O\u00d4000);
                arrayList2.add(Zauber.\u00f40\u00d3000);
                arrayList2.add(Zauber.\u00d4\u00f5\u00d3000);
                arrayList2.add(Zauber.\u00f8\u00d6\u00d4000);
                arrayList2.add(Zauber.o\u00f8\u00d4000);
                arrayList2.add(Zauber.\u00d4\u00f6\u00d3000);
                arrayList2.add(Zauber.OO\u00d5000);
                arrayList2.add(Zauber.privatefloatnew);
                arrayList2.add(Zauber.o\u00f6\u00d3000);
                arrayList2.add(Zauber.\u00f5\u00d6\u00d3000);
                arrayList2.add(Zauber.\u00d30\u00d4000);
                continue;
            }
            if (o00O.super.equals(o00O2)) {
                arrayList2.add(Zauber.\u00d5\u00f8\u00d4000);
                arrayList2.add(Zauber.\u00f5o\u00d5000);
                arrayList2.add(Zauber.\u00d8\u00d5\u00d4000);
                arrayList2.add(Zauber.O\u00d8\u00d4000);
                arrayList2.add(Zauber.o\u00d5\u00d3000);
                arrayList2.add(Zauber.o\u00d3\u00d5000);
                arrayList2.add(Zauber.\u00f5\u00f8\u00d4000);
                arrayList2.add(Zauber.whilenewnew);
                arrayList2.add(Zauber.thisObjectnew);
                continue;
            }
            if (o00O.\u00d4\u00d20000.equals(o00O2)) {
                arrayList2.add(Zauber.\u00f5\u00d6\u00d4000);
                arrayList2.add(Zauber.\u00d8O\u00d4000);
                arrayList2.add(Zauber.\u00d8\u00f4\u00d3000);
                arrayList2.add(Zauber.returnthisnew);
                arrayList2.add(Zauber.\u00f5\u00d2\u00d3000);
                arrayList2.add(Zauber.\u00f5\u00f5\u00d3000);
                arrayList2.add(Zauber.\u00d5O\u00d4000);
                arrayList2.add(Zauber.\u00d5o\u00d4000);
                arrayList2.add(Zauber.forfloatnew);
                arrayList2.add(Zauber.o\u00d6\u00d3000);
                continue;
            }
            if (o00O.\u00d800000.equals(o00O2)) {
                arrayList2.add(Zauber.o\u00d3\u00d3000);
                arrayList2.add(Zauber.\u00f8\u00d2\u00d3000);
                arrayList2.add(Zauber.\u00f8\u00f8\u00d2000);
                arrayList2.add(Zauber.whilewhilenew);
                arrayList2.add(Zauber.\u00d5o\u00d3000);
                arrayList2.add(Zauber.\u00d5\u00d5\u00d3000);
                arrayList2.add(Zauber.\u00d3\u00f4\u00d3000);
                arrayList2.add(Zauber.\u00d4\u00d3\u00d3000);
                arrayList2.add(Zauber.Oo\u00d4000);
                arrayList2.add(Zauber.\u00d3\u00f6\u00d3000);
                continue;
            }
            if (!o00O.\u00d2\u00d20000.equals(o00O2)) continue;
            arrayList2.add(Zauber.\u00d4O\u00d3000);
            arrayList2.add(Zauber.\u00d4\u00d6\u00d4000);
            arrayList2.add(Zauber.Stringfloatnew);
            arrayList2.add(Zauber.\u00d8\u00f6\u00d4000);
            arrayList2.add(Zauber.o\u00f8\u00d4000);
            arrayList2.add(Zauber.\u00d4\u00f6\u00d3000);
            arrayList2.add(Zauber.\u00f8O\u00d3000);
            arrayList2.add(Zauber.\u00f4\u00f5\u00d4000);
            arrayList2.add(Zauber.privatefloatnew);
            arrayList2.add(Zauber.\u00f8\u00d4\u00d4000);
            arrayList2.add(Zauber.\u00d8O\u00d3000);
            arrayList2.add(Zauber.\u00f4o\u00d5000);
            arrayList2.add(Zauber.forinterfacesuper);
            arrayList2.add(Zauber.\u00d80\u00d4000);
            arrayList2.add(Zauber.\u00d40\u00d5000);
        }
        return arrayList2;
    }
}

