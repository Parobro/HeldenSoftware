/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

import helden.framework.OOoO.String;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oO0O<A, B, C> {
    private A \u00d300000;
    private B \u00d200000;
    private C super;

    public oO0O(A a2, B b, C c) {
        this.\u00d300000 = a2;
        this.\u00d200000 = b;
        this.super = c;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof String)) {
            return false;
        }
        String string = (String)object;
        return this.\u00d300000().equals(string.\u00d300000()) && this.new().equals(string.new()) && this.o00000().equals(string.o00000());
    }

    public A \u00d300000() {
        return this.\u00d300000;
    }

    public B new() {
        return this.\u00d200000;
    }

    public C o00000() {
        return this.super;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public void o00000(A a2) {
        this.\u00d300000 = a2;
    }

    public void new(B b) {
        this.\u00d200000 = b;
    }

    public java.lang.String toString() {
        return this.\u00d300000 + " " + this.\u00d200000 + " " + this.super;
    }
}

