/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.super;

import helden.framework.E.B;
import helden.framework.E.C.I;
import helden.framework.E.F;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.OOoO.o0Oo;
import helden.framework.oooo.oooo_1;
import java.util.ArrayList;

public class thissuper {
    public static String o00000(o0Oo o0Oo2) {
        return "Rune: " + o0Oo2.\u00d400000();
    }

    public static ArrayList<F> o00000(Object object) {
        ArrayList<F> arrayList = new ArrayList<F>();
        if (!(object instanceof O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)) {
            return arrayList;
        }
        for (o0Oo o0Oo2 : o0Oo.o00000()) {
            arrayList.add(new F(thissuper.o00000(o0Oo2), B.int, 1.0f, 10, 1, new oooo_1("WnT", 1), new I(o0Oo2)));
        }
        return arrayList;
    }
}

