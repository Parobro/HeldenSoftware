/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OooO;

import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class new {
    public static <T> List<List<T>> super(List<T> list, int n) {
        ArrayList<List<T>> arrayList = new ArrayList<List<T>>();
        if (n == 1) {
            for (T t : list) {
                ArrayList<T> arrayList2 = new ArrayList<T>();
                arrayList2.add(t);
                arrayList.add(arrayList2);
            }
            return arrayList;
        }
        for (List<T> list2 : new.super(list, n - 1)) {
            for (T t : list) {
                if (list2.contains(t)) continue;
                ArrayList<T> arrayList3 = new ArrayList<T>(list2);
                arrayList3.add(0, t);
                arrayList.add(arrayList3);
            }
        }
        return arrayList;
    }
}

