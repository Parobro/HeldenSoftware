/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

import helden.framework.oooo.oooo_0;
import java.util.Arrays;

public class R
implements Comparable {
    private oooo_0 \u00d200000;
    private int o00000 = 0;
    private Object[] Object;

    public R(int n) {
        this.o00000 = n;
        this.Object = new Object[n];
    }

    public R(Object ... objectArray) {
        this(objectArray.length);
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            this.\u00d200000(i2, objectArray[i2]);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        R r = new R(this.o00000);
        for (int i2 = 0; i2 < this.o00000; ++i2) {
            r.\u00d200000(i2, this.o00000(i2));
        }
        r.\u00d200000 = this.\u00d200000;
        return r;
    }

    public int compareTo(Object object) {
        if (object == null) {
            return -1;
        }
        return this.toString().compareTo(object.toString());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        R r = (R)object;
        return r.Object().equals(this.Object());
    }

    public int o00000() {
        return this.o00000;
    }

    public Object o00000(int n) {
        return this.Object[n];
    }

    public Object[] \u00d200000() {
        return this.Object;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + Arrays.hashCode(this.Object);
        return n;
    }

    public void o00000(oooo_0 oooo_02) {
        this.\u00d200000 = oooo_02;
    }

    public void \u00d200000(int n, Object object) {
        this.Object[n] = object;
    }

    public R o00000(int n, Object object) {
        R r = null;
        try {
            r = (R)this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
            return null;
        }
        r.\u00d200000(n, object);
        return r;
    }

    public String toString() {
        if (this.\u00d200000 == null) {
            return this.Object();
        }
        return this.\u00d200000.super(this);
    }

    public String Object() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < this.o00000; ++i2) {
            if (i2 > 0) {
                stringBuffer.append("; ");
            }
            if (this.Object[i2] == null) continue;
            stringBuffer.append(this.Object[i2].toString());
        }
        return stringBuffer.toString();
    }
}

