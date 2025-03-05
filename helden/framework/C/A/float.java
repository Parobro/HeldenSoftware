/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C.A;

import helden.framework.C.A;
import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OOoO.oO0O;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import java.util.ArrayList;

public class float
extends A {
    public static int \u00d2O0000(R r) {
        return (Integer)r.o00000(1);
    }

    private static ArrayList O\u00d40000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : oooo_0.\u00f500000().values()) {
            if (!p2.\u00d500000()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    private static ArrayList \u00f6\u00d30000() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i2 = 1; i2 <= 6; ++i2) {
            arrayList.add(new Integer(i2));
        }
        return arrayList;
    }

    public float() {
        super(I.\u00f5\u00d60000, false, 1, float.O\u00d40000(), float.\u00f6\u00d30000());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        float float_ = new float();
        this.o00000(float_);
        return float_;
    }

    @Override
    public int \u00d200000(R r) {
        return 2 + float.\u00d2O0000(r) * 4;
    }

    @Override
    public ArrayList<oO0O<P, AbstraktBedingung, Integer>> o00000(R r, floatsuper floatsuper2) {
        ArrayList<oO0O<P, AbstraktBedingung, Integer>> arrayList = super.o00000(r, floatsuper2);
        arrayList.add(new oO0O<P, Object, Integer>((P)r.o00000(0), null, 0));
        arrayList.add(new oO0O<P, Object, Integer>(oooo_0.o00000(helden.framework.D.while.nullfor), null, 0));
        return arrayList;
    }

    public int classObject() {
        return float.\u00d2O0000((R)this.intsuper().iterator().next());
    }
}

