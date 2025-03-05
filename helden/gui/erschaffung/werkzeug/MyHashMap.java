/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import java.util.ArrayList;
import java.util.HashMap;

public class MyHashMap<K, V>
extends HashMap<K, V> {
    private ArrayList<K> o00000 = new ArrayList();

    public ArrayList<K> getWerte() {
        return this.o00000;
    }

    @Override
    public V put(K k2, V v) {
        if (!this.o00000.contains(k2)) {
            this.o00000.add(k2);
        }
        return super.put(k2, v);
    }

    @Override
    public V remove(Object object) {
        this.o00000.remove(object);
        return super.remove(object);
    }
}

