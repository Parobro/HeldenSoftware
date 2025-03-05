/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OooO;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public final class C {
    private static Collator o00000;

    public static int o00000(Object object, Object object2) {
        if (object == null) {
            return -1;
        }
        if (object2 == null) {
            return 1;
        }
        if (object instanceof Comparable && object2 instanceof Comparable && !(object instanceof String) && !(object2 instanceof String)) {
            return ((Comparable)object).compareTo(object2);
        }
        if (o00000 == null) {
            o00000 = Collator.getInstance(Locale.GERMAN);
            o00000.setStrength(1);
        }
        return o00000.compare(object.toString(), object2.toString());
    }

    public static List o00000(List list) {
        Collections.sort(list, new Comparator(){

            public int compare(Object object, Object object2) {
                return C.o00000(object, object2);
            }
        });
        return list;
    }

    public static List o00000(ArrayList arrayList) {
        Collections.sort(arrayList, new Comparator(){

            public int compare(Object object, Object object2) {
                return C.o00000(object, object2);
            }
        });
        return arrayList;
    }

    private C() {
    }
}

