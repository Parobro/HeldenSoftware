/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum classsuper {
    \u00d800000(1),
    super(2),
    class(4),
    \u00d400000(8),
    \u00d300000(16);

    private int \u00d600000;

    public static Set<classsuper> o00000(int n) {
        HashSet<classsuper> hashSet = new HashSet<classsuper>();
        for (classsuper classsuper2 : classsuper.values()) {
            if ((n & classsuper2.o00000()) <= 0) continue;
            hashSet.add(classsuper2);
        }
        return hashSet;
    }

    public static int \u00d200000(Set<classsuper> set) {
        int n = 0;
        Iterator<classsuper> iterator = set.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().o00000();
        }
        return n;
    }

    public static String o00000(Set<classsuper> set) {
        String string = "";
        if (set.contains((Object)\u00d300000)) {
            string = string + "Held wurde eingegeben oder editiert";
        }
        if (set.contains((Object)super) || !set.contains((Object)\u00d800000)) {
            if (!string.isEmpty()) {
                string = string + "; ";
            }
            string = string + "Keine vollst\u00e4ndige \u00c4nderungshistory f\u00fcr den Helden vorhanden";
        }
        if (!set.contains((Object)super) && !set.contains((Object)\u00d800000)) {
            if (!string.isEmpty()) {
                string = string + "; ";
            }
            string = string + "Der Held wurde evtl. extern ge\u00e4ndert";
        }
        return string;
    }

    private classsuper(int n2) {
        this.\u00d600000 = n2;
    }

    private int o00000() {
        return this.\u00d600000;
    }
}

