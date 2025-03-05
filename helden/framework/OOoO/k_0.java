/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

import helden.framework.OoOO.X;
import helden.framework.held.Object.public;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Renamed from helden.framework.OoOO.K
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class k_0<T>
implements Iterable<T> {
    private Map<T, Integer> \u00d200000 = new HashMap<T, Integer>();
    private public \u00d300000;
    private ArrayList<T> super;

    public k_0() {
        this.\u00d300000 = null;
    }

    public k_0(public public_) {
        this.\u00d300000 = public_;
    }

    public void \u00d200000(T t, int n) {
        int n2;
        if (!this.\u00d200000.containsKey(t)) {
            this.super = null;
            n2 = 0;
        } else {
            n2 = this.\u00d400000(t);
        }
        int n3 = n2 + n;
        if (n3 != 0) {
            this.o00000(t, n3);
        } else {
            this.o00000(t);
        }
    }

    public boolean \u00d200000(T t) {
        return this.\u00d200000.containsKey(t);
    }

    public List<T> \u00d200000() {
        if (this.super == null) {
            this.super = new ArrayList();
            for (T t : this.\u00d200000.keySet()) {
                if (t == null) continue;
                this.super.add(t);
            }
            if (this.\u00d300000 != null) {
                Collections.sort(this.super, this.\u00d300000);
            } else {
                Collections.sort(this.super);
            }
        }
        return this.super;
    }

    public List<T> o00000(int n) {
        ArrayList<T> arrayList = new ArrayList<T>();
        for (T t : this) {
            if (this.\u00d400000(t) < n) continue;
            arrayList.add(t);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public Map<T, Integer> o00000() {
        return this.\u00d200000;
    }

    public int \u00d400000(T t) {
        Integer n = this.\u00d200000.get(t);
        if (n == null) {
            throw new X(t.toString());
        }
        return n;
    }

    public int Object(T t) {
        Integer n = this.\u00d200000.get(t);
        if (n == null) {
            return 0;
        }
        return n;
    }

    @Override
    public Iterator<T> iterator() {
        return this.\u00d200000().iterator();
    }

    public void o00000(T t) {
        if (this.\u00d200000.containsKey(t)) {
            this.super = null;
        }
        this.\u00d200000.remove(t);
    }

    public void o00000(T t, int n) {
        if (!this.\u00d200000.containsKey(t)) {
            this.super = null;
        }
        this.\u00d200000.put(t, new Integer(n));
    }

    public int Object() {
        return this.\u00d200000.size();
    }
}

