/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C.A;

import helden.framework.C.A;
import helden.framework.C.I;
import helden.framework.OOoO.R;
import java.util.ArrayList;

public class D
extends A {
    public static int \u00d500000(R r) {
        return Integer.parseInt(((String)r.o00000(1)).substring(3));
    }

    public static int \u00d600000(R r) {
        return (Integer)r.o00000(0);
    }

    private static ArrayList \u00d2\u00d30000() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 1; i2 < 14; ++i2) {
            arrayList.add("SO " + i2);
        }
        return arrayList;
    }

    private static ArrayList publicnew() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i2 = 1; i2 <= 3; ++i2) {
            arrayList.add(new Integer(i2));
        }
        return arrayList;
    }

    public D() {
        super(I.\u00f80\u00d2000, false, 1, D.publicnew(), D.\u00d2\u00d30000());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        D d2 = new D();
        this.o00000(d2);
        return d2;
    }

    @Override
    public int \u00d200000(R r) {
        return D.\u00d600000(r) * D.\u00d500000(r);
    }

    public int \u00d4\u00d30000() {
        return D.\u00d600000((R)this.intsuper().iterator().next());
    }
}

