/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.A;
import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.private;
import helden.framework.D.P;
import helden.framework.OOoO.R;
import helden.framework.OOoO.oO0O;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.c.a.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.settings.Settings;
import helden.gui.erschaffung.werkzeug.KostenArt;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class D<T>
extends private<T>
implements PropertyChangeListener {
    private SortedMap<T, Integer> \u00f4\u00d4\u00d2000;
    private M<T> \u00d8\u00d4\u00d2000;
    private String \u00f5\u00d4\u00d2000 = "";

    protected D(M<T> m) {
        this(m.\u00f4O0000(), m.\u00d500000(), m.\u00d6o0000());
        this.\u00d8\u00d4\u00d2000 = m;
    }

    private D(I i2, boolean bl, SortedMap<T, Integer> sortedMap) {
        super(i2, bl, sortedMap);
    }

    @Override
    public void o00000(PropertyChangeListener propertyChangeListener, boolean bl) {
        if (bl) {
            this.\u00f5o0000().o00000(propertyChangeListener, bl);
        } else {
            super.o00000(propertyChangeListener, bl);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        D d2 = new D(this.\u00f4O0000(), this.\u00d500000(), this.\u00d6o0000());
        d2.o00000((T)new TreeSet(this.intsuper()));
        d2.\u00d8\u00d4\u00d2000 = this.\u00d8\u00d4\u00d2000;
        d2.\u00f4\u00d4\u00d2000 = new TreeMap<T, Integer>();
        SortedMap sortedMap = this.\u00d6o0000();
        for (Map.Entry entry : sortedMap.entrySet()) {
            d2.\u00f4\u00d4\u00d2000.put(entry.getKey(), new Integer(entry.getValue()));
        }
        return d2;
    }

    public boolean interfacesuper() {
        return this.\u00d8\u00d4\u00d2000 != null && this.\u00d8\u00d4\u00d2000 instanceof A;
    }

    @Override
    public int \u00d600000() {
        if (this.\u00f5o0000() instanceof oooo_0) {
            oooo_0 oooo_02 = (oooo_0)this.\u00f5o0000();
            return oooo_02.\u00f5O0000((R)this.\u00f4o0000());
        }
        return super.\u00d600000();
    }

    public T \u00f4o0000() {
        if (this.intsuper() != null && this.intsuper().size() > 0) {
            return this.intsuper().iterator().next();
        }
        return null;
    }

    public List<T> o00000(Settings settings) {
        ArrayList arrayList = new ArrayList();
        for (Object t : this.\u00d5o0000()) {
            if (settings != null && !settings.containsAuswahl(this, t)) continue;
            arrayList.add(t);
        }
        return arrayList;
    }

    @Override
    public int \u00d200000(T t) {
        if (this.\u00d8\u00d4\u00d2000 instanceof A) {
            return ((A)this.\u00d8\u00d4\u00d2000).\u00d200000((R)t);
        }
        int n = 0;
        try {
            n = (Integer)this.forfloatsuper.get(t);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return n;
    }

    @Override
    public ArrayList<I> void() {
        if (this.interfacesuper()) {
            A a2 = (A)this.\u00d8\u00d4\u00d2000;
            if (this.\u00f4o0000() != null) {
                return a2.Object((R)this.\u00f4o0000());
            }
        }
        return super.void();
    }

    public M<T> \u00f5o0000() {
        return this.\u00d8\u00d4\u00d2000;
    }

    public String \u00f6o0000() {
        if (this.\u00f5\u00d4\u00d2000.isEmpty()) {
            return this.\u00f4O0000().toString();
        }
        return this.\u00f5\u00d4\u00d2000;
    }

    @Override
    public Vector<KostenArt> \u00d200000(floatsuper floatsuper2) {
        if (this.interfacesuper()) {
            A a2 = (A)this.\u00d8\u00d4\u00d2000;
            if (this.\u00f4o0000() != null) {
                return a2.o00000(floatsuper2, this.\u00f4o0000());
            }
        }
        return super.\u00d200000(floatsuper2);
    }

    @Override
    public ArrayList<oO0O<P, AbstraktBedingung, Integer>> o00000(floatsuper floatsuper2) {
        if (this.interfacesuper()) {
            A a2 = (A)this.\u00d8\u00d4\u00d2000;
            if (this.\u00f4o0000() != null) {
                return a2.o00000((R)this.\u00f4o0000(), floatsuper2);
            }
        }
        return new ArrayList<oO0O<P, AbstraktBedingung, Integer>>();
    }

    public boolean \u00d400000(Object object) {
        return this.\u00f4o0000().equals(object);
    }

    @Override
    public String oO0000() {
        StringBuffer stringBuffer = new StringBuffer(this.toString());
        stringBuffer.append(": ");
        if (this.intsuper().size() > 0 && this.\u00f4o0000() != null) {
            stringBuffer.append(this.\u00f4o0000().toString());
        }
        return stringBuffer.toString();
    }

    public String dosuper() {
        StringBuffer stringBuffer = new StringBuffer(this.\u00f6o0000());
        stringBuffer.append(" ");
        if (this.intsuper().size() > 0 && this.\u00f4o0000() != null) {
            stringBuffer.append(this.\u00f4o0000().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals("AuswahlGP")) {
            this.\u00d200000((Integer)propertyChangeEvent.getNewValue());
        }
    }

    @Override
    public void \u00f600000() {
        SortedMap sortedMap = this.\u00d6o0000();
        if (this.\u00f4\u00d4\u00d2000 == null) {
            return;
        }
        for (Map.Entry<T, Integer> entry : this.\u00f4\u00d4\u00d2000.entrySet()) {
            sortedMap.put(entry.getKey(), new Integer(entry.getValue()));
        }
    }

    @Override
    public void OO0000() {
        this.\u00f4\u00d4\u00d2000 = new TreeMap<T, Integer>();
        for (Map.Entry entry : this.\u00d6o0000().entrySet()) {
            this.\u00f4\u00d4\u00d2000.put(entry.getKey(), new Integer(entry.getValue()));
        }
    }

    @Override
    public void o00000(T t) {
        T t2;
        if (t == null) {
            return;
        }
        if (this.intsuper().size() > 0 && (t2 = this.\u00f4o0000()) != null) {
            this.intsuper().remove(t2);
            if (this.\u00d8\u00d4\u00d2000 != null) {
                this.\u00d8\u00d4\u00d2000.\u00d500000(t2);
            }
        }
        this.intsuper().add(t);
        if (this.\u00d8\u00d4\u00d2000 != null && !this.\u00d8\u00d4\u00d2000.intsuper().contains(t)) {
            this.\u00d8\u00d4\u00d2000.intsuper().add(t);
        }
        if (this.\u00d8\u00d4\u00d2000 != null) {
            this.\u00d8\u00d4\u00d2000.voidnew();
        }
        this.o00000((T)this.\u00d200000(t));
    }

    @Override
    public void \u00d200000(int n) {
        Integer n2 = new Integer(n);
        this.o00000((T)n2);
        this.o00000((T)this.\u00d200000(this.\u00f4o0000()));
    }

    @Override
    public void Object(int n) {
        Integer n2 = new Integer(n);
        this.o00000((T)n2);
        for (Object k2 : this.forfloatsuper.keySet()) {
            Integer n3 = (Integer)this.forfloatsuper.get(k2);
            if (n3 != null && n3 == 0) continue;
            this.forfloatsuper.put(k2, n2);
        }
        this.o00000((T)this.\u00d200000(this.\u00f4o0000()));
    }

    @Override
    public void o00000(SortedMap<T, Integer> sortedMap) {
        super.o00000(sortedMap);
        this.o00000(this.\u00d4o0000());
    }

    public void \u00d500000(String string) {
        this.\u00f5\u00d4\u00d2000 = string;
    }

    @Override
    public void o00000(M<T> m) {
        if (m != null) {
            m.\u00d200000(this);
        } else if (this.\u00d8\u00d4\u00d2000 != null) {
            this.\u00d8\u00d4\u00d2000.Object(this);
        }
        this.\u00d8\u00d4\u00d2000 = m;
    }
}

