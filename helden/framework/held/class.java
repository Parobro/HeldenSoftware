/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.OoOO.U;
import helden.framework.held.Object.public;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class class<T> {
    private static final Boolean \u00d400000 = new Boolean(false);
    private k_0<T> class;
    private PropertyChangeSupport \u00d200000;
    private Map<T, Boolean> super;
    private Map<oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1, Integer> \u00d300000 = new HashMap<oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1, Integer>();

    public class() {
        this.class = new k_0();
        this.\u00d200000 = new PropertyChangeSupport(this);
        this.super = new HashMap<T, Boolean>();
    }

    public class(public public_) {
        this.class = new k_0(public_);
        this.\u00d200000 = new PropertyChangeSupport(this);
        this.super = new HashMap<T, Boolean>();
    }

    public void super(PropertyChangeListener propertyChangeListener) {
        PropertyChangeListener[] propertyChangeListenerArray = this.\u00d200000.getPropertyChangeListeners();
        boolean bl = false;
        for (PropertyChangeListener propertyChangeListener2 : propertyChangeListenerArray) {
            if (!propertyChangeListener2.equals(propertyChangeListener)) continue;
            bl = true;
        }
        if (!bl) {
            this.\u00d200000.addPropertyChangeListener(propertyChangeListener);
        }
    }

    public boolean \u00d300000(T t) {
        return this.class.\u00d200000(t);
    }

    public U \u00d200000(int n) {
        return (U)this.\u00d200000().get(n);
    }

    public List<T> \u00d200000() {
        return this.class.\u00d200000();
    }

    public int super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12) {
        Integer n = this.\u00d300000.get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12);
        int n2 = 0;
        if (n == null) {
            this.\u00d300000.put(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, new Integer(n2));
        } else {
            n2 = n;
        }
        return n2;
    }

    public List<T> super(int n) {
        ArrayList<T> arrayList = new ArrayList<T>();
        for (T t : this.\u00d200000()) {
            if (this.\u00d200000(t) < n) continue;
            arrayList.add(t);
        }
        return arrayList;
    }

    public int \u00d200000(T t) {
        return this.class.\u00d400000(t);
    }

    public Boolean \u00d400000(T t) {
        Boolean bl = this.super.get(t);
        if (bl == null) {
            return \u00d400000;
        }
        return bl;
    }

    public Iterator<T> super() {
        return this.class.iterator();
    }

    public void super(T t) {
        if (this.class.\u00d200000(t)) {
            U u2 = (U)t;
            Integer n = new Integer(this.super(u2.getArt()) - 1);
            this.\u00d300000.put(u2.getArt(), n);
        }
        this.class.o00000(t);
    }

    public void \u00d200000(PropertyChangeListener propertyChangeListener) {
        this.\u00d200000.removePropertyChangeListener(propertyChangeListener);
    }

    public void super(T t, int n) {
        int n2 = 0;
        if (this.\u00d300000(t)) {
            n2 = this.\u00d200000(t);
        } else {
            this.super.put(t, \u00d400000);
        }
        if (!this.class.\u00d200000(t)) {
            U u2 = (U)t;
            Integer n3 = new Integer(this.super(u2.getArt()) + 1);
            this.\u00d300000.put(u2.getArt(), n3);
        }
        this.class.o00000(t, n);
        this.\u00d200000.firePropertyChange(t.toString(), n2, n);
    }

    public void super(T t, Boolean bl) {
        this.super.put(t, bl);
    }

    public int \u00d300000() {
        return this.class.Object();
    }
}

