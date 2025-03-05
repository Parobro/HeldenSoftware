/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.private;
import helden.framework.C.public;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.held.Object.floatsuper;
import helden.framework.zauber.KonkreterZauber;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class M<T>
extends private<T> {
    protected int O\u00d5\u00d2000;
    protected boolean o\u00d5\u00d2000;
    protected String privatefloatsuper;
    private PropertyChangeSupport \u00f8\u00d4\u00d2000 = new PropertyChangeSupport(this);
    private Set<T> newforsuper;

    public static <T> M<T> o00000(I i2, SortedMap<T, Integer> sortedMap, int n) {
        M<T> m = new M<T>(i2, true, sortedMap, n);
        return m;
    }

    public static <T> M<T> \u00d200000(I i2, SortedMap<T, Integer> sortedMap, int n) {
        M<T> m = n > sortedMap.keySet().size() ? new M<T>(i2, false, sortedMap, sortedMap.keySet().size()) : new M<T>(i2, false, sortedMap, n);
        return m;
    }

    public static <T> M<T> Object(I i2, SortedMap<T, Integer> sortedMap, int n) {
        M<boolean> m = new M<boolean>(i2, true, sortedMap, n);
        m.o00000(true);
        return m;
    }

    public boolean \u00d4\u00d20000() {
        return this.o\u00d5\u00d2000;
    }

    @Override
    public void Object(boolean bl) {
        this.o\u00d5\u00d2000 = bl;
    }

    protected M(I i2, boolean bl, SortedMap<T, Integer> sortedMap, int n) {
        super(i2, bl, sortedMap);
        this.O\u00d5\u00d2000 = n;
        this.o\u00d5\u00d2000 = true;
        this.voidnew();
        this.newforsuper = new HashSet<T>();
    }

    public void \u00d200000(PropertyChangeListener propertyChangeListener) {
        this.\u00f8\u00d4\u00d2000.addPropertyChangeListener(propertyChangeListener);
    }

    public void voidnew() {
        StringBuffer stringBuffer = new StringBuffer(this.toString());
        stringBuffer.append(" ");
        if (this.intsuper().size() > 1) {
            stringBuffer.append("(");
        }
        Iterator iterator = this.intsuper().iterator();
        while (iterator.hasNext()) {
            Object t = iterator.next();
            if (t instanceof KonkreterZauber) {
                stringBuffer.append(((KonkreterZauber)t).getZaubername());
            } else {
                stringBuffer.append(t.toString());
            }
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        if (this.intsuper().size() > 1) {
            stringBuffer.append(")");
        }
        this.privatefloatsuper = stringBuffer.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        TreeMap treeMap = new TreeMap(this.\u00d6o0000());
        M m = new M(this.\u00f4O0000(), this.\u00d500000(), treeMap, this.O\u00d5\u00d2000);
        m.o00000((T)new TreeSet(this.intsuper()));
        m.\u00f5O0000().addAll(this.\u00f5O0000());
        m.voidnew();
        m.Object(this.\u00d4\u00d20000());
        return m;
    }

    public ArrayList<D<T>> \u00d200000(boolean bl) {
        int n = this.O\u00d5\u00d2000;
        if (bl) {
            n = this.\u00d2\u00d20000();
        }
        Iterator iterator = this.intsuper().iterator();
        ArrayList<D<T>> arrayList = new ArrayList<D<T>>(n);
        for (int i2 = 0; i2 < n; ++i2) {
            D<T> d2 = this.\u00d6\u00d20000();
            StringBuffer stringBuffer = new StringBuffer(d2.\u00f4O0000().toString());
            if (n > 1) {
                stringBuffer.append(" " + (i2 + 1));
            }
            d2.\u00d200000(stringBuffer.toString());
            d2.\u00d500000(d2.\u00f4O0000().toString());
            if (iterator.hasNext()) {
                this.o00000(d2, iterator.next());
            } else {
                this.o00000(d2, this.void(i2));
            }
            arrayList.add(d2);
        }
        return arrayList;
    }

    public void \u00d500000(T t) {
        this.intsuper().remove(t);
        this.\u00d600000(this.\u00d200000(t));
        this.voidnew();
    }

    public ArrayList<public> \u00f4\u00d20000() {
        D<T> d2 = this.\u00d200000(false).get(0);
        ArrayList<public> arrayList = new ArrayList<public>();
        Iterator iterator = this.\u00d5o0000().iterator();
        while (iterator.hasNext()) {
            try {
                D d3 = (D)d2.clone();
                this.o00000(d3, iterator.next());
                arrayList.add(d3);
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                throw new RuntimeException(cloneNotSupportedException);
            }
        }
        return arrayList;
    }

    public int \u00f5\u00d20000() {
        return this.O\u00d5\u00d2000;
    }

    public int \u00d2\u00d20000() {
        return this.intsuper().size();
    }

    @Override
    public int supersuper() {
        int n = 0;
        if (this.intsuper() != null) {
            for (Object t : this.intsuper()) {
                if (this.\u00d6o0000() == null || this.\u00d6o0000().get(t) == null || this.\u00d600000(t)) continue;
                n += ((Integer)this.\u00d6o0000().get(t)).intValue();
            }
        }
        return n;
    }

    public boolean \u00f400000(T t) {
        return this.intsuper().contains(t);
    }

    public boolean \u00d600000(T t) {
        return this.newforsuper.contains(t);
    }

    public boolean Objectnew() {
        return this.\u00d2\u00d20000() == 0;
    }

    public boolean o00000(D<?> d2) {
        return d2.\u00f4O0000().equals(this.\u00f4O0000());
    }

    @Override
    public String oO0000() {
        return this.privatefloatsuper;
    }

    public void \u00d5\u00d20000() {
        if (this.\u00f5\u00d20000() <= this.\u00d2\u00d20000()) {
            this.O\u00d5\u00d2000 = this.\u00d2\u00d20000() + 1;
        }
        if (this.\u00f4O0000().equals(I.\u00d8O0000) && this.O\u00d5\u00d2000 > 5) {
            this.O\u00d5\u00d2000 = this.\u00d2\u00d20000();
        }
    }

    public String o00000(T t, floatsuper floatsuper2, boolean bl) {
        if (bl && !floatsuper2.Object(this.void(t))) {
            return "<html><body>Der Held erf\u00fcllt nicht alle Voraussetzungen f\u00fcr diese Sonderfertigkeit:<br>" + this.void(t).toStringFormatiertHTML() + "<br>";
        }
        return null;
    }

    @Override
    public void Object(PropertyChangeListener propertyChangeListener) {
        this.\u00f8\u00d4\u00d2000.removePropertyChangeListener(propertyChangeListener);
    }

    public void \u00d200000(M<T> m) {
        for (Object t : m.intsuper()) {
            if (this.\u00d5o0000().contains(t)) {
                this.\u00d6o0000().put(t, new Integer(m.\u00d200000(t)));
            }
            this.o00000(t);
        }
    }

    @Override
    public void o00000(T t) {
        if (this.\u00d6o0000().get(t) != null) {
            this.o00000(t, (int)((Integer)this.\u00d6o0000().get(t)));
        }
        if (!this.intsuper().contains(t)) {
            this.intsuper().add(t);
            this.\u00d400000(this.\u00d200000(t));
        }
        this.voidnew();
    }

    @Override
    public void \u00d200000(int n) {
        Integer n2 = new Integer(n);
        this.o00000((T)n2);
        TreeSet treeSet = new TreeSet(this.intsuper());
        this.\u00d2o0000();
        for (Object e : treeSet) {
            this.o00000(e);
        }
        this.\u00f8\u00d4\u00d2000.firePropertyChange("AuswahlGP", null, new Integer(n));
    }

    public void o\u00d20000() {
        this.newforsuper = new HashSet(this.intsuper());
    }

    public void \u00d500000(int n) {
        this.O\u00d5\u00d2000 = n;
    }

    protected void \u00d400000(int n) {
        this.o00000(this.supersuper() + n, true);
    }

    protected D<T> \u00d6\u00d20000() {
        D d2 = new D(this);
        return d2;
    }

    protected AbstraktBedingung void(T t) {
        return this.\u00d5O0000();
    }

    protected T void(int n) {
        T t = null;
        T t2 = null;
        int n2 = 0;
        Iterator iterator = this.\u00d5o0000().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        do {
            ++n2;
            t2 = iterator.next();
            if (this.intsuper().contains(t2)) continue;
            t = t2;
        } while (t2 != null && (t == null || n2 <= n));
        return t;
    }

    protected void o00000(D<T> d2, T t) {
        d2.intsuper().clear();
        d2.intsuper().add(t);
        d2.o00000(this.\u00d200000(t), false);
    }

    private void \u00d600000(int n) {
        this.\u00d400000(-n);
    }
}

