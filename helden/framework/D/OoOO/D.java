/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D.OoOO;

import helden.framework.D.void;
import java.util.HashSet;
import java.util.Set;

public class D
extends void<String> {
    private static Set<String> \u00d4\u00d40000() {
        HashSet<String> hashSet = new HashSet<String>();
        for (int i2 = 1; i2 < 3; ++i2) {
            hashSet.add("\u00d6rtlichkeit " + java.lang.String.valueOf(i2));
            hashSet.add("Strecke " + java.lang.String.valueOf(i2));
        }
        return hashSet;
    }

    public D() {
        super("Ortskenntnis", 150, D.\u00d4\u00d40000(), 0);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        HashSet hashSet = new HashSet(this.nullObject());
        D d2 = new D();
        d2.o00000(hashSet);
        d2.o00000(this.\u00f5o0000());
        return d2;
    }

    @Override
    public void \u00d500000(String string) {
        this.\u00d400000(string);
        if (!this.\u00d5\u00d3\u00f8000.containsKey(string)) {
            this.\u00d5\u00d3\u00f8000.put(string, 150);
        }
    }
}

