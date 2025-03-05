/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C.A;

import helden.framework.C.A;
import helden.framework.C.I;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o00O;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.Bedingung;
import java.util.ArrayList;

public class E
extends A {
    private static ArrayList Object(I i2) {
        if (i2.equals(I.thisObject)) {
            return new ArrayList<helden.framework.OOoO.A>(helden.framework.OOoO.A.o00000());
        }
        if (i2.equals(I.\u00d30O000)) {
            return (ArrayList)o00O.public();
        }
        return null;
    }

    private static ArrayList \u00d6\u00d30000() {
        ArrayList<String> arrayList = new ArrayList<String>();
        Integer[] integerArray = new Integer[]{1, 3, 7, 21, 49};
        int n = integerArray.length;
        for (int i2 = 0; i2 < n; ++i2) {
            int n2 = integerArray[i2];
            arrayList.add(new String(n2 + " m"));
        }
        return arrayList;
    }

    private static ArrayList \u00d5\u00d30000() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i2 = 1; i2 <= 3; ++i2) {
            arrayList.add(new Integer(i2));
        }
        return arrayList;
    }

    public E(I i2) {
        super(i2, false, 99, E.Object(i2), E.\u00d6\u00d30000(), E.\u00d5\u00d30000());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        E e = new E(this.\u00f4O0000());
        this.o00000(e);
        return e;
    }

    @Override
    public int \u00d200000(R r) {
        int n = E.\u00d6\u00d30000().indexOf(r.o00000(1)) + 1;
        int n2 = (Integer)r.o00000(2);
        return n * n2;
    }

    @Override
    public AbstraktBedingung \u00d5O0000() {
        return Bedingung.istMindestens(Bedingung.MagieLevel.\u00d300000);
    }
}

