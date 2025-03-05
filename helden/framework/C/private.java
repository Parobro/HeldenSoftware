/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.I;
import helden.framework.C.public;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract class private<T>
extends public {
    protected SortedMap<T, Integer> forfloatsuper;
    protected SortedSet<T> \u00d5\u00d4\u00d2000 = new TreeSet<T>();

    protected private(I i2, boolean bl, SortedMap<T, Integer> sortedMap) {
        super(i2, 0, bl, true);
        this.o00000(sortedMap);
    }

    public void o00000(T t, int n) {
        this.\u00d6o0000().put(t, new Integer(n));
    }

    public void \u00d2o0000() {
        this.\u00d5\u00d4\u00d2000.clear();
        this.o00000((T)false);
    }

    public Set<T> intsuper() {
        return this.\u00d5\u00d4\u00d2000;
    }

    public List<T> \u00d5o0000() {
        if (this.forfloatsuper == null) {
            return new LinkedList();
        }
        return new LinkedList<T>(this.forfloatsuper.keySet());
    }

    public int \u00d200000(T t) {
        int n = 0;
        try {
            n = (Integer)this.forfloatsuper.get(t);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return n;
    }

    public SortedMap<T, Integer> \u00d6o0000() {
        return this.forfloatsuper;
    }

    public void Object(T t) {
        this.forfloatsuper.remove(t);
    }

    public void o00000(T t) {
        if (!this.\u00d5o0000().contains(t)) {
            this.o00000(t, 0);
        }
        this.intsuper().add(t);
    }

    public abstract void \u00d200000(int var1);

    public void \u00d200000(T t, int n) {
        this.o00000(n, false);
        this.\u00d6o0000().put(t, new Integer(n));
    }

    public void o00000(SortedMap<T, Integer> sortedMap) {
        this.forfloatsuper = sortedMap;
        this.\u00d2o0000();
    }

    protected void o00000(Integer n) {
        Iterator<T> iterator = this.forfloatsuper.keySet().iterator();
        while (iterator.hasNext()) {
            this.forfloatsuper.put(iterator.next(), n);
        }
    }

    protected T \u00d4o0000() {
        if (this.\u00d5o0000().size() == 0) {
            return null;
        }
        return this.\u00d5o0000().get(0);
    }

    protected void o00000(SortedSet<T> sortedSet) {
        this.\u00d5\u00d4\u00d2000 = sortedSet;
    }
}

