/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod;

import helden.framework.OOoO.while;
import helden.framework.OooO.C;

public class GModAtome<T>
extends while<String, T>
implements Comparable {
    public GModAtome(String string, T t) {
        super(string, t);
    }

    public int compareTo(Object object) {
        GModAtome gModAtome = (GModAtome)object;
        return C.o00000(this.getWert2(), gModAtome.getWert2());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        GModAtome gModAtome = (GModAtome)object;
        return ((String)this.getWert1() + " " + this.getWert2()).equals(gModAtome.getWert1() + " " + gModAtome.getWert2());
    }

    @Override
    public int hashCode() {
        return ((String)this.getWert1() + " " + this.getWert2()).hashCode();
    }

    @Override
    public String toString() {
        return (String)this.getWert1();
    }
}

