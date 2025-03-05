/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.held.A.String;
import helden.framework.held.Object.public;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class S {
    private HashMap<java.lang.String, String> o00000 = new HashMap();

    public String \u00d200000(java.lang.String string) {
        return this.o00000.get(string);
    }

    public ArrayList<java.lang.String> \u00d200000() {
        ArrayList<java.lang.String> arrayList = new ArrayList<java.lang.String>(this.o00000.keySet());
        Collections.sort(arrayList, public.o00000());
        return arrayList;
    }

    public void o00000() {
        this.o00000 = new HashMap();
    }

    public void o00000(java.lang.String string) {
        if (this.o00000.containsKey(string)) {
            this.o00000.remove(string);
        }
    }

    public void o00000(String string) {
        this.o00000.put(string.\u00d300000(), string);
    }
}

